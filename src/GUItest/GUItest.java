package GUItest;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GUItest extends JFrame{
    private JPanel panel1;
    private JButton button1;
private int i;
private int j;




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
            setBounds(100, 100, 500, 500);
            contentPane = new JPanel();
            contentPane.setBackground(Color.WHITE);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(new GridLayout(3, 3, 0, 0));
//            for (i = 0 ; i< 9; i++) {
            JPanel panel = new JPanel();
            panel.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel.setBackground(Color.RED);
            contentPane.add(panel);
            panel.setLayout(new GridLayout(3, 3, 0, 0));
//            for (j = 0; j<9; j++) {
            JPanel panel_1 = new JPanel();
            panel_1.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel.add(panel_1);
            panel_1.setLayout(new GridLayout(0, 1, 0, 0));
            
            JButton button = new JButton("");
            button.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		System.out.print("hi");
            	}
            });
            panel_1.add(button);
//            }
//            }
      

        }

        }



