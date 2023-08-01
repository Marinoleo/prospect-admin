package marinoleo.prospect.admin.entities.meetings;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import marinoleo.prospect.admin.entities.meetings.enumeraciones.CancelReason;
import marinoleo.prospect.admin.entities.meetings.enumeraciones.MeetStatus;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table (name="Meeting")
public class Meeting {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="userId")
    private Long userId;
    @Column (name="meetStatus")
    private MeetStatus meetStatus;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column (name="fecha")
    private LocalDateTime fecha;
    @JsonFormat(pattern = "HH:mm")
    @Column (name="duration")
    private LocalTime duration;
    @Column (name="meet_details")
    private String meetDetails;
    @Column (name="customerId")
    private Long customerId;
    @Column (name="contactId")
    private Long contactId;
    @Column (name="cancelReason")
    private CancelReason cancelReason;

    public Meeting() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public MeetStatus getMeetStatus() {
        return meetStatus;
    }

    public void setMeetStatus(MeetStatus meetStatus) {
        this.meetStatus = meetStatus;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public String getMeetDetails() {
        return meetDetails;
    }

    public void setMeetDetails(String meetDetails) {
        this.meetDetails = meetDetails;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public CancelReason getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(CancelReason cancelReason) {
        this.cancelReason = cancelReason;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", userId=" + userId +
                ", meetStatus=" + meetStatus +
                ", fecha=" + fecha +
                ", duration=" + duration +
                ", meetDetails='" + meetDetails + '\'' +
                ", customerId=" + customerId +
                ", contactId=" + contactId +
                ", cancelReason=" + cancelReason +
                '}';
    }
}
