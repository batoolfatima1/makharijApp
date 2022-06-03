package com.example.makharijapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondMainActivity extends AppCompatActivity implements View.OnClickListener
{
    String[] array ={"أ ة","ع ح","غ خ","ق ","ك ","ج ش ى","ض ","ل  ","ن ","ر ","ط د ت","ظ  ذ  ث","ص ز س","م ن","ف","ب م و ","باَ بوُ بىِ"};
    Button opt2,opt1,opt3,submit;
    int totalQuestions = Quiz.questions.length;
    int index;
    String item, answer;
    TextView ans;
    ImageView image;
    int currentQuestion = 0, score =0;
    String selectedAnswer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        opt2 = (Button)findViewById(R.id.option2);
        opt1 =(Button)findViewById(R.id.option1);
        opt3 = findViewById(R.id.option3);
        //ans = findViewById(R.id.ans);
        image=findViewById(R.id.image);
        submit=findViewById(R.id.submit);

        opt1.setOnClickListener(this);
        opt2.setOnClickListener(this);
        opt3.setOnClickListener(this);
        submit.setOnClickListener(this);

        LoadNewQuestion();

    }
  @Override
   public void onClick(View view)
  {
      opt1.setBackgroundColor(getResources().getColor( R.color.btnColor));
      opt2.setBackgroundColor(getResources().getColor( R.color.btnColor));
      opt3.setBackgroundColor(getResources().getColor( R.color.btnColor));

      Button clickedButton = (Button) view;

      if(clickedButton.getId() == R.id.submit)
      {
          if(selectedAnswer.equals(Quiz.answers[currentQuestion])){
              score++;
          }
          currentQuestion++;
          LoadNewQuestion();
      }
      else
      {
          selectedAnswer = clickedButton.getText().toString();
          clickedButton.setBackgroundColor(Color.BLACK);
      }
//
//        switch(v.getId())
//        {
//            case R.id.option3:
//                back.setEnabled(true);
//                item  = btn.getText().toString();
//                for (int i = 0; i < array.length; i++)
//                {
//                    if (item.equals(array[i]))
//                        index= i;
//                }
//                if(index == array.length-1)
//                {
//                    next.setEnabled(false);
//                }
//                else
//                {
//                    item = array[index+1];
//                    btn.setText(array[index+1]);
//                    next.setEnabled(true);
//                }
//
//                break;
//            case R.id.option1:
//                item  = btn.getText().toString();
//
//                for (int i = 0; i < array.length; i++)
//                {
//                    if (item.equals(array[i]))
//                        index= i;
//                }
//                if(index == 0)
//                {
//                    back.setEnabled(false);
//                }
//                else
//                {
//                    item = array[index-1];
//                    btn.setText(array[index-1]);
//                    next.setEnabled(true);
//                    back.setEnabled(true);
//                }
//
//                break;
//            case R.id.option2:
//                item  = btn.getText().toString();
//                if(item.equals(array[15]))
//                {
//                    answer = "CORRECT";
//                    ans.setText(answer);
////                    i1.setVisibility(View.GONE);
////                    i2.setVisibility(View.VISIBLE);
//                }
//                else
//                {
//                    answer = "INCORRECT";
//                    ans.setText(answer);
////                    i1.setVisibility(View.GONE);
////                    i2.setVisibility(View.VISIBLE);
//                }
//                next.setClickable(false);
//                back.setClickable(false);
//                btn.setClickable(false);
//        }
   }
//    @Override
//
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//
//        super.onSaveInstanceState(savedInstanceState);
//
//        savedInstanceState.putString("btnValue",btn.getText().toString());
//        savedInstanceState.putString("answer",ans.getText().toString());
//    }

//    @Override
//
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        item = savedInstanceState.getString("btnValue");
//        answer = savedInstanceState.getString("answer");
//        ans.setText(answer);
//        btn.setText(item);
//    }


    public void LoadNewQuestion()
    {
        if(currentQuestion == totalQuestions ){
            finishQuiz();
            return;
        }
        image.setImageResource(Quiz.questions[currentQuestion]);
        opt1.setText(Quiz.options[currentQuestion][0]);
        opt2.setText(Quiz.options[currentQuestion][1]);
        opt3.setText(Quiz.options[currentQuestion][2]);

    }
    public void finishQuiz()
    {
        String passStatus = "";
        if(score > totalQuestions*0.60){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestions)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();

    }
    public void restartQuiz()
    {
        score = 0;
        currentQuestion =0;
        LoadNewQuestion();
    }
}