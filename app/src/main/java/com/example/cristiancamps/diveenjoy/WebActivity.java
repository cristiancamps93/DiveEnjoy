package com.example.cristiancamps.diveenjoy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String url = (String)extras.get("url"); //Obtenemos el valor del enlace

        webView = findViewById(R.id.webWiew);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url); //Cargamos la página web
        finish();

    }
}
