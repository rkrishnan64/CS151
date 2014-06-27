
import javax.swing.*;
import java.awt.*;

public class Menu
{
	
	public void showMenu()
	{
		//File (Top)
		JFrame myWindow = new JFrame("Assignment 3");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(1000,1000); 

		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
	    
		JMenuItem New = new JMenuItem("New");
		JMenuItem Save = new JMenuItem("Save");
		JMenuItem Open = new JMenuItem("Open");
		JMenuItem Exit = new JMenuItem("Exit");
		
		menu.add(file);
		file.add(New);
		file.add(Save);
		file.add(Open);
		file.add(Exit);

		myWindow.setJMenuBar(menu);
		
		
		//Left
		//Browse
		JPanel browse = new JPanel();
		myWindow.getContentPane().add(browse, BorderLayout.WEST);
		JTextField field1 = new JTextField(10);
		JButton browseBtn = new JButton("Browse");
		JLabel caption = new JLabel("Caption");
		JTextField field2 = new JTextField(10);
		browse.add(field1);
		browse.add(browseBtn);
		browse.add(caption);
		browse.add(field2);
		
  		//Save
	JPanel save = new JPanel();
		myWindow.getContentPane().add(save, BorderLayout.AFTER_LINE_ENDS);
	
		JButton saveBtn = new JButton("Save");
		save.add(saveBtn);
		
		
		
		
		
		
		
		

		
		//JPanel EditBar = new JPanel(); 	
		
//		//Browse File 
//		JLabel Search = new JLabel("Image: ");
//		JTextField SrchText = new JTextField(15); 
//		JButton Browse = new JButton("Browse");
//		EditBar.add(Search);
//		EditBar.add(SrchText);
//		EditBar.add(Browse);
//		//Caption
//		JLabel Caption = new JLabel("Caption: ");
//		JTextField c = new JTextField(15); 
//		EditBar.add(Caption);
//		EditBar.add(c);
//		myWindow.getContentPane().add(EditBar, BorderLayout.WEST);
//		
//		JButton saveCaption = new JButton("Save");
//		EditBar.add(saveCaption, "Save");
//		
//		
		
		
		myWindow.setVisible(true); 
	}
}
  
