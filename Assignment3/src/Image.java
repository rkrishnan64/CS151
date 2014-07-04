import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Image 
{
	private String caption;
	private String imagePath;
	
	public Image()
	{
		
	}
	
	public Image(String newImagePath, String newCaption)
	{
		caption = newCaption;
		imagePath = newImagePath;
	}
	
	
	public String getCaption()
	{
		return caption;
	}
	
	public String getImagePath()
	{
		return imagePath;
	}
	
	public void setCaption(String newCaption)
	{
		caption = newCaption;
	}
	
	public void setImagePath(String newImagePath)
	{
		imagePath = newImagePath;
	}
}
