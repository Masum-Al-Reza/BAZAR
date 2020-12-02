package com.example.asssin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_activity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);
        bottomNavigationView=findViewById(R.id.bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigation=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    
            switch (item.getItemId()){
                case R.id.order:
                    Navigation.findNavController(Home_activity.this,R.id.nav_host).navigate(R.id.orders);

                    break;
                case R.id.Go_out:
                    Navigation.findNavController(Home_activity.this,R.id.nav_host).navigate(R.id.go_out);

                    break;
                case R.id.Gold:
                    Navigation.findNavController(Home_activity.this,R.id.nav_host).navigate(R.id.golds);

                    break;
                case R.id.Videos:
                    Navigation.findNavController(Home_activity.this,R.id.nav_host).navigate(R.id.videos);

                    break;
                default:
                    break;
            }

            return true;
        }
    };
}