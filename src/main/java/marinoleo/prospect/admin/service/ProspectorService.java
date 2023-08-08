package marinoleo.prospect.admin.service;

import marinoleo.prospect.admin.entities.prospectors.ProspectorEntity;
import marinoleo.prospect.admin.model.ProspectorDTO;
import marinoleo.prospect.admin.repository.ProspectorRespository;
import marinoleo.prospect.admin.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProspectorService {
    @Autowired
    private ProspectorRespository prospectorRespository;

    public ProspectorDTO updateProspect(Long id, ProspectorDTO prospectorDTO) {
        /*ProspectorEntity prospectorEntity = prospectorRespository.findById(id).get();
        prospectorEntity = Mapper.getUpdatedProspectorEntity(prospectorDTO, prospectorEntity);
        prospectorEntity = prospectorRespository.save(prospectorEntity);
        return Mapper.prospectorEntityToProspectorDTO(prospectorEntity);*/

        return Mapper.prospectorEntityToProspectorDTO(prospectorRespository.save(Mapper.getUpdatedProspectorEntity(
                prospectorDTO, prospectorRespository.findById(id).get())));

    }

}
