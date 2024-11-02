package com.example.college_selector_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
    }
    public void ddd(View view){
        Intent intent=new Intent(this, Login_Page.class);
        //Bundle b3= ActivityOptions.makeSceneTransitionAnimation(this).toBundle();

        startActivity(intent);
    }
}