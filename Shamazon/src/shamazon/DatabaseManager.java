
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
    
    private static Connection OpenConnection()
    {
        Connection databaseConnection = null;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            databaseConnection = DriverManager.getConnection(url, username, password);
        }
        catch(Exception e)
        {
            
        }
        
        return databaseConnection;
    }
    
    public static boolean IsUsernameAvailable(String username) throws SQLException
    {
        Statement statement = null;
        try
        {
            String query = "select * from UserAccounts where Username = " + "'" + username + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if(resultSet.next()) 
                return false;
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

    public static boolean IsPasswordCorrect(UserAccount account, String password) throws SQLException
    {
        Statement statement = null;
        try
        {
            String query = "select * from UserAccounts where UUID = " + "'" + account.GetUUID() + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
           if(resultSet.getNString("Password").equals(password))
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
            statement.close();
        }
    }
    
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
    
    public static void UpdateObjectInDatabase(ShamazonObject object, String tableName) throws SQLException
    {
        Statement statement = null;
        try
        {
            byte[] byteArray =  DatabaseObjectConverter.GetByteArray(object);

            String query = "select * from " + tableName + " where UUID = " + "'" + object.GetUUID().toString() + "'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);

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
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            if(statement != null) statement.close();
        }
    }
    
    public static ShamazonObject GetUpdatedObjectFromDatabase(ShamazonObject object, String tableName) throws SQLException
    {
        ShamazonObject updatedObject;
        Statement statement = null;
        try
        {
            String query = "select * from " + tableName + " where UUID = " + "'" + object.GetUUID().toString() + "'";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);

            byte[] byteArray = resultSet.getBytes("Object");
            resultSet.beforeFirst();

            updatedObject = DatabaseObjectConverter.GetObject(byteArray);
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
    
    public static void RemoveObjectFromDatabase(ShamazonObject object, String tableName) throws SQLException
    {
        Statement statement = null;
        try
        {
            String query = "select * from " + tableName + " where UUID = " + "\"" + object.GetUUID().toString() + "\"";
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery(query);

            resultSet.deleteRow();
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
    
    public static ArrayList<Listing> GetListingsFromDatabaseByOwner(UserAccount owner) throws SQLException
    {
        Statement statement = null;
        ArrayList<Listing> listings = new ArrayList<Listing>();
        try
        {
            String query = "select * from Listings where Owner = " + "\"" + owner.GetUUID().toString() + "\"";
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
}
