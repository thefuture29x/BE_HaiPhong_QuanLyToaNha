package com.example.be_haiphong_quanlytoanha.service;

import com.example.be_haiphong_quanlytoanha.dto.OfficeDTO;
import com.example.be_haiphong_quanlytoanha.dto.UserDTO;

import java.util.List;

public interface IOfficeService extends IBaseService<OfficeDTO,Long>{
    List<OfficeDTO> getListOfficeRened(Long idUser);
}
