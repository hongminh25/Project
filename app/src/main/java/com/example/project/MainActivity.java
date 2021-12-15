package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity implements Truyen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void DataCompany(SV sv) {
        FragmentInfor fragmentInfor = (FragmentInfor) getSupportFragmentManager().findFragmentById(R.id.fragmentInfor);
        Configuration configuration = getResources().getConfiguration();
        if (fragmentInfor != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE ){
            fragmentInfor.SetInfor(sv);
        }
        else {
            Intent intent = new Intent(MainActivity.this,CompanyInformation.class);
            intent.putExtra("thongTinCongTy", sv);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}


