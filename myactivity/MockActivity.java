package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MockActivity extends AppCompatActivity implements View.OnClickListener {
   private Button b1,b2,b3,b4,b5;
    private  String[] url=new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock);

        b1=findViewById(R.id.aptitude);
        b2=findViewById(R.id.reasoning_abitity);
        b3=findViewById(R.id.english_knowledge);
        b4=findViewById(R.id.general_science);
        b5=findViewById(R.id.comp_knowledge);

        url[0]=" https://gopract.com/Aptitude/aptitude-test-for-banks.aspx";
        url[1]="https://www.ibpsguide.com/logical-reasoning/ ";
        url[2]="https://gradeup.co/practice/quiz/banking-insurance/english ";
        url[3]="https://cracku.in/free-gk-tests ";
        url[4]="https://www.fresherslive.com/online-test/basic-computer-knowledge/questions-and-answers ";

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.aptitude:
                Intent intent=new Intent(MockActivity.this,mockWebPage.class);
                intent.putExtra("mock",url[0]);
                startActivity(intent);
                break;
            case R.id.reasoning_abitity:
                intent=new Intent(MockActivity.this,mockWebPage.class);
                intent.putExtra("mock",url[1]);
                startActivity(intent);
                break;
            case R.id.english_knowledge:
                intent=new Intent(MockActivity.this,mockWebPage.class);
                intent.putExtra("mock",url[2]);
                startActivity(intent);
                break;
            case R.id.general_science:
                intent=new Intent(MockActivity.this,mockWebPage.class);
                intent.putExtra("mock",url[3]);
                startActivity(intent);
                break;
            case R.id.comp_knowledge:
                intent=new Intent(MockActivity.this,mockWebPage.class);
                intent.putExtra("mock",url[4]);
                startActivity(intent);
                break;

        }

    }
}
