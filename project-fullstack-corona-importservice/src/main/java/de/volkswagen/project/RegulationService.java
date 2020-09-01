package de.volkswagen.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class RegulationService {

    @Autowired RegulationRepository repository;

    public void addRegulation(Regulation regulation) {
     repository.save(regulation);
    }

    public void addRegulations(Regulation[] regulations) {
        repository.saveAll(List.of(regulations));
       }


     public List<Regulation> getRegulations() {
        return (List<Regulation>) repository.findAll();
    }

    
}

