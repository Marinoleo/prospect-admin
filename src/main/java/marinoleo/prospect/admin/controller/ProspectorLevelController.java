package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.repository.ProspectorLevelRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProspectorLevelController {

    @Autowired
    private ProspectorLevelRespository prospectorLevelRespository;

}
