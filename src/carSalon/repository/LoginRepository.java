package carSalon.repository;

import carSalon.model.User;

import javax.servlet.http.HttpSession;
import java.sql.*;
import java.sql.SQLException;


public class LoginRepository {
    public void validateLoginQuery(User user) {
        Connection con = new DatabaseConnector().createConnection();

        try {
            String loginQuery = "SELECT `user_security_level` FROM `users` WHERE `username` = ? AND `password` = ?";
            PreparedStatement pstm = con.prepareStatement(loginQuery);
            pstm.setString(1, user.getUserName());
            pstm.setString(2, user.getPassword());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                if (rs.getInt("user_security_level") >= 0) {
                    user.setUserSecurityLevel(rs.getInt("user_security_level"));
                }
            }
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
