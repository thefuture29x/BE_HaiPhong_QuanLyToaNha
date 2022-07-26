//package com.example.be_haiphong_quanlytoanha.config;
//
//import com.example.be_haiphong_quanlytoanha.entity.FloorEntity;
//import com.example.be_haiphong_quanlytoanha.entity.OfficeEntity;
//import com.example.be_haiphong_quanlytoanha.entity.RoleEntity;
//import com.example.be_haiphong_quanlytoanha.entity.UserEntity;
//import com.example.be_haiphong_quanlytoanha.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class DataSeeder implements ApplicationListener<ContextRefreshedEvent> {
//    @Autowired
//    IRoleRepository iRoleRepository;
//    @Autowired
//    IUserRepository iUserRepository;
//    @Autowired
//    IOfficeRepository iOfficeRepository;
//    @Autowired
//    IFloorRepository iFloorRepository;
//    @Autowired
//    IRentalPeriodRepository iRentalPeriodRepository;
//    @Autowired
//    BCryptPasswordEncoder passwordEncoder;
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        RoleEntity roleUser = iRoleRepository.save(new RoleEntity(1L,"ROLE_USER",null));
//        RoleEntity roleAdmin = iRoleRepository.save(new RoleEntity(2L,"ROLE_ADMIN",null));
//        List<RoleEntity> listRole = new ArrayList<>();
//        listRole.add(roleUser);
//        iUserRepository.save(new UserEntity(1L,"user123", passwordEncoder.encode("123456"), listRole,null));
//        listRole.add(roleAdmin);
//        iUserRepository.save(new UserEntity(2L,"admin132",passwordEncoder.encode("123456"),listRole,null));
//
//        FloorEntity floor1 = iFloorRepository.save(new FloorEntity(1L,"Tang 1",null));
//        FloorEntity floor2 = iFloorRepository.save(new FloorEntity(2L,"Tang 2",null));
//        FloorEntity floor3 = iFloorRepository.save(new FloorEntity(3L,"Tang 3",null));
//
//        OfficeEntity office1_1 = iOfficeRepository.save(new OfficeEntity(1L,"Van Phong 001",false,1000000,200,floor1,null));
//        OfficeEntity office1_2 = iOfficeRepository.save(new OfficeEntity(2L,"Van Phong 002",false,1000000,200,floor1,null));
//        OfficeEntity office1_3 = iOfficeRepository.save(new OfficeEntity(3L,"Van Phong 003",false,1000000,200,floor1,null));
//
//        OfficeEntity office2_1 = iOfficeRepository.save(new OfficeEntity(4L,"Van Phong 001",false,1000000,200,floor2,null));
//        OfficeEntity office2_2 = iOfficeRepository.save(new OfficeEntity(5L,"Van Phong 002",false,1000000,200,floor2,null));
//        OfficeEntity office2_3 = iOfficeRepository.save(new OfficeEntity(6L,"Van Phong 003",false,1000000,200,floor2,null));
//
//        OfficeEntity office3_1 = iOfficeRepository.save(new OfficeEntity(7L,"Van Phong 001",false,1000000,200,floor3,null));
//        OfficeEntity office3_2 = iOfficeRepository.save(new OfficeEntity(8L,"Van Phong 002",false,1000000,200,floor3,null));
//        OfficeEntity office3_3 = iOfficeRepository.save(new OfficeEntity(9L,"Van Phong 003",false,1000000,200,floor3,null));
//
//    }
//}
