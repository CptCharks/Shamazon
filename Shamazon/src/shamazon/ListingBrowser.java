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
import java.awt.Label;
import java.sql.SQLException;
/**
 *
 * @author Charles
 */
public class ListingBrowser extends javax.swing.JPanel {

    
    private UserAccount userAccount;
    
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
    private void initComponents()
    {

        ListingScrollPane = new javax.swing.JScrollPane();
        SearchButton = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        SearchLabel = new javax.swing.JLabel();
        FilterSettingsLabel = new javax.swing.JLabel();
        PriceFieldLower = new javax.swing.JTextField();
        PriceFieldHigher = new javax.swing.JTextField();
        LessThanLabel = new javax.swing.JLabel();
        PriceCheckBox = new javax.swing.JCheckBox();
        CreateButton = new javax.swing.JButton();
        RefreshListings = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ListingScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ListingScrollPane.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchLabel.setText("Search:");

        FilterSettingsLabel.setText("Filter Settings:");

        PriceFieldLower.setText("0");
        PriceFieldLower.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PriceFieldLowerActionPerformed(evt);
            }
        });

        PriceFieldHigher.setText("100");

        LessThanLabel.setText("<");

        PriceCheckBox.setText("Price:");
        PriceCheckBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PriceCheckBoxActionPerformed(evt);
            }
        });

        CreateButton.setText("Create Listing");
        CreateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CreateButtonActionPerformed(evt);
            }
        });

        RefreshListings.setText("Refresh");
        RefreshListings.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RefreshListingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(SearchButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FilterSettingsLabel)
                                    .addComponent(PriceCheckBox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PriceFieldLower, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(LessThanLabel)
                                        .addGap(4, 4, 4)
                                        .addComponent(PriceFieldHigher, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CreateButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(RefreshListings)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListingScrollPane)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(SearchLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SearchButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FilterSettingsLabel)
                        .addGap(7, 7, 7)
                        .addComponent(PriceCheckBox)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceFieldLower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(LessThanLabel))
                            .addComponent(PriceFieldHigher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(CreateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RefreshListings)
                        .addContainerGap())
                    .addComponent(ListingScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PriceFieldLowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldLowerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceFieldLowerActionPerformed

    private void PriceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceCheckBoxActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        SearchListings();
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CreateButtonActionPerformed
    {//GEN-HEADEREND:event_CreateButtonActionPerformed
       CreateListing(userAccount);
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void RefreshListingsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RefreshListingsActionPerformed
    {//GEN-HEADEREND:event_RefreshListingsActionPerformed
        LoadListings();
    }//GEN-LAST:event_RefreshListingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JLabel FilterSettingsLabel;
    private javax.swing.JLabel LessThanLabel;
    private javax.swing.JScrollPane ListingScrollPane;
    private javax.swing.JCheckBox PriceCheckBox;
    private javax.swing.JTextField PriceFieldHigher;
    private javax.swing.JTextField PriceFieldLower;
    private javax.swing.JButton RefreshListings;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTextField SearchTextField;
    // End of variables declaration//GEN-END:variables

    //From this point on is the code for the ListingBrowser
    
     //Filter Settings
   
    /**
     * Reference to the shopping cart to add listings to
     */
    private ShoppingCart shopCart;
    
    /**
     * Listings to show in the browser.
     */
    private List<Listing> listingsToShow = new ArrayList<Listing>();
    
    /**
     * String to search through listings.
     */
    private String searchString;
    
    /**
     * Constructor for ListingBrowser
     * @param cart
     * @param dm 
     */
    public ListingBrowser(ShoppingCart cart, UserAccount user)
    {
        userAccount = user;
        shopCart = cart;
        initComponents();
    }
    
    /**
     * Run processes for creating a new listing
     */
    public void CreateListing(UserAccount user)
    {
       if(user != null)
       {
            Listing newListing = new Listing();
            newListing.SetOwner(user);
            EditorDialog editor = new EditorDialog(new javax.swing.JFrame(), true, true);
            editor.LoadListing(newListing);
            editor.setVisible(true);
       }
       else
       {
           JDialog warning = new JDialog();
           Label warningLabel = new Label();
           warningLabel.setText("No user account logged in!");
           warning.add(warningLabel);
       }
    }
    
    /**
     * Loads listings based on in searchString is empty or not
     */
    private void LoadListings()
    {
        if(searchString != null)
        {
            //Use search string and call luke's fancy function
            //Get a number of listings from the databasemanager
            try
            {
                listingsToShow = DatabaseManager.GetObjectsFromDatabase("Listings");
            }
            catch(SQLException e)
            {
                //throw e;
            }
        }
        else
        {
            //Get a number of listings from the databasemanager
            try
            {
                listingsToShow = DatabaseManager.GetObjectsFromDatabase("Listings");
            }
            catch(SQLException e)
            {
                //throw e;
            }
            
        }
        RefreshListings();
    }
    
    private void SearchListings()
    {
        searchString = SearchTextField.getText();
        if(SearchTextField.getText().isEmpty())
        {
            searchString = null;
        }
        this.LoadListings();
    }
    
    public void FilterListings()
    {
        
    }
        
    
    public void SetShoppingCart(ShoppingCart cart)
    {
        shopCart = cart;
    }
    
    /**
     * Refreshes listings in the scroll pane. Use to repopulate the list after
     * loading new listings.
     */
    public void RefreshListings()
    {
        if(!listingsToShow.isEmpty())
        {
            //Clear the pane so to repopulate
            //ListingScrollPane.removeAll();
            JPanel panelContain = new JPanel();
            
            //Loop to repopulate the listings
            for(int i = 0; i < listingsToShow.size(); i++)
            {
                if(PriceCheckBox.isSelected())
                {
                    float compareList = listingsToShow.get(i).GetPrice();
                    float lowerList = Float.parseFloat(PriceFieldLower.getText());
                    float higherList = Float.parseFloat(PriceFieldHigher.getText());
                    if((compareList >= lowerList)&&(compareList <= higherList))
                    {
                        //Create a panel to load
                        ListingPreviewPanel listingPanelToAdd = new ListingPreviewPanel();

                        //Loadlisting to panel
                        listingPanelToAdd.LoadListingToPanel(listingsToShow.get(i),this);
                        listingPanelToAdd.SetShoppingCart(shopCart);
                        //Add to container that will be added to pane
                        panelContain.add(listingPanelToAdd);

                        //Make sure the panel is visable
                        listingPanelToAdd.setVisible(true);
                    }
                }
                else
                {
                    //Create a panel to load
                    ListingPreviewPanel listingPanelToAdd = new ListingPreviewPanel();

                    //Loadlisting to panel
                    listingPanelToAdd.LoadListingToPanel(listingsToShow.get(i),this);
                    listingPanelToAdd.SetShoppingCart(shopCart);
                    //Add to container that will be added to pane
                    panelContain.add(listingPanelToAdd);

                    //Make sure the panel is visable
                    listingPanelToAdd.setVisible(true);
                }
                
                
            }
            //Format panel layout
            panelContain.setLayout(new BoxLayout(panelContain, BoxLayout.Y_AXIS));
            //Make sure container is visable
            panelContain.setVisible(true);
            //Add panels to scroll pane
            ListingScrollPane.getViewport().add(panelContain);
        }
        else
        {
            //Clear the pane so to repopulate
            //ListingScrollPane.removeAll();
            JPanel panelContain = new JPanel();
            
             //Format panel layout
            panelContain.setLayout(new BoxLayout(panelContain, BoxLayout.Y_AXIS));
            //Make sure container is visable
            panelContain.setVisible(true);
            //Add panels to scroll pane
            ListingScrollPane.getViewport().add(panelContain);
        }
    }
    
    public void TestAddToList(Listing list)
    {
        listingsToShow.add(list);
        this.RefreshListings();
    }
}

