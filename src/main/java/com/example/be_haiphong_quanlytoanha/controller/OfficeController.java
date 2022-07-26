package com.example.be_haiphong_quanlytoanha.controller;

import com.example.be_haiphong_quanlytoanha.dto.OfficeDTO;
import com.example.be_haiphong_quanlytoanha.entity.FloorEntity;
import com.example.be_haiphong_quanlytoanha.entity.OfficeEntity;
import com.example.be_haiphong_quanlytoanha.entity.RoleEntity;
import com.example.be_haiphong_quanlytoanha.entity.UserEntity;
import com.example.be_haiphong_quanlytoanha.repository.*;
import com.example.be_haiphong_quanlytoanha.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("office")
public class OfficeController {
    @Autowired
    IOfficeService iOfficeService;


    @GetMapping("find-all")
    public String getAllOffice(Model model){

        model.addAttribute("listOffice",iOfficeService.findAll());

        return "home";
    }

    @GetMapping("/create")
    public String getFormCreateOffice(Model model, @RequestParam(value = "id") Long id){
        System.out.println(id);
        return "home";
    }
    @GetMapping("/edit")
    public String getFormEditOffice(Model model, @RequestParam(value = "id") Long id){
        System.out.println(id);
        return "home";
    }

}
