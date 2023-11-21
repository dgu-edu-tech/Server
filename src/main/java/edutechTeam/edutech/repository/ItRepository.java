package edutechTeam.edutech.repository;

import edutechTeam.edutech.entity.Government;
import edutechTeam.edutech.entity.ItMachine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItRepository extends JpaRepository<ItMachine, Long> {

    List<ItMachine> findAll();
}
