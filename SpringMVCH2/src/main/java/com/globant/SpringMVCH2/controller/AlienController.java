package com.globant.SpringMVCH2.controller;

import com.globant.SpringMVCH2.model.Alien;
import com.globant.SpringMVCH2.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

    @Autowired
    AlienRepository alienRepository;

    @RequestMapping("/")
    public String home(){
        return "home.html";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        alienRepository.save(alien);
        return "home.html";
    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid){
        ModelAndView mv = new ModelAndView("showAlien.html");
        Alien alien = alienRepository.findById(aid).orElse(new Alien());
        mv.addObject("alien",alien);
        return mv;
    }
}
