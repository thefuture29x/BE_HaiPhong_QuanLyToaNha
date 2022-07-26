package com.example.be_haiphong_quanlytoanha.dto;

import com.example.be_haiphong_quanlytoanha.entity.FloorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FloorDTO {
    private Long id;
    private String name;

    private List<OfficeDTO> officeDTOList;

    public static FloorDTO entityToDTO(FloorEntity object){
        return FloorDTO.builder()

                .build();
    }
    public static FloorEntity dtoToEntity(FloorDTO object){
        return FloorEntity.builder()

                .build();
    }
}
