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
@Table(name = "tbl_rental_period")
public class RentalPeriodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "time_rental")
    private Date timeRental;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_office")
    private OfficeEntity officeEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private UserEntity userEntity;
}