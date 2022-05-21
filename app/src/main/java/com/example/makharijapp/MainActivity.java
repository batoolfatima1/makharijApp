package com.example.makharijapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId( )) {

            case R.id.mak1:
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("id","mak1");
                startActivity(intent);
                break;
            case R.id.mak2:
                Intent intent2 = new Intent(MainActivity.this,MainActivity2.class);
                intent2.putExtra("id","mak2");
                startActivity(intent2);
                break;

        }

    }




}