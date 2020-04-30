package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

public class ZeroActitvity extends AppCompatActivity {

    private static int TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zero_actitvity);
        Toast.makeText(ZeroActitvity.this,"Welcome to GeeksStudy",Toast.LENGTH_SHORT).show();
         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ZeroActitvity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME_OUT);

    }
}
