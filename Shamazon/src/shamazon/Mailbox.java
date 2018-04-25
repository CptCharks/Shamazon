/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;
import java.util.*;
import java.lang.String;
import java.awt.image.*;
import java.io.Serializable;
import java.sql.SQLException;


/**
 * Holds a list of messages which have been sent to the owner of this Mailbox.
 * Supplies methods to send and receive messages.
 */
public class Mailbox implements Serializable
{
    private ArrayList<Message> inbox;
    private UserAccount owner;
    
    /**
     * Creates a new Mailbox
     */
    public Mailbox(UserAccount owner) 
    { 
        this.owner = owner;
    }
    
    /**
     * Sends a message to another user's mailbox
     * @param receiver the receiver's username
     * @param title the title of the message
     * @param messageText the text of the message
     */
    public void SendMessage(String receiver, String title, String messageText)
    {
        UserAccount receiverAccount;
        try
        {
            receiverAccount = DatabaseManager.GetUserAccountByName(receiver);
        }
        catch(SQLException e)
        {
            return;
        }
        
        Mailbox receivingMailbox = receiverAccount.GetMailbox();
        
        Message message = new Message(messageText, title, this.owner, receiverAccount);
        receivingMailbox.AddMessage(message);
    }
    
    /**
     * Adds a message to the mailbox
     * @param message the message to be added
     */
    public void AddMessage(Message message)
    {
        inbox.add(message);
    }
    
    /**
     * Removes a message from a mailbox
     * @param message the message to be removed
     */
    public void RemoveMessage(Message message)
    {
        inbox.remove(message);
    }
    
    /**
     * 
     * @return the UserAccount which owns this mailbox
     */
    public UserAccount GetOwner()
    {
        return this.owner;
    }
}
