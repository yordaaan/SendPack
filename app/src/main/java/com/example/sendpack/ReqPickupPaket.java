package com.example.sendpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ReqPickupPaket extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reqpickup_paket);
    }

    public void done_paket(View view) {
        Intent i = new Intent(ReqPickupPaket.this, UserReqPickup.class);
        startActivity(i);
    }
}
