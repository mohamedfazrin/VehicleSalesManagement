/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclesalesmanagement;

import com.github.sarxos.webcam.Webcam;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

/**
 *
 * @author it17153232
 */

     
    




import com.github.sarxos.webcam.Webcam;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruzaik Mohomed
 */
public class Camera {
     public  static void Cam(){
        try {
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss a");
            String s=ft.format(dNow);

        
            

            Webcam webcam = Webcam.getDefault();
            webcam.open();

            BufferedImage image = webcam.getImage();

            String d ="E:\\Loging capthure\\";
           
           ImageIO.write(image, "jpg",new File(d+s));
            
           
            webcam.getLock();
            webcam.close();
            
            

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
}

    
    
    

