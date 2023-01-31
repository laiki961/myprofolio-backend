package com.myprofolio.myprofoliobackend.service.impl.ToDoList;

import com.myprofolio.myprofoliobackend.domain.ToDoList.ToDo;
import com.myprofolio.myprofoliobackend.domain.entity.ToDoList.ToDoEntity;
import com.myprofolio.myprofoliobackend.repository.ToDoList.ToDoRepository;
import com.myprofolio.myprofoliobackend.service.ToDoList.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ToDoServiceImpl implements ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;
//    @Autowired
//    private ToDoService toDoService;

    @Override
    public ToDo createToDo(ToDo toDo){
        ToDoEntity toDoEntity = toDoRepository.save(new ToDoEntity(toDo));
        return new ToDo(toDoEntity);
    }

    @Override
    public List<ToDo> getAllToDo(){
        List<ToDo> toDos = new ArrayList<>();
        List<ToDoEntity> toDoList = toDoRepository.findAll();
        for(ToDoEntity toDoEntity: toDoList){
            toDos.add(new ToDo(toDoEntity));
        }
        //need to convert a list of ToDoEntity to ToDo
        return toDos;
    }

}
