package com.axsos.web.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String helloHuman(){
        return "Hello Human";
    }
    @RequestMapping("/{name}")
    public String helloStranger(@PathVariable("name") String name){
        return "Hello "+ name;
    }
}
