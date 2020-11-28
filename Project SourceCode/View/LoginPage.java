package View;

import View.MainGuiController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginPage {

    public JFrame frame;
    private JTextField textField1;
    private JLabel Email;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton logInButton;
    private JButton registerButton;
    private JButton guestButton;

    public LoginPage(){

        frame = new JFrame("Login Page");
        frame.setContentPane(this.panel1);
//        frame.setSize(10000, 30000);
        frame.setPreferredSize(new Dimension(700, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);
    }

    public void registerButton(ActionListener actionListener) {
        registerButton.addActionListener(actionListener);
    }

    public void guestButton(ActionListener actionListener) {
        guestButton.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        LoginPage view = new LoginPage();
        MainGuiController mc = new MainGuiController(view);

    }
}
