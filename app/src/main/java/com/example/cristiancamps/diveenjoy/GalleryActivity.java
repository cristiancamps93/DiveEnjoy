package com.example.cristiancamps.diveenjoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }
    //Botones del menú
    public void onMain(View view) {
        finish();
    }
    public void onBookin(View view) {
        finish();
    }
    public void onCalendar(View view) {
        finish();
    }
    public void onSquad(View view) {
        finish();
    }
}
