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
private Button stop ;
private TextView count;
private int count1=0;
Thread counterThread;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.start);
        count = findViewById(R.id.count);
        stop = findViewById(R.id.stop);
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    counterThread=new Thread(() ->{
                        try {
                            while (true) {
                                count1++;
                                count.setText(count1+"");
                                Thread.sleep(1000);
                            }
                        }
                        catch (Exception e) {
                        }

                    });

                }
            });
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    counterThread.interrupt();

                }
            });

    }

}