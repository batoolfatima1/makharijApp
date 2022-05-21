package com.example.makharijapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LauncherPage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_page);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.learn:
                Intent i1 = new Intent(LauncherPage.this, MainActivity.class);
                startActivity(i1);
                break;
            case R.id.quiz:
                break;
            case R.id.repo:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/batoolfatima1/makharijApp") );
                startActivity(i3);
                break;
        }
    }
}