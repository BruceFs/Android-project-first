package com.example.xty.helloagain.MyActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.xty.helloagain.MyDataBase.DaoMaster;
import com.example.xty.helloagain.MyDataBase.MyCurriculumTableDao;
import com.example.xty.helloagain.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.xty.helloagain.MyView.ClearEditText;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by xty on 2018/6/21.
 */

public class registerclassActivity extends Activity{

    @BindView(R.id.courseName)
    ClearEditText courseName;
    @BindView(R.id.courseNumber)
    ClearEditText courseNumber;
    @BindView(R.id.teacherName)
    ClearEditText teacherName;
    @BindView(R.id.tel)
    ClearEditText tel;
    @BindView(R.id.studentNumber)
    ClearEditText studentNumber;
    @BindView(R.id.startweekspinner)
    Spinner startweekspinner;
    @BindView(R.id.endweekspinner)
    Spinner endweekspinner;
    @BindView(R.id.startclassnumberspinner)
    Spinner startclassnumberspinner;
    @BindView(R.id.endclassnumberspinner)
    Spinner endclassnumberspinner;
    @BindView(R.id.registerClassButton)
    Button registerClassButton;
    @BindView(R.id.classWeekday)
    Spinner classWeekday;
    @BindView(R.id.selectedPlan)
    TextView selectedPlan;
    @BindView(R.id.savePlan)
    Button savePlan;


    private List<String> data_list;
    private ArrayAdapter<String> arr_adapter;
    protected void setWeekNumber(){
        data_list=new ArrayList<>();   //后续做个管理端，从数据库取
        data_list.add("第1周");
        data_list.add("第2周");
        data_list.add("第3周");
        data_list.add("第4周");
        data_list.add("第5周");
        data_list.add("第6周");
        data_list.add("第7周");
        data_list.add("第8周");
        data_list.add("第9周");
        data_list.add("第10周");
        data_list.add("第11周");
        data_list.add("第12周");
        data_list.add("第13周");
        data_list.add("第14周");
        data_list.add("第15周");
        data_list.add("第16周");
        data_list.add("第17周");
        data_list.add("第18周");
        arr_adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data_list);
        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        startweekspinner.setAdapter(arr_adapter);
        endweekspinner.setAdapter(arr_adapter);
    }

    @OnClick(R.id.registerClassButton)
    public void onClick(View view) {
        /////下面要修改
        int startWeek=startweekspinner.getSelectedItemPosition()+1;
        int endWeek=endweekspinner.getSelectedItemPosition()+1;
        int startClass=startclassnumberspinner.getSelectedItemPosition()+1;
        int endClass= endclassnumberspinner.getSelectedItemPosition()+1;
        int weekday=classWeekday.getSelectedItemPosition()+1;
        Toast.makeText(registerclassActivity.this,String.valueOf(weekday)+String.valueOf(startWeek)+String.valueOf(endWeek)+String.valueOf(startClass)
                +String.valueOf(endClass) , Toast.LENGTH_SHORT).show();
//逻辑：先根据星期，找对应的表，根据上下课时间，获取空闲机房，根据人数生成方案，封装到util里。然后提交到selectedPlan




        //此处取数据库内容 查找可用方案
        final String items[] = {"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this,3);
        builder.setTitle("可选方案");
        // builder.setMessage("是否确认退出?"); //设置内容
        builder.setIcon(R.mipmap.ic_launcher);
        // 设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(registerclassActivity.this, items[which],
                        Toast.LENGTH_SHORT).show();//  提示选择的是哪个东西

            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(registerclassActivity.this, "确定", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        builder.create().show();
    }

    @OnClick(R.id.savePlan)
    public void onClickSavePlan(View view) {
        String ncourseName=courseName.getText().toString();
        String ncourseNumber=courseNumber.getText().toString();
        String nteacherName= teacherName.getText().toString();
        String ntel= tel.getText().toString();
        String nstudentNumber= studentNumber.getText().toString();
        //////此处添加向课程信息表插入数据和向约课表内插入信息，课程信息操作可整体封装成成类


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerclass);
        ButterKnife.bind(this);
        setWeekNumber();
    }
}
