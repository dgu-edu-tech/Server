package edutechTeam.edutech.service;

import edutechTeam.edutech.dto.EduDto;
import edutechTeam.edutech.dto.GovernDto;
import edutechTeam.edutech.dto.ItDto;
import edutechTeam.edutech.entity.Education;
import edutechTeam.edutech.entity.Government;
import edutechTeam.edutech.entity.ItMachine;
import edutechTeam.edutech.repository.EduRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EduService {

    private final EduRepository eduRepository;

    public List<EduDto> findList(){
        List<EduDto> dtoEdu = eduRepository.findList();
        return dtoEdu;
    }

    public Optional<Education> findInfo(Long id){
        Optional<Education> edu = eduRepository.findById(id);
        return edu;
    }
}
