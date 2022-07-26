
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_floor")
public class FloorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "floorEntity",cascade = CascadeType.ALL)
    private List<OfficeEntity> officeEntityList;


}
