package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.CarService;



@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping()
    public String car(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null) {
        model.addAttribute("cars", carService.showAll());
             } else {
            model.addAttribute("cars", carService.index(count));
            }
            return "cars";
        }
}