package com.example.xty.helloagain.Utils;

import com.example.xty.helloagain.MyDataBase.CourseInfoDao;
import com.example.xty.helloagain.MyDataBase.FridayTable;
import com.example.xty.helloagain.MyDataBase.FridayTableDao;
import com.example.xty.helloagain.MyDataBase.HolidaysDao;
import com.example.xty.helloagain.MyDataBase.MondayTable;
import com.example.xty.helloagain.MyDataBase.MondayTableDao;
import com.example.xty.helloagain.MyDataBase.MyCurriculumTableDao;
import com.example.xty.helloagain.MyDataBase.SaturdayTable;
import com.example.xty.helloagain.MyDataBase.SaturdayTableDao;
import com.example.xty.helloagain.MyDataBase.SettingsDao;
import com.example.xty.helloagain.MyDataBase.SundayTable;
import com.example.xty.helloagain.MyDataBase.SundayTableDao;
import com.example.xty.helloagain.MyDataBase.ThursdayTable;
import com.example.xty.helloagain.MyDataBase.ThursdayTableDao;
import com.example.xty.helloagain.MyDataBase.TuesdayTable;
import com.example.xty.helloagain.MyDataBase.TuesdayTableDao;
import com.example.xty.helloagain.MyDataBase.WednesdayTable;
import com.example.xty.helloagain.MyDataBase.WednesdayTableDao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xty on 2018/6/23.
 */

public class ClassSetting {

    MyCurriculumTableDao myCurriculumTableDao;
    SettingsDao mSettingDao;
    HolidaysDao myHolidaysDao;
    MondayTableDao mMondayTableDao;
    TuesdayTableDao mTuesdayTableDao;
    WednesdayTableDao mWednesdayTableDao;
    ThursdayTableDao mThursdayTableDao;
    FridayTableDao mFridayTableDao;
    SaturdayTableDao mSaturdayTableDao;
    SundayTableDao mSundayTableDao;
    CourseInfoDao mCourseInfoDao;
    private List<MondayTable> mondayList;
    private List<TuesdayTable> tuesdayList;
    private List<WednesdayTable> wednesdayList;
    private List<ThursdayTable> thursdayList;
    private List<FridayTable> fridayList;
    private List<SaturdayTable> saturdayList;
    private List<SundayTable> sundayList;


    private void InitDB_Operation(){
        myCurriculumTableDao=MyApplication.getInstances().getDaoSession().getMyCurriculumTableDao();
        mSettingDao=MyApplication.getInstances().getDaoSession().getSettingsDao();
        myHolidaysDao=MyApplication.getInstances().getDaoSession().getHolidaysDao();
        mMondayTableDao=MyApplication.getInstances().getDaoSession().getMondayTableDao();
        mTuesdayTableDao=MyApplication.getInstances().getDaoSession().getTuesdayTableDao();
        mWednesdayTableDao=MyApplication.getInstances().getDaoSession().getWednesdayTableDao();
        mThursdayTableDao=MyApplication.getInstances().getDaoSession().getThursdayTableDao();
        mFridayTableDao=MyApplication.getInstances().getDaoSession().getFridayTableDao();
        mSaturdayTableDao=MyApplication.getInstances().getDaoSession().getSaturdayTableDao();
        mSundayTableDao=MyApplication.getInstances().getDaoSession().getSundayTableDao();
        mCourseInfoDao=MyApplication.getInstances().getDaoSession().getCourseInfoDao();
    }
    public void findClassByTeacherName(String teacherName){

    }
    public void insertPlan(String className,String classNumber, String teacherName,String tel, String studentNumber,
                           String weekday, int startWeek, int endWeek,int startClass,int endClass,String roomName){
        //"机房_课程"填入各表中, 课程信息录入课程基本表
    }
    public void deletePlanByClassNumber(String classNumber){

    }
    public void findPlan(String studentNumber, String weekday, int startWeek, int endWeek,int startClass,int endClass){
        InitDB_Operation();
        List<String> ClassSituation=new ArrayList<>();
        switch(weekday){
            case "星期一":
                for(int i=startWeek;i<=endWeek;i++){
                    //循环取上课周的所有课程

                    //循环取所有行，再取列，然后存在Dic里，剩余的部分即可用的
                    mondayList=mMondayTableDao.queryBuilder()
                            .where(MondayTableDao.Properties.WeekNumber.eq(String.valueOf(i))).build().list();
                   for(int j=0;j<mondayList.size();j++){
                       for(int k=startClass;k<=endClass;k++){
                           switch (String.valueOf(k)){
                               case "1":
                                   ClassSituation.add(mondayList.get(j).getFirstClass().toString());
                                   break;
                               case "2":
                                   ClassSituation.add(mondayList.get(j).getSencondClass().toString());
                                   break;

                           }


                       }

                   }
                }

                break;
            case "星期二":
                break;
            case "星期三":
                break;
            case "星期四":
                break;
            case "星期五":
                break;
            case "星期六":
                break;
            case "星期日":
                break;

        }

    }


}
