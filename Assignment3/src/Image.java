import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;


public class Image extends Applet{
    
	/*
	 * Code to take an image and view it
	 */
	private BufferedImage img;
    
    public void init() {
        try {
            URL url = new URL(getCodeBase(), "examples/strawberry.jpg");
            img = ImageIO.read(url);
        } catch (IOException e) {
        }
    }

    public void paint(Graphics g) {
      g.drawImage(img, 50, 50, null);
    }

	
	public void uploadImage(){
		
	}
	public void selectImage(){
		
	}
	public void addNew(){
		
	}

}
