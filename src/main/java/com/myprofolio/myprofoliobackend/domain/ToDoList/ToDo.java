package com.myprofolio.myprofoliobackend.domain.ToDoList;

import com.myprofolio.myprofoliobackend.domain.entity.ToDoList.ToDoEntity;

public class ToDo {
    private Long id;
    private String subject;
    private String details;
    private Flag flag;

    public ToDo(){}

    //ToDoEntity to todoo
//    public ToDo(ToDoEntity toDoEntity) {
//        this.id = toDoEntity.getId();
//        this.subject = toDoEntity.getSubject();
//        this.details = toDoEntity.getDetails();
//        this.flag = new Flag(toDoEntity.getFlag());
//    }

    //DO to ResponseDTO (always do this inside DO)
    public ToDo(ToDo toDo){
//        this.id = toDo.getId();
//        this.subject = toDo.getSubject();
//        this.details = toDo.getDetails();
//        this.flag = new FlagResDto(toDo.getFlag());

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

    public Flag getFlag() {
        return flag;
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

    public void setFlag(Flag flag) {
        this.flag = flag;
    }
}


