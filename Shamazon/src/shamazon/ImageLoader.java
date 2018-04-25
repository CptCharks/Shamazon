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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Charles
 */
public class ImageLoader 
{
    /**
     * ImageFileToBuffImg searches for an image file and converts to ImageIcon.
     * @param imagePath File path to 
     * @return Returns an ImageIcon or null object if no file found
     */
    public static ImageIcon ImageFileToBufferedImage(String imagePath)
    {
            //Image fanagling goes here
            //listingToEdit.SetListingImage();
            File imageFile = new File(imagePath);
            try
            {
                BufferedImage imgBuff = ImageIO.read(imageFile);
                return new ImageIcon(imgBuff);
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
    
    /**
     * Reads the image selected from a file dialog into an ImageIcon.
     * @return an ImageIcon which displays the selected image file
     */
    public static ImageIcon LoadImage()
    {
         //Create file chooser object
        JFileChooser chooser = new JFileChooser();
        //Create a file filter. Make sure you can only choose JPG and PNG.
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        //Set the filter for the chooser
        chooser.setFileFilter(filter);
        //Get return value from showOpenDialog
        int returnVal = chooser.showOpenDialog(null);
        //Check if approved
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            //System printout.
            System.out.println("You chose to open this file: " +
            chooser.getSelectedFile().getName());
            
            //Store the image path for reference later
            chooser.getSelectedFile().getPath();
            
            //Create a file object of the file path
            File imageFile = new File(chooser.getSelectedFile().getPath());
            
            try
            {
                //Get bufferedImage from the listing
                BufferedImage imgBuffPreview = ImageIO.read(imageFile);
                return new ImageIcon(imgBuffPreview);
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
        return null;
    }   
}
