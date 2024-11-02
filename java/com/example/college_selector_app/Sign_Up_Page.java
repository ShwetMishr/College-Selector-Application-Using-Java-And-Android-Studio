package com.example.college_selector_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Sign_Up_Page extends AppCompatActivity {
     EditText em, full_name, username, passwo;
    FirebaseAuth mAuth;
    ProgressBar progressBar;


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Intent intent = new Intent(getApplicationContext(), Uihomescreen.class);
            startActivity(intent);
            finish();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        em = (EditText) findViewById(R.id.email);
        full_name = (EditText) findViewById(R.id.signup_name);
        username = (EditText) findViewById(R.id.signup_uname);
        passwo = (EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        mAuth = FirebaseAuth.getInstance();
    }

    public void Sgned_uped(View view) {
        //progressBar.setVisibility(View.VISIBLE);
        String email = em.getText().toString();
        String fn=full_name.getText().toString();
        String un=username.getText().toString();
        String password = passwo.getText().toString();
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please Enter Passwoed", Toast.LENGTH_SHORT).show();


        }
        else if (TextUtils.isEmpty(un)) {
            Toast.makeText(this, "Please Enter Username", Toast.LENGTH_SHORT).show();


        }
        else if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();


        }
        else {
            progressBar.setVisibility(View.VISIBLE);
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressBar.setVisibility(View.GONE);
                            if ((task.isSuccessful())) {

                                Toast.makeText(Sign_Up_Page.this, "Account created", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Uihomescreen.class);
                                startActivity(intent);
                                finish();

                            } else {
                                Toast.makeText(Sign_Up_Page.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });


        }
    }
}