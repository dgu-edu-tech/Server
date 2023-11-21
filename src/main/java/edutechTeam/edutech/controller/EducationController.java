package edutechTeam.edutech.controller;

import edutechTeam.edutech.apiResponse.ApiResponse;
import edutechTeam.edutech.apiResponse.SuccessStatus;
import edutechTeam.edutech.entity.Education;
import edutechTeam.edutech.service.EduService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/edu")
@RestController
public class EducationController {

    private final EduService eduservice;

    @PostMapping("/getInfo")
    public ApiResponse<List<Education>> getEducationInfo(){

        List<Education> listDto = eduservice.findAll();
        return new ApiResponse<>(SuccessStatus.EDU_READ, listDto);
    }



}
