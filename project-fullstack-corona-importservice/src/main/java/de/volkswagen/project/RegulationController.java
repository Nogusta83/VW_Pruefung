package de.volkswagen.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import javax.websocket.server.PathParam;

@RestController
@CrossOrigin
@RequestMapping("/regulationImporter")

public class RegulationController {

    @Autowired RegulationService service;

    @GetMapping
    public List<Regulation> getRegulations() {
        return service.getRegulations();
    }

    @PostMapping
    public void postRegulation(@RequestBody Regulation regulation) {
        service.addRegulation(regulation);
    }

    @PostMapping("/import")
    public void postSingleRegulations(@RequestParam(value = "stateName") String stateName) {
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8082/regulationByState?stateName="+stateName;
        ResponseEntity<Regulation[]> response =
	    restTemplate.getForEntity(url,Regulation[].class);
        Regulation[] regulations = response.getBody();
        service.addRegulation(regulations[0]);
        System.out.println("updated manualy");
    }



   @Scheduled(fixedRate = 5000)
    public void postServerRegulations() {
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8082/regulation";
        ResponseEntity<Regulation[]> response =
	    restTemplate.getForEntity(url,Regulation[].class);
        Regulation[] regulations = response.getBody();
        service.addRegulations(regulations);
        System.out.println("updated");
    }



}