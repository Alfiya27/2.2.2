package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    public static List<Car> carList(int count) {
        List<Car> list = new ArrayList<>();

        list.add(new Car("Peugeout", "white", 1995));
        list.add(new Car("DeLorean", "steel", 1981));
        list.add(new Car("Ford", "black", 1973));
        list.add(new Car("BMW", "black", 1995));
        list.add(new Car("Chevrolet", "yellow", 2011));

        if (count == 0 || count >= 5) {
            return list;
        }
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
