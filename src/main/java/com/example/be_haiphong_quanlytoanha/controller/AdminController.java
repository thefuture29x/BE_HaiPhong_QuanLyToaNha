package com.example.be_haiphong_quanlytoanha.controller;

import com.example.be_haiphong_quanlytoanha.dto.OfficeDTO;
import com.example.be_haiphong_quanlytoanha.service.IFloorService;
import com.example.be_haiphong_quanlytoanha.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("/admin/office")
@RolesAllowed("ROLE_ADMIN")
public class AdminController {
    @Autowired
    IOfficeService iOfficeService;
    @Autowired
    IFloorService iFloorService;


    @GetMapping("find-all")
    public String getAllOffice(Model model){
        model.addAttribute("listOffice",iOfficeService.findAll());
        model.addAttribute("listFloor", iFloorService.findAll());
        return "list_office";
    }

    @GetMapping("/create")
    public String getFormCreateOffice(Model model){
        model.addAttribute("officeObject", new OfficeDTO());
        model.addAttribute("listFloor", iFloorService.findAll());
        return "add_office";
    }
    @GetMapping("/edit")
    public String getFormEditOffice(Model model, @RequestParam(value = "id") Long id){

        model.addAttribute("officeObject",iOfficeService.findById(id));
        model.addAttribute("listFloor", iFloorService.findAll());
        return "add_office";
    }
    @GetMapping("/delete")
    public String deleteOffice(Model model, @RequestParam(value = "id") Long id){
        iOfficeService.deleteById(id);
        return "redirect:find-all";
    }
    @PostMapping("/save")
    public String saveOffice(Model model, OfficeDTO officeDTO){
        iOfficeService.add(officeDTO);
        return "redirect:find-all";
    }

}
