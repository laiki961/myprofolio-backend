package com.myprofolio.myprofoliobackend.repository;

import com.myprofolio.myprofoliobackend.domain.entity.ProjectCategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectCategoryRepository extends CrudRepository<ProjectCategoryEntity, Long> {
    List<ProjectCategoryEntity> findAll();
}
