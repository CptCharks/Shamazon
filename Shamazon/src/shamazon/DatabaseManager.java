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
/**
 *
 * @author Seth
 */
public class DatabaseManager 
{
    Connection conn = null;
    String username =null;
    String password =null;
    String url = null;

    public DatabaseManager(){
        username ="ShamAdmin";
        password ="Shamazon123";
        url ="jdbc:sqlserver://shamazondb.cvll5p9eet0l.us-east-2.rds.amazonaws.com:1433;databaseName=ShamazonDB";
  
    }
    
    public void OpenConnection() throws SQLException, ClassNotFoundException
    {
           
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("test");
    }
    
    public boolean CheckUserName(String uname) throws SQLException
    {
        String query = "select UserName from UserInfo";
        Statement stmt = conn.createStatement();
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

    public boolean CheckPassword(String pass) throws SQLException
    {
        String query = "select Password from UserInfo";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next())
        {
            if (rs.getString("Password").equals(pass))
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
        Statement stmt = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
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
        Statement stmt = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
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
    
}
 