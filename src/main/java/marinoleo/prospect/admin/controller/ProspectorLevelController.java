package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.entities.prospectors.ProspectorLevelEntity;
import marinoleo.prospect.admin.model.Prospector;
import marinoleo.prospect.admin.model.ProspectorLevel;
import marinoleo.prospect.admin.repository.ProspectorLevelRespository;
import marinoleo.prospect.admin.service.ProspectorLevelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProspectorLevelController {
    @Autowired
    private ProspectorLevelService prospectorLevelService;
    private final Logger log = LoggerFactory.getLogger(ProspectorLevelEntity.class);

    @GetMapping("/level/findall")
    public ResponseEntity<List<ProspectorLevel>> findAll() {
        return ResponseEntity.ok(prospectorLevelService.findAll());
    }

    @PostMapping("/level/create")
    public ResponseEntity<ProspectorLevel> create(@RequestBody ProspectorLevel prospectorLevel) {
        return ResponseEntity.ok(prospectorLevelService.create(prospectorLevel));
    }

    @PutMapping("/level/update/{id}")
    public ResponseEntity<ProspectorLevel> modify(@RequestBody ProspectorLevel prospectorLevel, @PathVariable Long id) {
        if (prospectorLevel.getId() == null) {
            log.warn("Triyng to update a Prospector Level with no id");
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(prospectorLevelService.update(prospectorLevel, id));
        }
    }

    @DeleteMapping("/level/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        if (id != null) {
            return ResponseEntity.notFound().build();
        } else {
            prospectorLevelService.deleteById(id);
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/level/calculate/{id}")
    public ResponseEntity<Prospector> calculate(@PathVariable Long id) {
        return ResponseEntity.ok(prospectorLevelService.calculateAndSaveLevel(id));
    }

}
