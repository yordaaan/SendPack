package com.example.sendpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Regis extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regis);
    }

    public void user_baru(View view) {
        Intent i = new Intent(Regis.this, Home.class);
        startActivity(i);
    }
}
