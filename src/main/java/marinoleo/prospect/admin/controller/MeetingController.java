package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.entities.meetings.enums.MeetStatus;
import marinoleo.prospect.admin.model.Meeting;
import marinoleo.prospect.admin.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MeetingController {
    @Autowired
    private MeetingService meetingService;

    @GetMapping("/meet/findall")
    public ResponseEntity<List<Meeting>> findAllMeeting() {
        return ResponseEntity.ok(meetingService.findAll());
    }

    @PostMapping("/meet/create")
    public ResponseEntity<Meeting> createMeeting(@RequestBody Meeting meeting) {
        meeting.setMeetStatus(MeetStatus.PLANNED);
        return ResponseEntity.ok(meetingService.createMeeting(meeting));
    }

    @PutMapping("/meet/done/{id}")
    public ResponseEntity<Meeting> setMeetDone(@PathVariable Long id) {
        return ResponseEntity.ok(meetingService.setMeetDone(id));
    }

    @PutMapping("/meet/cancel/{id}")
    public ResponseEntity<Meeting> setMeetingCancelled(@PathVariable Long id) {
        return ResponseEntity.ok(meetingService.cancelById(id));
    }

    @PutMapping("/meet/update/{id}")
    public ResponseEntity<Meeting> updateMeet(@PathVariable Long id, @RequestBody Meeting meeting) {
        return ResponseEntity.ok(meetingService.updateMeeting(meeting, id));
    }

    @DeleteMapping("/meet/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        meetingService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/meet/getdone/{id}")
    public ResponseEntity<Long> getDoneMeetings(@PathVariable Long id) {
        return ResponseEntity.ok(meetingService.getDoneMeetingsQty(id));
    }
}
