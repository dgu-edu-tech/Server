package edutechTeam.edutech.service;

import edutechTeam.edutech.entity.Government;
import edutechTeam.edutech.repository.GovernRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GovernService {

    private final GovernRepository governRepository;

    public List<Government> findAll(){

        List<Government> listGovern = governRepository.findAll();
        return listGovern;
    }
}
