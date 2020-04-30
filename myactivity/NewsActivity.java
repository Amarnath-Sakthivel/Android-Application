package com.example.myactivity;


import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class NewsActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        webView=findViewById(R.id.quans_webview);
        Intent intent=getIntent();
        String website=intent.getStringExtra("url");
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