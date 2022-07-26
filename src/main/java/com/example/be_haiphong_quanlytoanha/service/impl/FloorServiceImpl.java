package com.example.be_haiphong_quanlytoanha.service.impl;

import com.example.be_haiphong_quanlytoanha.dto.FloorDTO;
import com.example.be_haiphong_quanlytoanha.repository.IFloorRepository;
import com.example.be_haiphong_quanlytoanha.service.IFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FloorServiceImpl implements IFloorService {
    @Autowired
    IFloorRepository iFloorRepository;
    @Override
    public List<FloorDTO> findAll() {
        return iFloorRepository.findAll().stream().map(data-> FloorDTO.entityToDTO(data) ).collect(Collectors.toList());
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
