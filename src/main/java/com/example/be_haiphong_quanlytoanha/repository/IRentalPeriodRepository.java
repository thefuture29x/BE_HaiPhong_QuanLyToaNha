package com.example.be_haiphong_quanlytoanha.repository;

import com.example.be_haiphong_quanlytoanha.dto.RentalPeriodDTO;
import com.example.be_haiphong_quanlytoanha.entity.RentalPeriodEntity;
import com.example.be_haiphong_quanlytoanha.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentalPeriodRepository extends JpaRepository<RentalPeriodEntity,Long> {
}
