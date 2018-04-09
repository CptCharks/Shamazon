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
 * @author Charles
 */
public class Shamazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame tesFr = new JFrame();
        tesFr.setSize(800,500);
        
        ListingBrowser lisBow = new ListingBrowser();
        
        Listing testListing1 = new Listing("Test item","It does everything my "
                + "dudes",100.0f,"Cool",null);
        Listing testListing2 = new Listing("New Lawn Mower","It does not everything my "
                + "gals",100.0f,"Nope.jpg",null);
        
        lisBow.TestAddToList(testListing1);
        lisBow.TestAddToList(testListing2);
        lisBow.setVisible(true);
        
        tesFr.getContentPane().add(lisBow);
        tesFr.setTitle("Application Test Time");
        tesFr.setVisible(true);
        lisBow.RefreshListings();
        
        /*JFrame tesFr = new JFrame();
        tesFr.setSize(700,500);
        tesFr.setTitle("Test time");
        
        ListingEditorPanel editPanel = new ListingEditorPanel();
        
        Listing testListing1 = new Listing("Test item","It does everything my "
                + "dudes",100.0f,"Cool",null);
        
        editPanel.LoadListing(testListing1);
        
        tesFr.getContentPane().add(editPanel);
        
        tesFr.setVisible(true);
        
        editPanel.setVisible(true);*/
    }
    
}
