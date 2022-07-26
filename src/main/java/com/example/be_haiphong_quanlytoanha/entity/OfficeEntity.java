package com.example.be_haiphong_quanlytoanha.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_office")
public class OfficeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "office_name")
    private String officeName;
    private boolean status;
    private int price;
    private int area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_floor")
    private FloorEntity floorEntity;

    @OneToMany(mappedBy = "officeEntity",cascade = CascadeType.ALL)
    private List<RentalPeriodEntity> rentalPeriodEntityList;

}