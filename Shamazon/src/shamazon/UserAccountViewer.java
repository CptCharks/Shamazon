/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import javax.swing.ImageIcon;

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
    private void initComponents()
    {

        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        avatarLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        creditCardLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(580, 175));

        jLabel7.setText("Credit Card Number");

        jLabel4.setText("Name");

        jLabel2.setText("Username");

        jLabel5.setText("Address");

        jLabel6.setText("Email");

        avatarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShamazonResources/ClientImages/ImageMissing.png"))); // NOI18N
        avatarLabel.setMaximumSize(new java.awt.Dimension(150, 150));
        avatarLabel.setMinimumSize(new java.awt.Dimension(150, 150));
        avatarLabel.setPreferredSize(new java.awt.Dimension(150, 150));

        usernameLabel.setText("jLabel1");
        usernameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameLabel.setText("jLabel1");
        nameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addressLabel.setText("jLabel1");
        addressLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        emailLabel.setText("jLabel1");
        emailLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        creditCardLabel.setText("jLabel1");
        creditCardLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(addressLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(usernameLabel)
                            .addComponent(nameLabel))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditCardLabel)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(emailLabel))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(creditCardLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addressLabel))
                    .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel avatarLabel;
    private javax.swing.JLabel creditCardLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nameLabel;
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
