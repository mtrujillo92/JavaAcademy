package com.globant.Topic7.controller;

import com.globant.Topic7.entity.WeatherData;
import com.globant.Topic7.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class WeatherDataController {
    @Autowired
    WeatherDataRepository repository;


    @GetMapping("/weathers")
    private String addWeather (Model model){
        model.addAttribute("weatherData", new WeatherData());
        return "weather";
    }

    @GetMapping("/weather/{id}")
    private String deleteWeather(@PathVariable(name="id") Integer weatherId){
        repository.deleteById(weatherId);
        return "redirect:/";
    }

    @PostMapping("/addWeather")
    private String saveWeather(@ModelAttribute WeatherData weatherData, RedirectAttributes redirectAttributes){
        repository.save(weatherData);
        redirectAttributes
                .addFlashAttribute("message","Added")
                .addFlashAttribute("class","success");
        return "redirect:/weathers";
    }

    @GetMapping("/")
    private String getAll(Model model){
        List<WeatherData> weatherDataList = repository.findAll();
        model.addAttribute("weatherData", weatherDataList);
        return "home";
    }
    @GetMapping("/weatherEdit/{id}")
    private String editWeather(@PathVariable(name = "id") Integer weatherId, Model model){
        model.addAttribute("weatherToUpdate", repository.findById(weatherId));
        return "formEdit";
    }

    @PostMapping("/weatherEdit")
    private String updateWeather(@ModelAttribute WeatherData weatherData, RedirectAttributes redirectAttributes){
        repository.save(weatherData);
        redirectAttributes
                .addFlashAttribute("message","Added")
                .addFlashAttribute("class","success");
        return "redirect:/";
    }



}
