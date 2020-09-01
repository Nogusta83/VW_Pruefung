package de.volkswagen.project;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;  



@Repository
public interface RegulationRepository extends JpaRepository<Regulation, Long> {

  List<Regulation> findAll();
  
}