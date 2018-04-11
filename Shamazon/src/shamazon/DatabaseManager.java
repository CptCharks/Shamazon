/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DatabaseManager {
    
    public DatabaseManager(){
        
    }
    
    public void OpenConnection() throws SQLException, ClassNotFoundException{
           
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
        Connection conn = null;
        String userName ="ShamAdmin";
        String password ="Shamazon123";
        String url ="jdbc:sqlserver://shamazondb.cvll5p9eet0l.us-east-2.rds.amazonaws.com:1433;databaseName=ShamazonDB";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        conn = DriverManager.getConnection(url, userName, password);
        System.out.println("test");
    }
    
    public void CloseConnection(){
        
    }
}