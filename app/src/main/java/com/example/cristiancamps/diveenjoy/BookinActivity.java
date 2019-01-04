package com.example.cristiancamps.diveenjoy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookin);
    }

    //Botones del menú:

    public void onClick (View view){
        Intent miIntent = null;
        switch (view.getId()){

            case R.id.squadbtn:
                miIntent = new Intent(BookinActivity.this, SquadActivity.class);
                break;
            case R.id.imgbtn:
                miIntent = new Intent(BookinActivity.this, GalleryActivity.class);
                break;
            case R.id.calendarbtn:
                miIntent = new Intent(BookinActivity.this, CalendarioActivity.class);
                break;
            case R.id.mainbtn:
                miIntent = new Intent(BookinActivity.this, MainActivity.class);
                break;

        }
        startActivity(miIntent);

    }


}
