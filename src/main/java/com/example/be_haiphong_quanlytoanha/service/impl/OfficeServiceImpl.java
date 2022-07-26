package com.example.be_haiphong_quanlytoanha.service.impl;

import com.example.be_haiphong_quanlytoanha.dto.OfficeDTO;
import com.example.be_haiphong_quanlytoanha.dto.RentalPeriodDTO;
import com.example.be_haiphong_quanlytoanha.entity.OfficeEntity;
import com.example.be_haiphong_quanlytoanha.repository.IFloorRepository;
import com.example.be_haiphong_quanlytoanha.repository.IOfficeRepository;
import com.example.be_haiphong_quanlytoanha.service.IOfficeService;
import com.example.be_haiphong_quanlytoanha.service.IRentalPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfficeServiceImpl implements IOfficeService {
    @Autowired
    IOfficeRepository iOfficeRepository;
    @Autowired
    IFloorRepository iFloorRepository;
    @Override
    public List<OfficeDTO> findAll() {
        return iOfficeRepository.findAll().stream().map(data -> OfficeDTO.entityToDTO(data)).collect(Collectors.toList());
    }

    @Override
    public Page<OfficeDTO> findAll(Pageable page) {
        return null;
    }

    @Override
    public OfficeDTO findById(Long id) {
        return OfficeDTO.entityToDTO(iOfficeRepository.findById(id).get());
    }

    @Override
    public OfficeDTO add(OfficeDTO dto) {
        OfficeEntity office = OfficeDTO.dtoToEntity(dto);
        office.setFloorEntity(iFloorRepository.findById(dto.getFloorDTO().getId()).get());
        return OfficeDTO.entityToDTO(iOfficeRepository.save(office));
    }

    @Override
    public OfficeDTO update(OfficeDTO dto) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        iOfficeRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean deleteByIds(List<Long> id) {
        return false;
    }

    @Override
    public List<OfficeDTO> getListOfficeRened(Long idUser) {
        return iOfficeRepository.fillAllOfficeRenced(idUser).stream().map(data -> OfficeDTO.entityToDTO(data)).collect(Collectors.toList());
    }
}
