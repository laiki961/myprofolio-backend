package com.myprofolio.myprofoliobackend.service.impl.Project;

import com.myprofolio.myprofoliobackend.domain.Project.ProjectCategory;
import com.myprofolio.myprofoliobackend.domain.entity.Project.ProjectCategoryEntity;
import com.myprofolio.myprofoliobackend.repository.Project.ProjectCategoryRepository;
import com.myprofolio.myprofoliobackend.service.Project.ProjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectCategoryServiceImpl implements ProjectCategoryService {
    @Autowired
    private ProjectCategoryRepository projectCategoryRepository;

    @Override
    public List<ProjectCategory> getAllProjectCategory(){
        List<ProjectCategory> projectCategories = new ArrayList<>();
        List<ProjectCategoryEntity> projectCategoryEntities = projectCategoryRepository.findAll();
        for(ProjectCategoryEntity projectCategoryEntity: projectCategoryEntities){
            projectCategories.add(new ProjectCategory(projectCategoryEntity));
        }
        return projectCategories;
    }

}
