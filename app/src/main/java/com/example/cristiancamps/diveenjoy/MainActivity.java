package com.example.cristiancamps.diveenjoy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        finish();
    }

    //Botones de redes sociales

    public void onClickRRSS (View view){
        Intent intent = null;
        String url = "";

        switch (view.getId()){

            case R.id.fbbtn:
                url = "http://www.facebook.com/divenjoy.org";
                break;

            case R.id.instabtn:
                url = "https://www.instagram.com/divenjoy_org";
                break;

            case R.id.ytbtn:
                url = "https://www.youtube.com/channel/UCRjZpSXFUThTBVRphpiUuSg";
                break;

            case R.id.webbtn:
                url = "http://divenjoy.org";
                break;

            case R.id.twitterbtn:
                url = "https://twitter.com/divenjoy_org";
                break;
        }
        intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);

    }


}
