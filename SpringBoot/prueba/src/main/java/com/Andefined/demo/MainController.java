package com.Andefined.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/hola")
    public String index(){
        return "index";
    }

}
