package org.springjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springjdbc.entity.User;
import  org.springjdbc.service.UserService;

@Controller
public class HomeController {

    @Autowired
    private UserService UserService;

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/register")
    public String signup() {
        return "register";
    }

    @RequestMapping(path = "/createUser",method = RequestMethod.POST)
    public String registerUser(@ModelAttribute User user, @RequestParam("img") String img, Model m) {

        user.setImage(img);
        UserService.registerUser(user);

        m.addAttribute("user", user);

        /* return "redirect:/register"; */
        return "success";
    }

}