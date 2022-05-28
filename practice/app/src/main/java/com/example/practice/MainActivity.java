package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b = (Button) findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
                {

                    Uri uri =  Uri.parse("tel:+923328418357");
                    Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                    startActivity(intent);
                }

        });


    }


}