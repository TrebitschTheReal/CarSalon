package carSalon.service;

import carSalon.model.Car;
import carSalon.repository.CarRepository;

import java.util.List;

public class CarService extends CarRepository {

    public void uploadCar(Car carObject){
        saveTheCar(carObject);
    }
    public List<Car> getAllCars(){
        return getCarList();
    }

    public void deleteCar(Car car){
        deleteCarFromDB(car);
    }
}
