package com.myprofolio.myprofoliobackend.domain;

import com.myprofolio.myprofoliobackend.domain.entity.Project.ProjectCategoryEntity;

public class ProjectCategory {
    private Long id;
    private String name;


    public ProjectCategory(ProjectCategoryEntity projectCategoryEntity){
        this.id = projectCategoryEntity.getId();
        this.name = projectCategoryEntity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
