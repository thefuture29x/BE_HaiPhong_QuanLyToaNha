package com.example.be_haiphong_quanlytoanha.dto;

import com.example.be_haiphong_quanlytoanha.entity.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {
    private Long id;
    private String role;

    public static RoleDTO entityToDTO(RoleEntity object){
        return RoleDTO.builder()

                .build();
    }

    public static RoleEntity dtoToEntity(RoleDTO object){
        return RoleEntity.builder()

                .build();
    }
}