package com.example.sendpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KurirNewPaket extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kurir_newpaket);
    }

    public void take_paket(View view) {
        Intent i = new Intent(KurirNewPaket.this, KurirHome.class);
        startActivity(i);
    }
}
