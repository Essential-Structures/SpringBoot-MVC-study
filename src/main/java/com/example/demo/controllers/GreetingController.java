package com.example.demo.controllers;

import com.example.demo.models.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j //allows use of log

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model controllerToViewCarrier){
        controllerToViewCarrier.addAttribute("MesajMapareObiectModel", new Greeting());
       //  log.info("greetingForm method, triggered by GET verb, was called");
        return "greeting"; //nume template html

    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Greeting salutariTransmise, Model modelCareRaspunde){
        modelCareRaspunde.addAttribute("submitted", salutariTransmise);
       // log.info("submitForm method, triggered by POST verb, was called");
        return "result";//nume template html
    }
}

