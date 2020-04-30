package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class questionActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        webView = findViewById(R.id.qwv);
        Intent intent = getIntent();
        String website = intent.getStringExtra("question");
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
//    webView.setDownloadListener(new DownloadListener() {
//        @Override
//        public void onDownloadStart(String url, String userAgent,
//                String contentDisposition, String mimetype,
//        long contentLength) {
//
//            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
//        }
//    });
//}
