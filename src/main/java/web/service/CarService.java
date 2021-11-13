package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    public static List<Car> carCount(List<Car> list, int count) {
        if (count == 0 || count >= 5) {
            return list;
        }
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
