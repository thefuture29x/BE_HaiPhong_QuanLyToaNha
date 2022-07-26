
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
