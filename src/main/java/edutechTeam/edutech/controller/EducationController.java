package edutechTeam.edutech.controller;

import edutechTeam.edutech.apiResponse.ApiResponse;
import edutechTeam.edutech.apiResponse.SuccessStatus;
import edutechTeam.edutech.dto.EduDto;
import edutechTeam.edutech.entity.Education;
import edutechTeam.edutech.service.EduService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/edu")
@RestController
public class EducationController {

    private final EduService eduservice;

    @GetMapping("/getInfo/{id}")
    public ApiResponse<Optional<Education>> getEducationInfo(@PathVariable Long id){

        Optional<Education> info = eduservice.findInfo(id);
        return new ApiResponse<>(SuccessStatus.EDU_INFO_READ, info);
    }

    @GetMapping("/getList")
    public ApiResponse<List<EduDto>> getEducationList() {

        List<EduDto> list = eduservice.findList();
        return new ApiResponse<>(SuccessStatus.EDU_LIST_READ, list);
    }


}
