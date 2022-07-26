package com.example.be_haiphong_quanlytoanha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
