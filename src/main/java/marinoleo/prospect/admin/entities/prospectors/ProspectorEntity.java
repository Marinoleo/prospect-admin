package marinoleo.prospect.admin.entities.prospectors;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Prospector")
public class ProspectorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mail;
    private String name;
    private String lastName;
    private String linkedin;
    private String phone;
    private String country;
    private Double balance;
    //Examen aprobado:1,Examen no aprobado:0, por defecto 0.
    private Boolean exam;
    //Habilitado:1, Deshabilitado por admin:0, por defecto 1.
    private Boolean enabled;
    private Long levelId;


}