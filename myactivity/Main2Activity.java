//package com.example.myactivity;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.ListView;
//import android.widget.MediaController;
//import android.widget.VideoView;
//
//import java.util.ArrayList;
//
//public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
//    private Button b0,b1,b2,b3,b4,b5,b6;
//    private String[] url=new String[20];
//    VideoView video;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//        video=findViewById(R.id.video);
//        b0=findViewById(R.id.bank_exam_cat);
//        b1=findViewById(R.id.tips_bank);
//        b2=findViewById(R.id.apt_class);
//        b3=findViewById(R.id.reason_ability);
//        b4=findViewById(R.id.Eng_know);
//        b5=findViewById(R.id.comp_class);
//        b6=findViewById(R.id.Mot_class);
//
//
//        b0.setOnClickListener(this);
//        b1.setOnClickListener(this);
//        b2.setOnClickListener(this);
//        b3.setOnClickListener(this);
//        b4.setOnClickListener(this);
//        b5.setOnClickListener(this);
//        b6.setOnClickListener(this);
//
//        url[0]=" https://www.youtube.com/watch?v=g4AMr4cmEzM&feature=youtu.be";
//        url[1]=" https://youtu.be/g4AMr4cmEzM";
//        url[2]=" https://www.youtube.com/playlist?list=PLpyc33gOcbVA4qXMoQ5vmhefTruk5t9lt";
//        url[3]=" https://www.youtube.com/watch?v=fZn4oVhv_q0&feature=youtu.be";
//        url[4]="https://www.youtube.com/watch?v=dYiy_CmA4Ho&feature=youtu.be ";
//        url[5]=" https://www.youtube.com/watch?v=LHfhe-aggkg&feature=youtu.be";
//        url[6]="https://www.youtube.com/watch?v=-smSGHBDI3g&feature=youtu.be ";
//
//        MediaController mc = new MediaController(this);
//        mc.setAnchorView(video);
//        mc.setMediaPlayer(video);
//        video.setMediaController(mc);
//    }
//
//    @Override
//    public void onClick(View v) {
//
//        switch (v.getId()){
//            case R.id.bank_exam_cat:
//                Uri uri = Uri.parse(url[0]);
//                video.setVideoURI(uri);
//                video.start();
//                break;
//            case R.id.tips_bank:
//
//                uri = Uri.parse(url[1]);
//
//                video.setVideoURI(uri);
//                video.start();
//                break;
//            case R.id.apt_class:
//
//                uri = Uri.parse(url[2]);
//
//                video.setVideoURI(uri);
//                video.start();
//                break;
//            case R.id.reason_ability:
//
//                uri = Uri.parse(url[3]);
//
//                video.setVideoURI(uri);
//                video.start();
//                break;
//            case R.id.Eng_know:
//
//                uri = Uri.parse(url[4]);
//
//                video.setVideoURI(uri);
//                video.start();
//                break;
//            case R.id.comp_class:
//
//                uri = Uri.parse(url[5]);
//
//                video.setVideoURI(uri);
//                video.start();
//                break;
//            case R.id.Mot_class:
//                uri = Uri.parse(url[6]);
//                video.setVideoURI(uri);
//                video.start();
//                break;
//        }
//
//    }
//}