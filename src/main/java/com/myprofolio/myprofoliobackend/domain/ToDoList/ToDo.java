package com.myprofolio.myprofoliobackend.domain;

import com.myprofolio.myprofoliobackend.domain.entity.ToDoList.ToDoEntity;

public class ToDo {
    private Long id;
    private String subject;
    private String details;



    public ToDo() {
        this.id = id;
        this.subject = subject;
        this.details = details;
    }

    public ToDo(ToDoEntity toDoEntity) {
        this.id = toDoEntity.getId();
        this.subject = toDoEntity.getSubject();
        this.details = toDoEntity.getDetails();
    }

    public Long getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getDetails() {
        return details;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}


