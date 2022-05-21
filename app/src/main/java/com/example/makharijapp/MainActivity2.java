package com.example.makharijapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t = findViewById(R.id.textView);

        Intent i = getIntent();
        String get = i.getStringExtra("id");
        if(get.equals("mak1"))
        {
            t.setText("أ ة");
            ImageView img = (ImageView) findViewById(R.id.mk1);
            img.setVisibility(View.VISIBLE);

        }
        else if( get.equals("mak2"))
        {
            t.setText("ع ح");
            ImageView img = (ImageView) findViewById(R.id.mk2);
            img.setVisibility(View.VISIBLE);

        }

    }
}