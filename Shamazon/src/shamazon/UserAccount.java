/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Stores information about a user
 * @author Luke
 */
public class UserAccount extends ShamazonObject
{
    
    private String name;
    private String email;
    private String address;
    private String username;
    private String password;
    private String creditCardNumber;
    private ImageIcon avatar;
    private ArrayList<Listing> postedListings = new ArrayList<Listing>();
    private ArrayList<Listing> purchasedListings = new ArrayList<Listing>();
    private Mailbox mailbox;
    
    /**
     * Creates a new UserAccount with default field values
     */
    public UserAccount()
    {
        
    }
    
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
    public UserAccount(String username, String password, String name, String address, String email, String creditCardNumber, ImageIcon avatar)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.address = address;
        this.password = password;
        this.creditCardNumber = creditCardNumber;
        this.avatar = avatar;
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
     * @return the user's password
     */
    public String GetPassword()
    {
        return this.password;
    }
    
    /**
     * 
     * @param password the password to be set
     */
    public void SetPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * 
     * @return the user's avatar
     */
    public ImageIcon GetAvatar()
    {
        return avatar;
    }
    
   /**
    * 
    * @param avatar the avatar to be set
    */
    public void SetAvatar(ImageIcon avatar)
    {
       this.avatar = avatar;
    }
    
    /**
     * 
     * @return the user's credit card number
     */
    public String GetCreditCardNumber()
    {
        return creditCardNumber;
    }
    
    /**
     * 
     * @param creditCardNumber the credit card number to be set
     */
    public void SetCreditCardNumber(String creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }
    
    /**
     * 
     * @return the user's address
     */
    public String GetAddress()
    {
        return this.address;
    }
    
    /**
     * 
     * @param address the address to be set
     */
    public void SetAddress(String address)
    {
        this.address = address;
    }
    
    /**
     * Adds a posted listing
     * @param listing the listing to be posted
     */
    public void AddPostedListing(Listing listing)
    {
        postedListings.add(listing);
    }
    
    /**
     * Removes a posted listing
     * @param listing the listing to be removed
     */
    public void RemovePostedListing(Listing listing)
    {
        postedListings.remove(listing);
    }
    
    /**
     * 
     * @return the list of the user's posted listings
     */
    public ArrayList<Listing> GetPostedListings()
    {
        return postedListings;
    }
    
    /**
     * Adds a purchased listing
     * @param listing the listing which was purchased
     */
    public void AddPurchasedListing(Listing listing)
    {
        purchasedListings.add(listing);
    }
    
    /**
     * Removes a purchased listing
     * @param listing the listing which was returned
     */
    public void RemovePurchasedListing(Listing listing)
    {
        purchasedListings.remove(listing);
    }
    
    /**
     * 
     * @return the list of the user's purchased listings
     */
    public ArrayList<Listing> GetPurchasedListings()
    {
        return purchasedListings;
    }
    
    /**
     * 
     * @return the user's mailbox
     */
    public Mailbox GetMailbox()
    {
        return this.mailbox;
    }
}
