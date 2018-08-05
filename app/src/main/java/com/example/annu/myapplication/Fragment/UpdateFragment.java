package com.example.annu.myapplication.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.annu.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateFragment extends Fragment {
Spinner spBranch,spCourse;
Button btnSave,btnUpdate;
EditText edtName,edtAddress,edtPhone,edtYears;

    String branch[]={"COMM","Sience","Arts"};
    String course[]={"BCA","B.Com","Bed"};

    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_update, container, false);

        // Inflate the layout for this fragment
        spBranch=view.findViewById(R.id.spnBranch);
        spCourse=view.findViewById(R.id.spnCourse);
        btnSave=view.findViewById( R.id.btnSave );
        btnUpdate=view.findViewById( R.id.btnUpdate );
        edtName=view.findViewById( R.id.edtName );
        edtAddress=view.findViewById( R.id.edtAddress);
        edtPhone=view.findViewById( R.id.edtPhone);
        edtYears=view.findViewById( R.id.edtYears);
        ArrayAdapter<String> courseAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line ,  course);
        spCourse.setAdapter(courseAdapter);
        ArrayAdapter<String> branchAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line ,  branch);
        spBranch.setAdapter(branchAdapter);
       /* btnSave.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

            }
        } );
        btnUpdate.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

            }
        } );*/
        return view;
        // Inflate the layout for this fragment
    }

}
