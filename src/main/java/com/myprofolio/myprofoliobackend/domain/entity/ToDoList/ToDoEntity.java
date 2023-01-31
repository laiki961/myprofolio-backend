package com.myprofolio.myprofoliobackend.domain.entity.ToDoList;

import com.myprofolio.myprofoliobackend.domain.ToDoList.ToDo;

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

    @ManyToOne
    @JoinColumn(name = "flag", nullable = false)
    private FlagEntity flag;


//    public ToDoEntity(Long id, String subject, String details) {
//        this.id = id;
//        this.subject = subject;
//        this.details = details;
//    }

    //DO to Entity
    public ToDoEntity(ToDo toDo){
        this.id = toDo.getId();
        this.subject = toDo.getSubject();
        this.details = toDo.getDetails();
//        this.flag = new Flag(toDo.getFlag());
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

    public FlagEntity getFlag() {
        return flag;
    }

    public void setFlag(FlagEntity flag) {
        this.flag = flag;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
