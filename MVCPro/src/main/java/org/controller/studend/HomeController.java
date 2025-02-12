package org.controller.studend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public  String home(Model m){

        m.addAttribute("name" , "Gajendra");
        m.addAttribute("Address" , " Jhabua");
        List<String> city = new ArrayList<>();
        city.add("Indore");
        city.add("NewYork");
        city.add("Hyderbad");
        city.add("Rewa");
        return "home";
    }
    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView model = new ModelAndView();
        model.addObject("Class", "16th");
        model.addObject("Name", "Gajendra");
        List<String> cityList = new ArrayList<>();
        cityList.add("Indore");
        cityList.add("NewYork");
        cityList.add("Hyderbad");
        cityList.add("Rewa");
        model.addObject("City", cityList);
        model.setViewName("login");
        return model;

    }
}
