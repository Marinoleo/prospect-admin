package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.entities.prospectors.ProspectorLevel;
import marinoleo.prospect.admin.repository.ProspectorLevelRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProspectorLevelController {
    @Autowired
    private ProspectorLevelRespository prospectorLevelRespository;
    private final Logger log = LoggerFactory.getLogger(ProspectorLevel.class);

    @GetMapping("/level/findall")
    public List<ProspectorLevel> findAll() {
        return prospectorLevelRespository.findAll();
    }

    @PostMapping("/level/create")
    public ProspectorLevel create(@RequestBody ProspectorLevel prospectorLevel) {
        return prospectorLevelRespository.save(prospectorLevel);
    }

    @PutMapping("/level/update")
    public ResponseEntity<ProspectorLevel> modify(@RequestBody ProspectorLevel prospectorLevel) {
        if (prospectorLevel.getId() == null) {
            log.warn("Triyng to update a Prospector Level with no id");
            return ResponseEntity.notFound().build();
        }
        if (!prospectorLevelRespository.existsById(prospectorLevel.getId())) {
            log.warn("Triyng to update a Prospector Level with a non-existent id");
            return ResponseEntity.notFound().build();
        } else {
            prospectorLevelRespository.save(prospectorLevel);
            return ResponseEntity.ok(prospectorLevel);
        }
    }

    @DeleteMapping ("/level/delete/{id}")
    public ResponseEntity<ProspectorLevel> deleteById (@PathVariable Long id) {
        prospectorLevelRespository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
