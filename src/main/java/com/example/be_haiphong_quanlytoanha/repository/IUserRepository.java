package com.example.be_haiphong_quanlytoanha.repository;

import com.example.be_haiphong_quanlytoanha.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByUsername(String username);
}
