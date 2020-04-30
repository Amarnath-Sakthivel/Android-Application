package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishAcitivity extends AppCompatActivity implements View.OnClickListener{
   private Button eb1,eb2,eb3,eb4,eb5,eb6,eb7,eb8,eb9,eb10;
   private String[] url=new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_acitivity);

        eb1=findViewById(R.id.rc);
        eb2=findViewById(R.id.ct);
        eb3=findViewById(R.id.pj);
        eb4=findViewById(R.id.miscellaenous);
        eb5=findViewById(R.id.fb);
        eb6=findViewById(R.id.es);
        eb7=findViewById(R.id.pc);
        eb8=findViewById(R.id.vocal);
        eb9=findViewById(R.id.va);

        eb1.setOnClickListener(this);
        eb2.setOnClickListener(this);
        eb3.setOnClickListener(this);
        eb4.setOnClickListener(this);
        eb5.setOnClickListener(this);
        eb6.setOnClickListener(this);
        eb7.setOnClickListener(this);
        eb8.setOnClickListener(this);
        eb9.setOnClickListener(this);

        url[0]=" https://www.bankersadda.com/english-reading-comprehension/";
        url[1]="https://study.com/academy/lesson/cloze-procedure-technique-and-definition.html";
        url[2]="https://www.hitbullseye.com/Verbal/parajumbles.php";
        url[3]="https://www.yourdictionary.com/miscellaneous ";
        url[4]="https://www.bankersadda.com/important-tricks-fill-in-blanks-bankssc/ ";
        url[5]=" https://testbook.com/blog/26-tips-for-spotting-errors-in-english-for-sbi-po/";
        url[6]=" https://www.pinterest.com/pin/688910074223281258/";
        url[7]=" https://www.jagranjosh.com/articles/english-vocabulary-for-bank-exams-1529498979-1";
        url[8]="https://www.tutorialspoint.com/verbal_ability/verbal_ability_overview.htm";



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rc:
                Intent intent=new Intent(EnglishAcitivity.this,englishWebPage.class);
                intent.putExtra("english",url[0]);
                startActivity(intent);
                break;
            case R.id.ct:
                intent = new Intent(EnglishAcitivity.this, englishWebPage.class);
                intent.putExtra("english",url[1]);
                startActivity(intent);
                break;

            case R.id.pj:
                 intent=new Intent(EnglishAcitivity.this,englishWebPage.class);
                intent.putExtra("english",url[2]);
                startActivity(intent);
                break;

            case R.id.miscellaenous:
                intent=new Intent(EnglishAcitivity.this,englishWebPage.class);
                intent.putExtra("english",url[3]);
                startActivity(intent);
                break;

            case R.id.fb:
                 intent=new Intent(EnglishAcitivity.this,englishWebPage.class);
                intent.putExtra("english",url[4]);
                startActivity(intent);
                break;

            case R.id.es:
                intent=new Intent(EnglishAcitivity.this,englishWebPage.class);
                intent.putExtra("english",url[5]);
                startActivity(intent);
                break;

            case R.id.pc:
                intent=new Intent(EnglishAcitivity.this,englishWebPage.class);
                intent.putExtra("english",url[6]);
                startActivity(intent);
                break;

            case R.id.vocal:
                intent=new Intent(EnglishAcitivity.this,englishWebPage.class);
                intent.putExtra("english",url[7]);
                startActivity(intent);
                break;

            case R.id.va:
                intent=new Intent(EnglishAcitivity.this,englishWebPage.class);
                intent.putExtra("english",url[8]);
                startActivity(intent);
                break;


        }

    }
}
