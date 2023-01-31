package com.myprofolio.myprofoliobackend.service;

import com.myprofolio.myprofoliobackend.domain.ToDo;

import java.util.List;

public interface ToDoService {
    ToDo createToDo(ToDo toDo);
    List<ToDo> getAllToDo();
}
