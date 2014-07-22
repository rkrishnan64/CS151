
import javax.swing.*;

import java.awt.*;


public class ImageViewer extends JComponent
{
	private ImageIcon img;
	private JLabel captionLabel;
	private JPanel captPnl, imgBtnPnl;
	private GridBagConstraints GBC; //Constraints 

	public ImageViewer ()
	{
		captPnl = new JPanel();
		imgBtnPnl = new JPanel();
		captPnl.setLayout(new BoxLayout (captPnl , BoxLayout.Y_AXIS));
		this.setLayout(new GridBagLayout());
		captionLabel = new JLabel ("IMAGE CAPTION HERE");
		captionLabel.setFont (new Font( null , Font.PLAIN , 24 ) );
		GBC = new GridBagConstraints();
		GBC.weightx = 3;
		GBC.weighty = 3;
		GBC.anchor = GridBagConstraints.NORTH;
		
		captPnl.add(captionLabel);
		captPnl.add(imgBtnPnl);
		this.add(captPnl, GBC);
	}

	public void repaintImage (Image capImage)
	{
		if (capImage != null)
		{
			img = new ImageIcon(capImage.getImagePath());
			captionLabel.setText(capImage.getImageCaption());
			this.repaint();
		}
	}
	@Override
	public void paint(Graphics g)
	{	
		Graphics2D g2 = (Graphics2D) g;
		if (img != null)
		{
			g2.drawImage (img.getImage() , 10 , 10 , this.getWidth() - 10 , this.getHeight() - 25 , 0 , 0 , img.getIconWidth() , img.getIconHeight() , null);
		}
		captionLabel.repaint();

	}
}
