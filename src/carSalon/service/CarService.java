package carSalon.service;

import carSalon.model.Car;
import carSalon.repository.CarRepository;

import java.util.List;

public class CarService extends CarRepository {

    public CarService(Car carObject) {
        uploadCar(carObject);
    }

    public CarService() {

    }

    private void uploadCar(Car carObject){
        new CarRepository(carObject);
    }
    public List<Car> getAllCars(){
        return getCarList();
    }
}
