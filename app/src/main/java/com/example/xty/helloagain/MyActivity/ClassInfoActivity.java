package com.example.xty.helloagain.MyActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xty.helloagain.MyDataBase.CourseInfoDao;
import com.example.xty.helloagain.MyDataBase.FridayTableDao;
import com.example.xty.helloagain.MyDataBase.HolidaysDao;
import com.example.xty.helloagain.MyDataBase.MondayTableDao;
import com.example.xty.helloagain.MyDataBase.MyCurriculumTableDao;
import com.example.xty.helloagain.MyDataBase.SaturdayTableDao;
import com.example.xty.helloagain.MyDataBase.SettingsDao;
import com.example.xty.helloagain.MyDataBase.SundayTableDao;
import com.example.xty.helloagain.MyDataBase.ThursdayTableDao;
import com.example.xty.helloagain.MyDataBase.TuesdayTableDao;
import com.example.xty.helloagain.MyDataBase.WednesdayTableDao;
import com.example.xty.helloagain.MyEntity.DateInfo;
import com.example.xty.helloagain.MyEntity.Entity;
import com.example.xty.helloagain.MyEntity.OrderInfo;
import com.example.xty.helloagain.MyEntity.RoomInfo;
import com.example.xty.helloagain.R;
import com.example.xty.helloagain.Utils.MyApplication;
import com.example.xty.helloagain.Utils.ScrollablePanelAdapter;
import com.example.xty.helloagain.Utils.TestPanelAdapter;
import com.kelin.scrollablepanel.library.ScrollablePanel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by xty on 2018/6/21.
 */

public class ClassInfoActivity extends Activity{

    private Context mContext = this;
    @BindView(R.id.scrollable_panel)
    ScrollablePanel scrollablePanel;

    public static final SimpleDateFormat DAY_UI_MONTH_DAY_FORMAT = new SimpleDateFormat("MM-dd");
    public static final SimpleDateFormat WEEK_FORMAT = new SimpleDateFormat("EEE", Locale.US);

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

    public void InitDB_Operation(){
        myCurriculumTableDao= MyApplication.getInstances().getDaoSession().getMyCurriculumTableDao();
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


    private void loadClassInfoData(ScrollablePanelAdapter scrollablePanelAdapter) {
        List<RoomInfo> roomInfoList = new ArrayList<>();
        int weekNumbers=Integer.parseInt(mSettingDao.loadAll().get(0).getWeekNumber());
        for (int i = 1; i <= weekNumbers; i++) {
            RoomInfo roomInfo = new RoomInfo();
            roomInfo.setRoomName("第"+i+"周");
            roomInfo.setRoomId(i);
            roomInfo.setRoomType("");
            roomInfoList.add(roomInfo);
        }
        scrollablePanelAdapter.setRoomInfoList(roomInfoList);
        List<DateInfo> dateInfoList = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            DateInfo dateInfo = new DateInfo();
            dateInfo.setDate("第"+i+"节");
            dateInfo.setWeek("");
            dateInfoList.add(dateInfo);
        }
        scrollablePanelAdapter.setDateInfoList(dateInfoList);

        List<List<OrderInfo>> ordersList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            List<OrderInfo> orderInfoList = new ArrayList<>();
            for (int j = 0; j < 14; j++) {
                OrderInfo orderInfo = new OrderInfo();
                orderInfo.setGuestName("NO." + i + j);
                orderInfo.setBegin(true);
                orderInfo.setStatus(OrderInfo.Status.randomStatus());
                if (orderInfoList.size() > 0) {
                    OrderInfo lastOrderInfo = orderInfoList.get(orderInfoList.size() - 1);
                    if (orderInfo.getStatus().ordinal() == lastOrderInfo.getStatus().ordinal()) {
                        orderInfo.setId(lastOrderInfo.getId());
                        orderInfo.setBegin(false);
                        orderInfo.setGuestName("");
                    } else {
                        if (new Random().nextBoolean()) {
                            orderInfo.setStatus(OrderInfo.Status.空闲);
                        }
                    }
                }
                orderInfoList.add(orderInfo);
            }
            ordersList.add(orderInfoList);
        }
        scrollablePanelAdapter.setOrdersList(ordersList);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classinfo);
        ButterKnife.bind(this);
        InitDB_Operation();
        final ScrollablePanelAdapter scrollablePanelAdapter = new ScrollablePanelAdapter();
        loadClassInfoData(scrollablePanelAdapter);
        scrollablePanel.setPanelAdapter(scrollablePanelAdapter);

    }

}
