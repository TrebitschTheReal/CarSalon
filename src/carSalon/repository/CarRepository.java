package carSalon.repository;

import carSalon.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    Connection con;

    public CarRepository(Car carObject) {
        this.con = new DatabaseConnector().createConnection();
        saveTheCar(carObject);
    }

    public CarRepository() {
        this.con = new DatabaseConnector().createConnection();

    }

    private void saveTheCar(Car carObject){
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
            while(rs.next()) {
                cars.add(new Car(Integer.parseInt(rs.getString("id")), rs.getString("brand"), rs.getString("color")));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cars;
    }
}
