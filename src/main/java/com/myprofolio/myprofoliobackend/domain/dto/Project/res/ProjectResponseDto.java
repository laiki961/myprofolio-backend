package com.myprofolio.myprofoliobackend.domain.dto.Project.res;

import com.myprofolio.myprofoliobackend.domain.Project.Project;

public class ProjectResponseDto {
    private Long id;
    private String name;
    private ProjectCategoryResponseDto category;
    private String description;

    public ProjectResponseDto(Project project){
     this.id =  project.getId();
     this.name = project.getName();
     this.category = new ProjectCategoryResponseDto(project.getCategory());
     this.description = project.getDescription();
    }

}
