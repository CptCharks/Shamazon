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
    
    public UUID getUuid()
    {
        return uuid;
    }
    
    public void setUuid(UUID uuid)
    {
        this.uuid = uuid;
    }
    
    public void writeObject(java.io.ObjectOutputStream outputStream) throws IOException
    {
        outputStream.defaultWriteObject();
    }

    public void readObject(java.io.ObjectInputStream inputStream) throws IOException, ClassNotFoundException
    {
         inputStream.defaultReadObject();
    }
}
