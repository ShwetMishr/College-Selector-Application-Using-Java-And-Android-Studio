package com.example.college_selector_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Secondactivity extends AppCompatActivity {


    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    Button button,btn2;
    TextView textView;
    FirebaseAuth auth;
    FirebaseUser user;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this, gso);
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
    public void signout(View view){
        FirebaseAuth.getInstance().signOut();
        Intent intent=new Intent(getApplicationContext(),Login_Page.class);
        startActivity(intent);
        finish();
    }

    public void parullink(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://paruluniversity.ac.in/"));
        startActivity(intent);

    }
    public void galgotialink(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.galgotiasuniversity.edu.in/"));
        startActivity(intent);

    }
    public void iitlink(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitb.ac.in/"));
        startActivity(intent);

    }
    public void search_now(View view){
        Intent intent=new Intent(this, Search_now.class);
        Bundle b4= ActivityOptions.makeSceneTransitionAnimation(this).toBundle();

        startActivity(intent,b4);

    }
}
