package com.example.husnalmuslim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_main_fragmentcontainer, new MainFragment()).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnavigation_main);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId=item.getItemId();
                if (itemId==R.id.azkar_mainmenu){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_main_fragmentcontainer,new MainFragment()).commit();
                } else if (itemId==R.id.zekr_mainmenu) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_main_fragmentcontainer,new CounterFragment()).commit();
                } else if (itemId==R.id.setting_mainmenu) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_main_fragmentcontainer,new SettingsFragment()).commit();

                }else {}
                return true;
            }
        });
    }
}