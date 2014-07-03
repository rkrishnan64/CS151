
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		
		//Control Bar is the left panel that has all our controls for the program 
		JPanel ControlBar = new JPanel();
		ControlBar.setLayout(new BoxLayout(ControlBar, BoxLayout.Y_AXIS));
		//put the image field and browse button in a panel to add to the control bar
		
		JPanel imagePanel = new JPanel();
		imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.X_AXIS));
		//contents of image panel, which consist of a textfield and browse button i hard coded the size right now since it wont show properly 
		JTextField imageTxt = new JTextField();
		imageTxt.setPreferredSize(new Dimension(200, 1));
		JButton browseBtn = new JButton();
		browseBtn.setText("Browse");
		//added browse and text field to the image panel 
		imagePanel.add(new JLabel("Image:"));
		imagePanel.add(imageTxt);
		imagePanel.add(browseBtn);
		//added image panel to the control bar
		ControlBar.add(imagePanel);
		//Use RigidAreas instead of struts. 
		ControlBar.add(Box.createRigidArea(new Dimension(10, 10))); 
		
		//caption panel where we have the text field for the caption 
		JPanel CaptionPanel = new JPanel();
		CaptionPanel.setLayout(new BoxLayout(CaptionPanel, BoxLayout.X_AXIS));
		JTextField captionField = new JTextField();
		 //captionField.setPreferredSize(new Dimension(250, 1));
		//added caption label and the captionfield to the caption panel 
		CaptionPanel.add(new JLabel("Caption:"));
		CaptionPanel.add(captionField);
		//added the caption part to the control panel 
		ControlBar.add(CaptionPanel);
		ControlBar.add(Box.createRigidArea(new Dimension(10, 10))); 
		

		
		//save button is supposed to go under the caption bar so i made a new panel 
		JPanel saveBar = new JPanel();
		saveBar.setLayout(new BoxLayout(saveBar, BoxLayout.X_AXIS));
		JButton saveBtn = new JButton("Save");
		//setMaximumSize for the button 
		saveBtn.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
		saveBar.add(saveBtn);
		ControlBar.add(saveBar);
		ControlBar.add(Box.createRigidArea(new Dimension(10, 10))); 
		
	
		myWindow.add(ControlBar, BorderLayout.WEST);
		
		
		//Save button
		

		browseBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int OpenDialog = myEvents.getChooser().showOpenDialog(myWindow);
			}
		});
	
		//Photo List
		
		//What does this do? Does not make sense. - Kareem 
		myWindow.getContentPane().add(photo, BorderLayout.PAGE_END);
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
  
