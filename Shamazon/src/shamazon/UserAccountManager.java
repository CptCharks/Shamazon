/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.Dialog;
import java.awt.Frame;
import javax.swing.JDialog;

/**
 * Provides static functions to create and edit UserAccount objects in the database
 * @author Luke
 */
public class UserAccountManager
{
    public static UserAccount CreateNewUserAccount(Frame owner)
    {
        UserAccount newAccount = new UserAccount();
        JDialog parentDialog = new JDialog(owner, true);
        parentDialog.setContentPane(new UserAccountEditor(newAccount, parentDialog));
        parentDialog.pack();
        parentDialog.setVisible(true);
        
        return newAccount;
    }
    
    public static UserAccount EditUserAccount(Frame owner, UserAccount account)
    {
        JDialog parentDialog = new JDialog(owner, true);
        parentDialog.setContentPane(new UserAccountEditor(account, parentDialog));
        parentDialog.pack();
        parentDialog.setVisible(true);
        
        return account;
    }
    
    public static UserAccount CreateNewUserAccount(Dialog owner)
    {
        UserAccount newAccount = new UserAccount();
        JDialog parentDialog = new JDialog(owner, true);
        parentDialog.setContentPane(new UserAccountEditor(newAccount, parentDialog));
        parentDialog.pack();
        parentDialog.setVisible(true);
        
        return newAccount;
    }
    
    public static UserAccount EditUserAccount(Dialog owner, UserAccount account)
    {
        JDialog parentDialog = new JDialog(owner, true);
        parentDialog.setContentPane(new UserAccountEditor(account, parentDialog));
        parentDialog.pack();
        parentDialog.setVisible(true);
        
        return account;
    }
}
