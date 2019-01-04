package com.example.cristiancamps.diveenjoy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CalendarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
    }

    //Botones del menú:

    public void onClick (View view){
        Intent miIntent = null;
        switch (view.getId()){

            case R.id.squadbtn:
                miIntent = new Intent(CalendarioActivity.this, SquadActivity.class);
                break;
            case R.id.imgbtn:
                miIntent = new Intent(CalendarioActivity.this, GalleryActivity.class);
                break;
            case R.id.mainbtn:
                miIntent = new Intent(CalendarioActivity.this, MainActivity.class);
                break;
            case R.id.bookbtn:
                miIntent = new Intent(CalendarioActivity.this, BookinActivity.class);
                break;

        }
        startActivity(miIntent);
        finish();

    }
}
