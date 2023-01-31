package com.myprofolio.myprofoliobackend.service.impl.Project;

import com.myprofolio.myprofoliobackend.domain.Project.Project;
import com.myprofolio.myprofoliobackend.domain.entity.Project.ProjectEntity;
import com.myprofolio.myprofoliobackend.repository.Project.ProjectRepository;
import com.myprofolio.myprofoliobackend.service.Project.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProjectServiceImpl implements ProjectService {
    Logger logger = LoggerFactory.getLogger(ProjectService.class);

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProjects(){
        List<Project> projects = new ArrayList<>();
        List<ProjectEntity> projectsEntity = projectRepository.findAll();
        for(ProjectEntity projectEntity: projectsEntity){
            projects.add(new Project(projectEntity));
        }return projects;
    }

    @Override
    public Map<Long, Project> getProjectByIds(List<Long> projectIds) {
        return null;
    }


    //    List<Project> getProjectByProjectName(String projectName);
//    List<Project> getCategoryProjects(String category);
//    Project getProjectDetails(Long id);
    @Override
    public List<Project> getProjectByProjectName(String projectName){
        List<Project> projects = new ArrayList<>();
        List<ProjectEntity> projectEntities = projectRepository.findByNameLike(projectName);
        for(ProjectEntity projectEntity: projectEntities){
            projects.add(new Project(projectEntity));
        }return projects;
    }

    @Override
    public List<Project> getProjectsByCategoryId(Long id){
        List<Project> projects = new ArrayList<>();
        List<ProjectEntity> projectEntities = projectRepository.findByCategory_Id(id);
        for (ProjectEntity projectEntity: projectEntities){
            projects.add(new Project(projectEntity));
        }
        return projects;
    }

    @Override
    public Project getProjectDetails(Long id){
        ProjectEntity projectEntity = projectRepository.findFirstByProject_Id(id);
        return new Project(projectEntity);
    }

}
