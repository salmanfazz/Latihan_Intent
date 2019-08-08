package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        next = (Button)findViewById(R.id.next);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent next= new Intent(FormActivity.this, FormActivity2.class);
        startActivity(next);
    }
}
