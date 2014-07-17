
import javax.swing.*;

import java.awt.*;

import javax.swing.plaf.basic.BasicArrowButton;


public class ImageViewer extends JComponent
{
	private ImageIcon img;
	private JLabel captionLabel;
	private JPanel captionPanel, imageButtonPanel, toggleOptionsPanel;
	private GridBagConstraints gridBagConstraints;

	public ImageViewer ()
	{
		captionPanel = new JPanel();
		imageButtonPanel = new JPanel();
		toggleOptionsPanel = new JPanel();

		captionPanel.setLayout(new BoxLayout (captionPanel , BoxLayout.Y_AXIS));

		this.setLayout(new GridBagLayout());

		captionLabel = new JLabel ("IMAGE CAPTION HERE");
		captionLabel.setFont (new Font( null , Font.PLAIN , 22 ) );


		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.anchor = GridBagConstraints.SOUTH;
		gridBagConstraints.weightx = 2;
		gridBagConstraints.weighty = 3;

		captionPanel.add(captionLabel);
		captionPanel.add(imageButtonPanel);
		captionPanel.add(toggleOptionsPanel);

		this.add(captionPanel, gridBagConstraints);

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


	//
	// Paints image and resizes to size of window
	//
	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		if ( img != null )
		{
			//first 4 ints are desired size of image, last 4 are size of image
			g2.drawImage ( img.getImage() , 10 , 10 , this.getWidth() - 10 , this.getHeight() - 25 , 0 , 0 , img.getIconWidth() , img.getIconHeight() , null);
		}
		captionLabel.repaint();

	}
}
