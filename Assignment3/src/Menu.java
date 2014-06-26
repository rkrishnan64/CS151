
import javax.swing.*;
import java.awt.*;

public class Menu {

    public void showMenu() {
        JFrame myWindow = new JFrame("Assignment 3");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(1000, 1000);

        JMenuBar menubar = new JMenuBar();
        JMenu n = new JMenu("New");
        JMenu save = new JMenu("Save");
        JMenu open = new JMenu("Open");
        JMenu exit = new JMenu("Exit");
        menubar.add(n);
        menubar.add(save);
        menubar.add(open);
        menubar.add(exit);
        
        myWindow.setJMenuBar(menubar);



        JPanel EditBar = new JPanel();
        //EditBar.setPreferredSize(new Dimension(100,100));
        //EditBar.setLayout(new BoxLayout(EditBar, BoxLayout.Y_AXIS));

        //myWindow.getContentPane().add(EditBar, FlowLayout.LEFT);

        //Browse File 
        JLabel Search = new JLabel("Image: ");
        JTextField SrchText = new JTextField(15);
        JButton Browse = new JButton("Browse");
        EditBar.add(Search);
        EditBar.add(SrchText);
        EditBar.add(Browse);
        //Caption
        JLabel Caption = new JLabel("Caption: ");
        JTextField c = new JTextField(15);
        EditBar.add(Caption);
        EditBar.add(c);
        myWindow.getContentPane().add(EditBar, BorderLayout.WEST);

        JButton saveCaption = new JButton("Save");
        EditBar.add(saveCaption, "Save");




        myWindow.setVisible(true);

    }
}
