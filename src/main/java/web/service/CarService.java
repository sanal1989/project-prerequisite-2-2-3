package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> cars = Car.cars;

    public List<Car> countCar(int count){
        List<Car> list = new ArrayList<>();
        if(count > 5) count = cars.size();
        for (int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        return list;
    }
}
