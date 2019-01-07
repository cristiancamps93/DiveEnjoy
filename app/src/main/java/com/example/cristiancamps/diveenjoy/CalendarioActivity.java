package com.example.cristiancamps.diveenjoy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class CalendarioActivity extends AppCompatActivity {

    WebView calendar;
    // correo: buceodisfruta@gmail.com // pass: gCavaliers93
    //Link html5
    String url = "https://calendar.google.com/calendar/embed?src=buceodisfruta%40gmail.com&ctz=Europe%2FMadrid";
    //Link web
    //String url = "https://calendar.google.com/calendar/r?cid=buceodisfruta@gmail.com&cid=2k5diom7ca01m77voko9arcvf8@group.calendar.google.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        calendar = findViewById(R.id.calendar);
        calendar.getSettings().setJavaScriptEnabled(true);
        calendar.loadUrl(url); //Cargamos Calendario

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
