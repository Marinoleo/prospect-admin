package marinoleo.prospect.admin.repository;

import marinoleo.prospect.admin.entities.Prospector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProspectorRespository extends JpaRepository<Prospector,Long> {
}