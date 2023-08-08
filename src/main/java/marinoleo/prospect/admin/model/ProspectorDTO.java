package marinoleo.prospect.admin.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProspectorDTO {
    private Long id;
    private String mail;
    private String name;
    private String lastName;
    private String linkedin;
    private String phone;
    private String country;
    private Boolean exam;
    private Boolean enabled;
    private Integer level;


}
