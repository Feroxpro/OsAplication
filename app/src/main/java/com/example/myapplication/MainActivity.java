package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnok;
    EditText osNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnok = findViewById(R.id.btnok);
        osNumber = findViewById(R.id.number_os);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OsView.class);
                String txtNumber = osNumber.getText().toString();
                intent.putExtra("caraio", txtNumber);
                startActivity(intent);

            }
        });
    }
}