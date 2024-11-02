package com.example.college_selector_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forget_password extends AppCompatActivity {
    EditText fphone;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        fphone=(EditText) findViewById(R.id.forget_phone);
        auth=FirebaseAuth.getInstance();
    }

    public void send_login_link(View view){
        String fp=fphone.getText().toString();

        if(TextUtils.isEmpty(fp) && !Patterns.EMAIL_ADDRESS.matcher(fp).matches()){
            Toast.makeText(this, "Enter Your Registered Email id", Toast.LENGTH_SHORT).show();
            return;
        }
        auth.sendPasswordResetEmail(fp).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(forget_password.this, "Check Your Email ", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(forget_password.this, "Unable to send", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public  void Back_to_login(View view){
        Intent intent=new Intent(this, Login_Page.class);
        startActivity(intent);

    }
    public  void Create_new_Account(View view){
        Intent intent=new Intent(this, Sign_Up_Page.class);
        startActivity(intent);

    }

}