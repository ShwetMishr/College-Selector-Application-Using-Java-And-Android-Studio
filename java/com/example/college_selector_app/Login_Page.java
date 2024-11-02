package com.example.college_selector_app;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.GoogleAuthProvider;

public class Login_Page extends AppCompatActivity {

    EditText em,full_name,username,passwo;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
  





    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent= new Intent(getApplicationContext(),Uihomescreen.class);
            startActivity(intent);
            finish();
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        em=(EditText) findViewById(R.id.email);

        passwo=(EditText) findViewById(R.id.password);
        progressBar=(ProgressBar) findViewById(R.id.progressbar);
        mAuth=FirebaseAuth.getInstance();





    }

    public void loginnow(View view) {
       // progressBar.setVisibility(View.VISIBLE);
        String email = String.valueOf(em.getText());
        String password = String.valueOf(passwo.getText());
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(Login_Page.this, "Enter Email", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(Login_Page.this, "Enter Passwoed", Toast.LENGTH_SHORT).show();


        } else {
            progressBar.setVisibility(View.VISIBLE);
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressBar.setVisibility(View.GONE);
                            if (task.isSuccessful()) {

                                // Sign in success, update UI with the signed-in user's information
                                Toast.makeText(Login_Page.this, "Login Success full", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Uihomescreen.class);
                                startActivity(intent);
                                finish();

                            } else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(Login_Page.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }
    }







    public void Sign_up_now(View view){
        Intent intent=new Intent(this, Sign_Up_Page.class);
        Bundle b=ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(intent,b);

    }
    public void forget_password_options(View view){
        Intent intent=new Intent(this, forget_password.class);
        Bundle b2=ActivityOptions.makeSceneTransitionAnimation(this).toBundle();

        startActivity(intent,b2);
    }
}