package com.example.be_haiphong_quanlytoanha.repository;

import com.example.be_haiphong_quanlytoanha.entity.OfficeEntity;
import com.example.be_haiphong_quanlytoanha.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IOfficeRepository extends JpaRepository<OfficeEntity,Long> {
    @Query(value = "SELECT of.* FROM tbl_rental_period rp \n " +
            "JOIN tbl_user us ON rp.id_user = us.id \n " +
            "JOIN tbl_office of ON rp.id_office = of.id \n " +
            "WHERE rp.id_user = ?1 ",nativeQuery = true)
    List<OfficeEntity> fillAllOfficeRenced(Long idUser);
}
