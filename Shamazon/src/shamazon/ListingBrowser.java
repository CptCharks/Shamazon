/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.lang.String;
import javax.swing.*;
import java.util.*;
import java.awt.Container;
/**
 *
 * @author Charles
 */
public class ListingBrowser extends javax.swing.JPanel {

    
    
    /**
     * Creates new form ListingBrowserPanel
     */
    public ListingBrowser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListingScrollPane = new javax.swing.JScrollPane();

        ListingScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ListingScrollPane.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListingScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListingScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ListingScrollPane;
    // End of variables declaration//GEN-END:variables

    //From this point on is the code for the ListingBrowser
    /**
     * Database manager reference to call functions from.
     */
    private DatabaseManager databaseMan;
   
     //Filter Settings
    
    /**
     * Listings to show in the browser.
     */
    private List<Listing> listingsToShow = new ArrayList<Listing>();
    
    /**
     * String to search through listings.
     */
    private String searchString;
    
    public void CreateListing()
    {
        //Create a listing for a user
    }
    
    public void EditListing()
    {
        //Edit a given listing provided it is owned by the user and not sold
    }
    
    public void LoadListings()
    {
        //Get a number of listings from the databasemanager
    }
    
    /**
     * Refreshes listings in the scroll pane. Use to repopulate the list after
     * loading new listings.
     */
    public void RefreshListings()
    {
        if(listingsToShow.size() != 0)
        {
            //Clear the pane so to repopulate
            //ListingScrollPane.removeAll();
            JPanel panelContain = new JPanel();
            
            //Loop to repopulate the listings
            for(int i = 0; i < listingsToShow.size(); i++)
            {
                //Create a panel to load
                ListingPreviewPanel listingPanelToAdd = new ListingPreviewPanel();

                //Loadlisting to panel
                listingPanelToAdd.LoadListingToPanel(listingsToShow.get(i));
                
                //Add to container that will be added to pane
                panelContain.add(listingPanelToAdd);
                
                //Make sure the panel is visable
                listingPanelToAdd.setVisible(true);
            }
            //Format panel layout
            panelContain.setLayout(new BoxLayout(panelContain, BoxLayout.Y_AXIS));
            //Make sure container is visable
            panelContain.setVisible(true);
            //Add panels to scroll pane
            ListingScrollPane.getViewport().add(panelContain);
        }
    }
    
    public void FilterListings()
    {
        
    }
    
    public void SearchListings()
    {
        
    }
        
    public void TestAddToList(Listing list)
    {
        listingsToShow.add(list);
    }
}

