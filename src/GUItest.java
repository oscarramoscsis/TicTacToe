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
public class GUItest extends JFrame{
    private JPanel panel1;
    private JButton button1;





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

            JPanel panel = new JPanel();
            panel.setBackground(Color.RED);
            panel.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.add(panel);
            panel.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9 = new JPanel();
            panel_9.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel.add(panel_9);
            panel_9.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9 = new JPanel();
            panel_9_9.setBorder(new LineBorder(Color.ORANGE, 3));
            panel.add(panel_9_9);
            panel_9_9.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10 = new JPanel();
            panel_9_10.setBorder(new LineBorder(Color.ORANGE, 3));
            panel.add(panel_9_10);
            panel_9_10.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11 = new JPanel();
            panel_9_11.setBorder(new LineBorder(Color.ORANGE, 3));
            panel.add(panel_9_11);
            panel_9_11.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12 = new JPanel();
            panel_9_12.setBorder(new LineBorder(Color.ORANGE, 3));
            panel.add(panel_9_12);
            panel_9_12.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13 = new JPanel();
            panel_9_13.setBorder(new LineBorder(Color.ORANGE, 3));
            panel.add(panel_9_13);
            panel_9_13.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14 = new JPanel();
            panel_9_14.setBorder(new LineBorder(Color.ORANGE, 3));
            panel.add(panel_9_14);
            panel_9_14.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15 = new JPanel();
            panel_9_15.setBorder(new LineBorder(Color.ORANGE, 3));
            panel.add(panel_9_15);
            panel_9_15.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16 = new JPanel();
            panel_9_16.setBorder(new LineBorder(Color.ORANGE, 3));
            panel.add(panel_9_16);
            panel_9_16.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_1 = new JPanel();
            panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel_1.setBackground(Color.RED);
            contentPane.add(panel_1);
            panel_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_1 = new JPanel();
            panel_9_1.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel_1.add(panel_9_1);
            panel_9_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9_1 = new JPanel();
            panel_9_9_1.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_1.add(panel_9_9_1);
            panel_9_9_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10_1 = new JPanel();
            panel_9_10_1.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_1.add(panel_9_10_1);
            panel_9_10_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11_1 = new JPanel();
            panel_9_11_1.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_1.add(panel_9_11_1);
            panel_9_11_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12_1 = new JPanel();
            panel_9_12_1.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_1.add(panel_9_12_1);
            panel_9_12_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13_1 = new JPanel();
            panel_9_13_1.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_1.add(panel_9_13_1);
            panel_9_13_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14_1 = new JPanel();
            panel_9_14_1.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_1.add(panel_9_14_1);
            panel_9_14_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15_1 = new JPanel();
            panel_9_15_1.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_1.add(panel_9_15_1);
            panel_9_15_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16_1 = new JPanel();
            panel_9_16_1.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_1.add(panel_9_16_1);
            panel_9_16_1.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_2 = new JPanel();
            panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel_2.setBackground(Color.RED);
            contentPane.add(panel_2);
            panel_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_2 = new JPanel();
            panel_9_2.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel_2.add(panel_9_2);
            panel_9_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9_2 = new JPanel();
            panel_9_9_2.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_2.add(panel_9_9_2);
            panel_9_9_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10_2 = new JPanel();
            panel_9_10_2.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_2.add(panel_9_10_2);
            panel_9_10_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11_2 = new JPanel();
            panel_9_11_2.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_2.add(panel_9_11_2);
            panel_9_11_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12_2 = new JPanel();
            panel_9_12_2.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_2.add(panel_9_12_2);
            panel_9_12_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13_2 = new JPanel();
            panel_9_13_2.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_2.add(panel_9_13_2);
            panel_9_13_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14_2 = new JPanel();
            panel_9_14_2.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_2.add(panel_9_14_2);
            panel_9_14_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15_2 = new JPanel();
            panel_9_15_2.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_2.add(panel_9_15_2);
            panel_9_15_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16_2 = new JPanel();
            panel_9_16_2.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_2.add(panel_9_16_2);
            panel_9_16_2.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_3 = new JPanel();
            panel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel_3.setBackground(Color.RED);
            contentPane.add(panel_3);
            panel_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_3 = new JPanel();
            panel_9_3.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel_3.add(panel_9_3);
            panel_9_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9_3 = new JPanel();
            panel_9_9_3.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_3.add(panel_9_9_3);
            panel_9_9_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10_3 = new JPanel();
            panel_9_10_3.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_3.add(panel_9_10_3);
            panel_9_10_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11_3 = new JPanel();
            panel_9_11_3.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_3.add(panel_9_11_3);
            panel_9_11_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12_3 = new JPanel();
            panel_9_12_3.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_3.add(panel_9_12_3);
            panel_9_12_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13_3 = new JPanel();
            panel_9_13_3.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_3.add(panel_9_13_3);
            panel_9_13_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14_3 = new JPanel();
            panel_9_14_3.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_3.add(panel_9_14_3);
            panel_9_14_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15_3 = new JPanel();
            panel_9_15_3.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_3.add(panel_9_15_3);
            panel_9_15_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16_3 = new JPanel();
            panel_9_16_3.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_3.add(panel_9_16_3);
            panel_9_16_3.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_4 = new JPanel();
            panel_4.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel_4.setBackground(Color.RED);
            contentPane.add(panel_4);
            panel_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_4 = new JPanel();
            panel_9_4.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel_4.add(panel_9_4);
            panel_9_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9_4 = new JPanel();
            panel_9_9_4.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_4.add(panel_9_9_4);
            panel_9_9_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10_4 = new JPanel();
            panel_9_10_4.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_4.add(panel_9_10_4);
            panel_9_10_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11_4 = new JPanel();
            panel_9_11_4.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_4.add(panel_9_11_4);
            panel_9_11_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12_4 = new JPanel();
            panel_9_12_4.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_4.add(panel_9_12_4);
            panel_9_12_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13_4 = new JPanel();
            panel_9_13_4.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_4.add(panel_9_13_4);
            panel_9_13_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14_4 = new JPanel();
            panel_9_14_4.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_4.add(panel_9_14_4);
            panel_9_14_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15_4 = new JPanel();
            panel_9_15_4.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_4.add(panel_9_15_4);
            panel_9_15_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16_4 = new JPanel();
            panel_9_16_4.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_4.add(panel_9_16_4);
            panel_9_16_4.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_5 = new JPanel();
            panel_5.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel_5.setBackground(Color.RED);
            contentPane.add(panel_5);
            panel_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_5 = new JPanel();
            panel_9_5.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel_5.add(panel_9_5);
            panel_9_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9_5 = new JPanel();
            panel_9_9_5.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_5.add(panel_9_9_5);
            panel_9_9_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10_5 = new JPanel();
            panel_9_10_5.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_5.add(panel_9_10_5);
            panel_9_10_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11_5 = new JPanel();
            panel_9_11_5.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_5.add(panel_9_11_5);
            panel_9_11_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12_5 = new JPanel();
            panel_9_12_5.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_5.add(panel_9_12_5);
            panel_9_12_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13_5 = new JPanel();
            panel_9_13_5.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_5.add(panel_9_13_5);
            panel_9_13_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14_5 = new JPanel();
            panel_9_14_5.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_5.add(panel_9_14_5);
            panel_9_14_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15_5 = new JPanel();
            panel_9_15_5.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_5.add(panel_9_15_5);
            panel_9_15_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16_5 = new JPanel();
            panel_9_16_5.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_5.add(panel_9_16_5);
            panel_9_16_5.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_6 = new JPanel();
            panel_6.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel_6.setBackground(Color.RED);
            contentPane.add(panel_6);
            panel_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_6 = new JPanel();
            panel_9_6.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel_6.add(panel_9_6);
            panel_9_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9_6 = new JPanel();
            panel_9_9_6.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_6.add(panel_9_9_6);
            panel_9_9_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10_6 = new JPanel();
            panel_9_10_6.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_6.add(panel_9_10_6);
            panel_9_10_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11_6 = new JPanel();
            panel_9_11_6.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_6.add(panel_9_11_6);
            panel_9_11_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12_6 = new JPanel();
            panel_9_12_6.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_6.add(panel_9_12_6);
            panel_9_12_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13_6 = new JPanel();
            panel_9_13_6.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_6.add(panel_9_13_6);
            panel_9_13_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14_6 = new JPanel();
            panel_9_14_6.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_6.add(panel_9_14_6);
            panel_9_14_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15_6 = new JPanel();
            panel_9_15_6.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_6.add(panel_9_15_6);
            panel_9_15_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16_6 = new JPanel();
            panel_9_16_6.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_6.add(panel_9_16_6);
            panel_9_16_6.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_7 = new JPanel();
            panel_7.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel_7.setBackground(Color.RED);
            contentPane.add(panel_7);
            panel_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_7 = new JPanel();
            panel_9_7.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel_7.add(panel_9_7);
            panel_9_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9_7 = new JPanel();
            panel_9_9_7.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_7.add(panel_9_9_7);
            panel_9_9_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10_7 = new JPanel();
            panel_9_10_7.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_7.add(panel_9_10_7);
            panel_9_10_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11_7 = new JPanel();
            panel_9_11_7.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_7.add(panel_9_11_7);
            panel_9_11_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12_7 = new JPanel();
            panel_9_12_7.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_7.add(panel_9_12_7);
            panel_9_12_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13_7 = new JPanel();
            panel_9_13_7.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_7.add(panel_9_13_7);
            panel_9_13_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14_7 = new JPanel();
            panel_9_14_7.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_7.add(panel_9_14_7);
            panel_9_14_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15_7 = new JPanel();
            panel_9_15_7.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_7.add(panel_9_15_7);
            panel_9_15_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16_7 = new JPanel();
            panel_9_16_7.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_7.add(panel_9_16_7);
            panel_9_16_7.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_8 = new JPanel();
            panel_8.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel_8.setBackground(Color.RED);
            contentPane.add(panel_8);
            panel_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_8 = new JPanel();
            panel_9_8.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel_8.add(panel_9_8);
            panel_9_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_9_8 = new JPanel();
            panel_9_9_8.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_8.add(panel_9_9_8);
            panel_9_9_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_10_8 = new JPanel();
            panel_9_10_8.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_8.add(panel_9_10_8);
            panel_9_10_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_11_8 = new JPanel();
            panel_9_11_8.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_8.add(panel_9_11_8);
            panel_9_11_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_12_8 = new JPanel();
            panel_9_12_8.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_8.add(panel_9_12_8);
            panel_9_12_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_13_8 = new JPanel();
            panel_9_13_8.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_8.add(panel_9_13_8);
            panel_9_13_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_14_8 = new JPanel();
            panel_9_14_8.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_8.add(panel_9_14_8);
            panel_9_14_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_15_8 = new JPanel();
            panel_9_15_8.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_8.add(panel_9_15_8);
            panel_9_15_8.setLayout(new GridLayout(3, 3, 0, 0));

            JPanel panel_9_16_8 = new JPanel();
            panel_9_16_8.setBorder(new LineBorder(Color.ORANGE, 3));
            panel_8.add(panel_9_16_8);
            panel_9_16_8.setLayout(new GridLayout(3, 3, 0, 0));
        }

    }


