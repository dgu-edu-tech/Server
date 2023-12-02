package edutechTeam.edutech.controller;


import edutechTeam.edutech.apiResponse.ApiResponse;
import edutechTeam.edutech.apiResponse.SuccessStatus;
import edutechTeam.edutech.dto.ItDto;
import edutechTeam.edutech.entity.ItMachine;
import edutechTeam.edutech.service.ItMachineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/it")
@RestController
public class ItMachineController {

    private final ItMachineService itMachineService;

    @GetMapping("/getList")
    public ApiResponse<List<ItMachine>> getEducationList() {
        List<ItMachine> list = itMachineService.findList();
        return new ApiResponse<>(SuccessStatus.ITMACHINE_LIST_READ, list);
    }
    // 제목, 이미지, 설명
}
