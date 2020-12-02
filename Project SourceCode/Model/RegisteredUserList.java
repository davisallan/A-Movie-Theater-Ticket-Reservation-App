package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The type Registered user list.
 */
public class RegisteredUserList {

    private ArrayList<RegisteredUser> registeredUsers;

    /**
     * Instantiates a new Registered user list.
     */
    public RegisteredUserList() {
        registeredUsers = new ArrayList<>();
    }

    /**
     * Load registered users.
     *
     * @param rs the rs
     */
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

    /**
     * Gets registered users.
     *
     * @return the registered users
     */
    public ArrayList<RegisteredUser> getRegisteredUsers() {
        return registeredUsers;
    }
}
