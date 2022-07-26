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
public class RentalPeriodDTO {
    private Long id;
    private String timeRental;
    private OfficeDTO officeDTO;
    private UserDTO userDTO;

    public static RentalPeriodDTO entityToDTO(RentalPeriodEntity object){
        return RentalPeriodDTO.builder()

                .build();
    }

    public static RentalPeriodEntity dtoToEntity(RentalPeriodDTO object){
        return RentalPeriodEntity.builder()

                .build();
    }
}