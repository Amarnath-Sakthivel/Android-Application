package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComputerActivity extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    String[] url = new String[11];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        b1 = findViewById(R.id.internet);
        b2 = findViewById(R.id.memory);
        b3 = findViewById(R.id.keyboardshortcuts);
        b4 = findViewById(R.id.dbms);
        b5 = findViewById(R.id.ms);
        b6 = findViewById(R.id.networking);
        b7 = findViewById(R.id.cs);
        b8 = findViewById(R.id.hardware);
        b9 = findViewById(R.id.syllogism);
        b10 = findViewById(R.id.compabs);
        b11=findViewById(R.id.os);
        url[0] = " https://www.institutionforsavings.com/internet-banking-faqs.htm";
        url[1] = "https://www.studyadda.com/question-bank/4th-class/computers/computer-memories/self-test-2/672 ";
        url[2] = "https://support.microsoft.com/en-in/help/12445/windows-keyboard-shortcuts ";
        url[3] = " https://www.geeksforgeeks.org/introduction-of-dbms-database-management-system-set-1/";
        url[4] = " https://en.m.wikipedia.org/wiki/Microsoft_Word";
        url[5] = " https://www.geeksforgeeks.org/basics-computer-networking/";
        url[6] = "https://www.sciencedaily.com/terms/computer_software.htm ";
        url[7] = "https://en.m.wikipedia.org/wiki/Computer_hardware ";
        url[8] = "https://www.chtips.com/computer-fundamentals/what-is-computer-fundamentals ";
        url[9] = "https://www.tutorialspoint.com/basics_of_computer_science/basics_of_computer_science_abbreviations.htm ";
        url[10]="https://en.m.wikipedia.org/wiki/Operating_system ";

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[0]);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[1]);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[2]);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[3]);
                startActivity(intent);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[4]);
                startActivity(intent);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[5]);
                startActivity(intent);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[6]);
                startActivity(intent);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[7]);
                startActivity(intent);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[8]);
                startActivity(intent);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[9]);
                startActivity(intent);

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComputerActivity.this, ForthActivity.class);
                intent.putExtra("computer", url[10]);
                startActivity(intent);

            }
        });
    }
}