package com.example.xty.helloagain.MyActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.xty.helloagain.MyEntity.Entity;
import com.example.xty.helloagain.R;
import com.example.xty.helloagain.Utils.SheetAdapter;
import com.example.xty.helloagain.Utils.TestPanelAdapter;
import com.kelin.scrollablepanel.library.ScrollablePanel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by xty on 2018/6/21.
 */

public class ClassArrangementInfoActivity extends Activity{

    private Context mContext = this;
    @BindView(R.id.rv_sheet)
    RecyclerView rv_sheet;

    private List<Entity> list;
    private SheetAdapter sheetAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classarrangementinfo);
        ButterKnife.bind(this);

        list = new ArrayList<Entity>();
        for (int i = 0; i < 30; i++) {
            list.add(new Entity("Wade", "James", "Kobe"));
        }
        //设置线性布局 Creates a vertical LinearLayoutManager
        rv_sheet.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //设置recyclerView每个item间的分割线
/*        rv_sheet.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL_LIST));*/
        //创建recyclerView的实例，并将数据传输到适配器
        sheetAdapter = new SheetAdapter(list);
        rv_sheet.setAdapter(sheetAdapter);


     /*   testPanelAdapter= new TestPanelAdapter();
        scrollablePanel.setPanelAdapter(testPanelAdapter);*/
    }

}
