package com.example.be_haiphong_quanlytoanha.dto;

import com.example.be_haiphong_quanlytoanha.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private List<RoleDTO> roleDTOList;

    public static UserDTO entityToDTO(UserEntity object){
        return UserDTO.builder()

                .build();
    }

    public static UserEntity dtoToEntity(UserDTO object){
        return UserEntity.builder()

                .build();
    }

}