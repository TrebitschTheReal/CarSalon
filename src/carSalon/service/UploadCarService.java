package carSalon.service;

import carSalon.model.Car;
import carSalon.repository.UploadCarRepository;

public class UploadCarService {

    public UploadCarService(Car carObject) {
        uploadCar(carObject);
    }

    private void uploadCar(Car carObject){
        new UploadCarRepository(carObject);
    }
}
