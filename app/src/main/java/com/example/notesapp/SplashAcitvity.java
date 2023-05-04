package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.ktx.Firebase;

public class SplashAcitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acitvity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                FirebaseUser currentuser= FirebaseAuth.getInstance().getCurrentUser();
                if(currentuser==null){
                    startActivity(new Intent(SplashAcitvity.this,LoginActivity.class));
                }else{
                    startActivity(new Intent(SplashAcitvity.this,MainActivity.class));
                }
                startActivity(new Intent(SplashAcitvity.this,CreatAccountActivity.class));
                finish();
            }
        },1000);
    }
}