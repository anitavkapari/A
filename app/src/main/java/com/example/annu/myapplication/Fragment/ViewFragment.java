package com.example.annu.myapplication.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.annu.myapplication.DB.DBholder;
import com.example.annu.myapplication.DB.Employee;
import com.example.annu.myapplication.R;
import com.example.annu.myapplication.adapter.EmployeeListAdapter;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewFragment extends Fragment {
RecyclerView rvUsers;




    public ViewFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        rvUsers=view.findViewById( R.id.rvUsers );
        rvUsers.setLayoutManager( new LinearLayoutManager( getActivity() ) );//
        DBholder dbholder=new DBholder( getActivity() );//
        List<Employee> employees=dbholder.getAllEmployee();//
        EmployeeListAdapter adapter=new EmployeeListAdapter(employees ,dbholder );
        rvUsers.setAdapter( adapter );
        // Inflate the layout for this fragment
        return view;

    }

}
