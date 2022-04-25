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
            setBounds(100, 100, 500, 500);
            contentPane = new JPanel();
            contentPane.setBackground(Color.WHITE);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(new GridLayout(3, 3, 0, 0));


            JGuiLabel [][] grid = new JGuiLabel[3][3];
            //Maybe use this array in the for loops to get the coordinates of each panel? And
            // this way, know how to isolate it?



            for (i = 0 ; i< 9; i++) {
            JPanel panel = new JPanel();
            panel.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel.setBackground(Color.RED);
            contentPane.add(panel);
            panel.setLayout(new GridLayout(3, 3, 0, 0));

            for (j = 0; j<9; j++) {
            JPanel panel_1 = new JPanel();

            //grid [i][j];
            panel_1.addMouseListener(new MouseAdapter() {
            	@Override
            	public void mouseClicked(MouseEvent e) {

                    JPanel x = (JPanel) e.getComponent();
                    JGuiLabel y = (JGuiLabel) x.getComponent(0);

                    // while(guiController.workingBoard.checkValid() == true) // we're missing the checkValid for this
                    //Which we could use to disbale the swithcing between images

                    //System.out.println("Major pos: "+y.getMX()); // Provides major pos from 0-8
                    //System.out.println("Minor pos: "+y.getMY()); // Provides minor pos from 0-8

                    System.out.println("major pos x:" + y.getMajorX()); // Provides rows from 1-3 order
                    System.out.println("Major pos y: " + y.getMajorY()); // Provides columns from 1-3 order

                    System.out.println("TEST FOR X " + y.getInnerX()); // Provides rows from 1-3 order
                    System.out.println("TEST FOR Y " + y.getInnerY()); // Provides columns from 1-3 order

                    //grid.


                    buttonPressedUpdate(y.getMajorX(), y.getMajorY(), y.getInnerX(), y.getInnerY());

                    if (guiController.counter % 2 == 0) {
//                        turnId = 2;
                        guiController.playerTurn = 2;
                        //y.getRootPane().getContentPane().setVisible(false); //Made it invisible in turn 1


                    } else {
//                        turnId = 1;
                        guiController.playerTurn = 1;
                        //y.getRootPane().getContentPane().setVisible(true);
                    }


                    //Having issues with the majorPos for the middle board... returning 0 all the time
                    // no matter any changes? wth?
                    // will affect positioning for the next move to be highlighted

                    if (guiController.playerTurn == 1) {
                        y.setIcon(new ImageIcon(GUItest.class.getResource("/new/O.png")));

                        y.getRootPane().getContentPane().getComponent(y.converterFromMinorPosToMajorPos(y.getInnerX(),y.getInnerY())-1).setBackground(Color.CYAN);
                        //y.getRootPane().getContentPane().getComponent().ins
                        System.out.println(y.converterFromMinorPosToMajorPos(y.getInnerX(), y.getInnerY()));
                        System.out.println("Inner X " + y.getInnerX());
                        System.out.println("Inner Y " + y.getInnerY());

                        if (buttonPressedUpdate(y.getMajorX(), y.getMajorY(), y.getInnerX(), y.getInnerY())) {
                            if (guiController.counter % 2 == 0) {
                                guiController.playerTurn = 2;
                            } else {
                                guiController.playerTurn = 1;
                            }


                            if (guiController.playerTurn == 1) {
                                y.setIcon(new ImageIcon(GUItest.class.getResource("/new/O.png")));
                            } else if (guiController.playerTurn == 2)
                                y.setIcon(new ImageIcon(GUItest.class.getResource("/new/X.png")));
                        } else
                            System.out.println("invalid");


                        if(guiController.innerGameWon == true)
                        {
                            y.getRootPane().getContentPane().getComponent(y.converterForMajorPos(y.getMajorX(),y.getMajorY())-1).setVisible(false);
                            //y.getRootPane().getContentPane().getComponent(y.converterForMajorPos(y.getMajorX(),y.getMajorY())-1).setEnabled(false);
                        }



                    } else if (guiController.playerTurn == 2)
                        y.setIcon(new ImageIcon(GUItest.class.getResource("/new/X.png")));

                    if(guiController.innerGameWon == true)
                    {
                        y.getRootPane().getContentPane().getComponent(y.converterForMajorPos(y.getMajorX(),y.getMajorY())-1).setVisible(false);
                    }

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
        public static void check() {
            guiController.innerGameWon = guiController.workingBoard.checkWin();

            if (guiController.innerGameWon == true) {
                guiController.workingBoard.setWinnerID(guiController.playerTurn);
                guiController.mainBoard.updateBoard();
            }

    }
    //comment

    public boolean buttonPressedUpdate(int majorx, int majory, int innerx, int innery) {
        guiController.workingBoard = guiController.mainBoard.getInnerBoard(majorx - 1, majory - 1);

        if (guiController.workingBoard.checkValid((innerx - 1), (innery - 1)) == true) {

            guiController.workingBoard.updateBoard(guiController.playerTurn, (innerx - 1), (innery - 1));
            guiController.counter++;

            System.out.println(guiController.workingBoard);
            check();

            System.out.println(guiController.mainBoard.getBoard());
            return true;
        } else {
            System.out.println("invalid move");
            return false;
        }

    }

}
