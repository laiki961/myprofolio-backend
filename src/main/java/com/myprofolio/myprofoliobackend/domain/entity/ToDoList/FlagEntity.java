package com.myprofolio.myprofoliobackend.domain.entity.ToDoList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flag")
public class FlagEntity {
    @Id
    @Column(name="flag_id", nullable = false)
    private Long id;

    @Column
    private String flag;

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
        return "FlagEntity{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
