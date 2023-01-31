package com.myprofolio.myprofoliobackend.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="Category")
public class ProjectCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id", nullable = false, updatable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
