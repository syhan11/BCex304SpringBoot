package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    CarRepository carRepository;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("car", new Car());
        return "homePage";
    }


}
