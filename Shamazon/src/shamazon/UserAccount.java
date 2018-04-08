/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.image.BufferedImage;

/**
 *
 * @author Luke
 */
public class UserAccount {
    
    private String name;
    private String email;
    private String address;
    private String username;
    private String password;
    // private CreditCardInformation creditCard;
    private BufferedImage avatar;
    // private Mailbox mailbox;
    // COLLECTION OF LISTINGS
    
   /**
    * Creates a new UserAccount object
    * 
    * @param name The name which will appear on the user's shipping address
    * @param email The user's email address
    * @param address The user's shipping address
    * @param username The login and display name for the account
    * @param password The password used to login to the account
    * @param avatar An image which appears on the user's profile page
    */
    public UserAccount(String name, String email, String address, String username, String password, BufferedImage avatar)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.address = address;
        this.password = password;
        this.avatar = avatar;
        
        // Credit card info
        // this.mailbox = new Mailbox()
    }
    
    /**
     * 
     * @return the user's name as it would appear on a shipping address
     */
    public String GetName()
    {
        return name;
    }
    
    /**
     *
     * @param name the user's name as it would appear on a shipping address
     */
    public void SetName(String name)
    {
        this.name = name; 
    }
    
    /**
     * 
     * @return the user's email address 
     */
    public String GetEmail()
    {
        return email;
    }
    
    /**
     * 
     * @param email the email address to be set
     */
    public void SetEmail(String email)
    {
        this.email = email;
    }
       
    /**
     * 
     * @return the user's screen name
     */
    public String GetUsername()
    {
        return username;
    }
    
  /**
   * 
   * @param username the username string to be set
   */
    public void SetUsername(String username)
    {
        this.username = username;
    }
    
    /**
     * 
     * @return the user's avatar
     */
    public BufferedImage GetAvatar()
    {
        return avatar;
    }
    
   /**
    * 
    * @param avatar the avatar to be set
    */
    public void SetAvatar(BufferedImage avatar)
    {
       this.avatar = avatar;
    }
}
