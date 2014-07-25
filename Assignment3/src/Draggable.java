/*
 * Draggable.java
 */
import java.awt.*;

import javax.swing.*;

import java.awt.event.MouseEvent;

import javax.swing.border.Border;
import javax.swing.event.MouseInputAdapter;
public class Draggable extends JComponent {
    private Point pointPressed;
    private JComponent draggable;
    private Image img;
    public Draggable(JComponent component, Image capImage) 
    {
        draggable = component;
        img = capImage;
//        draggable.setCursor(draggable.getCursor());
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setLocation(capImage.getX(), capImage.getY());
        setSize(component.getPreferredSize());
        setLayout(new BorderLayout());
        add(component);
        MouseInputAdapter mouseAdapter = new MouseHandler();
        addMouseMotionListener(mouseAdapter);
        addMouseListener(mouseAdapter);
    }
    @Override
    public void setBorder(Border border) 
    {
        super.setBorder(border);
        if (border != null) 
        {
            Dimension size = draggable.getPreferredSize();
            Insets insets = border.getBorderInsets(this);
            size.width += (insets.left + insets.right + 5);
            size.height += (insets.top + insets.bottom);
            setSize(size);
        }
    }
    public class MouseHandler extends MouseInputAdapter 
    {
        @Override
        public void mouseDragged(MouseEvent e) 
        {
            Point pointDragged = e.getPoint();
            Point loc = getLocation();
            loc.translate(pointDragged.x - pointPressed.x,
                    pointDragged.y - pointPressed.y);
            if(loc.getX()>0 && loc.getX() < 450 && loc.getY()>0 && loc.getY()<700)
            {
	            setLocation(loc);
            }
            System.out.println("pointDragged: " + loc);
        }
        @Override
        public void mousePressed(MouseEvent e) {
            pointPressed = e.getPoint();
        }
        @Override
        public void mouseReleased(MouseEvent e)
        {
        	Point loc = getLocation();
        	img.setX((int)loc.getX());
        	img.setY((int)loc.getY());
			System.out.println("Image.getX(): " + img.getX());
			System.out.println("Image.getY():" + img.getY());
        }
    }
}