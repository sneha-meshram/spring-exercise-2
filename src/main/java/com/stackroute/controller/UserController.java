package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
    @RequestMapping("/")


    public String details()
    {
        return "index";
    }


    @RequestMapping("/login")
    public ModelAndView sendMessage() {
        User user1=new User();
        user1.setUsername("sneha");
        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("username", user1.getUsername());
        return modelAndView;
    }
}

