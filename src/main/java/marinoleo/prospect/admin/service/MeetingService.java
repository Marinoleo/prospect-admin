package marinoleo.prospect.admin.service;

import marinoleo.prospect.admin.entities.meetings.MeetingEntity;
import marinoleo.prospect.admin.entities.meetings.enums.MeetStatus;
import marinoleo.prospect.admin.model.Meeting;
import marinoleo.prospect.admin.repository.MeetingRepository;
import marinoleo.prospect.admin.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeetingService {
    @Autowired
    private MeetingRepository meetingRepository;
//    @Autowired
//    private ProspectorService prospectorService;

    public List<Meeting> findAll() {
        List<MeetingEntity> listMeetingEntity = meetingRepository.findAll();
        List<Meeting> listMeeting = new ArrayList<>();
        for (MeetingEntity meeting : listMeetingEntity) {
            listMeeting.add(Mapper.meetingEntityToMeeting(meeting));
        }
        return listMeeting;
    }

    public Meeting createMeeting(Meeting meeting) {
        return Mapper.meetingEntityToMeeting(meetingRepository.save(Mapper.meetingToMeetingEntity(meeting)));
    }

    public Meeting updateMeeting(Meeting meeting, Long id) {
        return Mapper.meetingEntityToMeeting(meetingRepository.save(Mapper.getUpdatedMeeting(
                meetingRepository.findById(id).get(), meeting)));
    }

    public Meeting setMeetDone(Long meetId) {
        MeetingEntity meetingEntity = meetingRepository.findById(meetId).get();
        meetingEntity.setMeetStatus(MeetStatus.DONE);
        meetingRepository.save(meetingEntity);
//        prospectorService.calculateAndSaveLevel(meetingEntity.getUserId());
        return Mapper.meetingEntityToMeeting(meetingEntity);
    }

    public void deleteById(Long id) {
        meetingRepository.deleteById(id);
    }

    public Meeting cancelById(Long id) {
        MeetingEntity meetingEntity = meetingRepository.findById(id).get();
        meetingEntity.setMeetStatus(MeetStatus.CANCELLED);
        return Mapper.meetingEntityToMeeting(meetingEntity);
    }
    public Long getDoneMeetingsQtyAndPaid(Long userId) {
        List<MeetingEntity> meetings = meetingRepository.findByMeetStatusAndUserId(MeetStatus.DONE, userId);
        for (MeetingEntity meetingEntity : meetings) {
            meetingEntity.setMeetStatus(MeetStatus.PAID);
            meetingRepository.save(meetingEntity);
        }
        return meetings.stream().count();

    }public Long getDoneMeetingsQty(Long userId) {
        List<MeetingEntity> meetings = meetingRepository.findByMeetStatusAndUserId(MeetStatus.DONE, userId);
        System.out.println("Llegó al done meetings");
        return meetings.stream().count();
    }
}
