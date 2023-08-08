package marinoleo.prospect.admin.repository;

import marinoleo.prospect.admin.entities.prospectors.ProspectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectorRespository extends JpaRepository<ProspectorEntity,Long> {
}
