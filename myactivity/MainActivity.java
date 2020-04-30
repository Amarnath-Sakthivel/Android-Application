package com.example.myactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.syllabus_button);
        b2=findViewById(R.id.share_button);
        b3=findViewById(R.id.news);

        Toast.makeText(MainActivity.this,"Welcome to GeeksStudy",Toast.LENGTH_SHORT).cancel();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
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
                String sharebody="Geeks study.com";
                String bodySubject="www.gooogle.com";
                sharingIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT,bodySubject);
                startActivity(Intent.createChooser(sharingIntent,"Geeks Study"));
                break;
            case R.id.news:
        }
        return super.onOptionsItemSelected(item);
    }
}
