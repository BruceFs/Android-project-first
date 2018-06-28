package com.example.xty.helloagain.MyActivity;
import com.example.xty.helloagain.MyDataBase.MyCurriculumTable;
import com.example.xty.helloagain.Utils.MyApplication;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.xty.helloagain.MyDataBase.DaoMaster;
import com.example.xty.helloagain.MyDataBase.MyCurriculumTableDao;
import com.example.xty.helloagain.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.xty.helloagain.MyView.ClearEditText;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.username)
    ClearEditText username;
    @BindView(R.id.userpassword)
    ClearEditText userpassword;
    @BindView(R.id.loginbutton)
    Button loginbutton;

    private String uname = "";
    private String upassword = "";
    private Context mContext = this;
    MyCurriculumTableDao myCurriculumTableDao;

    public void InitDB_Operation(){

        myCurriculumTableDao=MyApplication.getInstances().getDaoSession().getMyCurriculumTableDao();
    }
    private boolean login(String username, String password){
        if(username.equals("1004")&&password.equals(""))
            return true;
        else
            return false;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        InitDB_Operation();

    }
    //登录按钮的点击事件
    @OnClick(R.id.loginbutton)
    public void onClick(View view) {
        uname = username.getText().toString();
        upassword = userpassword.getText().toString();
        if(login(uname,upassword)){
            Intent intent = new Intent(MainActivity.this, Navigation.class);
            startActivity(intent);
            finish();
        }
        else
            Toast.makeText(mContext, "请输入正确的用户名和密码", Toast.LENGTH_SHORT).show();

      /*  SharedPreferencesUtils.setParam(mContext, "USER_NAME", uname);
        SharedPreferencesUtils.setParam(mContext, "PASSWORD", upassword);
        loginfuntion();*/
    }


}

