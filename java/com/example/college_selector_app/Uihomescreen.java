package com.example.college_selector_app;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Uihomescreen extends AppCompatActivity {
    TextView textView;
    FirebaseAuth auth;
    FirebaseUser user;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uihomescreen);
        button = (Button) findViewById(R.id.logout);
        textView = (TextView) findViewById(R.id.user_details);
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();





        if (user == null) {
            Intent intent = new Intent(getApplicationContext(), Login_Page.class);
            startActivity(intent);
            finish();
        } else {
            textView.setText(user.getEmail());

        }
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);

        if (acct != null) {
            String personname = acct.getDisplayName();
            String personemail = acct.getEmail();
            textView.setText(personemail + personname);
        }

    }
    public void signou(View view){
        FirebaseAuth.getInstance().signOut();
        Intent intent=new Intent(getApplicationContext(),Login_Page.class);
        startActivity(intent);
        finish();
    }

    public void Engineering_click(View view){

        Intent intent=new Intent(this, engineering.class);
        startActivity(intent);

    }
    public void Arcitecture_click(View view){

        Intent intent=new Intent(this, Architecture.class);
        startActivity(intent);

    }
    public void Dilpoma(View view){

        Intent intent=new Intent(this, Diploma.class);
        startActivity(intent);

    }
    public void Business(View view){

        Intent intent=new Intent(this, Business.class);
        startActivity(intent);

    }
    public void seeall(View view){
        Intent intent=new Intent(this, fbaseVideo.class);
        startActivity(intent);
    }

    public void search_parul_university(View view){
        Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://paruluniversity.ac.in/"));
        startActivity(intent1);

    }

    public void search_amity_university(View view){
        Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amity.edu/"));
        startActivity(intent1);

    }
    public void search_ahmedabad_university(View view){
        Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://ahduni.edu.in/"));
        startActivity(intent1);

    }
}