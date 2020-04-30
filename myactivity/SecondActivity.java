package com.example.myactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,b11;
    Button share_btn,news_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        share_btn=findViewById(R.id.share_button);
        news_btn=findViewById(R.id.news);


        b1 = findViewById(R.id.ques_button);
        //b2 = findViewById(R.id.video_button);
        b3 = findViewById(R.id.syllabus_button);
        //b4 = findViewById(R.id.ques_button);
        b5 = findViewById(R.id.reason_button);
        b6 = findViewById(R.id.english_button);
        b7 = findViewById(R.id.comp_button);
        b8 = findViewById(R.id.aff_button);
        b9 = findViewById(R.id.science_button);
        b10=findViewById(R.id.mock_button);
        b11=findViewById(R.id.aptitude_card);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SecondActivity.this, Main2Activity.class);
//                startActivity(intent);
//            }
//        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, SyllabusActivity.class);
                startActivity(intent);

            }
        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SecondActivity.this, aptitudeActivity.class);
//                startActivity(intent);
//
//            }
     //   });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, reasoningActivity.class);
                startActivity(intent);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, EnglishAcitivity.class);
                startActivity(intent);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ComputerActivity.class);
                startActivity(intent);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, affairsActivity.class);
                startActivity(intent);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ScienceActivity.class);
                startActivity(intent);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MockActivity.class);
                startActivity(intent);

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SecondActivity.this,aptitudeActivity.class);
                startActivity(i);
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sharebutton,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share_button:
                Intent sharingIntent=new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plan");
                String sharebody="https://bankexamportal.com/study-material ";
                String bodySubject="www.gooogle.com";
                sharingIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT,bodySubject);
                startActivity(Intent.createChooser(sharingIntent,"Study materials"));
                break;
            case R.id.news:
                Intent newsIntent=new Intent(Intent.ACTION_SEND);
                Intent i=new Intent(SecondActivity.this,newsWebPage.class);
                startActivity(i);

        }
        return super.onOptionsItemSelected(item);
    }
}


