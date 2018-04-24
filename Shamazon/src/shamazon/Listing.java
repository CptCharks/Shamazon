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
 * Listing: Contains item name, description, tag, image, price, availability
 * Does not edit itself. Relies on the listingBrowser to display information and
 * an editor to modify itself.
 * @author Charles The Well-Endowed
 */
public class Listing extends ShamazonObject
{
    /**
     * The listing's name
     */
    private String listingName;
    
    /**
     * The listing's description
     */
    private String listingDescription;
    
    /*
    * The listing's tag
    */
    private String listingTag;
    
    //Image imageFile
    private BufferedImage listingImage;
    
    /**
     * The listing's price
     */
    private float listingPrice;
    
    //UserAccount Account object 
    
    /**
     * Whether the listing is available for purchase
    */
    private boolean listingAvailable;
    
    /**
     * The owner of the listing
     */
    private UserAccount listingOwner;
    
    /**
     * Default constructor
     */
    public Listing(String name, UserAccount owner, String desc, float price, String tag, BufferedImage img)
    {
        listingName = name;
        listingOwner = owner;
        listingDescription = desc;
        listingPrice = price;
        listingTag = tag;
        listingImage = img;
    }
    
    /**
     * Default constructor for blank listings
     */
    public Listing()
    {
        listingName = "";
        listingDescription = "";
        listingPrice = 0.0f;
        listingTag = "";
        listingImage = null;
        
    }
    /**
     * Sets the name of the listing.
     * @param name The name to change the listing to. 
     */
    public void SetName(String name)
    {
        listingName = new String(name);
    }
   
    /**
     * Sets the description of the listing.
     * @param description The description to change the listing to.
     */
    public void SetDescription(String description)
    {
        listingDescription = new String(description);
    }
    
    /**
     * Sets the tag of the listing.
     * @param tag The tag to change the listing to.
     */
    public void SetTag(String tag)
    {
        listingTag = new String(tag);
    }
    
    /**
     * Sets the image of the listing.
     * @param img The image to change the listing to.
     */
    public void SetListingImage(BufferedImage img)
    {
        listingImage = img;
    }
    
    /**
     * Sets the price of the listing.
     * @param price The price to change the listing to.
     */
    public void SetPrice(float price)
    {
        listingPrice = price;
    }
    
    /**
     * Gets the name of the listing.
     * @return Returns a copy of the listing's name.
     */
    public String GetName()
    {
        String cpName = new String(this.listingName);
        return cpName;
    }
    
    /**
     * Gets the description of the listing.
     * @return Returns a copy of the listing.
     */
    public String GetDescription()
    {
        String cpDesc = new String(this.listingDescription);
        return cpDesc;
    }
    
    /**
     * Gets the tag of the listing.
     * @return Returns a copy of the listing's tag.
     */
    public String GetTag()
    {
        String cpTag = new String(listingTag);
        return cpTag;
    }
    
    /**
     * Gets the image of the listing.
     * @return Returns a copy of the listing's image;
     */
    public BufferedImage GetListingImage()
    {
        //Doesn't like passing a new image
        BufferedImage cpImg = this.listingImage;
        return cpImg;
    }
    
    /**
     * Gets the price of the listing.
     * @return Returns a copy of the listing's price;
     */
    public float GetPrice()
    {
        //TODO: Is this right?
        float cpPrice = this.listingPrice;
        return cpPrice;
    }
    
    /**
     * Gets the availability of the listing. i.e whether it's sold already.
     * @return Returns a copy of the availability.
     */
    public boolean GetAvailability()
    {
        boolean cpAvl = this.listingAvailable;
        return cpAvl;
    }
    
    /**
     * 
     * @return the owner of the listing
     */
    public UserAccount GetOwner()
    {
        return this.listingOwner;
    }
}
