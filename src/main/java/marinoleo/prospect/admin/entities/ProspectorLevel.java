package marinoleo.prospect.admin.entities;

import jakarta.persistence.*;

@Entity
@Table(name="ProspectorLevel")
public class ProspectorLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
