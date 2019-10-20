package carSalon.repository;

import carSalon.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UploadCarRepository {

    public UploadCarRepository(Car carObject) {
        saveTheCar(carObject);
    }

    private void saveTheCar(Car carObject){
        Connection con = new DatabaseConnector().createConnection();
        try {
            String loginQuery = "INSERT INTO `cars` (brand, color) VALUES (?, ?);";
            PreparedStatement pstm = con.prepareStatement(loginQuery);
            pstm.setString(1, carObject.getBrand());
            pstm.setString(2, carObject.getColor());
            pstm.execute();

            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
