/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Seth
 */
public class Shamazon {
    
      public static void main(String[] args) throws SQLException, ClassNotFoundException{
           
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
        String userName ="ShamAdmin";
        String b = "sdkgv";
        String password ="Shamazon123";
        String url ="jdbc:sqlserver://shamazondb.cvll5p9eet0l.us-east-2.rds.amazonaws.com:1433;databaseName=ShamazonDB";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        Connection conn = DriverManager.getConnection(url, userName, password);
        System.out.println("test");
        String query = "select * from UserInfo";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        rs.next();
        if (rs.getString("UserName")== b){
        System.out.println(rs.getString("UserName"));
        }
      }
}