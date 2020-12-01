package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisteredUserList {

    private ArrayList<RegisteredUser> registeredUsers;

    public RegisteredUserList() {
        registeredUsers = new ArrayList<>();
    }

    public void loadRegisteredUsers(ResultSet rs) {
        try {
            while (rs.next()) {
                registeredUsers.add (new RegisteredUser (
                        rs.getInt("UserID"),
                        rs.getString("FName"),
                        rs.getString("LName"),
                        rs.getString("Email"),
                        rs.getString("UserPassword"),
                        new CreditCard(rs.getString("Card_name"),
                                rs.getString("Credit_card"),
                                rs.getInt("CVC"),
                                rs.getString("Expiry"))));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<RegisteredUser> getRegisteredUsers() {
        return registeredUsers;
    }
}
