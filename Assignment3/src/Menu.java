
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

<<<<<<< HEAD
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
=======
public class Menu {

    public JPanel photo = new JPanel();
    public JFrame myWindow = new JFrame("Assignment 3");
    public Events myEvents = new Events();
    public ControlMenu myControls = new ControlMenu();

    public void showMenu() {
        //JFrame Properties
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(800, 600);
        myWindow.setVisible(true);
        myWindow.setJMenuBar(myControls.getJMenu());

        //Menubar (File)
        myEvents.theEvents();
        myControls.Control();


        /*
         * LEFT SIDE PANEL
         * ControlBar is the left panel that has all our controls for the program 
         * Contains an INNER PANEL for each row of components
         */
        JPanel ControlBar = new JPanel();
        ControlBar.setLayout(new BoxLayout(ControlBar, BoxLayout.Y_AXIS));
        myWindow.add(ControlBar, BorderLayout.WEST);


        /*
         * INNER PANEL imagePanel
         * imagePanel is the JPanel for holding Label, TextField, and Button
         */
        JPanel imagePanel = new JPanel();
        JLabel imageLabel = new JLabel("  Image: ");
        JTextField imageText = new JTextField(11);
        JButton browseButton = new JButton("Browse");
        browseButton.setPreferredSize(new Dimension(120, 24));

        //Add Label, TextField, and Button to Panel
        imagePanel.add(imageLabel);
        imagePanel.add(imageText);
        imagePanel.add(browseButton);

        imagePanel.setPreferredSize(new Dimension(300, 20));
        //Add imagePanel to the ControlBar
        ControlBar.add(imagePanel);



        /*
         * INNER PANEL CaptionPanel
         * CaptionPanel is the JPanel for holding Label and TextField
         * 
         */
        JPanel captionPanel = new JPanel();
        JLabel captionLabel = new JLabel("Caption: ");
        JTextField captionField = new JTextField(22);

        //Add Label and TextField to Panel
        captionPanel.add(captionLabel);
        captionPanel.add(captionField);

        captionPanel.setPreferredSize(new Dimension(300, 20));
        //Add captionPanel to the ControlBar
        ControlBar.add(captionPanel);



        /*
         * INNER PANEL savePanel
         * savePanel is the JPanel for holding Label and TextField
         * 
         */
        JPanel savePanel = new JPanel();
        JButton saveButton = new JButton("Save");
        saveButton.setPreferredSize(new Dimension(300, 40));
        
        savePanel.setPreferredSize(new Dimension(300, 40));
        //Add Button to Panel
        savePanel.add(saveButton);

        //Add Panel to ControlBar
        ControlBar.add(savePanel);


        
        /*
         * INNER PANEL photoListPanel
         * photoListPanel is the JPanel for holding List and ScrollPane
         */
        JPanel photoListPanel = new JPanel();
        DefaultListModel listModel = new DefaultListModel();
        
        //JList and Properties
        JList photolist = new JList(listModel);
        photolist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        photolist.setSelectedIndex(0);
        photolist.setVisibleRowCount(5);
        //photolist.addListSelectionListener(this);
        
        JScrollPane listScrollPane = new JScrollPane(photolist);
        listScrollPane.setPreferredSize(new Dimension(300, 350));
        //Delete when not needed
        listModel.addElement("Image 1");
        listModel.addElement("Image 2");
        listModel.addElement("Image 3");
        
        //Add ScrollPane to Panel
        photoListPanel.add(listScrollPane);
        
        //Add Panel to ControlBar
        ControlBar.add(photoListPanel);
        
        //What Component can create a List for the photos? - Brian



        /*
         * INNER PANEL AddNewButtonPanel
         * addNewButtonPanel is the JPanel for holding Button
         * 
         */
        JPanel addNewButtonPanel = new JPanel();
        JButton addNewButton = new JButton("Add New");

        //Add Button to Panel
        addNewButtonPanel.add(addNewButton);
        addNewButton.setPreferredSize(new Dimension(300, 40));
        
        addNewButtonPanel.setPreferredSize(new Dimension(300, 40));
        //Add Panel to ControlBar
        ControlBar.add(addNewButtonPanel);
        
        
        //What does this do? Does not make sense. - Kareem 
        //Was this supposed to be a part of the viewer of photos to display? - Brian
/*
        myWindow.getContentPane().add(photo, BorderLayout.PAGE_END);
        JLabel image1 = new JLabel("imagex");
        JLabel image2 = new JLabel("imagex");
        JLabel image3 = new JLabel("imagex");
        photo.add(image1);
        photo.add(image2);
        photo.add(image3);



        photo.add(addNew);
        class action implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                JButton newButton = new JButton("new image");
                photo.add(newButton);

            }
        }
        addNew.addActionListener(new action());
*/

        /*
         * EVENTS (Buttons)
         * This area will contain the methods for each button:
         * -Browse
         * -Save
         * -Add New
         */

        /*
         * Browse Button
         * 
         * 
         */
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int OpenDialog = myEvents.getChooser().showOpenDialog(myWindow);
            }
        });


        /*
         * Save button
         * Need to Implement Save Button
         * 
         */

        /*
         * Add New button
         * Need to Implement Add New Button
         * See Above where one is added.
         */

        //~~~~~~~~~~~~~~~~~~~End EVENTS



        //Area that shows the actual selected photo
>>>>>>> c5479c9b7e546bdf3396e0533455e557257b72e7
//		JPanel area = new JPanel();
//		myWindow.getContentPane().add(area, BorderLayout.EAST);
        //	JImageComponent = new JImageComponent(myImageGoesHere);
        
    }

    public JFrame getWindow() {
        return myWindow;
    }
}
