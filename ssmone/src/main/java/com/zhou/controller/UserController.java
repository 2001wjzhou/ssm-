package com.zhou.controller;

import com.zhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("userlist",userService.findAll());
        return "test";
    }

}
