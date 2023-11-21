package edutechTeam.edutech.repository;

import edutechTeam.edutech.entity.Government;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GovernRepository extends JpaRepository<Government, Long> {

    List<Government> findAll();
}
