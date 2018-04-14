/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;
import java.awt.Image.*;
import javax.swing.*;

/**
 *
 * @author Seth
 */
public class Shamazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame tesFr = new JFrame();
        tesFr.setSize(700,500);
        tesFr.setTitle("Test time");
        
        ListingEditorPanel editPanel = new ListingEditorPanel();
        
        Listing testListing1 = new Listing("Test item","It does everything my "
                + "dudes",100.0f,"Cool",null);
        
        editPanel.LoadListing(testListing1);
        
        tesFr.getContentPane().add(editPanel);
        
        tesFr.setVisible(true);
      
        /*editPanel.setVisible(true);
        UserAccount user = new UserAccount("Me", "Password", "Luke", "Memory Lane", "222@gmail", "1111", null);
        
        UserAccountEditor userAccountEditor = new UserAccountEditor();
        userAccountEditor.LoadUserAccount(user);
        
        JDialog dialog = new JDialog();
        
        dialog.setContentPane(userAccountEditor);
        dialog.pack();
        dialog.setVisible(true);*/
    }

}