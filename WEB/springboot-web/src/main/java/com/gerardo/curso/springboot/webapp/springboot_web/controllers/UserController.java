package com.gerardo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import com.gerardo.curso.springboot.webapp.springboot_web.models.User;
import java.util.Arrays;

//import jakarta.servlet.http.MappingMatch;
//import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class UserController {


    @GetMapping("/details")
    public String details (Model model){
       User user = new User("Gerardo" , "Espinosa");
       model.addAttribute("title", "Hola, Esta es mi primera Web Con Spring");
       model.addAttribute("user", user);
        return "details";
    }
    
    @GetMapping("/list")
    public String list (ModelMap model){
      List<User> users =  Arrays.asList(
        new User("Genaro","Alvarez"),
        new User("Jhon","Doe"),
        new User("Robert","Doe"),
        new User("Toca","Meltroso","meltroso@gmail.com ")); 
      model.addAttribute("users", users);
      model.addAttribute("title","listado de usuarios");
      
        return "list";
    }
}
