import com.example.module_javaspringboot_finalproject.config.AuthProvider;
import com.example.module_javaspringboot_finalproject.dto.UserDTO;
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
    private boolean status = false;
    private int price;
    private int area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_floor")
    private FloorEntity floorEntity;

    @OneToMany(mappedBy = "officeEntity",cascade = CascadeType.ALL)
    private List<RentalPeriodEntity> rentalPeriodEntityList;

}