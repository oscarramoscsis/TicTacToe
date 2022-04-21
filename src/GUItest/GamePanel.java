package GUItest;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class GamePanel extends JPanel{
	
	
	private ImageIcon icon1;
	protected JLabel displayImagebody;
	protected JLabel displayImageroof;
	protected JLabel displayImagedoor;

	public GamePanel() {
	setLayout(new GridLayout(0, 1, 0, 0));

	displayImagedoor = new JLabel("");
	displayImagedoor.setAlignmentX(Component.RIGHT_ALIGNMENT);
	displayImagedoor.setAlignmentY(Component.BOTTOM_ALIGNMENT);
	displayImagedoor.setHorizontalAlignment(SwingConstants.CENTER);
	displayImagedoor.setIcon(new ImageIcon(GUItest.class.getResource("/assets/o.png")));
	add(displayImagedoor);

	displayImageroof = new JLabel("");
	displayImageroof.setAlignmentX(Component.RIGHT_ALIGNMENT);
	displayImageroof.setAlignmentY(Component.BOTTOM_ALIGNMENT);
	displayImageroof.setHorizontalAlignment(SwingConstants.CENTER);
	displayImageroof.setIcon(new ImageIcon(GUItest.class.getResource("/assets/x.png")));
	add(displayImageroof);

	
	icon1 = new ImageIcon();

	}
	
	
	protected void paintComponet(Graphics g)
	{
		super.paintComponent(g);
		
		ImageIcon incon1 = new ImageIcon(GamePanel.class.getResource("assets/x.png"));
		
	}
	
	
	
	public void play1()
	{
		//icon1 = new ImageIcon(GamePanel.class.getResource("assets/x.png"));
		
		JLabel L = new JLabel("");
		
		L.setBackground(Color.BLACK);
		
	}


}
