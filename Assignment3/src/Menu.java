
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu
{
	public JPanel photo = new JPanel();	
	public JFrame myWindow = new JFrame("Assignment 3");
	public Events myEvents = new Events(); 
	public ControlMenu myControls = new ControlMenu(); 
	public void showMenu()
	{
		//File (Top)
		myEvents.theEvents();
		myControls.Control();
		
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(1000,1000); 

		
		myWindow.setJMenuBar(myControls.getJMenu());
		
		
		
		//Left
		//Browse
		

		
		JPanel browse = new JPanel();
		myWindow.getContentPane().add(browse, BorderLayout.WEST);
		JTextField field1 = new JTextField(10);
		JButton browseBtn = new JButton("Browse");
		JLabel caption = new JLabel("Caption");
		JButton saveBtn = new JButton("Save");
		JTextField field2 = new JTextField(10);
		browse.add(field1);
		browse.add(browseBtn);
		browse.add(caption);
		browse.add(field2);
		
		
		
		//Save button
		
	//JPanel save = new JPanel();
	//myWindow.getContentPane().add(save, BorderLayout.PAGE_END);
	browse.add(saveBtn);

		browseBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int OpenDialog = myEvents.getChooser().showOpenDialog(myWindow);
			}
		});
	
		//Photo List
		
		//What does this do? Does not make sense. - Kareem 
		myWindow.getContentPane().add(photo, BorderLayout.PAGE_END);
		ArrayList<String> images = new ArrayList<String>();
	    String imagex = "image";
	    String imagey = "image";
	    images.add(imagey);
	    images.add(imagex);
	    
		JLabel image1 = new  JLabel("imagex");
		JLabel image2 = new JLabel("imagex");
		JLabel image3 = new JLabel("imagex");
		photo.add(image1);
		photo.add(image2);
		photo.add(image3);
		
		
		JButton add = new JButton("Add New");
		photo.add(add);	
			class action implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent arg0){
						JButton newButton = new JButton("new image");
						photo.add(newButton);
					
				}
			}
		add.addActionListener(new action());	
		
		//Area that shows the actual selected photo
//		JPanel area = new JPanel();
//		myWindow.getContentPane().add(area, BorderLayout.EAST);
	//	JImageComponent = new JImageComponent(myImageGoesHere);
		myWindow.setVisible(true); 
	}
	
	public JFrame getWindow()
	{
		return myWindow; 
	}
}
  
