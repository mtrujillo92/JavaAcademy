package com.globant.Topic7.controller;

import com.globant.Topic7.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherDataController {
    @Autowired
    WeatherDataRepository repository;

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
