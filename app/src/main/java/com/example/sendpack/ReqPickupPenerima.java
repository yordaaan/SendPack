package com.example.sendpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ReqPickupPenerima extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reqpickup_penerima);
    }

    public void done_penerima(View view) {
        Intent i = new Intent(ReqPickupPenerima.this, UserReqPickup.class);
        startActivity(i);
    }
}
