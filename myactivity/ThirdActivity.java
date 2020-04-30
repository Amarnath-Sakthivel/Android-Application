package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private String[] url=new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        b1=findViewById(R.id.ibps_po);
        b2=findViewById(R.id.rrb_po_clerical);
        b3=findViewById(R.id.ibps_sbi_specialist);
        b4=findViewById(R.id.sbi_po_clerical);
        b5=findViewById(R.id.cobank_po_clerk);
        b6=findViewById(R.id.rbi_assistant);
        b7=findViewById(R.id.rbi_gradeB);
        b8=findViewById(R.id.scale2);
        b9=findViewById(R.id.nabarad_assistant);


        url[0]="https://www.bankersadda.com/ibps-clerk-previous-year-papers-2015-2018-download-now/";
        url[1]=" https://cracku.in/ibps-rrb-clerk-previous-papers";
        url[2]="https://www.recruitment.guru/previous-papers/ibps-so-previous-papers/";
        url[3]="https://cracku.in/sbi-po-previous-papers";
        url[4]="https://www.recruitment.guru/previous-papers/tamilnadu-cooperative-bank-previous-papers/";
        url[5]=" https://www.freshersnow.com/rbi-assistant-mains-previous-question-papers/";
        url[6]="https://gradeup.co/rbi-grade-b-question-paper-i";
        url[7]="https://www.ibpsclub.com/ibps-rrb-officer-scale-1-2-3-previous-question-papers/ ";
        url[8]=" https://www.recruitment.guru/nabard-development-assistant-previous-papers/";

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
                Intent intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[0]);
                startActivity(intent);
                break;
            case R.id.rrb_po_clerical:
                intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[1]);
                startActivity(intent);
                break;
            case R.id.ibps_sbi_specialist:
                intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[2]);
                startActivity(intent);
                break;
            case R.id.sbi_po_clerical:
                intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[3]);
                startActivity(intent);
                break;
            case R.id.cobank_po_clerk:
                intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[4]);
                startActivity(intent);
                break;
            case R.id.rbi_assistant:
                intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[5]);
                startActivity(intent);
                break;
            case R.id.rbi_gradeB:
                intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[6]);
                startActivity(intent);
                break;
            case R.id.scale2:
                intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[7]);
                startActivity(intent);
                break;
            case R.id.nabarad_assistant:
                intent=new Intent(ThirdActivity.this, questionActivity.class);
                intent.putExtra("question",url[8]);
                startActivity(intent);
                break;
        }

    }

}

