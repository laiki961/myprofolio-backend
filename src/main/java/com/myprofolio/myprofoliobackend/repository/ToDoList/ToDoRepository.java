package com.myprofolio.myprofoliobackend.repository.ToDoList;

import com.myprofolio.myprofoliobackend.domain.entity.ToDoList.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDoEntity, Long> {
    List<ToDoEntity> findAll();
    ToDoEntity findFirstByToDoId (Long id);
}
