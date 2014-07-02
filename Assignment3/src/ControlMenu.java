import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * Class that dictates the button clicks & various actions available in the menu.
 * Includes new, save, open, exit
 */
public class ControlMenu
{
	public JMenuBar menu = new JMenuBar();
	public void Control()
	{
		
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
		
		
	}
	public JMenuBar getJMenu()
	{
		return menu; 
	}
}
