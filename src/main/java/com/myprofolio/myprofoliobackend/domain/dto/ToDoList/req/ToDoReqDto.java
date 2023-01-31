package com.myprofolio.myprofoliobackend.domain.dto.ToDoList.req;

import com.myprofolio.myprofoliobackend.domain.ToDoList.Flag;
import com.myprofolio.myprofoliobackend.domain.ToDoList.ToDo;

public class ToDoReqDto {
    private Long id;
    private String subject;
    private String details;
    private FlagReqDto flag;

    public ToDo toToDo(){
        ToDo toDo = new ToDo();
        toDo.setId(id);
        toDo.setSubject(subject);
        toDo.setDetails(details);
        toDo.setFlag(new Flag(flag));
        return toDo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public FlagReqDto getFlag() {
        return flag;
    }

    public void setFlag(FlagReqDto flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "ToDoReqDto{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", details='" + details + '\'' +
                ", flag=" + flag +
                '}';
    }
}
