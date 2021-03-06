package com.example.makharijapp;

import androidx.annotation.NonNull;
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
//    String[] array ={"أ ة","ع ح","غ خ","ق ","ك ","ج ش ى","ض ","ل  ","ن ","ر ","ط د ت","ظ  ذ  ث","ص ز س","م ن","ف","ب م و ","باَ بوُ بىِ"};
    Button opt2,opt1,opt3,submit;
    int totalQuestions = Quiz.questions.length;
    String Clicked ;
    ImageView image;
    int currentQuestion , score ;
    String selectedAnswer="";
    Boolean select;
    TextView questionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        opt2 = (Button)findViewById(R.id.option2);
        opt1 =(Button)findViewById(R.id.option1);
        opt3 = findViewById(R.id.option3);
        questionBar= findViewById(R.id.numberbar);

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
          if(select == false)
          {
              new AlertDialog.Builder(this)
                      .setTitle("Select option")
                      .setMessage("Select option before submitting")
                      .show();
          }
          else
          {
              if (selectedAnswer.equals(Quiz.answers[currentQuestion])) {
                  score++;
              }
              currentQuestion++;
              LoadNewQuestion();
          }
      }
      else
      {
          selectedAnswer = clickedButton.getText().toString();
          select = true;
          clickedButton.setBackgroundColor(Color.BLACK);
          Clicked = clickedButton.getText().toString();
      }

   }

    @Override

    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("currentQuestion",currentQuestion);
        savedInstanceState.putInt("score",score);
        savedInstanceState.putString("SelectedAnswer",selectedAnswer);
        savedInstanceState.putString("SelectedButton",Clicked);
        savedInstanceState.putBoolean("select",select);

    }

    @Override

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        currentQuestion=savedInstanceState.getInt("currentQuestion");

        score=savedInstanceState.getInt("score");

        selectedAnswer = savedInstanceState.getString("SelectedAnswer");

        Clicked = savedInstanceState.getString("SelectedButton");


        LoadNewQuestion();

        if(opt1.getText().toString().equals(Clicked))
        {
            opt1.setBackgroundColor(Color.BLACK);
        }
        else  if(opt2.getText().toString().equals(Clicked))
        {
            opt2.setBackgroundColor(Color.BLACK);
        }
        else  if(opt3.getText().toString().equals(Clicked))
        {
            opt3.setBackgroundColor(Color.BLACK);
        }
        select = savedInstanceState.getBoolean("select");

    }


    public void LoadNewQuestion()
    {
        select = false;
        if(currentQuestion == totalQuestions ){
            finishQuiz();
            return;
        }
        String s = (currentQuestion+1)+"/"+totalQuestions;
        questionBar.setText(s);
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