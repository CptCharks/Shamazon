
package shamazon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Seth
 */
public class DatabaseManager 
{
    private static final Connection connection = OpenConnection();
    private static final String username = "ShamAdmin";
    private static final String password = "Shamazon123";
    private static final String url = "jdbc:sqlserver://shamazondb.cvll5p9eet0l.us-east-2.rds.amazonaws.com:1433;databaseName=ShamazonDB";
    
    public DatabaseManager() { }
    
    /**
     * Opens a connection to the Database
     * 
     * @return  a connection Object
     */
    private static Connection OpenConnection()
    {
        Connection databaseConnection = null;

        for(int i = 0; i < 10; i++)
        {
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
                databaseConnection = DriverManager.getConnection(url, username, password);
            }
            catch(Exception e)
            {
                databaseConnection = null;
            }

            if(databaseConnection != null)
                return databaseConnection;
        }
        
        return databaseConnection;
    }
    
    /**
     *  Close the database connection
     */
    public static void CloseConnection()
    {
        try
        {
            if(connection != null)
                connection.close();
        }
        catch(SQLException e)
        {
            
        }
    }
    
    /**
     * Checks if a new username already exists for another account in the database
     * 
     * @param account           account with username to be checked
     * @param newUsername       new username being checked for availability
     * @return                  true if username does not already exist in database, false if it does exist
     * @throws SQLException 
     */
    public static boolean IsUsernameAvailable(UserAccount account, String newUsername) throws SQLException
    {
        Statement statement = null;
        try
        {
            String query = "select * from UserAccounts where Username = " + "'" + newUsername + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if(resultSet.next())
                if(!resultSet.getNString("UUID").equals(account.GetUUID().toString()))
                    return false;
                else
                    return true;
            else 
                return true;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            statement.close();
        }
    }

    /**
     * Checks a password to ensure it's the one associated with the users account
     * 
     * @param account   The account that is trying to be accessed
     * @param password  The password the user is trying to login with
     * @return          True if password matches the password field in account, false otherwise
     * @throws SQLException 
     */
    public static boolean IsPasswordCorrect(UserAccount account, String password) throws SQLException
    {
        Statement statement = null;
        try
        {
            String query = "select * from UserAccounts where UUID = " + "'" + account.GetUUID() + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if(resultSet.next())
            {
                if(resultSet.getNString("Password").equals(password))
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            statement.close();
        }
    }
    
    public static boolean IsPasswordCorrect(String username, String password) throws SQLException
    {
        Statement statement = null;
        try
        {
            String query = "select * from UserAccounts where Username = " + "'" + username + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if(resultSet.next())
            {
                if(resultSet.getNString("Password").equals(password))
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            statement.close();
        }
    }
    
    /**
     * Checks if an object exists in the database
     * @param object        Object that is being looked for
     * @param tableName     Table that the object is expected to exist in
     * @return              True if object exists in given table, false otherwise
     * @throws SQLException 
     */
    public static boolean IsObjectInDatabase(ShamazonObject object, String tableName) throws SQLException
    {
        Statement statement = null;
        try
        {
            String query = "select * from " + tableName + " where UUID = " + "'" + object.GetUUID() + "'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(query);
            
            if(resultSet.next())
                return true;
            else
                return false;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
    
       /**
        * Adds an object to the specified database table
        * @param object         object to be added, (User account, product listing)
        * @param tableName      database table to be added
        * @throws SQLException 
        */
    public static void AddObjectToDatabase(ShamazonObject object, String tableName) throws SQLException
    {
        Statement statement = null;
        try
        {
            byte[] byteArray = null;

            byteArray = DatabaseObjectConverter.GetByteArray(object);

            String query = "select * from " + tableName;
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);

            resultSet.moveToInsertRow();
            resultSet.updateBytes("Object", byteArray);
            resultSet.updateString("UUID", object.GetUUID().toString());

            if(object instanceof UserAccount)
            {
                UserAccount account = (UserAccount)object;
                resultSet.updateNString("Username", account.GetUsername());
                resultSet.updateNString("Password", account.GetPassword());
            }
            else if(object instanceof Listing)
            {
                Listing listing = (Listing)object;
                resultSet.updateNString("Name", listing.GetName());
                resultSet.updateNString("Owner", listing.GetOwner().GetUUID().toString());
                resultSet.updateNString("Tag", listing.GetTag());
            }

            resultSet.insertRow();
            resultSet.beforeFirst();
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
    
    /**
     * Updates data stored in an existing object on the database
     * @param object        object to be updated
     * @param tableName     the table the object is stored in
     * @throws SQLException 
     */
    public static void UpdateObjectInDatabase(ShamazonObject object, String tableName) throws SQLException
    {
        Statement statement = null;
        try
        {
            byte[] byteArray =  DatabaseObjectConverter.GetByteArray(object);

            String query = "select * from " + tableName + " where UUID = " + "'" + object.GetUUID().toString() + "'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);
            
            if(resultSet.next())
            {
                resultSet.updateBytes("Object", byteArray);

                if(object instanceof UserAccount)
                {
                    UserAccount account = (UserAccount)object;
                    resultSet.updateNString("Username", account.GetUsername());
                    resultSet.updateNString("Password", account.GetPassword());
                }
                else if(object instanceof Listing)
                {
                    Listing listing = (Listing)object;
                    resultSet.updateNString("Name", listing.GetName());
                    resultSet.updateNString("Owner", listing.GetOwner().GetUUID().toString());
                }

                resultSet.updateRow();
                resultSet.beforeFirst();
            }
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
    
    /**
     * retrieves the most recent version of an object from the database
     * 
     * @param object        recently updated object
     * @param tableName     database table the object exists in
     * @return              latest version of the object
     * @throws SQLException 
     */
    public static ShamazonObject GetUpdatedObjectFromDatabase(ShamazonObject object, String tableName) throws SQLException
    {
        ShamazonObject updatedObject;
        Statement statement = null;
        try
        {
            String query = "select * from " + tableName + " where UUID = " + "'" + object.GetUUID().toString() + "'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);
            
            byte[] byteArray = null;
            if(resultSet.next())
               byteArray = resultSet.getBytes("Object");
            
            resultSet.beforeFirst();
            if(byteArray != null)
                updatedObject = DatabaseObjectConverter.GetObject(byteArray);
            else
                return null;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
        
        return updatedObject;
    }
    
    /**
     * retrieves all objects stored in a database table
     * @param <T>           the object array type that will be returned
     * @param tableName     the database table you want to access
     * @return              an array of the objects type containing all objects in the table
     * @throws SQLException 
     */
    public static <T> ArrayList<T> GetObjectsFromDatabase(String tableName) throws SQLException
    {
        ArrayList<T> objectList = new ArrayList<T>();
        Statement statement = null;
        try
        {
            String query = "select * from " + tableName;
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);

            byte[] byteArray;
            T object;

            while(resultSet.next())
            {
                byteArray = resultSet.getBytes("Object");
                object = DatabaseObjectConverter.GetObject(byteArray);
                objectList.add(object);
            }
            resultSet.beforeFirst();
        }
        catch(SQLException e)
        {
            throw e;
        }
        
        return objectList;
    }
    
    /**
     * Removes an object from the database
     * @param object        object to be removed
     * @param tableName     database table it exists in
     * @throws SQLException 
     */
    public static void RemoveObjectFromDatabase(ShamazonObject object, String tableName) throws SQLException
    {
        Statement statement = null;
        try
        {
            String query = "select * from " + tableName + " where UUID = " + "'" + object.GetUUID().toString() + "'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);

            if(resultSet.next())
            {
                resultSet.deleteRow();
                resultSet.beforeFirst();
            }
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
    
    /**
     * retrieves the listings a user has submitted
     * @param owner     the object associated with the users account
     * @return          an array of type Listing containing the products the user submitted
     * @throws SQLException 
     */
    public static ArrayList<Listing> GetListingsFromDatabaseByOwner(UserAccount owner) throws SQLException
    {
        Statement statement = null;
        ArrayList<Listing> listings = new ArrayList<Listing>();
        try
        {
            String query = "select * from Listings where Owner = " + "'" + owner.GetUUID().toString() + "'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);
            
            byte[] byteArray;
            Listing listing;

            while(resultSet.next())
            {
                byteArray = resultSet.getBytes("Object");
                listing = DatabaseObjectConverter.GetObject(byteArray);
                listings.add(listing);
            }
            resultSet.beforeFirst();
            
            return listings;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
    
    /**
     * Gets all listings from the database with a matching name
     * @param name the name to search for
     * @return an ArrayList of listings with matching names
     * @throws SQLException 
     */
    public static ArrayList<Listing> GetListingsByName(String name) throws SQLException
    {
        Statement statement = null;
        ArrayList<Listing> listings = new ArrayList<Listing>();
        try
        {
            String query = "select * from Listings where Name like " + "'%" + name + "%'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);
            
            byte[] byteArray;
            Listing listing;

            while(resultSet.next())
            {
                byteArray = resultSet.getBytes("Object");
                listing = DatabaseObjectConverter.GetObject(byteArray);
                listings.add(listing);
            }
            resultSet.beforeFirst();
            
            return listings;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
    
    /**
     * Gets all listings from the database with a matching tag
     * @param tag the tag to search for
     * @return an ArrayList of all matching listings
     * @throws SQLException 
     */
    public static ArrayList<Listing> GetListingsByTag(String tag) throws SQLException
    {
        Statement statement = null;
        ArrayList<Listing> listings = new ArrayList<Listing>();
        try
        {
            String query = "select * from Listings where Tag like " + "'%" + tag + "%'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);
            
            byte[] byteArray;
            Listing listing;

            while(resultSet.next())
            {
                byteArray = resultSet.getBytes("Object");
                listing = DatabaseObjectConverter.GetObject(byteArray);
                listings.add(listing);
            }
            resultSet.beforeFirst();
            
            return listings;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
    
    /**
     * Gets a UserAccount object from the database with the corresponding username
     * @param username the username to search for
     * @return the matching UserAccount
     */
    public static UserAccount GetUserAccountByName(String username) throws SQLException
    {
        Statement statement = null;
        
        try
        {
            String query = "select * from UserAccounts where Username = " + "'" + username + "'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);
            
            byte[] byteArray;
            UserAccount account = null;

            if(resultSet.next())
            {
                byteArray = resultSet.getBytes("Object");
                account = DatabaseObjectConverter.GetObject(byteArray);
            }
            resultSet.beforeFirst();
            
            return account;
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
}
