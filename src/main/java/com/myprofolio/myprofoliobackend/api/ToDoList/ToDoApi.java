package com.myprofolio.myprofoliobackend.api.ToDoList;

import com.myprofolio.myprofoliobackend.domain.ToDoList.ToDo;
import com.myprofolio.myprofoliobackend.domain.dto.ToDoList.req.ToDoReqDto;
import com.myprofolio.myprofoliobackend.domain.dto.ToDoList.res.ToDoResDto;
import com.myprofolio.myprofoliobackend.service.ToDoList.ToDoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/public/todo")
public class ToDoApi {
    Logger logger = LoggerFactory.getLogger(ToDoApi.class);

    @Autowired
    private ToDoService toDoService;

    //DTO (Req) -> DO -> Entity -> Repository -> Entity -> DO -> DTO (Res)
    @GetMapping("/all")
    public List<ToDoResDto> fetchAllToDo(){
        List<ToDoResDto> resDtos = new ArrayList<>();
        List<ToDo> toDos = toDoService.getAllToDo();
        logger.debug(toDos.toString());
        //DO to DTO
        for(ToDo toDo: toDos){
            resDtos.add(new ToDoResDto(toDo));
        }
        return resDtos;
    }

    @GetMapping("/details")
    public ToDoResDto fetchToDoDetails(@RequestParam("id") Long id){
        ToDo toDo = toDoService.getToDoDetails(id);
        return new ToDoResDto(toDo);
    }

    //New todoitem
    @PostMapping
    public ToDoResDto postNewToDoItem(@RequestBody ToDoReqDto toDoReqDto){
        ToDo toDo = toDoService.createToDo(toDoReqDto.toToDo());
        logger.debug("creating a new to do item" + toDo.toString());
        return new ToDoResDto(toDo);
    }

    //Edit

    //Delete

    //Drag to reorder

}

