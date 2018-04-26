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
    
    public TransactionManager(UserAccount user)
    {
        userAccount = user;
    }
    
    public void CheckOut(List<Listing> toBuy)
    {
       listingsToBuy = toBuy;
       PurchaseListing();
    }
   
    private void PurchaseListing()
    {
        //Add to the user's purchased list if we're still doing it
        
        for(int i = 0; i < listingsToBuy.size(); i++)
        {
            try
            {
                userAccount.AddPurchasedListing(listingsToBuy.get(i));
                UserAccount listingOwner = (UserAccount)DatabaseManager.GetUpdatedObjectFromDatabase(listingsToBuy.get(i).GetOwner(), "UserAccounts");
                listingOwner.RemovePostedListing(listingsToBuy.get(i));
                
                DatabaseManager.UpdateObjectInDatabase(userAccount, "UserAccounts");
                DatabaseManager.UpdateObjectInDatabase(listingOwner, "UserAccounts");
                DatabaseManager.RemoveObjectFromDatabase(listingsToBuy.get(i),"Listings");
            }
            catch(SQLException e)
            {
                
            }
        }
        
        listingsToBuy.clear();
    }
}
