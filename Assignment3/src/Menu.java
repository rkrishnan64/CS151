
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

    public void showMenu() {
<<<<<<< HEAD
        
=======
        //JFrame Properties
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(800, 600);
        
        myWindow.setJMenuBar(myControls.getJMenu());

>>>>>>> origin/master
        //Menubar (File)
        myEvents.theEvents();
        myControls.Control();


        /********************************************************************
         * LEFT SIDE PANEL
         * ControlBar is the left side panel that has all our controls for the program 
         * Contains an INNER PANEL for each row of components
         ********************************************************************/
        JPanel ControlBar = new JPanel();
        ControlBar.setLayout(new BoxLayout(ControlBar, BoxLayout.Y_AXIS));
        ControlBar.setPreferredSize(new Dimension(330, 600));
        //ControlBar.setVisible(true);
        myWindow.add(ControlBar, BorderLayout.WEST);

        

        /********************************************************************
         * INNER PANEL imagePanel
         * imagePanel is the JPanel for holding Label, TextField, and Button
         * 
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



        /********************************************************************
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



        /********************************************************************
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
        
        
        


        
        /********************************************************************
         * INNER PANEL photoListPanel
         * photoListPanel is the JPanel for holding List and ScrollPane
         * 
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


        
        /********************************************************************
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
 
  
        /********************************************************************
         * RIGHT SIDE PANEL
         * ImageViewer is the right side panel that will display images for the program 
         * Contains an INNER PANEL for each row of components
         ********************************************************************/
        JPanel ImageViewer = new JPanel();
        ImageViewer.setLayout(new BoxLayout(ImageViewer, BoxLayout.Y_AXIS));
        ImageViewer.setPreferredSize(new Dimension(450, 550));
        //ImageViewer.setVisible(true);
        myWindow.add(ImageViewer, BorderLayout.EAST);
        
        
        
<<<<<<< HEAD
        /********************************************************************
         * INNER PANEL viewerPanel
         * viewerPanel is the JPanel for holding the image viewer in a JLabel
         * 
         */
        JPanel viewerPanel = new JPanel(); 
        viewerPanel.setPreferredSize(new Dimension(450,550));
        ImageIcon image1 = new ImageIcon("cat.png");
        JLabel catLabel = new JLabel(image1);
        JLabel viewerLabel = new JLabel("~~~~~~~~~~~~~~~~~~~~~~~~~~~~IMAGE HERE~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //Add Label to Panel
        viewerPanel.add(catLabel);
        viewerPanel.add(viewerLabel);
        
        //Add Panel to ImageViewer
        ImageViewer.add(viewerPanel);
        
        
        
        /********************************************************************
         * INNER PANEL viewerCaptionPanel
         * viewerCaption Panel is the JPanel for holding the caption under the image
         * 
         */
        JPanel viewerCaptionPanel = new JPanel();
        viewerCaptionPanel.setPreferredSize(new Dimension(450, 50));
        JLabel viewerCaptionLabel = new JLabel("This is the Caption for the Image");
        
        //Add Label to Panel
        viewerCaptionPanel.add(viewerCaptionLabel);
        
        //Add Panel to ImageViewer
        ImageViewer.add(viewerCaptionPanel);
        
        /********************************************************************
=======
        
        
        


        /*
>>>>>>> origin/master
         * EVENTS (Buttons)
         * This area contains the methods for each button:
         * -Browse
         * -Save
         * -Add New
         ********************************************************************/
        
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
        saveButton.addActionListener(new ActionListener(){
        	@Override 
        	public void actionPerformed(ActionEvent e){
        		int OpenDialog = myEvents.getChooser().showOpenDialog(myWindow);
        	}
        });

        /*
         * Add New button
         * Need to Implement Add New Button
         * 
         */
        addNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int OpenDialog = myEvents.getChooser().showOpenDialog(myWindow);
            }
        });
        
        

        //~~~~~~~~~~~~~~~~~~~End EVENTS


        
        //Area that shows the actual selected photo
//		JPanel area = new JPanel();
//		myWindow.getContentPane().add(area, BorderLayout.EAST);
        //	JImageComponent = new JImageComponent(myImageGoesHere);
<<<<<<< HEAD
     
               
        
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
=======
        myWindow.setVisible(true);
>>>>>>> origin/master
        
        //JFrame Properties
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setPreferredSize(new Dimension(800, 600));
        myWindow.pack();
        myWindow.setVisible(true);
        myWindow.setResizable(false);
        myWindow.setJMenuBar(myControls.getJMenu());
    }

    public JFrame getWindow() {
        return myWindow;
    }
}
