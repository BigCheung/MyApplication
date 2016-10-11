package com.example.myhome.UI.Activity;


import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myhome.Adapter.LoginFragmentAdapter;
import com.example.myhome.R;

import java.util.ArrayList;
import java.util.List;

import com.example.myhome.UI.Fragment.LoginFragment;
import com.example.myhome.UI.Fragment.RegisterFragment;


public class LoginActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener{

    private List<Fragment> mFragments;
    private LoginFragmentAdapter loginFragmentAdapter;
    private ViewPager mLoginContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mFragments=new ArrayList<>();
        mFragments.add(new LoginFragment());
        mFragments.add(new RegisterFragment());

        mLoginContainer= (ViewPager) findViewById(R.id.loginContainer_viewPager_loginActivity);
        loginFragmentAdapter=new LoginFragmentAdapter(getSupportFragmentManager(),mFragments);
        mLoginContainer.setAdapter(loginFragmentAdapter);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
