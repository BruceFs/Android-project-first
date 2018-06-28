package com.example.xty.helloagain.MyEntity;

/**
 * Created by xty on 2018/6/24.
 */

public class Entity {
    //第一列表头
    private String sheetRow1;
    //第二列表头
    private String sheetRow2;
    //第三列表头
    private String sheetRow3;

    public Entity(String sheetRow1, String sheetRow2, String sheetRow3) {
        this.sheetRow1 = sheetRow1;
        this.sheetRow2 = sheetRow2;
        this.sheetRow3 = sheetRow3;
    }

    public String getSheetRow1() {
        return sheetRow1;
    }

    public void setSheetRow1(String sheetRow1) {
        this.sheetRow1 = sheetRow1;
    }

    public String getSheetRow2() {
        return sheetRow2;
    }

    public void setSheetRow2(String sheetRow2) {
        this.sheetRow2 = sheetRow2;
    }

    public String getSheetRow3() {
        return sheetRow3;
    }

    public void setSheetRow3(String sheetRow3) {
        this.sheetRow3 = sheetRow3;
    }
}
