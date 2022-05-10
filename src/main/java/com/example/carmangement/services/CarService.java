package com.example.carmangement.services;

import com.example.carmangement.model.Car;

//import org.springframework.http.ResponseEntity;

import java.util.List;
public interface CarService {
    Car saveCar(Car car);
    List<Car>getallcars();
    void deleteCar(long id);
    Car updateCarbyId(long id, Car car);
    Car getcarbyId(long id);
    
}
