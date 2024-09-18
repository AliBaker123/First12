package com.example.prepare12;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private Button start;
private Button stop = findViewById(R.id.stop);
private TextView count;
private boolean isCom=true;
private int count1=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        count=findViewById(R.id.count);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(isCom==true){
                    count1++;
                    count.setText(String.valueOf(count1));
                }
            }
        });
      stop.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              isCom=false;

          }
      });
    }
}