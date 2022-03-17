package com.globant.Topic7.controller;

import com.globant.Topic7.entity.WeatherData;
import com.globant.Topic7.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherDataController {
    @Autowired
    WeatherDataRepository repository;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/addWeather")
    public String addWeather (WeatherData weatherData){
        repository.save(weatherData);
        return "home";
    }
}
