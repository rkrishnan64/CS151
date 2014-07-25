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
    public Draggable(final JComponent component, final int x, final int y) {
        draggable = component;
//        draggable.setCursor(draggable.getCursor());
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setLocation(x, y);
        setSize(component.getPreferredSize());
        setLayout(new BorderLayout());
        add(component);
        MouseInputAdapter mouseAdapter = new MouseHandler();
        addMouseMotionListener(mouseAdapter);
        addMouseListener(mouseAdapter);
    }
    @Override
    public void setBorder(final Border border) {
        super.setBorder(border);
        if (border != null) {
            Dimension size = draggable.getPreferredSize();
            Insets insets = border.getBorderInsets(this);
            size.width += (insets.left + insets.right + 5);
            size.height += (insets.top + insets.bottom);
            setSize(size);
        }
    }
    private class MouseHandler extends MouseInputAdapter {
        @Override
        public void mouseDragged(final MouseEvent e) {
            Point pointDragged = e.getPoint();
            Point loc = getLocation();
            loc.translate(pointDragged.x - pointPressed.x,
                    pointDragged.y - pointPressed.y);
            setLocation(loc);
        }
        @Override
        public void mousePressed(final MouseEvent e) {
            pointPressed = e.getPoint();
        }
    }
}