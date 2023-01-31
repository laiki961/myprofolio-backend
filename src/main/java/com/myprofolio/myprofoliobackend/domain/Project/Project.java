package com.myprofolio.myprofoliobackend.domain.Project;

import com.myprofolio.myprofoliobackend.domain.entity.Project.ProjectEntity;

public class Project {
    private Long id;
    private String name;
    private ProjectCategory category;
    private String description;

    public Project(ProjectEntity projectEntity){
        this.id = projectEntity.getId();
        this.name = projectEntity.getName();
        this.category = new ProjectCategory(projectEntity.getCategory());
        this.description = projectEntity.getDescription();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProjectCategory getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
