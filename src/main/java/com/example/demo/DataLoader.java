package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... strings) throws Exception {
        Car car = new Car(2018, "Toyota", "Corolla");
        carRepository.save(car);

        car = new Car(2019, "Honda", "CR-V");
        carRepository.save(car);

        car = new Car(2010, "Jeep", "Wrangler");
        carRepository.save(car);

        car = new Car(2019, "Volkswagen", "e-Golf");
        carRepository.save(car);

        car = new Car(2019, "Chevrolet", "Volt");
        carRepository.save(car);
    }
}
