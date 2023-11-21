package edutechTeam.edutech.controller;


import edutechTeam.edutech.apiResponse.ApiResponse;
import edutechTeam.edutech.apiResponse.SuccessStatus;
import edutechTeam.edutech.entity.Government;
import edutechTeam.edutech.entity.ItMachine;
import edutechTeam.edutech.service.GovernService;
import edutechTeam.edutech.service.ItMachineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/it")
@RestController
public class ItMachineController {

    private final ItMachineService itMachineService;

    @PostMapping("/getInfo")
    public ApiResponse<List<ItMachine>> getGovernmentInfo(){

        List<ItMachine> listDto = itMachineService.findAll();
        return new ApiResponse<>(SuccessStatus.EDU_READ, listDto);
    }
}
