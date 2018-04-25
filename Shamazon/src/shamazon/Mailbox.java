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
 *
 * 
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
    
    public void SendMessage(UserAccount receiver, Message message)
    {
        Mailbox receivingMailbox = receiver.GetMailbox();
    }
    
    public void RecieveMessage(UserAccount sender, Message message)
    {
        
    }
                
    public void AddMessage(Message message)
    {
        inbox.add(message);
    }
    
    public void RemoveMessage(Message message)
    {
        inbox.remove(message);
    }
    
    
    public UserAccount GetOwner()
    {
        return this.owner;
    }
    
    
}
