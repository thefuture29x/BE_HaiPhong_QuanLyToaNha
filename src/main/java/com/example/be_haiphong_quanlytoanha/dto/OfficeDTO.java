
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

                .build();
    }

    public static OfficeEntity dtoToEntity(OfficeDTO object){
        return OfficeEntity.builder()

                .build();
    }

}