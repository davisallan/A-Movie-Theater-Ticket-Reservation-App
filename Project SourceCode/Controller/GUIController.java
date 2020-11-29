package Controller;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the GUI
 */

public class GUIController {

    private MainGUI mainGUI;

    public GUIController(MainGUI mainGUI) {
        setMainGUI(mainGUI);
        mainGUI.getLoginForm().signUpButton(new registerButton());
    }

    public void setMainGUI(MainGUI mainGUI) {
        this.mainGUI = mainGUI;
    }

    private class registerButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            mainGUI.setContentPane(mainGUI.getRegistrationForm().getContentPane());
        }
    }
}
