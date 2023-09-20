package marinoleo.prospect.admin.entities.meetings;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import marinoleo.prospect.admin.entities.meetings.enums.CancelReason;
import marinoleo.prospect.admin.entities.meetings.enums.MeetStatus;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Meeting")
public class MeetingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private MeetStatus meetStatus;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime fecha;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime duration;
    private String meetDetails;
    private Long customerId;
    private Long contactId;
    private CancelReason cancelReason;
}
