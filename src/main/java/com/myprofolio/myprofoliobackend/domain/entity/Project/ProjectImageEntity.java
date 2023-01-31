package com.myprofolio.myprofoliobackend.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="ProjectImage")
public class ProjectImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="project_id", nullable = false)
    private ProjectEntity project;

    @Column(name="project_image", nullable = false)
    private String image;

    public ProjectImageEntity(){

    }

    public ProjectImageEntity(ProjectEntity projectEntity){
        this.id = getId();
        this.project = getProject();
        this.image= getImage();
    }

    public Long getId() {
        return id;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "ProjectImageEntity{" +
                "id=" + id +
                ", project=" + project +
                ", image='" + image + '\'' +
                '}';
    }

}
