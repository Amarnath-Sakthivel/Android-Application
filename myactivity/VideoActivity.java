//package com.example.myactivity;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.webkit.WebSettings;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.widget.Button;
//import android.widget.MediaController;
//import android.widget.VideoView;
//
//public class VideoActivity extends AppCompatActivity {
//    VideoView video;
//    MediaController mc;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_video);
////        webView=findViewById(R.id.web_video);
////        Intent intent=getIntent();
////        String website=intent.getStringExtra("video");
////        webView.setWebViewClient(new WebViewClient());
////        webView.loadUrl(website);
////        WebSettings webSettings = webView.getSettings();
////        webSettings.setJavaScriptEnabled(true);
////
////
////    }
////
////    @Override
////    public void onBackPressed() {
////        if (webView.canGoBack()) {
////            webView.goBack();
////        } else {
////            super.onBackPressed();
////        }
//
//
//
//        video = (VideoView) findViewById(R.id.VideoView);
//        String path1 = "http://www.w3schools.com/html5/movie.mp4";
//        MediaController mc = new MediaController(this);
//        mc.setAnchorView(video);
//        mc.setMediaPlayer(video);
//        Uri uri = Uri.parse(path1);
//        video.setMediaController(mc);
//        video.setVideoURI(uri);
//        Button buttonStart = (Button) findViewById(R.id.buttonStart);
//        buttonStart.setOnClickListener(new OnClickListener() {
//
//            public void onClick(View v) {
//                video.start();
//            }
//
//        });
//
//
//    }
//}
//
//
//
