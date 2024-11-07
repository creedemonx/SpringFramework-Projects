package com.gerardo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerardo.curso.springboot.webapp.springboot_web.models.User;
import com.gerardo.curso.springboot.webapp.springboot_web.models.dto.ParamDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;

    @Value("${config.code}")
    private int code;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValues}")
    private List<String> listOfValues;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    //clase Environment
    @Autowired
    Environment environment;

    @GetMapping("/baz/{message}")
    public ParamDTO baz(@PathVariable String message) {
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVariable(@PathVariable String product, @PathVariable String id) {
        {
            Map<String, Object> json = new HashMap<>();
            json.put("producto", product);
            json.put("id", id);
            return json;

        }
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        // Aqui se debe de hacer algo con el usuario
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        Long code2 = environment.getProperty(("config.code"),Long.class);
        json.put("username", username);
        json.put("code", code);
        json.put("code2", code2);
        json.put("message", message);
        json.put("message2", environment.getProperty("config.message"));
        json.put("listOfValues", listOfValues);
        json.put("valuesMap", valuesMap);
        return json;
    }

}