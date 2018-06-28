package com.example.xty.helloagain.MyDataBase;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Kai on 2016/10/13. Utilzed by Ve on 2018
 * 课程表实体类
 * 在数据库中生成对应的表
 */

@Entity
public class MyCurriculumTable {
    @Id
    private Long id;     //主键
    @Property(nameInDb = "c_id")
    private int c_id;
    @Property(nameInDb = "studentNumber")
    private String studentNumber;
    @Property(nameInDb = "classNumber")
    private String classNumber;
    @Property(nameInDb = "className")
    private String className;
    @Property(nameInDb = "cName")
    private String cName;
    @Property(nameInDb = "cType")
    private String cType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCTime() {
        return this.cTime;
    }

    public void setCTime(String cTime) {
        this.cTime = cTime;
    }

    public String getTName() {
        return this.tName;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }

    public String getCType() {
        return this.cType;
    }

    public void setCType(String cType) {
        this.cType = cType;
    }

    public String getCName() {
        return this.cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    @Property(nameInDb = "tName")
    private String tName;
    @Property(nameInDb = "period")
    private String period;
    @Property(nameInDb = "cTime")
    private String cTime;
    @Property(nameInDb = "weekday")
    private String weekday;
    @Property(nameInDb = "location")
    private String location;

    @Generated(hash = 1225329189)
    public MyCurriculumTable(Long id, int c_id, String studentNumber, String classNumber,
            String className, String cName, String cType, String tName, String period,
            String cTime, String weekday, String location) {
        this.id = id;
        this.c_id = c_id;
        this.studentNumber = studentNumber;
        this.classNumber = classNumber;
        this.className = className;
        this.cName = cName;
        this.cType = cType;
        this.tName = tName;
        this.period = period;
        this.cTime = cTime;
        this.weekday = weekday;
        this.location = location;
    }

    @Generated(hash = 390820896)
    public MyCurriculumTable() {
    }
    
}
