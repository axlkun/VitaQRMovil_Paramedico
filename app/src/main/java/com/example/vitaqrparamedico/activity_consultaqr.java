package com.example.vitaqrparamedico;

import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity_consultaqr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultaqr);

        String direccion = getIntent().getStringExtra("direccion");
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl(direccion);
    }
}