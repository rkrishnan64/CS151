import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.undo.*;



/*
 * Class that dictates the button clicks & various actions available in the menu.
 * Includes new, save, open, exit
 */
public class ControlMenu extends JFrame
{
	private JMenuBar menu = new JMenuBar();
	
	JMenu file = new JMenu("File");
	JMenu edit = new JMenu("Edit");
    
	JMenuItem New = new JMenuItem("New");
	JMenuItem Save = new JMenuItem("Save");
	JMenuItem Open = new JMenuItem("Open");
	JMenuItem Exit = new JMenuItem("Exit");
	UndoManager undoManager = new UndoManager();
	UndoAction undoAction = new UndoAction();
	
	public void Control()
	{
		menu.add(file);
		menu.add(edit);
		file.add(New);
		file.add(Save);
		file.add(Open);
		file.add(Exit);;
		edit.add(undoAction);
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
	
	class UndoAction extends AbstractAction
	{
		public UndoAction()
		{
			this.putValue(Action.NAME, undoManager.getUndoPresentationName());
		    this.setEnabled(false);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(this.isEnabled())
			{
				undoManager.undo();
				undoAction.update();
			}
		}
		
		public void update()
		{
			this.putValue(Action.NAME,  undoManager.getUndoPresentationName());
			this.setEnabled(undoManager.canUndo());
		}
	}
}
