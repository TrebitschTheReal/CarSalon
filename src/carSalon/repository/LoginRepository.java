package carSalon.repository;

import carSalon.model.User;

import javax.servlet.http.HttpSession;
import java.sql.*;
import java.sql.SQLException;


public class LoginRepository {
    private int userSecurityLevel = -1;

    public boolean validateLoginQuery(User user) {
        boolean result = false;
        Connection con = new DatabaseConnector().createConnection();

        try {
            String loginQuery = "SELECT `user_security_level` FROM `users` WHERE `username` = ? AND `password` = ?";
            PreparedStatement pstm = con.prepareStatement(loginQuery);
            pstm.setString(1, user.getUserName());
            pstm.setString(2, user.getPassword());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                if (rs.getInt("user_security_level") >= 0) {
                    this.userSecurityLevel = rs.getInt("user_security_level");
                    result = true;
                }
            }
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public int getUserSecurityLevel() {
        return userSecurityLevel;
    }
}
