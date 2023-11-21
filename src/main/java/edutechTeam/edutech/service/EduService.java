package edutechTeam.edutech.service;

import edutechTeam.edutech.entity.Education;
import edutechTeam.edutech.repository.EduRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EduService {

    private final EduRepository eduRepository;

    public List<Education> findAll(){

        List<Education> listEdu = eduRepository.findAll();
        return listEdu;
    }
}
