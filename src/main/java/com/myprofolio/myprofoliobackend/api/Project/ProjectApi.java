package com.myprofolio.myprofoliobackend.api.Project;

import com.myprofolio.myprofoliobackend.domain.Project.Project;
import com.myprofolio.myprofoliobackend.domain.dto.Project.res.ProjectResponseDto;
import com.myprofolio.myprofoliobackend.service.Project.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectApi {
    Logger logger = LoggerFactory.getLogger(ProjectApi.class);


    @Autowired
    private ProjectService projectService;

    @GetMapping("/{categoryId}")
    public List<ProjectResponseDto> fetchAllProjects(

        @PathVariable (required = true) Long categoryId,
        @RequestParam (required = false) String projectName){

        if(projectName != null){
            List<Project> projects = projectService.getProjectByProjectName(projectName);
            logger.debug("Entered projectName" + projects.toString());
            return toProjectResponseDto(projects);
        }else if(categoryId.equals("all")){
            List<Project> projects = projectService.getAllProjects();
            logger.debug("Entered all" + projects.toString());
            return toProjectResponseDto(projects);
        }else{
            List<Project> projects = projectService.getProjectsByCategoryId(categoryId);
            logger.debug("Entered categoryId" + projects.toString());
            return toProjectResponseDto(projects);
        }
    }

    //DO to DTO
    public List<ProjectResponseDto> toProjectResponseDto(List<Project> projects){
        List<ProjectResponseDto> responseDtos = new ArrayList<>();
        for(Project project: projects){
            ProjectResponseDto dto = new ProjectResponseDto(project);
            responseDtos.add(dto);
        }
        return responseDtos;
    }

    @GetMapping("/details")
    public ProjectResponseDto fetchProjectDetails(@RequestParam("projectId") Long projectId){
        Project project = projectService.getProjectDetails(projectId);
        logger.debug("Project Details:" + project.toString());
        return new ProjectResponseDto(project);
    }
}
