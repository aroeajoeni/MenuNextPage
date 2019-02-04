package com.example.aroe.menunextpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private EditText babyshark1;
    private EditText babyshark2;
    private TextView  daddyshark;
    private Button mommyshark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        babyshark1 = (EditText)findViewById(R.id.etNum1);
        babyshark2 = (EditText)findViewById(R.id.etNum2);
        daddyshark = (TextView)findViewById(R.id.tvAnswer);
        mommyshark = (Button)findViewById(R.id.btnSub);

        mommyshark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(babyshark1.getText().toString());
                int number2 = Integer.parseInt(babyshark2.getText().toString());
                int sum = number1 - number2;

                daddyshark.setText("Answer: " + String.valueOf(sum));

            }
        });


    }
}
