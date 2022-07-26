package com.example.be_haiphong_quanlytoanha.service.impl;

import com.example.be_haiphong_quanlytoanha.dto.RentalPeriodDTO;
import com.example.be_haiphong_quanlytoanha.entity.OfficeEntity;
import com.example.be_haiphong_quanlytoanha.entity.RentalPeriodEntity;
import com.example.be_haiphong_quanlytoanha.repository.IOfficeRepository;
import com.example.be_haiphong_quanlytoanha.repository.IRentalPeriodRepository;
import com.example.be_haiphong_quanlytoanha.repository.IUserRepository;
import com.example.be_haiphong_quanlytoanha.service.IOfficeService;
import com.example.be_haiphong_quanlytoanha.service.IRentalPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentalPeriodServiceImpl implements IRentalPeriodService {
    @Autowired
    IUserRepository iUserRepository;
    @Autowired
    IOfficeRepository iOfficeRepository;
    @Autowired
    IRentalPeriodRepository iRentalPeriodRepository;

    @Override
    public List<RentalPeriodDTO> findAll() {
        return null;
    }

    @Override
    public Page<RentalPeriodDTO> findAll(Pageable page) {
        return null;
    }

    @Override
    public RentalPeriodDTO findById(Long id) {
        return null;
    }

    @Override
    public RentalPeriodDTO add(RentalPeriodDTO dto) {
        return null;
    }

    @Override
    public RentalPeriodDTO update(RentalPeriodDTO dto) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean deleteByIds(List<Long> id) {
        return false;
    }

    @Override
    public void RentOffice(Long idOffice, Long idUser) {
        RentalPeriodEntity rentalPeriodEntity = new RentalPeriodEntity();
        rentalPeriodEntity.setUserEntity(iUserRepository.findById(idUser).get());
        OfficeEntity office = iOfficeRepository.findById(idOffice).get();
        office.setStatus(true);
        rentalPeriodEntity.setOfficeEntity(office);
        iOfficeRepository.save(office);
        iRentalPeriodRepository.save(rentalPeriodEntity);
    }
}
