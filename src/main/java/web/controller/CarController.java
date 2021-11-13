package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carList(@RequestParam(value = "count",defaultValue = "5") int count, Model model) {
        List<Car> list = new ArrayList<>();

            list.add(new Car("Peugeout", "white", 1995));
            list.add(new Car("DeLorean", "steel", 1981));
            list.add(new Car("Ford", "black", 1973));
            list.add(new Car("BMW", "black", 1995));
            list.add(new Car("Chevrolet", "yellow", 2011));
            list = carService.carCount(list, count);


        model.addAttribute("cars", list);
        return "cars";
    }
}
