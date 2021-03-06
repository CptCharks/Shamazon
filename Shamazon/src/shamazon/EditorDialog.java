/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.*;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import java.awt.Window;
import java.sql.SQLException;

/**
 *
 * @author Charles
 */
public class EditorDialog extends javax.swing.JDialog
{

     /**
     * Listing either passed into the editor or a blank default one.
     */
    private Listing listingToEdit;
    
    public boolean creating;
    /*
    * Image file path name
    */
    private String editorImagePath;
    
    /**
     * Creates new form EditorDialog
     */
    public EditorDialog(java.awt.Frame parent, boolean modal, boolean create)
    {
        super(parent, modal);
        initComponents();
        creating = create;
    }

    public void LoadListing(Listing list)
    {
        listingToEdit = list;
        NameTextField.setText(listingToEdit.GetName());
        DescriptionTextField.setText(listingToEdit.GetDescription());
        PriceTextField.setText(Float.toString(listingToEdit.GetPrice()));
        TagTextField.setText(listingToEdit.GetTag());
        
        //make sure there is an image to show
        if(listingToEdit.GetListingImage() != null)
        {
            //Get bufferedImage from the listing
            ImageIcon listImage = listingToEdit.GetListingImage();
            
            //Create a previewIcon from a scaled instance of listImage
            ImageIcon previewIcon = new ImageIcon(listImage.getImage().getScaledInstance(ImagePreviewLabel.getWidth(),ImagePreviewLabel.getHeight(),0));
            
            //Set label to previewIcon.
            ImagePreviewLabel.setIcon(previewIcon);
        }
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

        jLabel1 = new javax.swing.JLabel();
        ImagePreviewLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SaveEditorButton = new javax.swing.JButton();
        EditorCancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TagTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PriceTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ImageTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        EditorLoadImageButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionTextField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name:");

        ImagePreviewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagePreviewLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShamazonResources/ClientImages/ImageMissing.png"))); // NOI18N

        jLabel2.setText("Description:");

        SaveEditorButton.setText("Save");
        SaveEditorButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SaveEditorButtonActionPerformed(evt);
            }
        });

        EditorCancelButton.setText("Cancel");
        EditorCancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditorCancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Price:");

        TagTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TagTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Tag:");

        PriceTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PriceTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Image:");

        ImageTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ImageTextFieldActionPerformed(evt);
            }
        });

        EditorLoadImageButton.setText("Load Image");
        EditorLoadImageButton.setActionCommand("ImageLoadButton");
        EditorLoadImageButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditorLoadImageButtonActionPerformed(evt);
            }
        });

        DescriptionTextField.setColumns(20);
        DescriptionTextField.setLineWrap(true);
        DescriptionTextField.setRows(5);
        DescriptionTextField.setToolTipText("");
        DescriptionTextField.setWrapStyleWord(true);
        jScrollPane2.setViewportView(DescriptionTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(EditorCancelButton)))))))
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditorCancelButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SaveEditorButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(ImagePreviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveEditorButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SaveEditorButtonActionPerformed
    {//GEN-HEADEREND:event_SaveEditorButtonActionPerformed
        if(!NameTextField.getText().isEmpty() && !PriceTextField.getText().isEmpty())
        {
            listingToEdit.SetName(NameTextField.getText());
            listingToEdit.SetDescription(DescriptionTextField.getText());
            listingToEdit.SetPrice(Float.parseFloat(PriceTextField.getText()));
            listingToEdit.SetTag(TagTextField.getText());

            if(editorImagePath != null)
            {
                ImageIcon imgBuff = ImageLoader.ImageFileToBufferedImage(editorImagePath);
                if (imgBuff != null)
                {
                    listingToEdit.SetListingImage(imgBuff);
                }
                else
                {
                    listingToEdit.SetListingImage(null);
                }
            }
            else
            {
                listingToEdit.SetListingImage(null);
            }
            //Pass listing to database
            //Update if already exists
            try
            {
                if(creating)
                {
                    DatabaseManager.AddObjectToDatabase(listingToEdit, "Listings");
                    UserAccount userRef = listingToEdit.GetOwner();
                    if(userRef != null)
                    {
                        userRef.AddPostedListing(listingToEdit);
                        DatabaseManager.UpdateObjectInDatabase(userRef, "UserAccounts");
                    }
                }
                else
                {
                    DatabaseManager.UpdateObjectInDatabase(listingToEdit, "Listings");
                }
            }
            catch(SQLException e)
            {

            }
        }
        else
        {
            if(NameTextField.getText().isEmpty())
            {
                NameTextField.setBackground(Color.red);
            }
            if(PriceTextField.getText().isEmpty())
            {
                PriceTextField.setBackground(Color.red);
            }
        }
        this.dispose();
    }//GEN-LAST:event_SaveEditorButtonActionPerformed

    private void EditorCancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditorCancelButtonActionPerformed
    {//GEN-HEADEREND:event_EditorCancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_EditorCancelButtonActionPerformed

    private void TagTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TagTextFieldActionPerformed
    {//GEN-HEADEREND:event_TagTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TagTextFieldActionPerformed

    private void PriceTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PriceTextFieldActionPerformed
    {//GEN-HEADEREND:event_PriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextFieldActionPerformed

    private void ImageTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ImageTextFieldActionPerformed
    {//GEN-HEADEREND:event_ImageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImageTextFieldActionPerformed

    private void EditorLoadImageButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditorLoadImageButtonActionPerformed
    {//GEN-HEADEREND:event_EditorLoadImageButtonActionPerformed
        //Create file chooser object
        JFileChooser chooser = new JFileChooser();
        //Create a file filter. Make sure you can only choose JPG and PNG.
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        //Set the filter for the chooser
        chooser.setFileFilter(filter);
        //Get return value from showOpenDialog
        int returnVal = chooser.showOpenDialog(null);
        //Check if approved
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            //System printout.
            System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
            //Store the image path for reference later
            editorImagePath = chooser.getSelectedFile().getPath();

            //Shorten the name for the user and store in text box.
            ImageTextField.setText(chooser.getSelectedFile().getName());

            File imageFile = new File(editorImagePath);

            try
            {
                //Get bufferedImage from the listing
                BufferedImage imgBuffPreview = ImageIO.read(imageFile);

                //Create a previewIcon from a scaled instance of listImage
                ImageIcon previewIcon = new ImageIcon(imgBuffPreview.getScaledInstance(ImagePreviewLabel.getWidth(),ImagePreviewLabel.getHeight(),0));

                //Set label to previewIcon.
                ImagePreviewLabel.setIcon(previewIcon);
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
        }
    }//GEN-LAST:event_EditorLoadImageButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(EditorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EditorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EditorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EditorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                EditorDialog dialog = new EditorDialog(new javax.swing.JFrame(), true, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionTextField;
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
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
