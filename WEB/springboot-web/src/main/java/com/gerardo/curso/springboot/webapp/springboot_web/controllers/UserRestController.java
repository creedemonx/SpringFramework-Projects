package com.gerardo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gerardo.curso.springboot.webapp.springboot_web.models.User;
import com.gerardo.curso.springboot.webapp.springboot_web.models.dto.UserDTO;
import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

    User user = new User();

    @GetMapping("/details")
    public UserDTO details() {
        UserDTO userDto = new UserDTO();
        User user = new User("Gerardo", "Espinosa");
        userDto.setID(1231);
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Gerardo", "Espinosa");
        User user2 = new User("Roberto", "Guitierrez");
        User user3 = new User("Juan", "Lopez");
        User user4 = new User("Pizarro", "Cortés");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;

    }

}
