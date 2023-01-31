package com.myprofolio.myprofoliobackend.repository;

import com.myprofolio.myprofoliobackend.domain.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDoEntity, Long> {
    List<ToDoEntity> findAll();
}
