package marinoleo.prospect.admin.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prospector {
    private Long id;
    private String mail;
    private String name;
    private String lastName;
    private String linkedin;
    private String phone;
    private String country;
    private Double balance;
    private Boolean exam;
    private Boolean enabled;
    private Long levelId;
}
