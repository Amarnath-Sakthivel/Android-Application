package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class reasonWebPage extends AppCompatActivity {
    WebView reasoningWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reason_web_page);
        reasoningWeb=findViewById(R.id.rwv);
        Intent intent=getIntent();
        String website=intent.getStringExtra("reasoning");
        reasoningWeb.setWebViewClient(new WebViewClient());
        reasoningWeb.loadUrl(website);

        WebSettings webSettings = reasoningWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if (reasoningWeb.canGoBack()) {
            reasoningWeb.goBack();
        } else {
            super.onBackPressed();
        }

    }
}
