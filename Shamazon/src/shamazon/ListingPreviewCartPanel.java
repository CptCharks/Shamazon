/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Charles
 */
public class ListingPreviewCartPanel extends javax.swing.JPanel
{
    private ShoppingCartPanel shopCartPanelRef;
    
    private ShoppingCart cartRef;
    
    private Listing thisListing;
    
    /**
     * Creates new form ListingPreviewCartPanel
     */
    public ListingPreviewCartPanel()
    {
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

        ListingImageLabel = new javax.swing.JLabel();
        ListingNameLabel = new javax.swing.JLabel();
        ListingDescLabel = new javax.swing.JLabel();
        RemoveButton = new javax.swing.JButton();
        ListingPriceLabel = new javax.swing.JLabel();

        ListingImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShamazonResources/ClientImages/ImageMissing.png"))); // NOI18N
        ListingImageLabel.setMaximumSize(new java.awt.Dimension(150, 150));
        ListingImageLabel.setMinimumSize(new java.awt.Dimension(150, 150));
        ListingImageLabel.setPreferredSize(new java.awt.Dimension(150, 150));

        ListingNameLabel.setText("Name");

        ListingDescLabel.setText("Desc");

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RemoveButtonActionPerformed(evt);
            }
        });

        ListingPriceLabel.setText("Price:");
        ListingPriceLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListingImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ListingDescLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ListingPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(RemoveButton))
                    .addComponent(ListingNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ListingNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListingDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoveButton)
                            .addComponent(ListingPriceLabel))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(ListingImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void LoadListingToPanel(Listing list)
    {
        thisListing = list;
        //Set name, description and price for each of the listing properties
        ListingNameLabel.setText(list.GetName());
        ListingDescLabel.setText(list.GetDescription());
        ListingPriceLabel.setText("Price: " + Float.toString(list.GetPrice()));
        //make sure there is an image to show
        if(list.GetListingImage() != null)
        {
            //Get bufferedImage from the listing
            ImageIcon listImage = list.GetListingImage();
            
            //Create a previewIcon from a scaled instance of listImage
            ImageIcon previewIcon = new ImageIcon(listImage.getImage().getScaledInstance(ListingImageLabel.getPreferredSize().width,ListingImageLabel.getPreferredSize().height,0));
            
            //Set label to previewIcon.
            ListingImageLabel.setIcon(previewIcon);
        }
        else
        {   
            ListingImageLabel.setText("Image Missing");
        }
    }
    
    public void SetCart(ShoppingCart cart)
    {
        cartRef = cart;
    }
    
    public void SetShopPanel(ShoppingCartPanel shopCart)
    {
        shopCartPanelRef = shopCart;
    }
    
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RemoveButtonActionPerformed
    {//GEN-HEADEREND:event_RemoveButtonActionPerformed
        // TODO add your handling code here:
        cartRef.RemoveListing(thisListing);
        shopCartPanelRef.RefreshListings();
    }//GEN-LAST:event_RemoveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListingDescLabel;
    private javax.swing.JLabel ListingImageLabel;
    private javax.swing.JLabel ListingNameLabel;
    private javax.swing.JLabel ListingPriceLabel;
    private javax.swing.JButton RemoveButton;
    // End of variables declaration//GEN-END:variables
}
