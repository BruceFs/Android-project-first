package com.example.xty.helloagain.MyActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.xty.helloagain.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by xty on 2018/6/21.
 */

public class Navigation extends Activity{

    private Context mContext = this;
    @BindView(R.id.registerNewClass)
    Button registerNewClass;
    @BindView(R.id.queryClass)
    Button queryClass;
    @BindView(R.id.settingTerm)
    Button settingTerm;

    @OnClick(R.id.registerNewClass)
    public void onClick(View view) {
        Intent intent = new Intent(Navigation.this, registerclassActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.queryClass)
    public void onClickQuery(View view) {
        Intent intent = new Intent(Navigation.this, ClassInfoActivity.class);
     /*   Intent intent = new Intent(Navigation.this, ClassArrangementInfoActivity.class);*/
        startActivity(intent);
       /* Toast.makeText(mContext, "转到查询界面", Toast.LENGTH_SHORT).show();*/
    }
    @OnClick(R.id.settingTerm)
    public void onClickSetting(View view) {
        Intent intent = new Intent(Navigation.this, SettingTerm.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        ButterKnife.bind(this);


    }

}
