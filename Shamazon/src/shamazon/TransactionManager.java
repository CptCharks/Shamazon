/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Charles
 */
public class TransactionManager
{
    //Database manager is has static functions for this
    
    /**
     * Reference to the user
     */
    private UserAccount userAccount;
    
    private List<Listing> listingsToBuy;
    
    /**
     * Constructor for TransactionManager
     * @param user The user that this is for.
     */
    public TransactionManager(UserAccount user)
    {
        userAccount = user;
    }
    
    /**
     * Sets the list of listings to the shopping cart for PurchaseListing() and calls it.
     * @param toBuy 
     */
    public void CheckOut(List<Listing> toBuy)
    {
       listingsToBuy = toBuy;
       PurchaseListing();
    }
   
    /**
     * Adds the listing to the user's purchased account, removes from main database, and removes from owner's account
     */
    private void PurchaseListing()
    {
        //Add to the user's purchased list if we're still doing it
        
        for(int i = 0; i < listingsToBuy.size();i++)
        {
            try
            {
                userAccount.AddPurchasedListing(listingsToBuy.get(i));
                DatabaseManager.RemoveObjectFromDatabase(listingsToBuy.get(i),"Listings");
                listingsToBuy.get(i).GetOwner().RemovePostedListing(listingsToBuy.get(i));
            }
            catch(SQLException e)
            {
                
            }
        }
        
        listingsToBuy.clear();
    }
}
