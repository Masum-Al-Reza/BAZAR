package com.example.asssin.registration_phone;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asssin.R;

public class Login_phone extends AppCompatActivity {
    private ImageButton btRegister;
    private TextView tvLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btRegister  = findViewById(R.id.btRegister);

    }
}