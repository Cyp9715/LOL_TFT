package com.example.lol_tft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_percentage = findViewById(R.id.btn_percentage);
        Button btn_champion = findViewById(R.id.btn_champion);
        Button btn_synergy = findViewById(R.id.btn_synergy);
        Button synergy_combine = findViewById(R.id.btn_synergy_combine);
        Button btn_path_note = findViewById(R.id.btn_path_note);


        btn_percentage.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_percentage = new Intent(getApplicationContext(), Percentage_Activity.class);
                startActivity(intent_percentage);
                overridePendingTransition(0, 0);
            }
        });

        btn_champion.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_champion = new Intent(getApplicationContext(), Champion_Activity.class);
                startActivity(intent_champion);
            }
        });

        btn_synergy.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_synergy = new Intent(getApplicationContext(), Synergy_Activity.class);
                startActivity(intent_synergy);
            }
        });


        synergy_combine.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_synergy_combine = new Intent(getApplicationContext(), Synergy_Combine_Activity.class);
                startActivity(intent_synergy_combine);
            }
        });


        btn_path_note.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent path_note = new Intent(getApplicationContext(), Path_Note_Activity.class);
                startActivity(path_note);
            }
        });


    }
}
