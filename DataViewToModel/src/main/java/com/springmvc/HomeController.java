package com.springmvc;

import com.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMapping.*;

@Controller
public class HomeController {

//    @ModelAttribute
//    public void commanDataForModel(Model model){
//        model.addAttribute("header" , " Learing  the spring boot ");
//    }
    @GetMapping("/home")
    public  String home(){

        return "home";
    }
    @RequestMapping("/register")
    public  String register(Model model){
//        model.addAttribute("header"," Gajendra Patidar");
        return "register";
    }




    ///using the MOdel Attribute


    @RequestMapping(value = "/createUser",method = RequestMethod.POST)
    public  String registerUser(@ModelAttribute User user,Model model){

        System.out.println(user);
//model.addAttribute("user",user);
        return "success";
    }




    // here we printing the data of the user with the single value
//    @RequestMapping(value = "/createUser",method = RequestMethod.POST)
//    public String registerUser(@ModelAttribute User user, @RequestParam("fullName") String fn,
//                               @RequestParam("email") String email, @RequestParam("password") String password,
//                               @RequestParam("check") String check, Model m){
//
//
//        System.out.println("Full Name" +fn);
//        System.out.println("Email" +email);
//        System.out.println("Password" +password);
//        System.out.println("Check" +check);
////        System.out.println(user);
//
//        // model help to sending the data to the sucess jsp page
//        m.addAttribute("fn" , fn);
//        m.addAttribute("email", email);
//        m.addAttribute("password" , password);
//        m.addAttribute("Check", check);
//
//        return "success"; // assuming you want to return to the register page
//    }
}
