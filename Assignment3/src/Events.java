import javax.swing.*; 
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*; 
public class Events
{ 
	JFileChooser F = new JFileChooser(); 
	
	
	void theEvents()
	{
		//Accepts images of this Extension
		FileNameExtensionFilter Filter = new FileNameExtensionFilter("img", "png", "jpg");
		//Give the JFileChooser the Image Filter 
		F.setFileFilter(Filter); 
	
	}
	
	
	public JFileChooser getChooser()
	{
		return F; 
	}
}
