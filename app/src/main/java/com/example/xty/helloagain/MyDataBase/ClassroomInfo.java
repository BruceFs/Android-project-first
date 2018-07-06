package com.example.xty.helloagain.MyDataBase;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by xty on 2018/6/21.
 */
@Entity
public class ClassroomInfo {
    @Id
    private Long id;     //主键
    @Property(nameInDb = "classroomName")
    private String classroomName;
    @Property(nameInDb = "classroomCapacity")
    private String classroomCapacity;
    public String getClassroomCapacity() {
        return this.classroomCapacity;
    }
    public void setClassroomCapacity(String classroomCapacity) {
        this.classroomCapacity = classroomCapacity;
    }
    public String getClassroomName() {
        return this.classroomName;
    }
    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1583919672)
    public ClassroomInfo(Long id, String classroomName, String classroomCapacity) {
        this.id = id;
        this.classroomName = classroomName;
        this.classroomCapacity = classroomCapacity;
    }
    @Generated(hash = 1004386031)
    public ClassroomInfo() {
    }

}
