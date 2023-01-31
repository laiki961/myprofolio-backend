package com.myprofolio.myprofoliobackend.domain.ToDoList;

import com.myprofolio.myprofoliobackend.domain.dto.ToDoList.req.FlagReqDto;
import com.myprofolio.myprofoliobackend.domain.entity.ToDoList.FlagEntity;

public class Flag {
    private Long id;
    private String flag;

    public Flag() {
    }

    public Flag(FlagReqDto flagReqDto) {
        this.id = id;
        this.flag = flagReqDto.getFlag();
    }

    //Entity to DO ???
//    public Flag(FlagEntity flagEntity){
//        this.id = flagEntity.getId();
//        this.flag = flagEntity.getFlag();
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
