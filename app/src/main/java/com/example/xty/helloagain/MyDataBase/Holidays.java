package com.example.xty.helloagain.MyDataBase;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by xty on 2018/6/21.
 */
@Entity
public class Holidays {
    @Id
    private Long id;     //主键
    @Property(nameInDb = "weekNumber")
    private String weekNumber;
    @Property(nameInDb = "weekDay")
    private String weekDay;
    public String getWeekDay() {
        return this.weekDay;
    }
    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }
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
    @Generated(hash = 415751436)
    public Holidays(Long id, String weekNumber, String weekDay) {
        this.id = id;
        this.weekNumber = weekNumber;
        this.weekDay = weekDay;
    }
    @Generated(hash = 239887016)
    public Holidays() {
    }
    



    
}
