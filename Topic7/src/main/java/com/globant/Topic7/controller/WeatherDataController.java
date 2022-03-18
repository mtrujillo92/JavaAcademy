package com.globant.Topic7.controller;

import com.globant.Topic7.entity.WeatherData;
import com.globant.Topic7.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class WeatherDataController {
    @Autowired
    WeatherDataRepository repository;

    @RequestMapping("/")
    public String home (){
        return "home";
    }

    @GetMapping("/weathers")
    public String addWeather (Model model){
        model.addAttribute("weatherData", new WeatherData());
        return "weather";
    }

    @PostMapping("/addWeather")
    public String saveWeather(@ModelAttribute WeatherData weatherData, RedirectAttributes redirectAttributes){
        repository.save(weatherData);
        redirectAttributes
                .addFlashAttribute("message","Added")
                .addFlashAttribute("class","success");
        return "redirect:/weathers";
    }

}
