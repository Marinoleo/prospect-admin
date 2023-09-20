package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.model.Prospector;
import marinoleo.prospect.admin.service.ProspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProspectorController {
    @Autowired
    private ProspectorService prospectorService;

    @PostMapping("/prospect/singin")
    public ResponseEntity<Prospector> singIn(@RequestBody Prospector prospector) {
        prospector.setEnabled(true);
        prospector.setExam(false);
        prospector.setLevelId(0L);
        return ResponseEntity.ok(prospectorService.saveProspector(prospector));
    }

    @GetMapping("/prospect/findall")
    public ResponseEntity<List<Prospector>> findAll() {
        return ResponseEntity.ok(prospectorService.findAll());
    }

    @GetMapping("/prospect/findbyid/{id}")
    public ResponseEntity<Prospector> findById(@PathVariable Long id) {
        return ResponseEntity.ok(prospectorService.findById(id));
    }

    @PutMapping("/prospect/update/{id}")
    public ResponseEntity<Prospector> update(@RequestBody Prospector prospector, @PathVariable Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(prospectorService.updateProspect(id, prospector));
        }
    }

    @DeleteMapping("/prospect/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        } else {
            prospectorService.deleteProspectorById(id);
            return ResponseEntity.noContent().build();
        }
    }

//    @GetMapping("/prospect/getbalance/{id}")
//    public ResponseEntity<Prospector> getBalance(@PathVariable Long id) {
//        return ResponseEntity.ok(prospectorService.calculateBalance(id));
//    }

}
