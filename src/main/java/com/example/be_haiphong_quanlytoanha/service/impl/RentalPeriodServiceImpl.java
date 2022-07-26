package com.example.be_haiphong_quanlytoanha.service.impl;

import com.example.be_haiphong_quanlytoanha.dto.RentalPeriodDTO;
import com.example.be_haiphong_quanlytoanha.service.IRentalPeriodService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class RentalPeriodServiceImpl implements IRentalPeriodService {
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
}
