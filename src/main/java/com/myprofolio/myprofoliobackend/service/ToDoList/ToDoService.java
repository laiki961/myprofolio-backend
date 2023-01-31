package com.myprofolio.myprofoliobackend.service.ToDoList;

import com.myprofolio.myprofoliobackend.domain.ToDoList.ToDo;

import java.util.List;

public interface ToDoService {
    List<ToDo> getAllToDo();
    ToDo getToDoDetails(Long id);
    ToDo createToDo(ToDo toDo);

}
