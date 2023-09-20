package marinoleo.prospect.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProspectorLevel {
    private Long id;
    private String name;
    private Integer meetAmount;
    private Double commission;
}
