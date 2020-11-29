package View;

import javax.swing.*;

public class MainGUI extends JFrame {

    private LoginForm loginForm;
    private RegistrationForm registrationForm;

    public MainGUI() {
        setLoginForm(new LoginForm());
        setRegistrationForm(new RegistrationForm());

        setContentPane(loginForm.getContentPane());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setContentPane(JPanel pane) {
        setContentPane(pane);
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }

    public void setLoginForm(LoginForm loginForm) {
        this.loginForm = loginForm;
    }

    public RegistrationForm getRegistrationForm() {
        return registrationForm;
    }

    public void setRegistrationForm(RegistrationForm registrationForm) {
        this.registrationForm = registrationForm;
    }
}
