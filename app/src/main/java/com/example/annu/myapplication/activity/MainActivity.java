package com.example.annu.myapplication.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.annu.myapplication.Fragment.AddFragment;
import com.example.annu.myapplication.Fragment.UpdateFragment;
import com.example.annu.myapplication.Fragment.ViewFragment;
import com.example.annu.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private TextView changeFragment;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_add:
                        changeFragment(new AddFragment());
                        return true;
                    case R.id.navigation_view:
                        changeFragment(new ViewFragment());
                        return true;
                    case R.id.navigation_update:
                        changeFragment(new UpdateFragment());
                        return true;

                }
                return false;
            }
    };


    public void changeFragment(Fragment fragment) {//import support fragment
        FragmentManager fragmentManager = getSupportFragmentManager( );//mangage menu
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction( );
        fragmentTransaction.replace(R.id.parent, fragment);
        fragmentTransaction.commit( );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);//for by default show navigationview
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        changeFragment(new AddFragment());
    }

}
