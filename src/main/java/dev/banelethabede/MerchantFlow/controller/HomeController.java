package dev.banelethabede.MerchantFlow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
     
    @RequestMapping("/")
    public String home(){
        return "The application is Alive and Kicking";
    }
}
