
import javax.swing.*;

import java.awt.*;


public class ImageViewer extends JComponent
{
	private ImageIcon img;
	private JLabel captionLabel;
	private JPanel captPnl, imgBtnPnl;
	private GridBagConstraints gridBagConstraints;

	public ImageViewer ()
	{
		captPnl = new JPanel();
		imgBtnPnl = new JPanel();
		captPnl.setLayout(new BoxLayout (captPnl , BoxLayout.Y_AXIS));
		this.setLayout(new GridBagLayout());
		captionLabel = new JLabel ("IMAGE CAPTION HERE");
		captionLabel.setFont (new Font( null , Font.PLAIN , 24 ) );
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.weightx = 2;
		gridBagConstraints.weighty = 3;
		gridBagConstraints.anchor = GridBagConstraints.SOUTH;
		
		captPnl.add(captionLabel);
		captPnl.add(imgBtnPnl);
		this.add(captPnl, gridBagConstraints);
	}

	public void updateImage (Image capImage)
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
