package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class aptitude1 extends AppCompatActivity {
  private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude1);
        webView = findViewById(R.id.swv);
        Intent intent = getIntent();
        String website = intent.getStringExtra("syllabus");
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