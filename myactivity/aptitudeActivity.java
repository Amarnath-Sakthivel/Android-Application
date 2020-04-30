package com.example.myactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class aptitudeActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    String[] url=new String[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);

        b0=findViewById(R.id.simplification);
        b1=findViewById(R.id.profit_loss);
        b2 = findViewById(R.id.sc_interest);
        b3 = findViewById(R.id.work_time);
        b4 = findViewById(R.id.time_distance);
        b5 = findViewById(R.id.mensuration);
        b6 = findViewById(R.id.data_interpretation);
        b7 = findViewById(R.id.ratio_proportion);
        b8 = findViewById(R.id.numbers_system);
        b9 = findViewById(R.id.seq_series);
        b10 = findViewById(R.id.premutation_combination);
        b11 = findViewById(R.id.probality);
        b12 = findViewById(R.id.quad_equation);
        b13 = findViewById(R.id.data_sufficiency);
        b14 = findViewById(R.id.mixture_allegations);
        b15 = findViewById(R.id.surds_cards);

        url[0] = " https://gradeup.co/basics-of-simplification-i-92fb579e-5006-11e6-875a-aa9887a810df";
        url[1] = "https://www.indiabix.com/aptitude/profit-and-loss/";
        url[2] = "https://www.indiabix.com/aptitude/compound-interest/ ";
        url[3] = "https://www.hitbullseye.com/Time-and-Work-Questions.php ";
        url[4] = " https://www.indiabix.com/aptitude/time-and-distance/";
        url[5] = "https://www.math-shortcut-tricks.com/mensuration-methods/";
        url[6] = "https://www.indiabix.com/data-interpretation/questions-and-answers/";
        url[7] = " https://www.indiabix.com/aptitude/ratio-and-proportion/";
        url[8] = "https://www.indiabix.com/aptitude/problems-on-numbers/ ";
        url[9] = "https://www.onlinemathlearning.com/arithmetic-series-tutorial.html";
        url[10]="https://www.javatpoint.com/aptitude/permutation-and-combination ";
        url[11]=" https://www.indiabix.com/aptitude/probability/";
        url[12] = "https://www.toppr.com/guides/quantitative-aptitude/inequalities/quadratic-equations/ ";
        url[13]="https://www.indiabix.com/verbal-reasoning/data-sufficiency/ ";
        url[14]=" https://www.indiabix.com/aptitude/alligation-or-mixture/";
        url[15]="https://www.indiabix.com/aptitude/surds-and-indices/ ";

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this, NewsActivity.class);
                intent.putExtra("url", url[0]);
                startActivity(intent);
            }
        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this, NewsActivity.class);
                intent.putExtra("url", url[1]);
                startActivity(intent);
            }
            });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this, NewsActivity.class);
                intent.putExtra("url", url[2]);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this, NewsActivity.class);
                intent.putExtra("url", url[3]);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this, NewsActivity.class);
                intent.putExtra("url", url[4]);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[5]);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[6]);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[7]);
                startActivity(intent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this, NewsActivity.class);
                intent.putExtra("url", url[8]);
                startActivity(intent);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[9]);
                startActivity(intent);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this, NewsActivity.class);
                intent.putExtra("url", url[10]);
                startActivity(intent);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[11]);
                startActivity(intent);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[12]);
                startActivity(intent);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[13]);
                startActivity(intent);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[14]);
                startActivity(intent);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aptitudeActivity.this,  NewsActivity.class);
                intent.putExtra("url", url[15]);
                startActivity(intent);
            }
        });
    }
}


