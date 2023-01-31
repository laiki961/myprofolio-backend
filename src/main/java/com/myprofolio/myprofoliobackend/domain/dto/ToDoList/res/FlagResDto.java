package com.myprofolio.myprofoliobackend.domain.dto.ToDoList.res;

import com.myprofolio.myprofoliobackend.domain.ToDoList.Flag;

public class FlagResDto {
    private Long id;
    private String flagString;

    public FlagResDto(Flag flag) {
        this.id = flag.getId();
        this.flagString = flag.getFlag();
    }

    public Flag toFlag(){
        Flag flag = new Flag();
        flag.setId(id);
        flag.setFlag(flagString);
        return flag;
    }

    public Long getId() {
        return id;
    }

    public String getFlagString() {
        return flagString;
    }
}
