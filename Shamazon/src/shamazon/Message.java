/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;
import java.util.*;
import java.lang.String;
import java.awt.image.*;
/**
 * Message: Contains a message string containing the message, a Message title
 * and the names of the sender and receiver of the message.
 * 
 */
public class Message {
    
    /**
     * A String holding the message
     */
    private String message;
    /**
     * A string containing the Message Title
     */
    private String title;
    /**
     * A String containing the name of the sender
     */    
    private String sender;
    /**
     * A String containing the name of the recipient of the message.
     */   
    private String recipient;
    
    

/**
 * Returns the message
 * @return message
 */
    public String GetMessage()
    {
        return message;
    }
/**
 * Sets the message to send
 */
    public void SetMessage()
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
     * Sets the title on the message to be sent
     */
    public void SetTitle()
    {
        this.title = title;
    }
    /**
     * Returns the name of the user sending the message
     * @return sender
     */
    public String GetSender()
    {   
        return sender;
    }
    /**
     * Sets the name of the sender of the message
     */
    public void SetSender()
    {
        this.sender = sender;
    }
    /**
     * Returns the intended recipient of the message
     * @return recipient
     */
    public String GetRec()
    {   
        return recipient;
    }
    /**
     * Set the Recipient of the message.
     */
    public void SetRec()
    {
        this.recipient = recipient;
    }
    
}