package com.myprofolio.myprofoliobackend.api.Project;

import com.myprofolio.myprofoliobackend.domain.Project.ProjectCategory;
import com.myprofolio.myprofoliobackend.domain.dto.Project.res.ProjectCategoryResponseDto;
import com.myprofolio.myprofoliobackend.service.Project.ProjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/public/category")
public class ProjectCategoryApi {
    @Autowired
    private ProjectCategoryService projectCategoryService;

    @GetMapping("/all")
    public List<ProjectCategoryResponseDto> fetchAllProjectCategories(){
        List<ProjectCategoryResponseDto> responseDtos = new ArrayList<>();
        List<ProjectCategory> projectCategories = projectCategoryService.getAllProjectCategory();
        responseDtos.add(new ProjectCategoryResponseDto(projectCategories));
        return responseDtos;
    }

    //converting do to dto
//    public List<ProjectCategoryResponseDto> toProjectCategoryDto(List<ProjectCategory> projectCategories){
//        List<ProjectCategoryResponseDto> responseDto = new ArrayList<>();
//        List<ProjectCategory> projectCategories
//        for(ProjectCategory projectCategory: projectCategories){
//            ProjectCategoryResponseDto dto = new ProjectResponseDto(projectCategories);
//        }
//    }

}
