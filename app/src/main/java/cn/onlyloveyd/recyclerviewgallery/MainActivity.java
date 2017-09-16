package cn.onlyloveyd.recyclerviewgallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_horizontal_linearsnaphelper)
    Button btHorizontalLinearsnaphelper;
    @BindView(R.id.bt_vertical_linearsnaphelper)
    Button btVerticalLinearsnaphelper;
    @BindView(R.id.bt_pagersnaphelper)
    Button btPagersnaphelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.bt_horizontal_linearsnaphelper, R.id.bt_vertical_linearsnaphelper, R.id.bt_pagersnaphelper})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_horizontal_linearsnaphelper:
                directToGallery(0);
                break;
            case R.id.bt_vertical_linearsnaphelper:
                directToGallery(1);
                break;
            case R.id.bt_pagersnaphelper:
                directToGallery(2);
                break;
        }
    }

    /**
     * direct to Gallery Activity with different mode
     * @param mode
     */
    private void directToGallery(int mode) {
        Intent intent = new Intent();
        intent.setClass(this, GalleryActivity.class);
        intent.putExtra("MODE", mode);
        this.startActivity(intent);
    }
}
