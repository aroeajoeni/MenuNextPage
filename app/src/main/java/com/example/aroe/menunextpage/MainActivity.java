package com.example.aroe.menunextpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.philcollins,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menuCalculator){
            Intent ladygaga = new Intent(MainActivity.this, CalculatorActivity.class);
            startActivity(ladygaga);
        }

        if (item.getItemId() == R.id.menuColor){
            Intent ladygaga = new Intent(MainActivity.this, ColorBox.class);
            startActivity(ladygaga);
        }
        return super.onOptionsItemSelected(item);
    }
}
