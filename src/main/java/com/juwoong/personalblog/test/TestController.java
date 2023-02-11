package com.juwoong.personalblog.test;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String index(Model model){
        //model.addAttribute("name", "saelobi");
        System.out.println("this is for test Check");
        return "index";
    }

    @GetMapping("/post")
    public String post(Model model){
        //model.addAttribute("name", "saelobi");
        System.out.println("this is for test Check");
        return "post";
    }



}
