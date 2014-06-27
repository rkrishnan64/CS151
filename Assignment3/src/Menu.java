
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu
{
	public JPanel photo = new JPanel();	
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
		
		//Save button
		
		JPanel save = new JPanel();
		myWindow.getContentPane().add(save, BorderLayout.PAGE_END);
	
		JButton saveBtn = new JButton("Save");
		save.add(saveBtn);
		
		//Photo List
		myWindow.getContentPane().add(photo, BoxLayout.LINE_AXIS);
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
}
  
