package edutechTeam.edutech.repository;

import edutechTeam.edutech.dto.EduDto;
import edutechTeam.edutech.dto.ItDto;
import edutechTeam.edutech.entity.Government;
import edutechTeam.edutech.entity.ItMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ItRepository extends JpaRepository<ItMachine, Long> {

    List<ItMachine> findAll();

}
