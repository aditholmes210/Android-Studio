package com.aditas.viewpager;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class Adapt extends FragmentStatePagerAdapter {
    private static ArrayList<String> myTitles;
    private static ArrayList<String> myData;
    private static int numOfItems;

    public static Adapt newInstance(FragmentManager fm, ArrayList<String> titles, ArrayList<String> data){
        Adapt adapt = new Adapt(fm);
        myTitles = titles;
        myData = data;
        numOfItems = data.size();
        return adapt;
    }

    //Constructor
    public Adapt(FragmentManager fm){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        FirstFragment firstFrag = new FirstFragment();
        SecondFragment sndFrag = new SecondFragment();

        switch (position){
            case 0:
                return firstFrag;
            case 1:
                return sndFrag;
            default:
                return firstFrag;
        }

    }

//    @Override
//    public int getCount() {
//        return 3;
//    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int pos) {
////        return "Page " + position;
//        String title = null;
//        switch (pos){
//            case 0:
//                title = "Chats";
//                break;
//            case 1:
//                title = "Stats";
//                break;
//            case 2:
//                title = "calls";
//                break;
//        }
//        return title;
//    }

    @Override
    public int getCount(){
        return numOfItems;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        String title = myTitles.get(position);

        return title;
    }
}
