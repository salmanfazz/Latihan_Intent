package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    Button daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        daftar = (Button)findViewById(R.id.daftar);
        daftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent daftar = new Intent(RegisterActivity.this, InputActivity.class);
        startActivity(daftar);
    }
}
