package com.example.myactivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class affairsActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affairs);
        webView = findViewById(R.id.affWebview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.gktoday.in/category/gk-current-affairs-quiz-questions-answers/");

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
