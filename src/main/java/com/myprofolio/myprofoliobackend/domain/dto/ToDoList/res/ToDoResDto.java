package com.myprofolio.myprofoliobackend.domain.dto.ToDoList.res;

import com.myprofolio.myprofoliobackend.domain.ToDoList.ToDo;
import com.myprofolio.myprofoliobackend.domain.dto.ToDoList.req.FlagReqDto;

import java.util.List;

public class ToDoResDto {
    private Long id;
    private String subject;
    private String details;
    private FlagResDto flag;

    public ToDoResDto(ToDo toDo){
        this.id = toDo.getId();
        this.subject = toDo.getSubject();
        this.details = toDo.getDetails();
        this.flag = new FlagResDto(toDo.getFlag());
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



    }
}
