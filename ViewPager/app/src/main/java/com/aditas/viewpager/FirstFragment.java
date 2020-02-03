package com.aditas.viewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    public static FirstFragment newInstance(ArrayList<CarSpec.Carf> text){
        FirstFragment firstFrag = new FirstFragment();
        return firstFrag;
    }

    public FirstFragment() {
        // Required empty public constructor
    }

//    public static FirstFragment newInstance(ArrayList<CarSpec.Carf> text) {
//        FirstFragment firstFrag = new FirstFragment();
//        Bundle args = new Bundle();
//        args.putString("text",text);
//        firstFrag.setArguments(args);
//        return firstFrag;
//    }

    private TextView textData;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_first, container, false);

        textData = rootView.findViewById(R.id.text_data);
        textData.setText(getArguments().getString("text"));

        return rootView;
       // return inflater.inflate(R.layout.fragment_first, container, false);
    }

//    public fix(ArrayList<CarSpec.Carf>){
//
//    }

}
