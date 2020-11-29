package Controller;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the GUI
 */

public class GUIController {

    private LoginForm loginForm;
    private RegistrationForm registrationForm;
    private MainController mainController;

    public GUIController(LoginForm loginForm) {
        setLoginForm(loginForm);

        loginForm.signUpButton(new SignUpButton());
    }

    public void setLoginForm(LoginForm loginForm) {
        this.loginForm = loginForm;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    private class SignUpButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }
}
