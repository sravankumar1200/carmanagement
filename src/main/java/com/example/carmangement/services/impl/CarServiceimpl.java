package com.example.carmangement.services.impl;

import java.util.List;

import com.example.carmangement.Repository.CarRepository;
import com.example.carmangement.model.Car;
import com.example.carmangement.services.CarService;

import org.springframework.stereotype.Service;

@Service
public class CarServiceimpl implements CarService{
    private CarRepository carRepository;
    public CarServiceimpl(CarRepository carRepository){
        this.carRepository=carRepository;

    }

    @Override
    public Car saveCar(Car car) {
        
         return carRepository.save(car);
    }

    @Override
    public List<Car> getallcars() {
        
        return carRepository.findAll();
    }

    @Override
    public void deleteCar(long id) throws RuntimeException {
        carRepository.findById(id).orElseThrow(() -> new RuntimeException());
        carRepository.deleteById(id); 
               
        
        
    }

    @Override
    public Car updateCarbyId(long id,Car car) {
        carRepository.findById(id);
        return carRepository.save(car);
       
    }

    @Override
    public Car  getcarbyId(long id) {
      
        return (carRepository.findById(id).orElseThrow(() -> new RuntimeException()));

    }

}