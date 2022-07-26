
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