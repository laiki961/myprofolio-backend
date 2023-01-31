package com.myprofolio.myprofoliobackend.domain.dto.ToDoList.req;

import com.myprofolio.myprofoliobackend.domain.ToDoList.Flag;

public class FlagReqDto {
    private Long id;
    private String flag;

    //DO to DTO
    public FlagReqDto(Flag flag) {
        this.id = flag.getId();
        this.flag = flag.getFlag();
    }

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


    @Override
    public String toString() {
        return "FlagResDto{" +
                "id=" + id +
                ", flag='" + flag + '\'' +
                '}';
    }
}
