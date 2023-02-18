package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.IService;

import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private IService IService;

    @RequestMapping("")
    public String carList(@RequestParam(required = false) Optional<Integer> count, Model model) {
        Integer carCount = count.orElse(0);
        model.addAttribute("cars", IService.getCarsList(carCount));
        return "carList";
    }
}
