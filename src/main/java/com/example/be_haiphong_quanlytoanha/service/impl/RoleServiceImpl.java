package com.example.be_haiphong_quanlytoanha.service.impl;

import com.example.be_haiphong_quanlytoanha.dto.RoleDTO;
import com.example.be_haiphong_quanlytoanha.service.IRoleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
    @Override
    public List<RoleDTO> findAll() {
        return null;
    }

    @Override
    public Page<RoleDTO> findAll(Pageable page) {
        return null;
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }

    @Override
    public RoleDTO add(RoleDTO dto) {
        return null;
    }

    @Override
    public RoleDTO update(RoleDTO dto) {
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
