package com.example.xty.helloagain.MyDataBase;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by xty on 2018/6/21.
 */
@Entity
public class CourseInfo {
    @Id
    private Long id;     //主键
    @Property(nameInDb = "className")
    private String className;
    @Property(nameInDb = "classNumber")
    private String classNumber;
    @Property(nameInDb = "teacherName")
    private String teacherName;
    @Property(nameInDb = "tel")
    private String tel;
    @Property(nameInDb = "studentNumber")
    private String studentNumber;
    @Property(nameInDb = "weekNumber")
    private String weekNumber;
    @Property(nameInDb = "weekday")
    private String weekday;
    @Property(nameInDb = "startWeek")
    private String startWeek;
    @Property(nameInDb = "endWeek")
    private String endWeek;
    @Property(nameInDb = "startClass")
    private String startClass;
    @Property(nameInDb = "endClass")
    private String endClass;
    public String getEndClass() {
        return this.endClass;
    }
    public void setEndClass(String endClass) {
        this.endClass = endClass;
    }
    public String getStartClass() {
        return this.startClass;
    }
    public void setStartClass(String startClass) {
        this.startClass = startClass;
    }
    public String getEndWeek() {
        return this.endWeek;
    }
    public void setEndWeek(String endWeek) {
        this.endWeek = endWeek;
    }
    public String getStartWeek() {
        return this.startWeek;
    }
    public void setStartWeek(String startWeek) {
        this.startWeek = startWeek;
    }
    public String getWeekday() {
        return this.weekday;
    }
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    public String getWeekNumber() {
        return this.weekNumber;
    }
    public void setWeekNumber(String weekNumber) {
        this.weekNumber = weekNumber;
    }
    public String getStudentNumber() {
        return this.studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String getTel() {
        return this.tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getTeacherName() {
        return this.teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getClassNumber() {
        return this.classNumber;
    }
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
    public String getClassName() {
        return this.className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1109726061)
    public CourseInfo(Long id, String className, String classNumber,
            String teacherName, String tel, String studentNumber,
            String weekNumber, String weekday, String startWeek, String endWeek,
            String startClass, String endClass) {
        this.id = id;
        this.className = className;
        this.classNumber = classNumber;
        this.teacherName = teacherName;
        this.tel = tel;
        this.studentNumber = studentNumber;
        this.weekNumber = weekNumber;
        this.weekday = weekday;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.startClass = startClass;
        this.endClass = endClass;
    }
    @Generated(hash = 1849777725)
    public CourseInfo() {
    }



    
}
