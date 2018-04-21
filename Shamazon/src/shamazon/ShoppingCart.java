/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles
 */
public class ShoppingCart
{
     /**
     * List of listings to represent the user's shopping cart.
     */
    List<Listing> shoppingcart_list = new ArrayList<Listing>();
    
    /**
     * Adds a listing from the shopping cart and updates the list visually.
     * @param listing The listing to add to the shopping cart.
     */
    public void AddListing(Listing listing)
    {
        shoppingcart_list.add(listing);
        
        //Update visual list
    }
    
    /**
     * Removes a listing from the shopping cart and updates the list visually.
     * @param listing The listing to remove from the shopping cart.
     */
    public void RemoveListing(Listing listing)
    {
        if(shoppingcart_list.contains(listing))
        {
            shoppingcart_list.remove(listing);
        }
        
        //Update visual list
    }
    
    
    public List<Listing> GetCart()
    {
        
        return shoppingcart_list;
    }
    
}
