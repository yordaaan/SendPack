package com.example.sendpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ReqPickupPengirim extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reqpickup_pengirim);
    }

    public void done_pengirim(View view) {
        Intent i = new Intent(ReqPickupPengirim.this, UserReqPickup.class);
        startActivity(i);
    }
}
