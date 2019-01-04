package com.example.cristiancamps.diveenjoy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Botones del menú:

    public void onClick (View view){
        Intent miIntent = null;
        switch (view.getId()){

            case R.id.aboutbtn:
                miIntent = new Intent(MainActivity.this, AboutActivity.class);
                break;
            case R.id.squadbtn:
                miIntent = new Intent(MainActivity.this, SquadActivity.class);
                break;
            case R.id.imgbtn:
                miIntent = new Intent(MainActivity.this, GalleryActivity.class);
                break;
            case R.id.calendarbtn:
                miIntent = new Intent(MainActivity.this, CalendarioActivity.class);
                break;
            case R.id.bookbtn:
                miIntent = new Intent(MainActivity.this, BookinActivity.class);
                break;

        }
    startActivity(miIntent);

    }

    //Botones de redes sociales
    public void onFacebook(View view) {
        finish();
    }
    public void onInstagram(View view) {
        finish();
    }
    public void onGmail(View view) {
        finish();
    }
    public void onWhatssapp(View view) {
        finish();
    }
    public void onTwitter(View view) {
        finish();
    }


}
