package com.example.asssin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_activity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);
        bottomNavigationView=findViewById(R.id.bottomnav);
        bottomNavigationView.setOnNavigationItemReselectedListener((BottomNavigationView.OnNavigationItemReselectedListener) navigation);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigation=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){
                case R.id.order:
                    Toast.makeText(Home_activity.this, "order", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Go_out:
                    Toast.makeText(Home_activity.this, "order", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Gold:
                    Toast.makeText(Home_activity.this, "order", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Videos:
                    Toast.makeText(Home_activity.this, "order", Toast.LENGTH_SHORT).show();
                    break;
            }
            return false;
        }
    };
}