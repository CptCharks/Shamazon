/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Charles
 */
public class ImageLoader {
    /**
     * ImageFileToBuffImg searches for an image file and converts to buffered image.
     * @param PATH_TO_IMAGE File path to 
     * @return Returns buffered image or null object if no file found
     */
    public BufferedImage ImageFileToBuffImg(String PATH_TO_IMAGE)
    {
            //Image fanagling goes here
            //listingToEdit.SetListingImage();
            File imageFile = new File(PATH_TO_IMAGE);
            try
            {
                BufferedImage imgBuff = ImageIO.read(imageFile);
                return imgBuff;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Invalid image file passed. No image saved.");
                System.out.println(e.getMessage());
            }
            catch(IOException e)
            {
                System.out.println("IOException found in image reading. No image saved.");
                System.out.println(e.getMessage());
            }
            
            return null;
    }
}
