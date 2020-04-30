package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class SyllabusActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private String[] url=new String[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        b1=findViewById(R.id.ibps_po);
        b2=findViewById(R.id.rrb_po_clerical);
        b3=findViewById(R.id.ibps_sbi_specialist);
        b4=findViewById(R.id.sbi_po_clerical);
        b5=findViewById(R.id.cobank_po_clerk);
        b6=findViewById(R.id.rbi_assistant);
        b7=findViewById(R.id.rbi_gradeB);
        b8=findViewById(R.id.scale2);
        b9=findViewById(R.id.nabarad_assistant);


        url[0]="https://prepp.in/ibps-clerk-exam/syllabus";
        url[1]="https://examupdates.in/rrb-clerk-syllabus/";
        url[2]="https://bankexamportal.com/ibps/specialist-officers/syllabus";
        url[3]="https://www.careerpower.in/sbi-clerk-syllabus.html";
        url[4]=" https://www.recruitment.guru/tamil-nadu-state-cooperative-bank-syllabus/";
        url[5]="https://www.careerpower.in/rbi-assistant-syllabus-exam-pattern.html";
        url[6]="https://byjus.com/rbi-grade-b-syllabus/ ";
        url[7]=" https://www.bankexamstoday.com/p/ibps-rrb-scale-2-and-3-exam-date.html";
        url[8]=" https://testbook.com/blog/nabard-syllabus/";

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ibps_po:
                Intent intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[0]);
                startActivity(intent);
                break;
            case R.id.rrb_po_clerical:
                 intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[1]);
                startActivity(intent);
                break;
            case R.id.ibps_sbi_specialist:
                intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[2]);
                startActivity(intent);
                break;
            case R.id.sbi_po_clerical:
                intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[3]);
                startActivity(intent);
                break;
            case R.id.cobank_po_clerk:
                intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[4]);
                startActivity(intent);
                break;
            case R.id.rbi_assistant:
                intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[5]);
                startActivity(intent);
                break;
            case R.id.rbi_gradeB:
                intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[6]);
                startActivity(intent);
                break;
            case R.id.scale2:
                intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[7]);
                startActivity(intent);
                break;
            case R.id.nabarad_assistant:
                intent=new Intent(SyllabusActivity.this, aptitude1.class);
                intent.putExtra("syllabus",url[8]);
                startActivity(intent);
                break;
        }

    }
}