package com.myprofolio.myprofoliobackend.repository.Project;

import com.myprofolio.myprofoliobackend.domain.entity.Project.ProjectCategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectCategoryRepository extends CrudRepository<ProjectCategoryEntity, Long> {
    List<ProjectCategoryEntity> findAll();
}
