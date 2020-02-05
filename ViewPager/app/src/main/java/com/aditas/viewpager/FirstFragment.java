package com.aditas.viewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    ListView lvData;

    private static ArrayList<CarSpec.Carf> items;

    public static FirstFragment newInstance(ArrayList<CarSpec.Carf> data){ //ambil data dari CarSpec.Carf trus masukin ke argument
        FirstFragment firstFrag = new FirstFragment();
        Bundle args = new Bundle();
        args.putParcelableArrayList("text", data);
        firstFrag.setArguments(args);
        items = data;
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

//    private TextView textData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        ListView list =(ListView) rootView.findViewById(R.id.lv_data);

        ArrayAdapter<CarSpec.Carf> adapter = new ArrayAdapter<CarSpec.Carf>(getActivity(), android.R.layout.simple_list_item_1, items);
        list.setAdapter(adapter);

        if(getArguments() != null){
            ArrayList<CarSpec.Carf> crf = getArguments().getParcelableArrayList("text");
            lvData = rootView.findViewById(R.id.lv_data);
            UserAdapter adaptr = new UserAdapter(getActivity(), crf);
            lvData.setAdapter(adaptr);
        }

        return rootView;
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View rootView =  inflater.inflate(R.layout.fragment_first, container, false);
//
//        textData = rootView.findViewById(R.id.text_data);
//        textData.setText(getArguments().getString("text"));
//
//        return rootView;
//       // return inflater.inflate(R.layout.fragment_first, container, false);
//    }

//    public fix(ArrayList<CarSpec.Carf>){
//
//    }

}
