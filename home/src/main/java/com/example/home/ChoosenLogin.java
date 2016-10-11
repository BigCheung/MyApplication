package com.example.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */

public class ChoosenLogin extends AppCompatActivity {

    private List<Fragment> mFragments=new ArrayList<>();

    private ViewPager mViewPager;

    private LoginFragmentAdapter loginFragmentAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosen_login);
    }


}
