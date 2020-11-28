package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGuiController {


    private LoginPage login;


    public MainGuiController(LoginPage login){
        this.login = login;

        login.registerButton(new RegisterButton());
        login.guestButton(new GuestButton());

    }

    public class RegisterButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new RegisterPage();
            login.frame.dispose();

        }
    }

    public class GuestButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new ReservationPage();
            login.frame.dispose();

        }
    }

}
