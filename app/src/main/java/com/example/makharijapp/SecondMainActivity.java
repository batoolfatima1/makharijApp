package com.example.makharijapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondMainActivity extends AppCompatActivity implements View.OnClickListener
{
    String[] array ={"أ ة","ع ح","غ خ","ق ","ك ","ج ش ى","ض ","ل  ","ن ","ر ","ط د ت","ظ  ذ  ث","ص ز س","م ن","ف","ب م و ","باَ بوُ بىِ"};
    Button btn,back,next;
    int index;
    String item, answer;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        btn = (Button)findViewById(R.id.confirm);
        back =(Button)findViewById(R.id.back);
        next = findViewById(R.id.next);
        ans = findViewById(R.id.ans);

    }
    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.next:
                back.setEnabled(true);
                item  = btn.getText().toString();
                for (int i = 0; i < array.length; i++)
                {
                    if (item.equals(array[i]))
                        index= i;
                }
                if(index == array.length-1)
                {
                    next.setEnabled(false);
                }
                else
                {
                    item = array[index+1];
                    btn.setText(array[index+1]);
                }

                break;
            case R.id.back:
                item  = btn.getText().toString();

                for (int i = 0; i < array.length; i++)
                {
                    if (item.equals(array[i]))
                        index= i;
                }
                if(index == 0)
                {
                    back.setEnabled(false);
                }
                else
                {
                    item = array[index-1];
                    btn.setText(array[index-1]);
                }

                break;
            case R.id.confirm:
                item  = btn.getText().toString();
                if(item.equals(array[15]))
                {
                    answer = "CORRECT";
                    ans.setText(answer);
                }
                else
                {
                    answer = "INCORRECT";
                    ans.setText(answer);
                }
                next.setClickable(false);
                back.setClickable(false);
                btn.setClickable(false);
        }
    }
    @Override

    public void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString("btnValue",btn.getText().toString());
        savedInstanceState.putString("answer",ans.getText().toString());
    }

    @Override

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        item = savedInstanceState.getString("btnValue");
        answer = savedInstanceState.getString("answer");
        ans.setText(answer);
        btn.setText(item);
    }
}