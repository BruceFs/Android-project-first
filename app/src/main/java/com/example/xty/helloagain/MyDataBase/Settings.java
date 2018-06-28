package com.example.xty.helloagain.MyDataBase;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by xty on 2018/6/21.
 */
@Entity
public class Settings {
    @Id
    private Long id;     //主键
    @Property(nameInDb = "weekNumber")
    private String weekNumber;
    public String getWeekNumber() {
        return this.weekNumber;
    }
    public void setWeekNumber(String weekNumber) {
        this.weekNumber = weekNumber;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1513464318)
    public Settings(Long id, String weekNumber) {
        this.id = id;
        this.weekNumber = weekNumber;
    }
    @Generated(hash = 456090543)
    public Settings() {
    }


    
}
