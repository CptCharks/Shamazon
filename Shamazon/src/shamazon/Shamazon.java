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
        Listing testListing = new Listing("Test item","It does everything my "
                + "dudes",100.0f,"Cool");
        ListingEditorPanel editorPanel = new ListingEditorPanel();
        JFrame tesFr = new JFrame();
        tesFr.setSize(700,500);
        tesFr.setTitle("This is broken");
        tesFr.getContentPane().add(editorPanel);
        editorPanel.LoadListing(testListing);
        editorPanel.setVisible(true);
        tesFr.setVisible(true);
    }
    
}
