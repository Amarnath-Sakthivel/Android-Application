package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class englishWebPage extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_web_page);

        webView=findViewById(R.id.ewv);
        Intent intent=getIntent();
        String website=intent.getStringExtra("english");
        webView.setWebViewClient(new WebViewClient());
       webView.loadUrl(website);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
           webView.goBack();
        } else {
            super.onBackPressed();
        }

    }
}
