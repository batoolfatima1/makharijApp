package com.example.makharijapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondMainActivity extends AppCompatActivity implements View.OnClickListener
{
    String[] array = {"أ ة ","ع ح","غ خ","ق ","ك ","ج ش ى","ض ","ل  ","ن ","ر ","ط د ت","ظ  ذ  ث","ص ز س","م ن","ف","ب م و ","باَ بوُ بىِ"};

    Button btn = (Button)findViewById(R.id.button2);
    int index=99;
    String item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);


        btn.setText(array[0]);
        Button beck = (Button) findViewById(R.id.back);
        beck.setEnabled(false);
    }


    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.next:
                item  = btn.getText().toString();
                for (int i = 0; i < array.length; i++)
                {
                    if (item.equals(array[i]))
                        index= i;
                }
                btn.setText(array[index+1]);
                break;
            case R.id.back:
                item  = btn.getText().toString();

                for (int i = 0; i < array.length; i++)
                {
                    if (item.equals(array[i]))
                        index= i;
                }
                btn.setText(array[index-1]);
                break;
        }
    }

}