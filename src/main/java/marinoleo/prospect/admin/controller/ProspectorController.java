package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.entities.prospectors.Prospector;
import marinoleo.prospect.admin.repository.ProspectorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProspectorController {
    @Autowired
    private ProspectorRespository prospectorRespository;

    @PostMapping ("/prospect/singin")
    public ResponseEntity<Prospector> singIn(@RequestBody Prospector prospector) {
        prospector.setEnabled(true);
        prospector.setExam(false);
        prospector.setLevel(0);
        prospectorRespository.save(prospector);
        return ResponseEntity.ok(prospector);
    }

    @GetMapping ("/prospect/findall")
    public ResponseEntity<List<Prospector>> findAll() {
        return ResponseEntity.ok(prospectorRespository.findAll());
    }

    @PutMapping ("/prospect/update")
    public ResponseEntity<Prospector> update(@RequestBody Prospector prospector) {
        if(prospector.getId()==null){
            return ResponseEntity.badRequest().build();
        }if(!prospectorRespository.existsById(prospector.getId())) {
            return ResponseEntity.notFound().build();
        }else {
            prospectorRespository.save(prospector);
            return ResponseEntity.ok(prospector);
    }
    }



}
