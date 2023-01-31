package com.myprofolio.myprofoliobackend.domain.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Project")
public class ProjectEntity {
    @Id
    @Column(name="project_id", nullable = false, updatable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="category", nullable = false)
    private ProjectCategoryEntity category;

    @Column(name="description")
    private String description;

    @OneToMany(mappedBy = "project")
    private List<ProjectImageEntity> imageUrls;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProjectCategoryEntity getCategory() {
        return category;
    }

    public List<ProjectImageEntity> getImageUrls() {
        return imageUrls;
    }
}
