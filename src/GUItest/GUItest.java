package GUItest;


import tictactoe.*;

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
import java.util.Scanner;

public class GUItest extends JFrame{
    /**
	 *
	 */

   // private int counter = 0;
//    private int turnId;
//    //private majorBoard mainBoard;
//    private innerBoard workingBoard;
//    private majorBoard mainBoard = new majorBoard();

    private int i;
private int j;
private JGuiLabel L;
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
            		JGuiLabel y = (JGuiLabel) x.getComponent(0);


                    System.out.println("Major pos: "+y.getMX());
                    System.out.println("major pos x:"+ y.getMajorX());
                    System.out.println("Minor pos: "+y.getMY());
                    System.out.println("Major pos y: "+y.getMajorY());



                    buttonPressedUpdate(y.getMajorX(),y.getMajorY(), y.getInnerX(), y.getInnerY());

                    if (guiController.counter % 2 == 0) {
//                        turnId = 2;
                        guiController.playerTurn = 2;
                    } else {
//                        turnId = 1;
                        guiController.playerTurn = 1;
                    }

            		if (guiController.playerTurn == 1) {
            		y.setIcon(new ImageIcon(GUItest.class.getResource("/new/O.png")));
            		}
            		else if (guiController.playerTurn == 2)
            			y.setIcon(new ImageIcon(GUItest.class.getResource("/new/X.png")));

            	}
            });
            panel_1.setBorder(new LineBorder(new Color(255, 200, 0), 3));
            panel.add(panel_1);
            panel_1.setLayout(new GridLayout(1, 1, 0, 0));

            L = new JGuiLabel(i,j,i,j);
            //L.setIcon(new ImageIcon(GUItest.class.getResource("/new/X.png")));
            panel_1.add(L);


            }
            }
        }

        public void buttonPressedUpdate(int majorx, int majory, int innerx, int innery ){

            guiController.workingBoard = guiController.mainBoard.getInnerBoard(majorx-1,majory-1);

            guiController.workingBoard.updateBoard(guiController.playerTurn, (innerx-1), (innery-1));

            guiController.counter++;

            System.out.println(guiController.workingBoard);
            guiController.innerGameWon = guiController.workingBoard.checkWin();

            if(guiController.innerGameWon == true){
                guiController.workingBoard.setWinnerID(guiController.playerTurn);
                guiController.mainBoard.updateBoard();
            }

            System.out.println(guiController.mainBoard.getBoard());

        }
        }



