package carSalon.repository;

import carSalon.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    protected void saveTheCar(Car carObject) {
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

    protected List<Car> getCarList() {
        List<Car> cars = new ArrayList<Car>();
        Connection con = new DatabaseConnector().createConnection();
        try {
            String loginQuery = "SELECT id, brand, color FROM cars;";
            PreparedStatement pstm = con.prepareStatement(loginQuery);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                cars.add(new Car(rs.getString("id"), rs.getString("brand"), rs.getString("color")));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cars;
    }

    protected void deleteCarFromDB(Car car) {
        Connection con = new DatabaseConnector().createConnection();

        try {
            String loginQuery = "DELETE FROM cars WHERE id = ?;";
            PreparedStatement pstm = con.prepareStatement(loginQuery);
            pstm.setString(1, car.getId());
            pstm.execute();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    protected void modifyCarInDB(Car car) {
        Connection con = new DatabaseConnector().createConnection();

        try {
            if (car.getBrand().equals("")) {
                String loginQuery = "UPDATE cars SET color = ? WHERE id = ?;";
                PreparedStatement pstm = con.prepareStatement(loginQuery);
                pstm.setString(1, car.getColor());
                pstm.setString(2, car.getId());
                pstm.execute();
                con.close();
            } else if (car.getColor().equals("")) {
                String loginQuery = "UPDATE cars SET brand = ? WHERE id = ?;";
                PreparedStatement pstm = con.prepareStatement(loginQuery);
                pstm.setString(1, car.getBrand());
                pstm.setString(2, car.getId());
                pstm.execute();
                con.close();
            } else {
                String loginQuery = "UPDATE cars SET brand = ?, color = ? WHERE id = ?;";
                PreparedStatement pstm = con.prepareStatement(loginQuery);
                pstm.setString(1, car.getBrand());
                pstm.setString(2, car.getColor());
                pstm.setString(3, car.getId());
                pstm.execute();
                con.close();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
