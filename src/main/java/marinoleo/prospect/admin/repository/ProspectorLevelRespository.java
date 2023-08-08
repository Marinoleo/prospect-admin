package marinoleo.prospect.admin.repository;

import marinoleo.prospect.admin.entities.prospectors.ProspectorLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectorLevelRespository extends JpaRepository<ProspectorLevel,Long> {
}
