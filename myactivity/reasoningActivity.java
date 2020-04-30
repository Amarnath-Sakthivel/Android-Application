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

public class reasoningActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13;
    private String[] url = new String[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reasoning);

        btn1 = findViewById(R.id.as);
        btn2 = findViewById(R.id.ds);
        btn3 = findViewById(R.id.ci);
        btn4 = findViewById(R.id.csa);
        btn5 = findViewById(R.id.puzzle);
        btn6 = findViewById(R.id.tab);
        btn7 = findViewById(R.id.syllogism);
        btn8 = findViewById(R.id.br);
        btn9 = findViewById(R.id.io);
        btn10 = findViewById(R.id.cd);
        btn11 = findViewById(R.id.rd);
        btn12 = findViewById(R.id.lsa);
        btn13 = findViewById(R.id.dl);



        url[0] = "https://byjus.com/free-cat-prep/alphanumeric-series-for-cat-logical-reasoning/";
        url[1] = " https://www.hitbullseye.com/Data-Sufficiency-Questions-with-Answers.php";
        url[2] = "https://www.toppr.com/guides/quantitative-aptitude/inequalities/coded-inequalities/ ";
        url[3] = "https://testbook.com/blog/how-to-approach-circular-arrangement-problems-part-i/ ";
        url[4] = " https://www.codechef.com/wiki/tutorial-puzzle-game";
        url[5] = " https://bankexamportal.com/study-material/data-interpretation/tabulation";
        url[6] = "https://www.tutorialspoint.com/reasoning/reasoning_syllogism.htm ";
        url[7] = " https://www.tutorialspoint.com/reasoning/reasoning_blood_relationship.htm";
        url[8] = " https://testbook.com/blog/time-saving-short-tricks-for-input-output-in-reasoning/";
        url[9] = "https://www.basictell.com/reasoning/coding-decoding.html";
        url[10] = " https://www.tutorialspoint.com/reasoning/reasoning_ranking_and_order.htm";
        url[11] = "https://www.indiabix.com/verbal-reasoning/seating-arrangement/044001 ";
        url[12] = " https://gradeup.co/tips-for-seating-arrangement-and-puzzles-i-b102a730-910a-11e6-9d0e-c0cb799a38c2";


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[0]);
                startActivity(intent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[1]);
                startActivity(intent);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[2]);
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[3]);
                startActivity(intent);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[4]);
                startActivity(intent);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[5]);
                startActivity(intent);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[6]);
                startActivity(intent);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[7]);
                startActivity(intent);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[8]);
                startActivity(intent);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[9]);
                startActivity(intent);

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[10]);
                startActivity(intent);

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[11]);
                startActivity(intent);

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reasoningActivity.this, reasonWebPage.class);
                intent.putExtra("reasoning", url[12]);
                startActivity(intent);

            }
        });

    }
}

