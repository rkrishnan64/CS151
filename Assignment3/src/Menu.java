import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.PrintWriter;


public class Menu
{


    private JPanel photo = new JPanel();
    private JFrame myWindow = new JFrame("Assignment 3");
    private Events myEvents = new Events();
    private ControlMenu myControls = new ControlMenu();
    private ArrayList<Image> storage;
    private JPanel ControlBar = new JPanel();
    
    public void showMenu() 
    {
        //JFrame Properties
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setMinimumSize(new Dimension(800, 800));
        myWindow.pack();
        myWindow.setJMenuBar(myControls.getJMenu());

        //Menubar (File)
        myEvents.theEvents();
        myControls.Control();
        storage = new ArrayList<Image>();
        /********************************************************************
         * MENU BAR
         * Adds actionListeners to the buttons in myControls.
         ********************************************************************/
        
        myControls.changeNewAction(new ActionListener() 
		{
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	myWindow.dispose();
            	photo = new JPanel();
                myWindow = new JFrame("Assignment 3");
                myEvents = new Events();
                myControls = new ControlMenu(); 
                showMenu();
            }
        });
        
        myControls.changeSaveAction(new ActionListener() 
		{
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	JFileChooser F = new JFileChooser();
            	F.showSaveDialog(myWindow);
            	PrintWriter writer;
				try 
				{
					File newFile = F.getSelectedFile();
					writer = new PrintWriter(newFile.getName(), "UTF-8");
	            	writer.println("The first line");
	            	writer.println("The second line");
	            	writer.close();
				} 
				catch (Exception E)
				{
					
				}
            }
        });
        
        myControls.changeOpenAction(new ActionListener() 
		{
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	JFileChooser F = new JFileChooser();
            	FileNameExtensionFilter filter = new FileNameExtensionFilter(
            	        "Text Files(.txt)", "txt");
                F.setFileFilter(filter);
                int returnVal = F.showOpenDialog(myWindow);
                if(returnVal == JFileChooser.APPROVE_OPTION) 
                {
                	File newFile = F.getSelectedFile();
                    String picTest = newFile.getName();
                    String picTest1 = picTest.substring(picTest.length()-3);
                    if (picTest1.equalsIgnoreCase("txt"))
                    {
                    	JOptionPane.showMessageDialog(myWindow, picTest + " Opened");
                    }
                    else
                    {
                    	JOptionPane.showMessageDialog(myWindow, "Invalid file.");
                    }
                }
            }
        });
        
        myControls.changeExitAction(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				WindowEvent windowClosing = new WindowEvent(myWindow, WindowEvent.WINDOW_CLOSING);
				myWindow.dispatchEvent(windowClosing);
			}
		});

        /*
         * LEFT SIDE PANEL
         * ControlBar is the left panel that has all our controls for the program 
         * Contains an INNER PANEL for each row of components
         */

        ControlBar.setLayout(new BoxLayout(ControlBar, BoxLayout.Y_AXIS));
        myWindow.add(ControlBar, BorderLayout.WEST);


        /*
         * INNER PANEL imagePanel
         * imagePanel is the JPanel for holding Label, TextField, and Button
         */
        JPanel imagePanel = new JPanel();
        JLabel imageLabel = new JLabel("  Image: ");
        final JTextField imageText = new JTextField(11);
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
        browseButton.addActionListener(new ActionListener() 
        {
        	@Override
            public void actionPerformed(ActionEvent e) 
            {
            	JFileChooser F = new JFileChooser();
            	FileNameExtensionFilter filter = new FileNameExtensionFilter(
            	        "Images(jpg, gif, png)", "jpg", "gif", "png");
                F.setFileFilter(filter);
              
                int returnVal = F.showOpenDialog(myWindow);
                if(returnVal == JFileChooser.APPROVE_OPTION) 
                {
                	File newFile = F.getSelectedFile();
                    String picTest = newFile.getName();
                    String picTest1 = picTest.substring(picTest.length()-3);
                    if (picTest1.equalsIgnoreCase("jpg") || picTest1.equalsIgnoreCase("gif") || picTest1.equalsIgnoreCase("png"))
                    {
                    	JOptionPane.showMessageDialog(myWindow, picTest + " Opened");
                    }
                    else
                    {
                    	JOptionPane.showMessageDialog(myWindow, "Invalid file.");
                    }
                }
                String ImageSelected = F.getSelectedFile().getAbsolutePath();
                imageText.setText(ImageSelected);
            }
        });


        /*
         * Save button
         * Need to Implement Save Button
         * 
         */
        saveButton.addActionListener(new ActionListener(){
        	@Override 
        	public void actionPerformed(ActionEvent e){
        		int OpenDialog = myEvents.getChooser().showOpenDialog(myWindow);
        	}
        });

        /*
         * Add New button
         * Need to Implement Add New Button
         * See Above where one is added.
         */
        addNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	Image temp = new Image();
            	storage.add(temp);
            	
            }
        });
        
        

        //~~~~~~~~~~~~~~~~~~~End EVENTS



        //Area that shows the actual selected photo
        //JPanel area = new JPanel();
        //myWindow.getContentPane().add(area, BorderLayout.EAST);
        //JImageComponent = new JImageComponent(myImageGoesHere);
        myWindow.setVisible(true);
        
    }

    public JFrame getWindow() {
        return myWindow;
    }
}
