package edutechTeam.edutech.repository;

import edutechTeam.edutech.dto.EduDto;
import edutechTeam.edutech.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EduRepository extends JpaRepository<Education, Long> {

    List<Education> findAll();

    @Query("select title, content, image from Education")
    List<EduDto> findList();

    Optional<Education> findById(Long id);
}
