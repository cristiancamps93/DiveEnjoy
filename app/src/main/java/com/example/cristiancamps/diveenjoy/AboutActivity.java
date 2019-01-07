package com.example.cristiancamps.diveenjoy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }


    //Boton de Back
    public void onBack(View view) {
        Intent miIntent = new Intent(AboutActivity.this, MainActivity.class);
        startActivity(miIntent);
        finish();
    }

    //Boton easter
    public void onEaster (View view){
        Intent miIntent = new Intent(AboutActivity.this, EasterEgg.class);
        startActivity(miIntent);
        finish();
    }





}
