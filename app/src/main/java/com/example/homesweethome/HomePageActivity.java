package com.example.homesweethome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        HomeViewPagerAdapter homeViewPager=new HomeViewPagerAdapter(getSupportFragmentManager());
        homeViewPager.add(new Mess());
        homeViewPager.add(new Home());

        ViewPager viewPager=findViewById(R.id.home_view_pager);
        viewPager.setAdapter(homeViewPager);

        TabLayout tabs=findViewById(R.id.nav);
        tabs.setupWithViewPager(viewPager);

        System.out.println("ii: "+tabs.getTabAt(0));
        tabs.getTabAt(0).setText("Hello");

    }
}