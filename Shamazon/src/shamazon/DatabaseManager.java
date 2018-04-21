
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
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static Connection OpenConnection()
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
    
    public boolean CheckUserName(String uname) throws SQLException
    {
        String query = "select UserName from UserInfo";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) 
        {
            if (rs.getString("UserName").equals(uname))
            {
                return true;
            }
        }
    return false;
    }

    public boolean CheckPassword(String uname, String pass) throws SQLException
    {
        String query = "select Password from UserInfo";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next())
        {
            if (rs.getString("Password").equals(pass) && rs.getString("UserName").equals(uname))
            {
                return true;
            }
        }
        return false;
    }
    
    public void CreateUser(String name, String email, String address, String uName, String pass, 
            BufferedImage avatar) throws SQLException
    {
        String query = "select * from UserInfo";
        Statement stmt = connection.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(query);
        rs.moveToInsertRow();
        rs.updateString("Name", name);
        rs.updateString("eMail", email);
        rs.updateString("Address", address);
        rs.updateString("UserName", uName);
        rs.updateString("Password", pass);
        rs.insertRow();
        rs.beforeFirst();
    }
    
        public void CreateProduct(String name, String description, String owner, Double price, String tag1,
                String tag2, String tag3) throws SQLException
    {
        String query = "select * from UserInfo";
        Statement stmt = connection.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(query);
        rs.moveToInsertRow();
        rs.updateString("Name", name);
        rs.updateString("Description", description);
        rs.updateString("Owner", owner);
        rs.updateDouble("Price", price);
        rs.updateString("Tag_1", tag1);
        rs.updateString("Tag_2", tag2);
        rs.updateString("Tag_3", tag3);
        rs.insertRow();
        rs.beforeFirst();
    }
        
    public static <T> UUID AddObjectToDatabase(T object, String tableName) throws SQLException
    {
        byte[] byteArray = null;
        UUID uuid = UUID.randomUUID();
        
        byteArray = DatabaseObjectConverter.GetByteArray(object);
        
        String query = "select * from " + tableName;
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = statement.executeQuery(query);
        
        resultSet.moveToInsertRow();
        resultSet.updateBytes("Object", byteArray);
        resultSet.updateString("UUID", uuid.toString());
        resultSet.insertRow();
        resultSet.beforeFirst();
        
        return uuid;
    }
    
}
