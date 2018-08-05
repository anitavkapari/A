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
import android.widget.Toast;

import com.example.annu.myapplication.DB.DBholder;
import com.example.annu.myapplication.DB.Employee;
import com.example.annu.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {
    Spinner spCourse,spBranch;
    Button btnSave;
    EditText edtName,edtAddress,edtPhone,edtYears;

    String branch[]={"COMM","Sience","Arts"};
    String course[]={"BCA","B.Com","Bed"};

    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);

        // Inflate the layout for this fragment
        spBranch=view.findViewById(R.id.spnBranch);
        spCourse=view.findViewById(R.id.spnCourse);
        btnSave=view.findViewById( R.id.btnSave );
        edtName=view.findViewById( R.id.edtName );
        edtAddress=view.findViewById( R.id.edtAddress);
        edtPhone=view.findViewById( R.id.edtPhone);
        edtYears=view.findViewById( R.id.edtYears);
        ArrayAdapter<String> courseAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line ,  course);
        spCourse.setAdapter(courseAdapter);
        ArrayAdapter<String> branchAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line ,  branch);
        spBranch.setAdapter(branchAdapter);
        btnSave.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                String name =edtName.getText().toString().trim();
                String address =edtAddress.getText().toString().trim();
                String phone =edtPhone.getText().toString().trim();
                String course =spCourse.getSelectedItem().toString();
                String branch =spBranch.getSelectedItem().toString();
                String years =edtYears.getText().toString().trim();
                Employee employee=new Employee( name,address,phone,course,branch,years );
                DBholder dBholder=new DBholder( getActivity() );
                boolean isAddes= dBholder.addEmployee( employee );
                if(isAddes){
                    Toast.makeText( getActivity(),"Recod Added",Toast.LENGTH_SHORT ).show();

            }
            }
        } );
        return view;

    }

}
