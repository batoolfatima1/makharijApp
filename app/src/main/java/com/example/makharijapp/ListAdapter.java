package com.example.makharijapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Mukharij> {

    public ListAdapter(@NonNull Context context, ArrayList<Mukharij> mukharijsBtn) {
        super(context, 0,mukharijsBtn);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Mukharij mukharij = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.listlayout,parent,false);
        Button button = convertView.findViewById(R.id.btn);
        button.setText(mukharij.getName());
        button.setId(mukharij.getId());

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (button.getId())
                {
                    case 1:
                        Intent intent = new Intent(getContext(),MainActivity2.class);
                        intent.putExtra("id","mak1");
                        getContext().startActivity(intent);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getContext(),MainActivity2.class);
                        intent2.putExtra("id","mak2");
                        getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getContext(),MainActivity2.class);
                        intent3.putExtra("id","mak3");
                        getContext().startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getContext(),MainActivity2.class);
                        intent4.putExtra("id","mak4");
                        getContext().startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getContext(),MainActivity2.class);
                        intent5.putExtra("id","mak5");
                        getContext().startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(getContext(),MainActivity2.class);
                        intent6.putExtra("id","mak6");
                        getContext().startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(getContext(),MainActivity2.class);
                        intent7.putExtra("id","mak7");
                        getContext().startActivity(intent7);
                        break;

                    case 8:
                        Intent intent8 = new Intent(getContext(),MainActivity2.class);
                        intent8.putExtra("id","mak8");
                        getContext().startActivity(intent8);
                        break;

                    case 9:
                        Intent intent9 = new Intent(getContext(),MainActivity2.class);
                        intent9.putExtra("id","mak9");
                        getContext().startActivity(intent9);
                        break;

                    case 10:
                        Intent intent10 = new Intent(getContext(),MainActivity2.class);
                        intent10.putExtra("id","mak10");
                        getContext().startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getContext(),MainActivity2.class);
                        intent11.putExtra("id","mak11");
                        getContext().startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getContext(),MainActivity2.class);
                        intent12.putExtra("id","mak12");
                        getContext().startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getContext(),MainActivity2.class);
                        intent13.putExtra("id","mak13");
                        getContext().startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getContext(),MainActivity2.class);
                        intent14.putExtra("id","mak14");
                        getContext().startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getContext(),MainActivity2.class);
                        intent15.putExtra("id","mak15");
                        getContext().startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getContext(),MainActivity2.class);
                        intent16.putExtra("id","mak16");
                        getContext().startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(getContext(),MainActivity2.class);
                        intent17.putExtra("id","mak17");
                        getContext().startActivity(intent17);
                        break;
                }

            }
        });

        return convertView;
    }
}
