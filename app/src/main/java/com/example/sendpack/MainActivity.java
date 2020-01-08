package com.example.sendpack;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText PassInput;
    private CheckBox ShowPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PassInput = findViewById(R.id.txtpass);
        ShowPass = findViewById(R.id.showPass);

        //Set onClickListener, untuk menangani kejadian saat Checkbox diklik
        ShowPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ShowPass.isChecked()){
                    //Saat Checkbox dalam keadaan Checked, maka password akan di tampilkan
                    PassInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    //Jika tidak, maka password akan di sembuyikan
                    PassInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }

    public void klik_signin(View view) {
        Intent i = new Intent(MainActivity.this, Home.class);
        startActivity(i);
    }

    public void klik_regis(View view) {
        Intent i = new Intent(MainActivity.this, Regis.class);
        startActivity(i);
    }
}
