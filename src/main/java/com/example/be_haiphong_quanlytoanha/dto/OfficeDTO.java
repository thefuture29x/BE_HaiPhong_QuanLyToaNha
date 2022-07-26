package com.example.be_haiphong_quanlytoanha.dto;

import com.example.be_haiphong_quanlytoanha.entity.OfficeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfficeDTO {
    private Long id;
    private String officeName;
    private boolean status;
    private int price;
    private int area;

    private FloorDTO floorDTO;

    private List<RentalPeriodDTO> rentalPeriodDTOList;

    public static OfficeDTO entityToDTO(OfficeEntity object){
        return OfficeDTO.builder()
                .id(object.getId())
                .officeName(object.getOfficeName())
                .status(object.isStatus())
                .price(object.getPrice())
                .area(object.getArea())
                .floorDTO(object.getFloorEntity() != null ? FloorDTO.entityToDTO(object.getFloorEntity()) :null)
                .rentalPeriodDTOList(object.getRentalPeriodEntityList() != null ? object.getRentalPeriodEntityList().stream().map(data -> RentalPeriodDTO.entityToDTO(data)).collect(Collectors.toList()) : null)
                .build();
    }

    public static OfficeEntity dtoToEntity(OfficeDTO object){
        return OfficeEntity.builder()
                .id(object.getId())
                .officeName(object.getOfficeName())
                .status(object.isStatus())
                .price(object.getPrice())
                .area(object.getArea())
                .build();
    }

}