package marinoleo.prospect.admin.utils;

import marinoleo.prospect.admin.entities.prospectors.ProspectorEntity;
import marinoleo.prospect.admin.model.ProspectorDTO;

public class Mapper {
    public static ProspectorEntity prospectorDTOToProspectorEntity(ProspectorDTO prospectorDTO) {
        ProspectorEntity updatedProspector = new ProspectorEntity();

        if(prospectorDTO.getMail()!=null)
            updatedProspector.setMail(prospectorDTO.getMail());
        if(prospectorDTO.getName()!=null)
            updatedProspector.setName(prospectorDTO.getName());
        if(prospectorDTO.getLinkedin()!=null)
            updatedProspector.setLinkedin(prospectorDTO.getLinkedin());
        if(prospectorDTO.getPhone()!=null)
            updatedProspector.setPhone(prospectorDTO.getPhone());
        if(prospectorDTO.getCountry()!=null)
            updatedProspector.setCountry(prospectorDTO.getCountry());
        return updatedProspector;
    }

    public static ProspectorDTO prospectorEntityToProspectorDTO(ProspectorEntity prospectorEntity) {
        ProspectorDTO updatedProspector =  new ProspectorDTO();

        updatedProspector.setId(prospectorEntity.getId());
        //completar


        return updatedProspector;
    }

    public static ProspectorEntity getUpdatedProspectorEntity(ProspectorDTO prospectorDTO, ProspectorEntity prospectorEntity){
        if(prospectorDTO.getMail()!=null)
            prospectorEntity.setMail(prospectorDTO.getMail());
        if(prospectorDTO.getName()!=null)
            prospectorEntity.setName(prospectorDTO.getName());
        if(prospectorDTO.getLinkedin()!=null)
            prospectorEntity.setLinkedin(prospectorDTO.getLinkedin());
        if(prospectorDTO.getPhone()!=null)
            prospectorEntity.setPhone(prospectorDTO.getPhone());
        if(prospectorDTO.getCountry()!=null)
            prospectorEntity.setCountry(prospectorDTO.getCountry());
        return prospectorEntity;
    }

}
