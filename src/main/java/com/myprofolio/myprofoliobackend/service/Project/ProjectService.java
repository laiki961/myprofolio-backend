package com.myprofolio.myprofoliobackend.service.Project;

import com.myprofolio.myprofoliobackend.domain.Project.Project;

import java.util.List;
import java.util.Map;

public interface ProjectService {
    List<Project> getAllProjects();
    Map<Long, Project> getProjectByIds(List<Long> projectIds);
    List<Project> getProjectByProjectName(String projectName);
    List<Project> getProjectsByCategoryId(Long Id);
    Project getProjectDetails(Long id);
//    Map<Long, Product> getProductsByIds(List<Long> productIds);
//    List<ProductEntity> getProductEntityByIds(List<Long> productIds);
//    List<Product> getCategoryProducts(String category);
//    List<Product> getProductsByProductName(String productName);
//    ProductEntity getProductEntityById(Long productIds);
}
