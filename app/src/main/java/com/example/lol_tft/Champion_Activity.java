package com.example.lol_tft;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;

public class Champion_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.champion);
        Button btn_percentage = findViewById(R.id.btn_percentage);
        Button btn_champion = findViewById(R.id.btn_champion);
        Button btn_synergy = findViewById(R.id.btn_synergy);
        Button synergy_combine = findViewById(R.id.btn_synergy_combine);
        Button btn_path_note = findViewById(R.id.btn_path_note);
        ImageButton btn_champion_orrn = findViewById(R.id.btn_champion_orrn);
        ImageButton btn_champion_diana = findViewById(R.id.btn_champion_diana);


        // MENU CLICK LISTENER
        btn_percentage.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_percentage = new Intent(getApplicationContext(), Percentage_Activity.class);
                startActivity(intent_percentage);
                finish();
                overridePendingTransition(0, 0);
            }
        });

        btn_champion.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_champion = new Intent(getApplicationContext(), Champion_Activity.class);
                startActivity(intent_champion);
                finish();
                overridePendingTransition(0, 0);
            }
        });

        btn_synergy.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_synergy = new Intent(getApplicationContext(), Synergy_Activity.class);
                startActivity(intent_synergy);
                finish();
                overridePendingTransition(0, 0);
            }
        });


        synergy_combine.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_synergy_combine = new Intent(getApplicationContext(), Synergy_Combine_Activity.class);
                startActivity(intent_synergy_combine);
                finish();
                overridePendingTransition(0, 0);
            }
        });


        btn_path_note.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent path_note = new Intent(getApplicationContext(), Path_Note_Activity.class);
                startActivity(path_note);
                finish();
                overridePendingTransition(0, 0);
            }
        });




        btn_champion_orrn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_orrn;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_diana.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_diana;
                Champion_popup(view, champion_popup_page);
            }
        });




    }

    public void Champion_popup(View view, int champion_popup_page){
            LayoutInflater inflater = (LayoutInflater)
                    getSystemService(LAYOUT_INFLATER_SERVICE);
            View popupView = inflater.inflate(champion_popup_page, null);

            int width = LinearLayout.LayoutParams.MATCH_PARENT;
            int height = LinearLayout.LayoutParams.WRAP_CONTENT;
            boolean focusable = true;
            final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
            popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    }
}
