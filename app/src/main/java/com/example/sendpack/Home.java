package com.example.sendpack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void klik_reqpick(View view) {
        Intent i = new Intent(Home.this, UserReqPickup.class);
        startActivity(i);
    }

    public void klik_statpick(View view) {
        Intent i = new Intent(Home.this, ReqPickUpStatus.class);
        startActivity(i);

    }

    public void klik_edprof(View view) {
        Intent i = new Intent(Home.this, EditProfile.class);
        startActivity(i);
    }

    public void klik_help(View view) {
        Intent i = new Intent(Home.this, Help.class);
        startActivity(i);
    }
}
