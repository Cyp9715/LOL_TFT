package com.example.lol_tft;

import android.content.Intent;
import android.os.Bundle;
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
        setContentView(R.layout.activity_champion);
        Button btn_champion = findViewById(R.id.btn_champion);
        Button btn_synergy = findViewById(R.id.btn_synergy);
        Button btn_item = findViewById(R.id.btn_item);
        Button btn_path_note = findViewById(R.id.btn_path_note);

        ImageButton btn_champion_orrn = findViewById(R.id.btn_champion_orrn);
        ImageButton btn_champion_diana = findViewById(R.id.btn_champion_diana);
        ImageButton btn_champion_zyra = findViewById(R.id.btn_champion_zyra);
        ImageButton btn_champion_warwick = findViewById(R.id.btn_champion_warwick);
        ImageButton btn_champion_ivern = findViewById(R.id.btn_champion_ivern);
        ImageButton btn_champion_kogmaw = findViewById(R.id.btn_champion_kogmaw);
        ImageButton btn_champion_nasus = findViewById(R.id.btn_champion_nasus);
        ImageButton btn_champion_vayne = findViewById(R.id.btn_champion_vayne);
        ImageButton btn_champion_maokai = findViewById(R.id.btn_champion_maokai);
        ImageButton btn_champion_renekton = findViewById(R.id.btn_champion_renekton);
        ImageButton btn_champion_vladimir = findViewById(R.id.btn_champion_vladimir);
        ImageButton btn_champion_taliyah = findViewById(R.id.btn_champion_taliyah);
        ImageButton btn_champion_leona = findViewById(R.id.btn_champion_leona);

        ImageButton btn_champion_braum = findViewById(R.id.btn_champion_braum);
        ImageButton btn_champion_leblanc = findViewById(R.id.btn_champion_leblanc);
        ImageButton btn_champion_varus = findViewById(R.id.btn_champion_varus);
        ImageButton btn_champion_jax = findViewById(R.id.btn_champion_jax);
        ImageButton btn_champion_neeko = findViewById(R.id.btn_champion_neeko);
        ImageButton btn_champion_syndra = findViewById(R.id.btn_champion_syndra);
        ImageButton btn_champion_thresh = findViewById(R.id.btn_champion_thresh);
        ImageButton btn_champion_senna = findViewById(R.id.btn_champion_senna);
        ImageButton btn_champion_skarner = findViewById(R.id.btn_champion_skarner);
        ImageButton btn_champion_reksai = findViewById(R.id.btn_champion_reksai);
        ImageButton btn_champion_malzahar = findViewById(R.id.btn_champion_malzahar);
        ImageButton btn_champion_volibare = findViewById(R.id.btn_champion_volibare);
        ImageButton btn_champion_yasuo = findViewById(R.id.btn_champion_yasuo);

        ImageButton btn_champion_azir = findViewById(R.id.btn_champion_azir);
        ImageButton btn_champion_sion = findViewById(R.id.btn_champion_sion);
        ImageButton btn_champion_drmondo = findViewById(R.id.btn_champion_drmondo);
        ImageButton btn_champion_kindred = findViewById(R.id.btn_champion_kindred);
        ImageButton btn_champion_ezreal = findViewById(R.id.btn_champion_ezreal);
        ImageButton btn_champion_aatrox = findViewById(R.id.btn_champion_aatrox);
        ImageButton btn_champion_nautilus = findViewById(R.id.btn_champion_nautilus);
        ImageButton btn_champion_qiyana = findViewById(R.id.btn_champion_qiyana);
        ImageButton btn_champion_sivir = findViewById(R.id.btn_champion_sivir);
        ImageButton btn_champion_soraka = findViewById(R.id.btn_champion_soraka);
        ImageButton btn_champion_nocturne = findViewById(R.id.btn_champion_nocturne);
        ImageButton btn_champion_veigar = findViewById(R.id.btn_champion_veigar);
        ImageButton btn_champion_karma = findViewById(R.id.btn_champion_karma);

        ImageButton btn_champion_annie = findViewById(R.id.btn_champion_annie);
        ImageButton btn_champion_brand = findViewById(R.id.btn_champion_brand);
        ImageButton btn_champion_ashe = findViewById(R.id.btn_champion_ashe);
        ImageButton btn_champion_khazix = findViewById(R.id.btn_champion_khazix);
        ImageButton btn_champion_olaf = findViewById(R.id.btn_champion_olaf);
        ImageButton btn_champion_janna = findViewById(R.id.btn_champion_janna);
        ImageButton btn_champion_yorick = findViewById(R.id.btn_champion_yorick);
        ImageButton btn_champion_lucian = findViewById(R.id.btn_champion_lucian);
        ImageButton btn_champion_malphite = findViewById(R.id.btn_champion_malphite);
        ImageButton btn_champion_twitch = findViewById(R.id.btn_champion_twitch);

        ImageButton btn_champion_zed = findViewById(R.id.btn_champion_zed);
        ImageButton btn_champion_amumu = findViewById(R.id.btn_champion_amumu);
        ImageButton btn_champion_nami = findViewById(R.id.btn_champion_nami);
        ImageButton btn_champion_masteryi = findViewById(R.id.btn_champion_masteryi);
        ImageButton btn_champion_singed = findViewById(R.id.btn_champion_singed);
        ImageButton btn_champion_taric = findViewById(R.id.btn_champion_taric);

        ImageButton btn_champion_lux = findViewById(R.id.btn_champion_lux);





        // MENU CLICK LISTENER
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


        btn_item.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent_synergy_combine = new Intent(getApplicationContext(), Item_Activity.class);
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




        // Image Button Click Listener
        // cost 1
        btn_champion_orrn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_orrn;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_diana.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_diana;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_zyra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_zyra;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_warwick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_warwick;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_ivern.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_ivern;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_kogmaw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_kogmaw;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_nasus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_nasus;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_vayne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_vayne;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_maokai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_maokai;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_renekton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_renekton;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_vladimir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_vladimir;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_taliyah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_taliyah;
                Champion_popup(view, champion_popup_page);
            }
        });
        btn_champion_leona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost1_leona;
                Champion_popup(view, champion_popup_page);
            }
        });


        // cost 2
        btn_champion_braum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_braum;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_leblanc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_leblanc;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_varus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_varus;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_jax.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_jax;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_neeko.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_neeko;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_syndra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_syndra;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_thresh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_thresh;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_senna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_senna;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_skarner.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_skarner;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_reksai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_reksai;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_malzahar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_malzahar;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_volibare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_volibare;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_yasuo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost2_yasuo;
                Champion_popup(view, champion_popup_page);
            }
        });



        // cost 3
        btn_champion_azir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_azir;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_sion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_sion;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_drmondo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_drmundo;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_kindred.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_kindred;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_ezreal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_ezreal;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_aatrox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_aatrox;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_nautilus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_nautilus;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_qiyana.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_qiyana;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_sivir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_sivir;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_soraka.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_soraka;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_nocturne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_nocturne;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_veigar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_veigar;
                Champion_popup(view, champion_popup_page);
            }
        });
        btn_champion_karma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost3_karma;
                Champion_popup(view, champion_popup_page);
            }
        });




        // cost 4
        btn_champion_annie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_annie;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_brand.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_brand;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_ashe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_ashe;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_khazix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_khazix;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_olaf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_olaf;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_janna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_janna;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_yorick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_yorick;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_lucian.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_lucian;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_malphite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_malphite;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_twitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost4_twitch;
                Champion_popup(view, champion_popup_page);
            }
        });



        // cost 5
        btn_champion_zed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost5_zed;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_amumu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost5_amumu;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_nami.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost5_nami;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_masteryi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost5_masteryi;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_singed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost5_singed;
                Champion_popup(view, champion_popup_page);
            }
        });

        btn_champion_taric.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost5_taric;
                Champion_popup(view, champion_popup_page);
            }
        });



        // cost 7
        btn_champion_lux.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int champion_popup_page = R.layout.champion_popup_cost7_lux;
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
