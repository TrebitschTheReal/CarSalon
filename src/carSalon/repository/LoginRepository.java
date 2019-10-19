package carSalon.repository;

import carSalon.model.User;

import java.sql.*;
import java.sql.SQLException;

public class LoginRepository {

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
                result = true;
            }

            con.close();

            return result;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
