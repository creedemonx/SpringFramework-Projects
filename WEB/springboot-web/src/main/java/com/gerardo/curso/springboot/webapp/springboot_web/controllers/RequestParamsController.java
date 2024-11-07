package com.gerardo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gerardo.curso.springboot.webapp.springboot_web.models.dto.ParamDTO;
import com.gerardo.curso.springboot.webapp.springboot_web.models.dto.ParamMixDTO;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/poo/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDTO paramDTO(@RequestParam(required = false, defaultValue = "Hola Mundo que tal") String message) {
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamMixDTO paramMixDTO(@RequestParam String text, @RequestParam Integer code) {
        ParamMixDTO paramsMix = new ParamMixDTO();
        paramsMix.setText(text);
        paramsMix.setCode(code);
        return paramsMix;
    }

    @GetMapping("/request")
    public ParamMixDTO paramMixDto(HttpServletRequest request){
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
         
        }
        ParamMixDTO paramsMix = new ParamMixDTO();
        paramsMix.setCode(code);
        paramsMix.setText(request.getParameter("message"));
        return paramsMix;
    }

}
