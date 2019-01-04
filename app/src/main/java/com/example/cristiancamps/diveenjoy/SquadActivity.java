package com.example.cristiancamps.diveenjoy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SquadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squad);
    }


    //Botones del menú:

    public void onClick (View view){
        Intent miIntent = null;
        switch (view.getId()){

            case R.id.mainbtn:
                miIntent = new Intent(SquadActivity.this, MainActivity.class);
                break;
            case R.id.imgbtn:
                miIntent = new Intent(SquadActivity.this, GalleryActivity.class);
                break;
            case R.id.calendarbtn:
                miIntent = new Intent(SquadActivity.this, CalendarioActivity.class);
                break;
            case R.id.bookbtn:
                miIntent = new Intent(SquadActivity.this, BookinActivity.class);
                break;

        }
        startActivity(miIntent);
        finish();

    }


}
