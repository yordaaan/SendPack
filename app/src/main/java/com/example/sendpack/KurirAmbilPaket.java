package com.example.sendpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KurirAmbilPaket extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kurir_ambilpaket);
    }

    public void selesai_paket(View view) {
        Intent i = new Intent(KurirAmbilPaket.this, KurirHome.class);
        startActivity(i);
    }
}
