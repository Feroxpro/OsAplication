package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OsView extends AppCompatActivity {

    TextView resultOs;
    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_view);
        btnnext = findViewById(R.id.btnnext);
        resultOs = findViewById(R.id.result_os);

        Bundle extra = getIntent().getExtras();

        resultOs.setText(extra.getString("caraio"));

        getNextActivity();
    }


//    void getNextActivity() {
//
//    }

    void getNextActivity() {

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OsView.this, NextActivity.class);
                String txtNumber = resultOs.getText().toString();
                intent.putExtra("puta", txtNumber);
                startActivity(intent);
            }
        });
    }
}