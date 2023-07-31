package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.entities.Prospector;
import marinoleo.prospect.admin.repository.ProspectorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProspectorController {
    @Autowired
    private ProspectorRespository prospectorRespository;

    @PostMapping ("/singin")
    public Prospector singIn(@RequestBody Prospector prospector) {
        System.out.println(prospector.toString());
        prospector.setEnabled(true);
        prospector.setExam(false);
        prospector.setLevel(0);
        System.out.println(prospector.toString());
        return prospectorRespository.save(prospector);
    }

    @GetMapping ("/findall")
    public List<Prospector> findAll() {
        System.out.println(prospectorRespository.findAll().toString());
        return prospectorRespository.findAll();
    }


}
