package com.example.be_haiphong_quanlytoanha.controller;

import com.example.be_haiphong_quanlytoanha.dto.OfficeDTO;
import com.example.be_haiphong_quanlytoanha.repository.IOfficeRepository;
import com.example.be_haiphong_quanlytoanha.service.IFloorService;
import com.example.be_haiphong_quanlytoanha.service.IOfficeService;
import com.example.be_haiphong_quanlytoanha.service.IRentalPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/office")
@RolesAllowed("ROLE_USER")
public class UserController {
    @Autowired
    IOfficeService iOfficeService;
    @Autowired
    IFloorService iFloorService;
    @Autowired
    IRentalPeriodService iRentalPeriodService;

    @GetMapping("find-all")
    public String getAllOffice(Model model, HttpSession session){
        if (session.getAttribute("userLogin") == null) {
            return "login";
        } else {
            model.addAttribute("userLogin", session.getAttribute("userLogin"));
        }
        model.addAttribute("listOffice",iOfficeService.findAll());
        model.addAttribute("listFloor", iFloorService.findAll());
        return "list_office_user";
    }
    @GetMapping("/rent")
    public String getFormEditOffice(Model model,
                                    @RequestParam(value = "idOffice") Long idOffice,
                                    @RequestParam(value = "idUser") Long idUser){
        iRentalPeriodService.RentOffice(idOffice,idUser);
        return "redirect:find-all";
    }

    @GetMapping("/rented-office")
    public String getListOfficerented(Model model,@RequestParam(value = "idUser") Long idUser, HttpSession session){
        if (session.getAttribute("userLogin") == null) {
            return "login";
        } else {
            model.addAttribute("userLogin", session.getAttribute("userLogin"));
        }
        model.addAttribute("listOffice",iOfficeService.getListOfficeRened(idUser));
        model.addAttribute("listFloor", iFloorService.findAll());
        return "list_office_user";
    }
}
