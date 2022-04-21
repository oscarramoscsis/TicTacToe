package GUItest;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	//private GUItest G = new GUItest();
	private ImageIcon icon1;



	/**
	 * Create the panel.
	 */
	public ImagePanel() {
		
		icon1 = new ImageIcon();
		
		this.add(icon1);
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		ImageIcon icon1 = new ImageIcon(ImagePanel.class.getResource(""));
		
		icon1.paintIcon(this, g, -50, -50);
	} 
	
	
	
	public void play1()
	{
		icon1 = new ImageIcon(ImagePanel.class.getResource("/assets/x.png"));
		
		repaint();
	}

}
