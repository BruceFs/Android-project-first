package com.example.xty.helloagain.MyDataBase;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by xty on 2018/6/21.
 */
@Entity
public class SaturdayTable {
    @Id
    private Long id;     //主键
    @Property(nameInDb = "weekNumber")
    private int weekNumber;
    @Property(nameInDb = "firstClass")
    private String firstClass;
    @Property(nameInDb = "secondClass")
    private String sencondClass;
    @Property(nameInDb = "thirdClass")
    private String thirdClass;
    @Property(nameInDb = "fourthClass")
    private String fourthClass;
    @Property(nameInDb = "fifthClass")
    private String fifthClass;
    @Property(nameInDb = "sixthClass")
    private String sixthClass;
    @Property(nameInDb = "seventhClass")
    private String seventhClass;
    @Property(nameInDb = "eighthClass")
    private String eighthClass;
    @Property(nameInDb = "ninthClass")
    private String ninthClass;
    @Property(nameInDb = "tenthClass")
    private String tenthClass;
    @Property(nameInDb = "eleventhClasss")
    private String eleventhClasss;
    @Property(nameInDb = "twelfthClass")
    private String twelfthClass;
    public String getTwelfthClass() {
        return this.twelfthClass;
    }
    public void setTwelfthClass(String twelfthClass) {
        this.twelfthClass = twelfthClass;
    }
    public String getEleventhClasss() {
        return this.eleventhClasss;
    }
    public void setEleventhClasss(String eleventhClasss) {
        this.eleventhClasss = eleventhClasss;
    }
    public String getTenthClass() {
        return this.tenthClass;
    }
    public void setTenthClass(String tenthClass) {
        this.tenthClass = tenthClass;
    }
    public String getNinthClass() {
        return this.ninthClass;
    }
    public void setNinthClass(String ninthClass) {
        this.ninthClass = ninthClass;
    }
    public String getEighthClass() {
        return this.eighthClass;
    }
    public void setEighthClass(String eighthClass) {
        this.eighthClass = eighthClass;
    }
    public String getSeventhClass() {
        return this.seventhClass;
    }
    public void setSeventhClass(String seventhClass) {
        this.seventhClass = seventhClass;
    }
    public String getSixthClass() {
        return this.sixthClass;
    }
    public void setSixthClass(String sixthClass) {
        this.sixthClass = sixthClass;
    }
    public String getFifthClass() {
        return this.fifthClass;
    }
    public void setFifthClass(String fifthClass) {
        this.fifthClass = fifthClass;
    }
    public String getFourthClass() {
        return this.fourthClass;
    }
    public void setFourthClass(String fourthClass) {
        this.fourthClass = fourthClass;
    }
    public String getThirdClass() {
        return this.thirdClass;
    }
    public void setThirdClass(String thirdClass) {
        this.thirdClass = thirdClass;
    }
    public String getSencondClass() {
        return this.sencondClass;
    }
    public void setSencondClass(String sencondClass) {
        this.sencondClass = sencondClass;
    }
    public String getFirstClass() {
        return this.firstClass;
    }
    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }
    public int getWeekNumber() {
        return this.weekNumber;
    }
    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 863467324)
    public SaturdayTable(Long id, int weekNumber, String firstClass,
            String sencondClass, String thirdClass, String fourthClass,
            String fifthClass, String sixthClass, String seventhClass,
            String eighthClass, String ninthClass, String tenthClass,
            String eleventhClasss, String twelfthClass) {
        this.id = id;
        this.weekNumber = weekNumber;
        this.firstClass = firstClass;
        this.sencondClass = sencondClass;
        this.thirdClass = thirdClass;
        this.fourthClass = fourthClass;
        this.fifthClass = fifthClass;
        this.sixthClass = sixthClass;
        this.seventhClass = seventhClass;
        this.eighthClass = eighthClass;
        this.ninthClass = ninthClass;
        this.tenthClass = tenthClass;
        this.eleventhClasss = eleventhClasss;
        this.twelfthClass = twelfthClass;
    }
    @Generated(hash = 1148106194)
    public SaturdayTable() {
    }


}
