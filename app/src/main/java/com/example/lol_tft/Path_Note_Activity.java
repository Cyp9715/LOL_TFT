package com.example.lol_tft;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Path_Note_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.path_note);
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
                finish();
            }
        });

        btn_champion.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_champion = new Intent(getApplicationContext(), Champion_Activity.class);
                startActivity(intent_champion);
                overridePendingTransition(0, 0);
                finish();
            }
        });

        btn_synergy.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_synergy = new Intent(getApplicationContext(), Synergy_Activity.class);
                startActivity(intent_synergy);
                overridePendingTransition(0, 0);
                finish();
            }
        });


        synergy_combine.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_synergy_combine = new Intent(getApplicationContext(), Synergy_Combine_Activity.class);
                startActivity(intent_synergy_combine);
                overridePendingTransition(0, 0);
                finish();
            }
        });


        btn_path_note.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent path_note = new Intent(getApplicationContext(), Path_Note_Activity.class);
                startActivity(path_note);
                overridePendingTransition(0, 0);
                finish();
            }
        });

    }
}
