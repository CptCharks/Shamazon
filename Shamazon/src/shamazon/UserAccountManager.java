/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.Dialog;
import java.awt.Frame;
import java.sql.SQLException;
import javax.swing.JDialog;

/**
 * Provides static functions to create and edit UserAccount objects in the database
 * @author Luke
 */
public class UserAccountManager
{
    /**
     * Creates a new UserAccount and adds it to the database
     * @param owner the owner frame for the modal dialog to be created
     * @return the new UserAccount if successfully created, otherwise null
     */
    public static UserAccount CreateNewUserAccount(Frame owner)
    {
        UserAccount newAccount = new UserAccount();
        newAccount = CreateUserAccountEditor(owner, newAccount);
        if(newAccount != null)
        {
            try
            {
                DatabaseManager.AddObjectToDatabase(newAccount, "UserAccounts");
            }
            catch(SQLException e)
            {
                return null;
            }
        }
        
        return newAccount;
    }
    
    /**
     * Edits a UserAccount and updates it in the database
     * @param owner the owner frame for the modal dialog to be created
     * @return the new UserAccount if successfully edited, otherwise null
     */
    public static UserAccount EditUserAccount(Frame owner, UserAccount account)
    {
        account = CreateUserAccountEditor(owner, account);
        if(account != null)
        {
            try
            {
                DatabaseManager.UpdateObjectInDatabase(account, "UserAccounts");
            }
            catch(SQLException e)
            {
                return null;
            }
        }
        
        return account;
    }
    
    /**
     * Creates a new UserAccount and adds it to the database
     * @param owner the owner dialog for the modal dialog to be created
     * @return the new UserAccount if successfully created, otherwise null
     */
    public static UserAccount CreateNewUserAccount(Dialog owner)
    {
        UserAccount newAccount = new UserAccount();
        newAccount = CreateUserAccountEditor(owner, newAccount);
        if(newAccount != null)
        {
            try
            {
                DatabaseManager.AddObjectToDatabase(newAccount, "UserAccounts");
            }
            catch(SQLException e)
            {
                return null;
            }
        }
        
        return newAccount;
    }
    
    /**
     * Edits a UserAccount and updates it in the database
     * @param owner the owner frame for the modal dialog to be created
     * @return the new UserAccount if successfully edited, otherwise null
     */
    public static UserAccount EditUserAccount(Dialog owner, UserAccount account)
    {
        account = CreateUserAccountEditor(owner, account);
        if(account != null)
        {
            try
            {
                DatabaseManager.UpdateObjectInDatabase(account, "UserAccounts");
            }
            catch(SQLException e)
            {
                return null;
            }
        }
        
        return account;
    }
    
    /**
     * Opens a new UserAccountEditor in a dialog to edit account details
     * @param owner the frame which will own the dialog
     * @param account the UserAccount to be edited
     * @return the edited UserAccount if editing succeeds, otherwise null
     */
    private static UserAccount CreateUserAccountEditor(Frame owner, UserAccount account)
    {
        JDialog parentDialog = new JDialog(owner, true);
        parentDialog.setContentPane(new UserAccountEditor(account, parentDialog));
        parentDialog.pack();
        parentDialog.setVisible(true);
        
        return account;
    }
    
    /**
     * Opens a new UserAccountEditor in a dialog to edit account details
     * @param owner the frame which will own the dialog
     * @param account the UserAccount to be edited
     * @return the edited UserAccount if editing succeeds, otherwise null
     */
    private static UserAccount CreateUserAccountEditor(Dialog owner, UserAccount account)
    {
        JDialog parentDialog = new JDialog(owner, true);
        parentDialog.setContentPane(new UserAccountEditor(account, parentDialog));
        parentDialog.pack();
        parentDialog.setVisible(true);
        
        return account;
    }
}
