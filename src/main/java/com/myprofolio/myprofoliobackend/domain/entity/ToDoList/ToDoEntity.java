package com.myprofolio.myprofoliobackend.domain.entity;

import com.myprofolio.myprofoliobackend.domain.ToDo;

import javax.persistence.*;

@Entity
@Table(name="ToDo")
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="todo_id", nullable = false, updatable = false)
    private Long id;

    @Column(name="subject", nullable = false)
    private String subject;

    @Column(name="details")
    private String details;


//    public ToDoEntity(Long id, String subject, String details) {
//        this.id = id;
//        this.subject = subject;
//        this.details = details;
//    }

    public ToDoEntity(ToDo toDo){
        this.id = toDo.getId();
        this.subject = toDo.getSubject();
        this.details = toDo.getDetails();
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
}
