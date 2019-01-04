package com.example.cristiancamps.diveenjoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CalendarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
    }

    //Botones del menú
    public void onSquad(View view) {
        finish();
    }
    public void onBookin(View view) {
        finish();
    }
    public void onMain(View view) {
        finish();
    }
    public void onImage(View view) {
        finish();
    }
}
