package com.example.sendpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class UserReqPickup extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_reqpickup);
    }

    public void det_pengirim(View view) {
        Intent i = new Intent(UserReqPickup.this, ReqPickupPengirim.class);
        startActivity(i);
    }

    public void det_penerima(View view) {
        Intent i = new Intent(UserReqPickup.this, ReqPickupPenerima.class);
        startActivity(i);
    }

    public void det_paket(View view) {
        Intent i = new Intent(UserReqPickup.this, ReqPickupPaket.class);
        startActivity(i);
    }

    //public void kembali(View view) {

    //}

    public void done_req(View view) {
        Intent i = new Intent(UserReqPickup.this, Home.class);
        startActivity(i);
    }
}
