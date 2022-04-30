package com.example.practiceandroidstudio;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Button button1 = findViewById(R.id.button1);

        TextView t=findViewById(R.id.textView);

button1.setText("text changed");
t.setText("good bye");
    }
}