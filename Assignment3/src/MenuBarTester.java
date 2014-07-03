/**
 * This is a template from which Gordon will apply the MenuBar actionListeners. 
 * The code is easily transferable. This class is standalone so you can play around with it
 * and get a better sense of how the JMenuBar and its action listeners work.
 */


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuBarTester 
{
	public static void main(String[] args)
	{
		final JFrame myWindow = new JFrame("Tester For Menu Here");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(500,500);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		
		JMenuItem New = new JMenuItem("New");
		JMenuItem Save = new JMenuItem("Save");
		JMenuItem Open = new JMenuItem("Open");
		JMenuItem Exit = new JMenuItem("Exit");
		
		New.addActionListener(new ActionListener() 
		{
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	myWindow.getContentPane().setBackground(Color.BLACK);
            	myWindow.repaint();
            }
        });
		
		Save.addActionListener(new ActionListener() 
		{
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	JFileChooser F = new JFileChooser();
            	F.showSaveDialog(myWindow);
            }
        });
		
		Open.addActionListener(new ActionListener() 
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
            }
        });
		
		Exit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				WindowEvent windowClosing = new WindowEvent(myWindow, WindowEvent.WINDOW_CLOSING);
				myWindow.dispatchEvent(windowClosing);
			}
		});
		
		menuBar.add(file);
		file.add(New);
		file.add(Save);
		file.add(Open);
		file.add(Exit);
		
		myWindow.setJMenuBar(menuBar);
		myWindow.setVisible(true);
	}
	
}
