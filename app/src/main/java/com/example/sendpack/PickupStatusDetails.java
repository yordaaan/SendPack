package com.example.sendpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PickupStatusDetails extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reqpickup_status_detail);
    }

    public void details_pickup_done(View view) {
        Intent i = new Intent(PickupStatusDetails.this, PickupStatus.class);
        startActivity(i);
    }
}

