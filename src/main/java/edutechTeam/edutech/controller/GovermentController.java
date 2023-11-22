package edutechTeam.edutech.controller;

import edutechTeam.edutech.apiResponse.ApiResponse;
import edutechTeam.edutech.apiResponse.SuccessStatus;
import edutechTeam.edutech.dto.EduDto;
import edutechTeam.edutech.dto.GovernDto;
import edutechTeam.edutech.entity.Education;
import edutechTeam.edutech.entity.Government;
import edutechTeam.edutech.service.GovernService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/govern")
@RestController
public class GovermentController {

    private final GovernService governservice;

    @PostMapping("/getInfo/{id}")
    public ApiResponse<Optional<Government>> getGovernmentInfo(@PathVariable Long id){

        Optional<Government> info = governservice.findInfo(id);
        return new ApiResponse<>(SuccessStatus.GOVERN_INFO_READ, info);
    }

    @PostMapping("/getList")
    public ApiResponse<List<GovernDto>> getEducationList() {

        List<GovernDto> list = governservice.findList();
        return new ApiResponse<>(SuccessStatus.GOVERN_LIST_READ, list);
    }
    // 제목, 이미지, 설명
}
