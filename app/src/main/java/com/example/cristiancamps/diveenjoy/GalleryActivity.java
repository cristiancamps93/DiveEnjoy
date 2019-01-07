package com.example.cristiancamps.diveenjoy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        //Hacemos la referencia a nuestro boton
        Button showGallery = (Button)findViewById(R.id.btngal);


        //Lamamos al evento setOnClickListener del boton

        showGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Colocamos la clase intent que sirve para crear actividades entre activity y generar la actividad con la clase ShowGallery
                Intent intent = new Intent(GalleryActivity.this, ShowGalleryActivity.class);
                startActivity(intent);

            }
        });


    }





    //Botones del menú:

    public void onClick (View view){
        Intent miIntent = null;
        switch (view.getId()){

            case R.id.squadbtn:
                miIntent = new Intent(GalleryActivity.this, SquadActivity.class);
                break;
            case R.id.mainbtn:
                miIntent = new Intent(GalleryActivity.this, MainActivity.class);
                break;
            case R.id.calendarbtn:
                miIntent = new Intent(GalleryActivity.this, CalendarioActivity.class);
                break;
            case R.id.bookbtn:
                miIntent = new Intent(GalleryActivity.this, BookinActivity.class);
                break;

        }
        startActivity(miIntent);
        finish();

    }
}
