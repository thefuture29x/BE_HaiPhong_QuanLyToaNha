package com.example.be_haiphong_quanlytoanha.service.impl;

import com.example.be_haiphong_quanlytoanha.dto.FloorDTO;
import com.example.be_haiphong_quanlytoanha.service.IFloorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FloorServiceImpl implements IFloorService {
    @Override
    public List<FloorDTO> findAll() {
        return null;
    }

    @Override
    public Page<FloorDTO> findAll(Pageable page) {
        return null;
    }

    @Override
    public FloorDTO findById(Long id) {
        return null;
    }

    @Override
    public FloorDTO add(FloorDTO dto) {
        return null;
    }

    @Override
    public FloorDTO update(FloorDTO dto) {
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
