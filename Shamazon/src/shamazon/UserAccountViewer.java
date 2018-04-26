/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Luke
 */
public class UserAccountViewer extends javax.swing.JPanel
{
    UserAccount account;

    /**
     * Creates new form UserAccountViewer
     */
    public UserAccountViewer(UserAccount account)
    {
        this.account = account;
        initComponents();
        
        LoadAccount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatarLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        creditCardLabel = new javax.swing.JLabel();
        purchasedListingsButton = new javax.swing.JButton();
        postedListingsButton = new javax.swing.JButton();
        jButtonEditAccount = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(580, 175));

        avatarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShamazonResources/ClientImages/ImageMissing.png"))); // NOI18N
        avatarLabel.setMaximumSize(new java.awt.Dimension(150, 150));
        avatarLabel.setMinimumSize(new java.awt.Dimension(150, 150));
        avatarLabel.setPreferredSize(new java.awt.Dimension(150, 150));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        usernameLabel.setText("jLabel1");
        usernameLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameLabel.setText("jLabel1");
        nameLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addressLabel.setText("jLabel1");
        addressLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailLabel.setText("jLabel1");
        emailLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        creditCardLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        creditCardLabel.setText("jLabel1");
        creditCardLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Credit Card Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        purchasedListingsButton.setText("Purchased Listings");
        purchasedListingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchasedListingsButtonMouseClicked(evt);
            }
        });

        postedListingsButton.setText("Posted Listings");
        postedListingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postedListingsButtonMouseClicked(evt);
            }
        });

        jButtonEditAccount.setText("Edit Account");
        jButtonEditAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(postedListingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(purchasedListingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addComponent(creditCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(creditCardLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressLabel))
                    .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postedListingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchasedListingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void purchasedListingsButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_purchasedListingsButtonMouseClicked
    {//GEN-HEADEREND:event_purchasedListingsButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_purchasedListingsButtonMouseClicked

    private void postedListingsButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_postedListingsButtonMouseClicked
    {//GEN-HEADEREND:event_postedListingsButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_postedListingsButtonMouseClicked

    private void jButtonEditAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditAccountActionPerformed
        UserAccount editAccount = account;
        editAccount = UserAccountManager.EditUserAccount(new JFrame(), editAccount);
        if (editAccount != null)
        {
            account = editAccount;
            LoadAccount();
            try {
                DatabaseManager.UpdateObjectInDatabase(editAccount, "UserAccounts");
            } catch (SQLException ex) {
                Logger.getLogger(UserAccountViewer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonEditAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel avatarLabel;
    private javax.swing.JLabel creditCardLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton jButtonEditAccount;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton postedListingsButton;
    private javax.swing.JButton purchasedListingsButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private void LoadAccount()
    {
        usernameLabel.setText(account.GetUsername());
        nameLabel.setText(account.GetName());
        addressLabel.setText(account.GetAddress());
        emailLabel.setText(account.GetEmail());
        creditCardLabel.setText(account.GetCreditCardNumber());
        avatarLabel.setIcon(new ImageIcon(account.GetAvatar().getImage().getScaledInstance(avatarLabel.getPreferredSize().width, avatarLabel.getPreferredSize().height, 0)));
    }
}
