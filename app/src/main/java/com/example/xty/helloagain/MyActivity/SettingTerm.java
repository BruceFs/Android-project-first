package com.example.xty.helloagain.MyActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.MonthDisplayHelper;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.Toast;


import com.example.xty.helloagain.MyDataBase.CourseInfo;
import com.example.xty.helloagain.MyDataBase.CourseInfoDao;
import com.example.xty.helloagain.MyDataBase.FridayTable;
import com.example.xty.helloagain.MyDataBase.FridayTableDao;
import com.example.xty.helloagain.MyDataBase.Holidays;
import com.example.xty.helloagain.MyDataBase.HolidaysDao;
import com.example.xty.helloagain.MyDataBase.MondayTable;
import com.example.xty.helloagain.MyDataBase.MondayTableDao;
import com.example.xty.helloagain.MyDataBase.MyCurriculumTable;
import com.example.xty.helloagain.MyDataBase.MyCurriculumTableDao;

import com.example.xty.helloagain.MyDataBase.SaturdayTable;
import com.example.xty.helloagain.MyDataBase.SaturdayTableDao;
import com.example.xty.helloagain.MyDataBase.Settings;
import com.example.xty.helloagain.MyDataBase.SettingsDao;
import com.example.xty.helloagain.MyDataBase.SundayTable;
import com.example.xty.helloagain.MyDataBase.SundayTableDao;
import com.example.xty.helloagain.MyDataBase.ThursdayTable;
import com.example.xty.helloagain.MyDataBase.ThursdayTableDao;
import com.example.xty.helloagain.MyDataBase.TuesdayTable;
import com.example.xty.helloagain.MyDataBase.TuesdayTableDao;
import com.example.xty.helloagain.MyDataBase.WednesdayTable;
import com.example.xty.helloagain.MyDataBase.WednesdayTableDao;
import com.example.xty.helloagain.MyView.ClearEditText;
import com.example.xty.helloagain.R;
import com.example.xty.helloagain.Utils.MyApplication;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
/**
 * Created by xty on 2018/6/21.
 */

public class SettingTerm extends Activity{
    @BindView(R.id.numberOfWeeks)
    ClearEditText numberOfWeeks;
  /*  @BindView(R.id.festivalCalendar)
    CalendarView festivalCalendar;*/
    @BindView(R.id.saveFestivals)
    Button saveFestivals;
    @BindView(R.id.saveNumberOfWeeks)
    Button saveNumberOfWeeks;
    @BindView(R.id.festivalWeekNo)
    Spinner festivalWeekNo;
    @BindView(R.id.festvalWeekday)
    Spinner festvalWeekday;
    @BindView(R.id.setTermArrangement)
    Button  setTermArrangement;

    private String weeknumbers = "";
    private Context mContext = this;

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
    Holidays nHolidays;
    Settings newSettings;
    List<Settings> settings;



    public void InitDB_Operation(){
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


    //学期开始设置周数，建立学期数据库
    @OnClick(R.id.saveNumberOfWeeks)
    public void onClick(View view) {
        weeknumbers=numberOfWeeks.getText().toString();
        newSettings=new Settings(null,weeknumbers.toString());
        mSettingDao.deleteAll();
        mSettingDao.insert(newSettings);
        settings=mSettingDao.loadAll();
        Toast.makeText(mContext, settings.get(0).getWeekNumber(), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.saveFestivals)
    public void onClickSaveFestivals(View view) {
        String newFestivalWeekNo= festivalWeekNo.getSelectedItem().toString();
        String newFestivalWeekday= festvalWeekday.getSelectedItem().toString();
        nHolidays= new Holidays(null,newFestivalWeekNo.toString(),newFestivalWeekday.toString());
        myHolidaysDao.insert(nHolidays);
        Toast.makeText(mContext, "已将"+newFestivalWeekNo+newFestivalWeekday+"添加至放假日期", Toast.LENGTH_SHORT).show();
    }

    //设置学期除约课模板
    @OnClick(R.id.setTermArrangement)
    public void onClickSetTermArrangement(View view) {
        settings=mSettingDao.loadAll();
        int weeks= Integer.parseInt(settings.get(0).getWeekNumber().toString());
        if(weeks==0){
            Toast.makeText(mContext, "请先设定学期周数", Toast.LENGTH_SHORT).show();
            return;
        }
        int i;
        MondayTable mondayTable;
        TuesdayTable tuesdayTable;
        WednesdayTable wednesdayTable;
        ThursdayTable thursdayTable;
        FridayTable fridayTable;
        SaturdayTable saturdayTable;
        SundayTable sundayTable;
        for(i=1;i<=weeks;i++){
            mondayTable=new MondayTable(null,i,"","","","","","","","","","","","");
            tuesdayTable=new TuesdayTable(null,i,"","","","","","","","","","","","");
            wednesdayTable=new WednesdayTable(null,i,"","","","","","","","","","","","");
            thursdayTable=new ThursdayTable(null,i,"","","","","","","","","","","","");
            fridayTable=new FridayTable(null,i,"","","","","","","","","","","","");
            saturdayTable=new SaturdayTable(null,i,"","","","","","","","","","","","");
            sundayTable=new SundayTable(null,i,"","","","","","","","","","","","");
            mMondayTableDao.insert(mondayTable);
            mTuesdayTableDao.insert(tuesdayTable);
            mWednesdayTableDao.insert(wednesdayTable);
            mThursdayTableDao.insert(thursdayTable);
            mFridayTableDao.insert(fridayTable);
            mSaturdayTableDao.insert(saturdayTable);
            mSundayTableDao.insert(sundayTable);
        }
        Toast.makeText(mContext,"已生成学期课表模板", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingterm);
        ButterKnife.bind(this);
        InitDB_Operation();
       /* Toast.makeText(mContext, settings.get(0).getWeekNumber(), Toast.LENGTH_SHORT).show();*/
    }

}
