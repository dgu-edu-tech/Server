package edutechTeam.edutech.service;

import edutechTeam.edutech.dto.ItDto;
import edutechTeam.edutech.entity.ItMachine;
import edutechTeam.edutech.repository.ItRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItMachineService {

    private final ItRepository itRepository;
    public List<ItMachine> findList(){
        List<ItMachine> it = itRepository.findAll();
        return it;
    }

}
