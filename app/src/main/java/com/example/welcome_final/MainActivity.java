package com.example.welcome_final;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    Button btn_clear;
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = findViewById(R.id.editTextTextPersonName);
        btn_clear = findViewById(R.id.button_resert);
        btn_test = findViewById(R.id.button_test);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.getText().clear();
            }
        });

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.name);
                tv.setText(edt.getText());
            }
        });
    }
}