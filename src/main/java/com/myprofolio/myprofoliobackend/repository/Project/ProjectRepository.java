package com.myprofolio.myprofoliobackend.repository;

import com.myprofolio.myprofoliobackend.domain.Project;
import com.myprofolio.myprofoliobackend.domain.entity.ProjectEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long> {
    List<ProjectEntity> findAll();
    List<ProjectEntity> findByNameLike(String projectName);
    List<ProjectEntity> findByCategory_Id(Long id);
    ProjectEntity findFirstByProject_Id(Long id);

}
