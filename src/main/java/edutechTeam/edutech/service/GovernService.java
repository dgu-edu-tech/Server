package edutechTeam.edutech.service;

import edutechTeam.edutech.dto.GovernDto;
import edutechTeam.edutech.dto.ItDto;
import edutechTeam.edutech.entity.Government;
import edutechTeam.edutech.entity.ItMachine;
import edutechTeam.edutech.repository.GovernRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GovernService {

    private final GovernRepository governRepository;

    public List<GovernDto> findList(){
        List<GovernDto> dtoGovern = governRepository.findList();
        return dtoGovern;
    }

    public Optional<Government> findInfo(Long id){
        Optional<Government> govern = governRepository.findById(id);
        return govern;
    }
}
