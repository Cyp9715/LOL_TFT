package com.example.lol_tft;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Path_Note_Activity extends AppCompatActivity {

    private WebSettings webview_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_note);
        Button btn_champion = findViewById(R.id.btn_champion);
        Button btn_synergy = findViewById(R.id.btn_synergy);
        Button btn_item = findViewById(R.id.btn_item);
        Button btn_path_note = findViewById(R.id.btn_path_note);

        WebView path_webview = findViewById(R.id.path_webview);

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


        btn_item.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_synergy_combine = new Intent(getApplicationContext(), Item_Activity.class);
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




        path_webview.setWebViewClient(new WebViewClient());
        webview_setting = path_webview.getSettings();
        webview_setting.setJavaScriptEnabled(true);
        path_webview.loadUrl("https://www.leagueoflegends.co.kr/ko/update/patchnote/");

    }
}
