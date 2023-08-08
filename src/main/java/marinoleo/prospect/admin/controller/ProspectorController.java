package marinoleo.prospect.admin.controller;
import marinoleo.prospect.admin.model.ProspectorDTO;
import marinoleo.prospect.admin.service.ProspectorService;
import marinoleo.prospect.admin.entities.prospectors.ProspectorEntity;
import marinoleo.prospect.admin.repository.ProspectorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProspectorController {
    @Autowired
    private ProspectorRespository prospectorRespository; //matar esto
    @Autowired
    private ProspectorService prospectorService;
    @PostMapping ("/prospect/singin")
    public ResponseEntity<ProspectorEntity> singIn(@RequestBody ProspectorEntity prospector) {
        prospector.setEnabled(true);
        prospector.setExam(false);
        prospector.setLevel(0);
        prospectorRespository.save(prospector);
        return ResponseEntity.ok(prospector);
    }

    @GetMapping ("/prospect/findall")
    public ResponseEntity<List<ProspectorEntity>> findAll() {
        return ResponseEntity.ok(prospectorRespository.findAll());
    }

    @PutMapping ("/prospect/update/{id}")
    public ResponseEntity<ProspectorDTO> update(@RequestBody ProspectorDTO prospector, @PathVariable Long id) {
        Optional<ProspectorEntity> prospectorId;

        if(id==null){
            return ResponseEntity.badRequest().build();
        }else {
            return ResponseEntity.ok(prospectorService.updateProspect(id, prospector));
            }
        }

    @DeleteMapping ("/prospect/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {

        if(id==null){
            return ResponseEntity.badRequest().build();
        }if(!prospectorRespository.existsById(id))
            return ResponseEntity.noContent().build();
        else {
            prospectorRespository.deleteById(id);
            return ResponseEntity.ok("Prospector id: " + id + " ha sido eliminado");
        }

    }


}
