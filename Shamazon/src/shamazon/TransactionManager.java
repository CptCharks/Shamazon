/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.util.List;

/**
 *
 * @author Charles
 */
public class TransactionManager
{
    //Database manager is has static functions for this
    
    private List<Listing> listingsToBuy;
    
    public TransactionManager()
    {
        
    }
    
    public void CheckOut(List<Listing> toBuy)
    {
       listingsToBuy = toBuy;
       PurchaseListing();
    }
   
    public void PurchaseListing()
    {
        //Add to the user's purchased list if we're still doing it
        
        for(int i = 0; i < listingsToBuy.size()-1;i++)
        {
            //DatabaseManager.RemoveObjectFromDatabase();
        }
    }
}
