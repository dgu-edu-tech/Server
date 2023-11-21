package edutechTeam.edutech.controller;

import edutechTeam.edutech.apiResponse.ApiResponse;
import edutechTeam.edutech.apiResponse.SuccessStatus;
import edutechTeam.edutech.entity.Education;
import edutechTeam.edutech.entity.Government;
import edutechTeam.edutech.service.GovernService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/govern")
@RestController
public class GovermentController {

    private final GovernService governservice;

    @PostMapping("/getInfo")
    public ApiResponse<List<Government>> getGovernmentInfo(){

        List<Government> listDto = governservice.findAll();
        return new ApiResponse<>(SuccessStatus.EDU_READ, listDto);
    }
}
