package marinoleo.prospect.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private Long prospectorId;
    private LocalDateTime date;
    private Double amount;
}
