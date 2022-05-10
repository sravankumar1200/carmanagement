package com.example.carmangement.controller;

import com.example.carmangement.Repository.CarRepository;
import com.example.carmangement.model.Car;
import com.example.carmangement.services.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping
public class CarController {
    @Autowired
    private CarService carService;
    public CarController(CarService carService){
        super();
        this.carService=carService;
    }
   @PostMapping("/api/cars")
   public List<Car>saveCar(@RequestBody Car car){
       carService.saveCar(car);
       return(carService.getallcars());
   }
   @GetMapping("/showall")
   public List<Car> p(){
       return(carService.getallcars());
   }
   @GetMapping("/deletebyid")
   public String del(@RequestParam(name = "id")long id){
       carService.deleteCar(id);
       return "deleted";

   }
   @PostMapping("/updatebyId")
   public Car q(@RequestParam(name = "id")long id, @RequestBody Car car){
       carService.saveCar(car);
       return carService.updateCarbyId(id, car);
}
   @GetMapping("/getCarById")
       public Car l(@RequestParam(name = "id")long id){
          return carService.getcarbyId(id);

       }
   }


    




