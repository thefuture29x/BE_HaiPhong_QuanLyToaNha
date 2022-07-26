package com.example.be_haiphong_quanlytoanha.service;

import com.example.be_haiphong_quanlytoanha.dto.RentalPeriodDTO;
import com.example.be_haiphong_quanlytoanha.dto.UserDTO;

import java.util.List;

public interface IRentalPeriodService extends IBaseService<RentalPeriodDTO,Long>{
    void RentOffice(Long idOffice,Long idUser);
}
