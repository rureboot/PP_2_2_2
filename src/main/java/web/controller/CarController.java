package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {


    private CarService CarService;

    @RequestMapping("")
    public String carList(@RequestParam(required = false) Optional<Integer> count, Model model) {
        Integer carCount = count.orElse(0);
        model.addAttribute("cars", CarService.getCarsList(carCount));
        return "carList";
    }

    @Autowired
    public CarController(web.service.CarService carService) {
        CarService = carService;
    }
}
