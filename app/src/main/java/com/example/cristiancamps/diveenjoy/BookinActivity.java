package com.example.cristiancamps.diveenjoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookin);
    }

    //Botones del menú
    public void onSquad(View view) {
        finish();
    }
    public void onImage(View view) {
        finish();
    }
    public void onMain(View view) {
        finish();
    }
    public void onCalendar(View view) {
        finish();
    }


}
