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
public class Listing 
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
     * Sets the name of the listing.
     * @param name The name to change the listing to. 
     */
    public void setName(String name)
    {
        listingName = new String(name);
    }
   
    /**
     * Sets the description of the listing.
     * @param description The description to change the listing to.
     */
    public void setDescription(String description)
    {
        listingDescription = new String(description);
    }
    
    /**
     * Sets the tag of the listing.
     * @param tag The tag to change the listing to.
     */
    public void setTag(String tag)
    {
        listingTag = new String(tag);
    }
    
    /**
     * Sets the image of the listing.
     * @param img The image to change the listing to.
     */
    public void setListingImage(BufferedImage img)
    {
        listingImage = img;
    }
    
    /**
     * Sets the price of the listing.
     * @param price The price to change the listing to.
     */
    public void setPrice(float price)
    {
        listingPrice = price;
    }
    
    /**
     * Gets the name of the listing.
     * @return Returns a copy of the listing's name.
     */
    public String getName()
    {
        String cpName = new String(this.listingName);
        return cpName;
    }
    
    /**
     * Gets the description of the listing.
     * @return Returns a copy of the listing.
     */
    public String getDescription()
    {
        String cpDesc = new String(this.listingDescription);
        return cpDesc;
    }
    
    /**
     * Gets the tag of the listing.
     * @return Returns a copy of the listing's tag.
     */
    public String getTag()
    {
        String cpTag = new String(listingTag);
        return cpTag;
    }
    
    /**
     * Gets the image of the listing.
     * @return Returns a copy of the listing's image;
     */
    public BufferedImage getListingImage()
    {
        //Doesn't like passing a new image
        BufferedImage cpImg = this.listingImage;
        return cpImg;
    }
    
    /**
     * Gets the price of the listing.
     * @return Returns a copy of the listing's price;
     */
    public float getPrice()
    {
        //TODO: Is this right?
        float cpPrice = this.listingPrice;
        return cpPrice;
    }
    
    /**
     * Gets the availability of the listing. i.e whether it's sold already.
     * @return Returns a copy of the availability.
     */
    public boolean getAvailability()
    {
        boolean cpAvl = this.listingAvailable;
        return cpAvl;
    }
}
