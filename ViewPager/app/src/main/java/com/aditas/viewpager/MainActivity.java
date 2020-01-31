package com.aditas.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager page;
    private Adapt adapt;
    private TabLayout tabMenu;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateTitle();
        generateData();

        page = findViewById(R.id.vp_page);
        adapt = new Adapt(getSupportFragmentManager());
        tabMenu = findViewById(R.id.tab_menu);

        page.setAdapter(adapt);
        tabMenu.setupWithViewPager(page);
    }
    //Membuat dummy title data
    private void generateTitle(){
        menuTitleData.add("Promo");
        menuTitleData.add("Paket");
        menuTitleData.add("Minum");
        menuTitleData.add("Dessert");
        menuTitleData.add("Sate");
    }
    private void generateData(){
        data.add("Sahara");
        data.add("Wrangler");
        data.add("Sport");
        data.add("Rubicon");
        data.add("Gladiator");
    }
}
