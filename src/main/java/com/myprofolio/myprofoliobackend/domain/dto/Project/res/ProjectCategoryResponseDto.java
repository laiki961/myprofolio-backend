package com.myprofolio.myprofoliobackend.domain.dto.Project.res;

import com.myprofolio.myprofoliobackend.domain.Project.ProjectCategory;

import java.util.List;

public class ProjectCategoryResponseDto {
    private Long id;
    private String category;

    public ProjectCategoryResponseDto (ProjectCategory projectCategory){
        this.id = projectCategory.getId();
        this.category = projectCategory.getName();
    }

    public ProjectCategoryResponseDto (List<ProjectCategory> projectCategories){
        for(ProjectCategory projectCategory: projectCategories){
            this.id = projectCategory.getId();
            this.category = projectCategory.getName();
        }
    }

}
