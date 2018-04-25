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
/**
 * Message: Contains a message string containing the message, a Message title
 * and the names of the sender and receiver of the message.
 * 
 */
public class Message implements Serializable
{
    
    /**
     * A String holding the message
     */
    private String message;
    /**
     * A string containing the Message Title
     */
    private String title;
    /**
     * The sender's account
     */    
    private UserAccount sender;
    /**
     * The recipient's account
     */   
    private UserAccount recipient;
    
    public Message(String message, String title, UserAccount sender, UserAccount recipient)
    {
        this.message = message;
        this.title = title;
        this.sender = sender;
        this.recipient = recipient;
    }

    /**
     * Returns the message
     * @return message
     */
    public String GetMessage()
    {
        return message;
    }
    
    /**
     * 
     * @param message the message to set
     */
    public void SetMessage(String message)
    {
        this.message = message;
    }
    
    /**
     * returns the title of the message to be sent
     * @return title
     */
    public String GetTitle()
    {
        return title;
    }
    
    /**
     * 
     * @param title the title to set
     */
    public void SetTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * Returns the name of the user sending the message
     * @return sender
     */
    public UserAccount GetSender()
    {   
        return sender;
    }
    
    /**
     * 
     * @param sender the sender to set
     */
    public void SetSender(UserAccount sender)
    {
        this.sender = sender;
    }
    
    /**
     * Returns the intended recipient of the message
     * @return recipient
     */
    public UserAccount GetRecipient()
    {   
        return recipient;
    }
    
    
    /**
     * 
     * @param recipient the recipient to set
     */
    public void SetRecipient(UserAccount recipient)
    {
        this.recipient = recipient;
    }
    
}