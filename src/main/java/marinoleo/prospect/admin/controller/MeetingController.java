package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.entities.meetings.Meeting;
import marinoleo.prospect.admin.entities.meetings.enumeraciones.MeetStatus;
import marinoleo.prospect.admin.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MeetingController {

    @Autowired
    private MeetingRepository meetingRepository;

    @GetMapping ("/meet/findall")
    public List<Meeting> meetFindall() {
        return meetingRepository.findAll();
    }

    @PostMapping("/meet/create")
    public Meeting meetCreator (@RequestBody Meeting meeting) {
        meeting.setMeetStatus(MeetStatus.PLANNED);
        System.out.println(meeting.toString());
        return meetingRepository.save(meeting);
    }

    /*@PutMapping("/meet/done/{id}")
    public Meeting meetDone (@PathVariable Long id, @RequestBody Meeting newMeeting) {

    }*/

}
