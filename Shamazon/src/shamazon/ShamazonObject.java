/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Luke
 */
public class ShamazonObject implements Serializable
{
    private UUID uuid;
    
    public ShamazonObject()
    {
        uuid = UUID.randomUUID();
    }
    
    /**
     * 
     * @return the UUID of the ShamazonObject 
     */
    public UUID GetUUID()
    {
        return uuid;
    }
}
