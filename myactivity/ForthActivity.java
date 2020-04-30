package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ForthActivity extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        wv= findViewById(R.id.wvc);
        Intent intent = getIntent();
        String website = intent.getStringExtra("computer");
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl(website);

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if (wv.canGoBack()) {
            wv.goBack();
        } else {
            super.onBackPressed();
        }
}



}
