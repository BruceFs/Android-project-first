package com.example.xty.helloagain.MyActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xty.helloagain.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QueryActivity extends Activity {
    private Context mContext = this;
    @BindView(R.id.teacher)
    Button teacher;
    @BindView(R.id.course)
    Button course;
    @BindView(R.id.all)
    Button all;

    @OnClick(R.id.teacher)
    public void onClick(View view) {
//        Intent intent = new Intent(QueryActivity.this, registerclassActivity.class);
//        startActivity(intent);
    }

    @OnClick(R.id.course)
    public void onClickQuery(View view) {
//        Intent intent = new Intent(Navigation.this, QueryActivity.class);
//        startActivity(intent);
    }

    @OnClick(R.id.all)
    public void onClickSetting(View view) {
//        Intent intent = new Intent(Navigation.this, SettingTerm.class);
//        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        ButterKnife.bind(this);
    }
}
