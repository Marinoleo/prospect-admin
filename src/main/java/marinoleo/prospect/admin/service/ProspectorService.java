package marinoleo.prospect.admin.service;

import marinoleo.prospect.admin.entities.prospectors.ProspectorEntity;
import marinoleo.prospect.admin.model.Prospector;
import marinoleo.prospect.admin.repository.MeetingRepository;
import marinoleo.prospect.admin.repository.ProspectorLevelRespository;
import marinoleo.prospect.admin.repository.ProspectorRespository;
import marinoleo.prospect.admin.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProspectorService {
    @Autowired
    private ProspectorRespository prospectorRespository;
    @Autowired
    private MeetingService meetingService;
    @Autowired
    private ProspectorLevelService prospectorLevelService;
    @Autowired
    private ProspectorLevelRespository prospectorLevelRespository;

    public Prospector updateProspect(Long id, Prospector prospector) {
        return Mapper.prospectorEntityToProspector(prospectorRespository.save(Mapper.getUpdatedProspectorEntity(
                prospector, prospectorRespository.findById(id).get())));
    }

    public Prospector saveProspector(Prospector prospector) {
        return Mapper.prospectorEntityToProspector(prospectorRespository.save(Mapper.prospectorToProspectorEntity(prospector)));
    }

    public List<Prospector> findAll() {
        List<Prospector> listProspector = new ArrayList<>();
        for (ProspectorEntity prospectorEntity : prospectorRespository.findAll()) {
            listProspector.add(Mapper.prospectorEntityToProspector(prospectorEntity));
        }
        return listProspector;
    }

    public void deleteProspectorById(Long id) {
        prospectorRespository.deleteById(id);
    }

    public Prospector findById(Long id) {
        return Mapper.prospectorEntityToProspector(prospectorRespository.findById(id).get());
    }

    public Prospector calculateBalance(Long id) {
        ProspectorEntity prospectorEntity = prospectorRespository.findById(id).get();
        prospectorEntity.setBalance(prospectorLevelRespository.findById(prospectorEntity.getLevelId()).get().getCommission() *
                meetingService.getDoneMeetingsQtyAndPaid(id));
        return Mapper.prospectorEntityToProspector(prospectorRespository.save(prospectorEntity));
    }

//    public Prospector calculateBalance(Long id) {
//        ProspectorEntity prospectorEntity = prospectorRespository.findById(id).get();
//        prospectorEntity.setBalance(prospectorLevelService.getComission(prospectorEntity.getLevelId()) *
//                meetingService.getDoneMeetingsQtyAndPaid(id));
//        return Mapper.prospectorEntityToProspector(prospectorRespository.save(prospectorEntity));
//    }

    //    public Prospector zeroBalance(Long id) {
//        ProspectorEntity prospectorEntity = prospectorRespository.findById(id).get();
//        prospectorEntity.setBalance(0D);
//        return Mapper.prospectorEntityToProspector(prospectorRespository.save(prospectorEntity));
//    }

}
