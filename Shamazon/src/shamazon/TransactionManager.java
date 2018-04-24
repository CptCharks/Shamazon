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
    
    List<Listing> listingsToBuy;
    
    private DatabaseManager dataMan;
    
    public TransactionManager(DatabaseManager dm)
    {
        dataMan = dm;
    }
    
    public void CheckOut()
    {
        
    }
   
    public void PurchaseListing()
    {
        
    }
}
