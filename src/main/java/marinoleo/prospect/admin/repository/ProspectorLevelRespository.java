package marinoleo.prospect.admin.repository;

import marinoleo.prospect.admin.entities.prospectors.ProspectorLevelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProspectorLevelRespository extends JpaRepository<ProspectorLevelEntity,Long> {
//    public List<ProspectorLevelEntity> findAllOrderByMeetAmount();
}
