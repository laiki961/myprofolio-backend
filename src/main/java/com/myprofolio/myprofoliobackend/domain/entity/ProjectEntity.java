package com.myprofolio.myprofoliobackend.domain.entity;

import jdk.jfr.Category;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Project")
public class ProjectEntity {
    @Id
    @Column(name="project_id", nullable = false, updatable = false)
    private Long id;

    @Column(name="project_id", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private CategoryEntity category;

    @OneToMany(mappedBy = "project")
    private List<ProjectImageEntity> imageUrls;

}
