package View;

import javax.swing.*;
import java.awt.*;

public class ReservationPage {
    public JFrame frame;
    private JPanel panel1;
    private JTextField textField1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton checkoutButton;
    private JTextArea textArea1;
    private JButton seat9Button;
    private JButton seat1Button;
    private JButton seat5Button;
    private JButton seat4Button1;
    private JButton seat8Button;
    private JButton seat12Button;
    private JButton seat3Button;
    private JButton seat7Button;
    private JButton seat11Button;
    private JButton seat2Button;
    private JButton seat6Button;
    private JButton seat10Button;
    private JPanel panel2 = new JPanel();

//    JButton buttons1[] = new JButton[9];


    public ReservationPage(){

        frame = new JFrame("Main Reservation Page");
        frame.setContentPane(this.panel1);
        frame.setPreferredSize(new Dimension(1000, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);
//        panel2.setLayout(new GridLayout(4,4));
//        for (int i= 0; i < 9; i++){
//            buttons1[i] = new JButton();
//            buttons1[i].setText("");
//            panel2.add(buttons1[i]);
//        }
    }

}
