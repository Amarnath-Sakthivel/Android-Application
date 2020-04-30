package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ScienceActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        webView = findViewById(R.id.qwv);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.jagranjosh.com/general-knowledge/1000-gk-question-and-answers-on-general-science-1487151522-1");

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
