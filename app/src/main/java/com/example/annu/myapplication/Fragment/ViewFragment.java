package com.example.annu.myapplication.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.annu.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewFragment extends Fragment {
   // define spinner





    public ViewFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view, container, false);

        // Inflate the layout for this fragment


        return view;

    }

}
