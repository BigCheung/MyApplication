package com.example.myhome.UI.Activity;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myhome.Adapter.HostContentAdapter;
import com.example.myhome.R;
import com.example.myhome.UI.Fragment.ChatFragment;

import java.util.ArrayList;
import java.util.List;

public class HostActivity extends AppCompatActivity implements ChatFragment.OnFragmentInteractionListener{

    private ViewPager mHostContainer;
    private HostContentAdapter mHostContentAdapter;
    private List<Fragment> fragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

        fragments=new ArrayList<>();
        fragments.add(new ChatFragment());
        mHostContainer= (ViewPager) findViewById(R.id.contentContainer_viewPager_hostActivity);
        mHostContentAdapter=new HostContentAdapter(getSupportFragmentManager(),fragments);
        mHostContainer.setAdapter(mHostContentAdapter);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
