package com.example.makharijapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity { //implements View.OnClickListener

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.listview);

        ArrayList<Mukharij> arrayList = new ArrayList<Mukharij>();
        arrayList.add(new Mukharij("أ ة",1));
        arrayList.add(new Mukharij("ع ح",2));
        arrayList.add(new Mukharij("غ خ",3));
        arrayList.add(new Mukharij("ق ",4));
        arrayList.add(new Mukharij("ك ",5));
        arrayList.add(new Mukharij("ج ش ى",6));
        arrayList.add(new Mukharij("ض ",7));
        arrayList.add(new Mukharij("ل ",8));
        arrayList.add(new Mukharij("ن",9));
        arrayList.add(new Mukharij("ر",10));
        arrayList.add(new Mukharij("ط د ت",11));
        arrayList.add(new Mukharij("ظ  ذ  ث",12));
        arrayList.add(new Mukharij("ص ز س",13));
        arrayList.add(new Mukharij("م ن",14));
        arrayList.add(new Mukharij("ف",15));
        arrayList.add(new Mukharij("ب م و",16));
        arrayList.add(new Mukharij("باَ بوُ بى",17));




        ListAdapter adapter = new ListAdapter(this,arrayList);
        list.setAdapter(adapter);

    }

//    @Override
//    public void onClick(View v) {
//
//        switch (v.getId( )) {
//
//            case R.id.mak1:
//                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//                intent.putExtra("id","mak1");
//                startActivity(intent);
//                break;
//            case R.id.mak2:
//                Intent intent2 = new Intent(MainActivity.this,MainActivity2.class);
//                intent2.putExtra("id","mak2");
//                startActivity(intent2);
//                break;
//
//            case R.id.mak3:
//                Intent intent3 = new Intent(MainActivity.this,MainActivity2.class);
//                intent3.putExtra("id","mak3");
//                startActivity(intent3);
//                break;
//
//            case R.id.mak4:
//                Intent intent4 = new Intent(MainActivity.this,MainActivity2.class);
//                intent4.putExtra("id","mak4");
//                startActivity(intent4);
//                break;
//
//            case R.id.mak5:
//                Intent intent5 = new Intent(MainActivity.this,MainActivity2.class);
//                intent5.putExtra("id","mak5");
//                startActivity(intent5);
//                break;
//
//            case R.id.mak6:
//                Intent intent6 = new Intent(MainActivity.this,MainActivity2.class);
//                intent6.putExtra("id","mak6");
//                startActivity(intent6);
//                break;
//
//            case R.id.mak7:
//                Intent intent7 = new Intent(MainActivity.this,MainActivity2.class);
//                intent7.putExtra("id","mak7");
//                startActivity(intent7);
//                break;
//
//            case R.id.mak8:
//                Intent intent8 = new Intent(MainActivity.this,MainActivity2.class);
//                intent8.putExtra("id","mak8");
//                startActivity(intent8);
//                break;
//
//            case R.id.mak9:
//                Intent intent9 = new Intent(MainActivity.this,MainActivity2.class);
//                intent9.putExtra("id","mak9");
//                startActivity(intent9);
//                break;
//
//            case R.id.mak10:
//                Intent intent10 = new Intent(MainActivity.this,MainActivity2.class);
//                intent10.putExtra("id","mak10");
//                startActivity(intent10);
//                break;
//            case R.id.mak11:
//                Intent intent11 = new Intent(MainActivity.this,MainActivity2.class);
//                intent11.putExtra("id","mak11");
//                startActivity(intent11);
//                break;
//            case R.id.mak12:
//                Intent intent12 = new Intent(MainActivity.this,MainActivity2.class);
//                intent12.putExtra("id","mak12");
//                startActivity(intent12);
//                break;
//            case R.id.mak13:
//                Intent intent13 = new Intent(MainActivity.this,MainActivity2.class);
//                intent13.putExtra("id","mak13");
//                startActivity(intent13);
//                break;
//            case R.id.mak14:
//                Intent intent14 = new Intent(MainActivity.this,MainActivity2.class);
//                intent14.putExtra("id","mak14");
//                startActivity(intent14);
//                break;
//            case R.id.mak15:
//                Intent intent15 = new Intent(MainActivity.this,MainActivity2.class);
//                intent15.putExtra("id","mak15");
//                startActivity(intent15);
//                break;
//            case R.id.mak16:
//                Intent intent16 = new Intent(MainActivity.this,MainActivity2.class);
//                intent16.putExtra("id","mak16");
//                startActivity(intent16);
//                break;
//            case R.id.mak17:
//                Intent intent17 = new Intent(MainActivity.this,MainActivity2.class);
//                intent17.putExtra("id","mak17");
//                startActivity(intent17);
//                break;
//        }
//
//    }




}