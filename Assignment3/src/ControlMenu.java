import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * Class that dictates the button clicks & various actions available in the menu.
 * Includes new, save, open, exit
 */
public class ControlMenu
{
	private JMenuBar menu = new JMenuBar();
	
	JMenu file = new JMenu("File");
    
	JMenuItem New = new JMenuItem("New");
	JMenuItem Save = new JMenuItem("Save");
	JMenuItem Open = new JMenuItem("Open");
	JMenuItem Exit = new JMenuItem("Exit");
	public void Control()
	{
		menu.add(file);
		file.add(New);
		file.add(Save);
		file.add(Open);
		file.add(Exit);
	}
	
	public JMenuBar getJMenu()
	{
		return menu; 
	}
	
	// Methods to add ActionListeners
	public void changeNewAction( ActionListener a)
	{
		New.addActionListener(a);
	}
	
	public void changeSaveAction( ActionListener a)
	{
		Save.addActionListener(a);
	}
	public void changeOpenAction( ActionListener a)
	{
		Open.addActionListener(a);
	}
	public void changeExitAction( ActionListener a)
	{
		Exit.addActionListener(a);
	}
}
