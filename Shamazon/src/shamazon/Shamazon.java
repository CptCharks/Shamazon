/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;
import java.awt.Image.*;
import java.sql.SQLException;
import java.util.UUID;
import javax.swing.*;

/**
 *
 * @author Seth
 */
public class Shamazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException
    {
//        JFrame tesFr = new JFrame();
//        tesFr.setSize(700,500);
//        tesFr.setTitle("Test time");
//        
//        ShoppingCart cart = new ShoppingCart();
//        Listing list1 = new Listing("Polly Locket","Tis bitchin",10,null, null);
//        Listing list2 = new Listing("Bob","Tis Bob",15,null, null);
//        cart.AddListing(list1);
//        cart.AddListing(list2);
//        
//        ShoppingCartPanel shopPanel = new ShoppingCartPanel();
//        shopPanel.SetCart(cart);
//        
//        shopPanel.RefreshListings();
//        
//        tesFr.getContentPane().add(shopPanel);
//        
//        tesFr.setVisible(true);
//      
//        shopPanel.setVisible(true);
    UserAccount user = new UserAccount("Me", "Password", "Luke", "Memory Lane", "222@gmail", "1111", null);
    UserAccount user1 = new UserAccount("Me1", "Password", "Luke", "Memory Lane", "222@gmail", "1111", null);
    UUID uuid;
    try
    {
        uuid = DatabaseManager.AddObjectToDatabase(user, "Test");
        user.SetUUID(uuid);
        uuid = DatabaseManager.AddObjectToDatabase(user1, "Test");
        user1.SetUUID(uuid);
        DatabaseManager.GetObjectsFromDatabase("Test"); 
    }
    catch(SQLException e)
    {
      System.out.println(e);
    }
    }

}