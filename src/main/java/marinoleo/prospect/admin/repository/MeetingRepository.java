package marinoleo.prospect.admin.repository;

import marinoleo.prospect.admin.entities.meetings.MeetingEntity;
import marinoleo.prospect.admin.entities.meetings.enums.MeetStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRepository extends JpaRepository <MeetingEntity,Long> {
    public List<MeetingEntity> findByMeetStatusAndUserId(MeetStatus meetStatus, Long userId);
    public List<MeetingEntity> findByUserId(Long userId);
}
