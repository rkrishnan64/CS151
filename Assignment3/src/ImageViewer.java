
import javax.swing.*;

import java.awt.*;


public class ImageViewer extends JComponent
{
	private ImageIcon img;
	private JLabel captionLabel;
	private GridBagConstraints GBC; //Constraints 
	private Draggable movable;
	private JPanel myP;

	public ImageViewer()
	{
		this.setLayout(null);
		captionLabel = new JLabel ("IMAGE CAPTION HERE");
		captionLabel.setFont (new Font( null , Font.PLAIN , 24 ) );
		captionLabel.setBounds(100, 0, 400, 40);
		this.add(captionLabel);
	}

	public void repaintImage (Image capImage)
	{
		if (capImage != null)
		{
			this.repaint();
			img = new ImageIcon(capImage.getImagePath());
			captionLabel.setText(capImage.getImageCaption());
			movable = new Draggable(captionLabel, 100, 0);
			this.add(movable);
		}
	}
	@Override
	public void paintComponent(Graphics g)
	{	
		Graphics2D g2 = (Graphics2D) g;
		if (img != null)
		{
			super.paintComponent(g);
	        g.drawImage(img.getImage() , 10 , 10 , this.getWidth() - 10 , this.getHeight() - 25 , 0 , 0 , img.getIconWidth() , img.getIconHeight() , null);
		}
		if (movable != null)
		{
			movable.repaint();
		}

	}
}
