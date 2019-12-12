package com.example.school_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import app.ingic.saloonik.R;

public class MainLoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

            nextActivity();

    }

    public void test(View view) {
        startActivity(new Intent(this , ParentsDashboardActivity.class));
    }

    public void nextActivity()
    {
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                setContentView(R.layout.activity_main_login);
            }
        }, 5000);
    }

    public void signUp(View view) {
        startActivity(new Intent(this,SignUpActivity.class));
    }
}
