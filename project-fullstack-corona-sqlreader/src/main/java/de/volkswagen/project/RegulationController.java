package de.volkswagen.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/regulation")

public class RegulationController {

    @Autowired RegulationService service;

    @GetMapping
    public List<Regulation> getRegulations() {
        return service.getRegulations();
    }

}