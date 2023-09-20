package marinoleo.prospect.admin.service;

import marinoleo.prospect.admin.entities.meetings.MeetingEntity;
import marinoleo.prospect.admin.entities.meetings.enums.MeetStatus;
import marinoleo.prospect.admin.entities.prospectors.ProspectorEntity;
import marinoleo.prospect.admin.entities.prospectors.ProspectorLevelEntity;
import marinoleo.prospect.admin.model.Prospector;
import marinoleo.prospect.admin.model.ProspectorLevel;
import marinoleo.prospect.admin.repository.MeetingRepository;
import marinoleo.prospect.admin.repository.ProspectorLevelRespository;
import marinoleo.prospect.admin.repository.ProspectorRespository;
import marinoleo.prospect.admin.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProspectorLevelService {
    @Autowired
    private ProspectorLevelRespository prospectorLevelRespository;
    @Autowired
    private MeetingService meetingService;
    @Autowired
    private MeetingRepository meetingRepository;
    @Autowired
    private ProspectorRespository prospectorRespository;

    public List<ProspectorLevel> findAll() {
        List<ProspectorLevelEntity> listProspectorLevelEntity = prospectorLevelRespository.findAll();
        List<ProspectorLevel> listProspectorLevel = new ArrayList<>();
        for (ProspectorLevelEntity prospectorLevelEntity : listProspectorLevelEntity) {
            listProspectorLevel.add(Mapper.prospectorLevelEntityToProspectorLevel(prospectorLevelEntity));
        }
        return listProspectorLevel;
    }

    public ProspectorLevel create(ProspectorLevel prospectorLevel) {
        return Mapper.prospectorLevelEntityToProspectorLevel(prospectorLevelRespository.save(
                Mapper.prospectorLevelToProspectorLevelEntity(prospectorLevel)));
    }

    public ProspectorLevel update(ProspectorLevel prospectorLevel, Long id) {
        ProspectorLevelEntity prospectorLevelEntity = prospectorLevelRespository.findById(id).get();
        return Mapper.prospectorLevelEntityToProspectorLevel(prospectorLevelRespository.save(
                Mapper.getUpdatedProspectorLevel(prospectorLevelEntity, prospectorLevel)));
    }

    public void deleteById(Long id) {
        prospectorLevelRespository.deleteById(id);
    }

    public Prospector calculateAndSaveLevel(Long id) {
        ProspectorEntity prospectorEntity = prospectorRespository.findById(id).get();
        prospectorEntity.setLevelId(calculateLevel(id));
        return Mapper.prospectorEntityToProspector(prospectorRespository.save(prospectorEntity));
    }

    public Long calculateLevel(Long userId) {
        Long calculatedLevel = 0L;
        Long meetingsQty = getComputableMeetingsByProspectorId(userId);
        List<ProspectorLevelEntity> prospectorLevelEntities = prospectorLevelRespository.findAll(); //findAllOrderByMeetAmount()
        for (ProspectorLevelEntity prospectorLevel : prospectorLevelEntities) {
            if (meetingsQty > prospectorLevel.getMeetAmount()) {
                calculatedLevel = prospectorLevel.getId();
            }
        }
        return calculatedLevel;
    }

    public Long getComputableMeetingsByProspectorId(Long id) {
        Long computableMeetings = 0L;
        List<MeetingEntity> meetings = meetingRepository.findByUserId(id);
        for (MeetingEntity meetingEntity : meetings) {
            if (meetingEntity.getMeetStatus() == MeetStatus.DONE || meetingEntity.getMeetStatus() == MeetStatus.PAID) {
                computableMeetings++;
            }
        }
        return computableMeetings;
    }

//    public Double getComission(Long levelId) {
//        return prospectorLevelRespository.findById(levelId).get().getCommission();
//    }

}
