package marinoleo.prospect.admin.repository;

import marinoleo.prospect.admin.entities.meetings.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository <Meeting,Long> {

}
