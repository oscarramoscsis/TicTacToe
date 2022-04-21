package GUItest;


import javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
public class GUItest extends JFrame{
    /**
	 * 
	 */

    private int counter = 0;
private int i;
private int j;
private JLabel L;
private BufferedImage marker;
private GamePanel gamePanel;



        private JPanel contentPane;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        GUItest frame = new GUItest();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        /**
         * Create the frame.
         */
        public GUItest() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 1000, 1000);
            contentPane = new JPanel();
            contentPane.setBackground(Color.WHITE);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(new GridLayout(3, 3, 0, 0));
            
            JGuiLabel [][] grid;
            
            for (i = 0 ; i< 9; i++) {
            JPanel panel = new JPanel();
            panel.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel.setBackground(Color.RED);
            contentPane.add(panel);
            panel.setLayout(new GridLayout(3, 3, 0, 0));
            
            for (j = 0; j<9; j++) {
            JPanel panel_1 = new JPanel();
            panel_1.addMouseListener(new MouseAdapter() {
            	@Override
            	public void mouseClicked(MouseEvent e) {

        			JPanel x = (JPanel) e.getComponent();
            		JLabel y = (JLabel) x.getComponent(0);
            		counter++;
            		if (counter % 2 !=0) {
            			
            		y.setIcon(new ImageIcon(GUItest.class.getResource("/new/O.png")));
            		}
            		else if (counter % 2 == 0)
            			y.setIcon(new ImageIcon(GUItest.class.getResource("/new/X.png")));
            		
            		
                      
                    
            	}
            });
            panel_1.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel.add(panel_1);
            panel_1.setLayout(new GridLayout(1, 1, 0, 0));
            
            L = new JLabel("");
            //L.setIcon(new ImageIcon(GUItest.class.getResource("/new/X.png")));
            panel_1.add(L);


            }
            }
      

        }

        }



