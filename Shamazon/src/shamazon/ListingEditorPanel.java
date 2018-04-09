/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;
import java.util.HashSet;
import java.math.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.*;


/**
 *
 * @author Charles
 */
public class ListingEditorPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListingEditorPanel
     */
    public ListingEditorPanel() {
        initComponents();
    }
    
    /**
     * Listing either passed into the editor or a blank default one.
     */
    private Listing listingToEdit;
    private String editorImagePath;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DescriptionTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SaveEditorButton = new javax.swing.JButton();
        EditorCancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TagTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PriceTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ImageTextField = new javax.swing.JTextField();
        EditorLoadImageButton = new javax.swing.JButton();
        ImagePreviewLabel = new javax.swing.JLabel();

        DescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        SaveEditorButton.setText("Save");
        SaveEditorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEditorButtonActionPerformed(evt);
            }
        });

        EditorCancelButton.setText("Cancel");
        EditorCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorCancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Price:");

        TagTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TagTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Tag:");

        PriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Image:");

        ImageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageTextFieldActionPerformed(evt);
            }
        });

        EditorLoadImageButton.setText("Load Image");
        EditorLoadImageButton.setActionCommand("ImageLoadButton");
        EditorLoadImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorLoadImageButtonActionPerformed(evt);
            }
        });

        ImagePreviewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagePreviewLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShamazonResources/ClientImages/ImageMissing.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NameTextField)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DescriptionTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TagTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ImagePreviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ImageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(EditorLoadImageButton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(SaveEditorButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(EditorCancelButton)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditorLoadImageButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TagTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 71, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditorCancelButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SaveEditorButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(ImagePreviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        DescriptionTextField.getAccessibleContext().setAccessibleName("DescriptionField");
        NameTextField.getAccessibleContext().setAccessibleName("NameField");
        SaveEditorButton.getAccessibleContext().setAccessibleName("EditorSave");
        EditorCancelButton.getAccessibleContext().setAccessibleName("EditorCancel");
        TagTextField.getAccessibleContext().setAccessibleName("TagField");
        jLabel4.getAccessibleContext().setAccessibleName("Tag");
        EditorLoadImageButton.getAccessibleContext().setAccessibleName("LoadImageButton");
    }// </editor-fold>//GEN-END:initComponents
    
    public void LoadListing(Listing list)
    {
        listingToEdit = list;
        NameTextField.setText(listingToEdit.GetName());
        DescriptionTextField.setText(listingToEdit.GetDescription());
        PriceTextField.setText(Float.toString(listingToEdit.GetPrice()));
        TagTextField.setText(listingToEdit.GetTag());
        
        //Image fanagling
    }
    
    private void DescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTextFieldActionPerformed
    
    private void SaveEditorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveEditorButtonActionPerformed
        listingToEdit.SetName(NameTextField.getText());
        listingToEdit.SetDescription(DescriptionTextField.getText());
        listingToEdit.SetPrice(Float.parseFloat(PriceTextField.getText()));
        listingToEdit.SetTag(TagTextField.getText());
        
        //Image fanagling goes here
        //listingToEdit.SetListingImage();
        String imagePath = editorImagePath;
        File imageFile = new File(imagePath);
        try
        {
            BufferedImage imgBuff = ImageIO.read(imageFile);
            listingToEdit.SetListingImage(imgBuff);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Invalid image file passed. No image saved.");
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("IOException found in image reading. No image saved.");
            System.out.println(e.getMessage());
        }
        
        
        //Pass listing to database
        //Update if already exists
    }//GEN-LAST:event_SaveEditorButtonActionPerformed

    private void EditorCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorCancelButtonActionPerformed
        
    }//GEN-LAST:event_EditorCancelButtonActionPerformed

    private void TagTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TagTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TagTextFieldActionPerformed

    private void PriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextFieldActionPerformed

    private void ImageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImageTextFieldActionPerformed

    private void EditorLoadImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorLoadImageButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
            chooser.getSelectedFile().getName());
            editorImagePath = chooser.getSelectedFile().getPath();
            ImageTextField.setText(chooser.getSelectedFile().getName());
        }  
    }//GEN-LAST:event_EditorLoadImageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JButton EditorCancelButton;
    private javax.swing.JButton EditorLoadImageButton;
    private javax.swing.JLabel ImagePreviewLabel;
    private javax.swing.JTextField ImageTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JButton SaveEditorButton;
    private javax.swing.JTextField TagTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
