
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