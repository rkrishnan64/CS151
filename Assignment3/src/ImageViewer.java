
import javax.swing.*;

import java.awt.*;

import javax.swing.plaf.basic.BasicArrowButton;

//
// Creates a slideshow viewer
//
public class ImageViewer extends JComponent
{

	/**
	 * 
	 */
	private ImageIcon img;
	private JLabel captionLabel, optionLabel;
	private JButton rightBtn, leftBtn;
	private JToggleButton optionsBtn;
	private JPanel captionPanel, imageButtonPanel, toggleOptionsPanel;
	private GridBagConstraints gridBagConstraints;

	public ImageViewer ()
	{




		captionPanel = new JPanel ();
		imageButtonPanel = new JPanel ();
		toggleOptionsPanel = new JPanel ();

		captionPanel.setLayout ( new BoxLayout ( captionPanel , BoxLayout.Y_AXIS ) );

		this.setLayout ( new GridBagLayout () );

		captionLabel = new JLabel ( "CAPTION" );
		captionLabel.setFont ( new Font ( null , Font.PLAIN , 22 ) );

		// Adds viewing buttons
		rightBtn = new BasicArrowButton ( BasicArrowButton.EAST );
		leftBtn = new BasicArrowButton ( BasicArrowButton.WEST );

		optionLabel = new JLabel ( "Options:" );
		optionsBtn = new JCheckBox ();
		optionsBtn.setSelected ( true );

		toggleOptionsPanel.add ( optionLabel );
		toggleOptionsPanel.add ( optionsBtn );

		imageButtonPanel.add ( leftBtn );
		imageButtonPanel.add ( rightBtn );

		gridBagConstraints = new GridBagConstraints ();
		gridBagConstraints.anchor = GridBagConstraints.SOUTH;
		gridBagConstraints.weightx = 1;
		gridBagConstraints.weighty = 1;

		captionPanel.add ( captionLabel );
		captionPanel.add ( imageButtonPanel );
		captionPanel.add ( toggleOptionsPanel );

		this.add ( captionPanel , gridBagConstraints );

	}

	public void updateImage (Image capImage )
	{
		if ( capImage != null )
		{
			img = new ImageIcon ( capImage.getImagePath () );
			captionLabel.setText ( capImage.getCaption () );
			this.repaint();
		}
	}


	//
	// Paints image and resizes to size of window
	//
	@Override
	public void paint ( Graphics g )
	{
		Graphics2D g2 = ( Graphics2D ) g;

		if ( img != null )
		{
			//first 4 ints are desired size of image, last 4 are size of image
			g2.drawImage ( img.getImage () , 10 , 10 , this.getWidth () - 10 , this.getHeight () - 25 , 0 , 0 , img.getIconWidth () , img.getIconHeight () , null );
		}
		captionLabel.repaint ();
		leftBtn.repaint ();
		rightBtn.repaint ();
		optionLabel.repaint ();
		optionsBtn.repaint ();
	}
}
