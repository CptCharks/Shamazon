/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;
import java.awt.BorderLayout;
import java.awt.Image.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.*;

/**
 * The main class that gets this mad train rolling.
 * @author Seth
 */
public class Shamazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException
    {
 /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    
        
//      
//        Listing list1 = new Listing("Polly Locket",null,"Tis #######",10,null, null);
//        Listing list2 = new Listing("Bob",null,"Tis Bob",15,null, null);
//        
//        listBrow.TestAddToList(list1);
//        listBrow.TestAddToList(list2);
//        JFrame tesFr = new JFrame();
//        tesFr.setSize(700,500);
//        tesFr.setTitle("Test time");
//        
//        ShoppingCart cart = new ShoppingCart();
//        Listing list1 = new Listing("Polly Locket","Tis #######",10,null, null);
//        Listing list2 = new Listing("Bob","Tis Bob",15,null, null);
//        cart.AddListing(list1);
//        cart.AddListing(list2);
//        
//        ShoppingCartPanel shopPanel = new ShoppingCartPanel();
//        shopPanel.SetCart(cart);



//    UserAccount user = new UserAccount("Me", "Password", "Luke", "Memory Lane", "222@gmail", "1111", null);
//    UserAccount user1 = new UserAccount("Me1", "Password", "Luke", "Memory Lane", "222@gmail", "1111", null);
//    UUID uuid;
//    try
//    {
//        uuid = DatabaseManager.AddObjectToDatabase(user, "Test");
//        user.SetUUID(uuid);
//        uuid = DatabaseManager.AddObjectToDatabase(user1, "Test");
//        user1.SetUUID(uuid);
//        DatabaseManager.GetObjectsFromDatabase("Test"); 
//    }
//    catch(SQLException e)
//    {
//      System.out.println(e);
//    }
       
        
        
    }
    
    
    void InitilizeEverything()
    {
       
    }

}
