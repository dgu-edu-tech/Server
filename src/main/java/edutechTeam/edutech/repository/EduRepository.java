package edutechTeam.edutech.repository;

import edutechTeam.edutech.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EduRepository extends JpaRepository<Education, Long> {

    List<Education> findAll();
}
