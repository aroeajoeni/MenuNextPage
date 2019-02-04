package com.example.aroe.menunextpage;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ColorBox extends AppCompatActivity {

    private TextView alabama;
    private Button texas;
    private Button ohio;
    private Button vegas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_box);

        alabama = (TextView)findViewById(R.id.tvBox);
        texas = (Button)findViewById(R.id.btnBlack);
        ohio = (Button)findViewById(R.id.btnYellow);
        vegas = (Button)findViewById(R.id.btnRed);

        texas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alabama.setBackgroundColor(Color.parseColor("Black"));
            }
        });

        ohio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alabama.setBackgroundColor(Color.parseColor("Yellow"));
            }
        });

        vegas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alabama.setBackgroundColor(Color.parseColor("Red"));
            }
        });
    }
}
