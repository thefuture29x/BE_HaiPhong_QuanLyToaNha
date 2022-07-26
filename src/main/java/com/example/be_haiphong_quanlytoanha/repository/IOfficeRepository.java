package com.example.be_haiphong_quanlytoanha.repository;

import com.example.be_haiphong_quanlytoanha.entity.OfficeEntity;
import com.example.be_haiphong_quanlytoanha.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOfficeRepository extends JpaRepository<OfficeEntity,Long> {
}
