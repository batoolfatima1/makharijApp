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
        else if( get.equals("mak3"))
        {
            t.setText("غ خ");
            ImageView img = (ImageView) findViewById(R.id.mk3);
            img.setVisibility(View.VISIBLE);

        }
        else if( get.equals("mak4"))
        {
            t.setText("ق");
            ImageView img = (ImageView) findViewById(R.id.mk4);
            img.setVisibility(View.VISIBLE);

        }
        else if( get.equals("mak5"))
        {
            t.setText("ك");
            ImageView img = (ImageView) findViewById(R.id.mk5);
            img.setVisibility(View.VISIBLE);

        }
        else if( get.equals("mak6"))
        {
            t.setText("ج ش ى");
            ImageView img = (ImageView) findViewById(R.id.mk6);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak7"))
        {
            t.setText("ض");
            ImageView img = (ImageView) findViewById(R.id.mk7);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak8"))
        {
            t.setText("ل ");
            ImageView img = (ImageView) findViewById(R.id.mk8);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak9"))
        {
            t.setText("ن");
            ImageView img = (ImageView) findViewById(R.id.mk9);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak10"))
        {
            t.setText("ر");
            ImageView img = (ImageView) findViewById(R.id.mk10);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak11"))
        {
            t.setText("ط د ت");
            ImageView img = (ImageView) findViewById(R.id.mk11);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak12"))
        {
            t.setText("ظ  ذ  ث ");
            ImageView img = (ImageView) findViewById(R.id.mk12);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak13"))
        {
            t.setText("ص ز س");
            ImageView img = (ImageView) findViewById(R.id.mk13);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak14"))
        {
            t.setText("م ن");
            ImageView img = (ImageView) findViewById(R.id.mk14);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak15"))
        {
            t.setText("ف");
            ImageView img = (ImageView) findViewById(R.id.mk15);
            img.setVisibility(View.VISIBLE);
        }
        else if( get.equals("mak16"))
        {
            t.setText("ب م و");
            ImageView img = (ImageView) findViewById(R.id.mk16);
            img.setVisibility(View.VISIBLE);
        }

        else if( get.equals("mak17"))
        {
            t.setText("باَ بوُ بىِ");
            ImageView img = (ImageView) findViewById(R.id.mk17);
            img.setVisibility(View.VISIBLE);
        }
    }
}