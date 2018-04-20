/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Luke
 */
public class DatabaseObjectConverter
{
    /**
     * Converts an object of type T into a byte array
     * @param <T> the type of the object to be converted
     * @param javaObject the object to be converted
     * @return the byte array equivalent of the object passed in
     */
     public static <T> byte[] GetByteArray(T javaObject)
     {
        byte[] byteArrayObject = null;
       
        try 
        {
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            ObjectOutputStream objectStream = new ObjectOutputStream(byteArrayStream);
            objectStream.writeObject(javaObject);
            
            objectStream.close();
            byteArrayStream.close();
            byteArrayObject = byteArrayStream.toByteArray();
        } 
        catch (Exception e) 
        {
            return byteArrayObject;
        }
        
        return byteArrayObject;
    }
     
    /**
     * Converts a byte array into an object of type T
     * @param <T> the type of the object to be converted
     * @param byteArray the byte array to be converted into an object
     * @return an object of type T
     */
    public static <T> T GetObject(byte[] byteArray)
    {
        T convertedObject = null;

        ByteArrayInputStream byteArrayStream;
        ObjectInputStream objectStream;
        try 
        {
            byteArrayStream = new ByteArrayInputStream(byteArray);

            objectStream = new ObjectInputStream(byteArrayStream);
            convertedObject =(T)objectStream.readObject();

            objectStream.close();
        }
        catch (Exception e) 
        {
            return convertedObject;
        }

        return convertedObject;
    }
}
