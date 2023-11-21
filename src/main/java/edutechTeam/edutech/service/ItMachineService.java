package edutechTeam.edutech.service;

import edutechTeam.edutech.entity.Education;
import edutechTeam.edutech.entity.ItMachine;
import edutechTeam.edutech.repository.ItRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItMachineService {

    private final ItRepository itRepository;
    public List<ItMachine> findAll(){

        List<ItMachine> listIt = itRepository.findAll();
        return listIt;
    }
}
