/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.image.BufferedImage;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JTextField;

/**
 *
 * @author Luke
 */
public class UserAccountEditor extends javax.swing.JPanel 
{
    private UserAccount userAccount;
    private ImageIcon avatar;
    private JDialog parentDialog;

    /**
     * Creates new form UserAccountEditor
     */
    public UserAccountEditor(UserAccount userAccount, JDialog parentDialog)
    {
        initComponents();
        this.userAccount = userAccount;
        this.parentDialog = parentDialog;
        LoadUserAccount();
        
        creditCardTextField.setInputVerifier(new ValidatorBase(creditCardTextField) 
        {
            @Override
            public boolean ValidateInput(JComponent input)
            {
                String text = ((JTextField)input).getText();
                
                if(text.length() != 16) return false;
                try 
                {  
                    Long.parseLong(text);
                } 
                catch (NumberFormatException e)   
                {  
                    return false;  
                }
                return true;
            }
        });
        
        usernameTextField.setInputVerifier(new ValidatorBase(creditCardTextField) 
        {
            @Override
            public boolean ValidateInput(JComponent input)
            {
                String text = ((JTextField)input).getText();
                
                try
                {
                    if(text == "") return false;
                    
                    if(DatabaseManager.IsUsernameAvailable(userAccount, usernameTextField.getText()))
                        return true;
                    else
                        return false;
                }                
                catch(SQLException e)
                {
                    return false;
                }
            }
        });
        
        passwordTextField.setInputVerifier(new EmptyTextValidator(passwordTextField));
        nameTextField.setInputVerifier(new EmptyTextValidator(nameTextField));
        addressTextField.setInputVerifier(new EmptyTextValidator(addressTextField));
        emailTextField.setInputVerifier(new EmptyTextValidator(emailTextField));
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        avatarLabel = new javax.swing.JLabel();
        creditCardTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        loadAvatarButton = new javax.swing.JButton();

        addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
                formAncestorRemoved(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Address");

        addressTextField.setName(""); // NOI18N

        jLabel6.setText("Email");

        emailTextField.setName(""); // NOI18N

        avatarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShamazonResources/ClientImages/ImageMissing.png"))); // NOI18N
        avatarLabel.setPreferredSize(new java.awt.Dimension(150, 150));

        creditCardTextField.setName(""); // NOI18N

        usernameTextField.setName(""); // NOI18N

        jLabel7.setText("Credit Card Number");

        passwordTextField.setName(""); // NOI18N

        cancelButton.setText("Cancel");
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                cancelButtonMouseClicked(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        saveButton.setText("Save");
        saveButton.setName("saveButton"); // NOI18N
        saveButton.setPreferredSize(new java.awt.Dimension(65, 23));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                saveButtonMouseClicked(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        nameTextField.setName(""); // NOI18N

        loadAvatarButton.setText("Load Avatar");
        loadAvatarButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                loadAvatarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(nameTextField)
                            .addComponent(addressTextField)
                            .addComponent(emailTextField)
                            .addComponent(creditCardTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(passwordTextField)
                                    .addComponent(loadAvatarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadAvatarButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creditCardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        avatarLabel.getAccessibleContext().setAccessibleName("avatarLabel");
        usernameTextField.getAccessibleContext().setAccessibleName("");
        passwordTextField.getAccessibleContext().setAccessibleName("passwordTextField");
    }// </editor-fold>//GEN-END:initComponents

    private void loadAvatarButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_loadAvatarButtonMouseClicked
    {//GEN-HEADEREND:event_loadAvatarButtonMouseClicked
        avatar = ImageLoader.LoadImage();
        LoadAvatar(avatar);
    }//GEN-LAST:event_loadAvatarButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cancelButtonMouseClicked
    {//GEN-HEADEREND:event_cancelButtonMouseClicked
        this.userAccount = null;
        parentDialog.dispose();
        
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_saveButtonMouseClicked
    {//GEN-HEADEREND:event_saveButtonMouseClicked
        if(!saveButton.hasFocus()) return;
        
        SaveUserAccount();
        parentDialog.dispose();
    }//GEN-LAST:event_saveButtonMouseClicked

    private void formAncestorRemoved(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_formAncestorRemoved
    {//GEN-HEADEREND:event_formAncestorRemoved
       this.userAccount = null;
    }//GEN-LAST:event_formAncestorRemoved

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
    {//GEN-HEADEREND:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveButtonActionPerformed
    {//GEN-HEADEREND:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void LoadAvatar(ImageIcon avatar)
    {
        avatar = new ImageIcon(avatar.getImage().getScaledInstance(avatarLabel.getPreferredSize().width, avatarLabel.getPreferredSize().height, 0));
       
        avatarLabel.setIcon(avatar);
    }
    
    public void LoadUserAccount()
    {
        if(userAccount == null) return;
        
        this.avatar = userAccount.GetAvatar();
        if(avatar != null) LoadAvatar(avatar);
        
        usernameTextField.setText(userAccount.GetUsername());
        passwordTextField.setText(userAccount.GetPassword());
        nameTextField.setText(userAccount.GetName());
        addressTextField.setText(userAccount.GetAddress());
        emailTextField.setText(userAccount.GetEmail());
        creditCardTextField.setText(userAccount.GetCreditCardNumber());
    }
    
    private void SaveUserAccount()
    {
        userAccount.SetUsername(usernameTextField.getText());
        userAccount.SetPassword(passwordTextField.getText());
        userAccount.SetName(nameTextField.getText());
        userAccount.SetAddress(addressTextField.getText());
        userAccount.SetEmail(emailTextField.getText());
        userAccount.SetCreditCardNumber(creditCardTextField.getText());
        userAccount.SetAvatar(avatar);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel avatarLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField creditCardTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton loadAvatarButton;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
