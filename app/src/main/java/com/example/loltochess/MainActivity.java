package com.example.loltochess;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        b =  findViewById(R.id.jButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doJSONParser();
            }
        });
    }

        void doJSONParser () {
            StringBuffer sb = new StringBuffer();

            String str2 = "{\"id\":\"Wbqc4hK8RTGmIndHsBGG47dGr93qVHULmgm_sHoDz1DV4Tk\"," +
                    "\"accountId\":\"J3tpw1dNyJtlxJmTX6Kpgh2U6dN0I_o_8KFNTGbd36PQ6DClgI80nriC\"," +
                    "\"puuid\":\"PYTClYEC5sZwkmKUMnoGIG9FFK7sMHqEXe_1KKnke2kHL3GP_xbzeG15Ll6qanQjAcT-MaUDYGKeJA\"," +
                    "\"name\":\"전우협 CEO\"," +
                    "\"profileIconId\":6," +
                    "\"revisionDate\":1574930664000," +
                    "\"summonerLevel\":93}\n";

            try{
                JSONObject j = new JSONObject(str2);
                String id = j.getString("id");
                String puuid = j.getString("puuid");
                String name = j.getString("name");
                int profileIconId = j.getInt("profileIconId");
                long revisionDate = j.getLong("revisionDate");
                int summonerLevel = j.getInt("summonerLevel");

                tv.setText(String.valueOf(revisionDate));
                tv.setText(puuid);

            }catch(JSONException e){
                e.getStackTrace();
            }


        } // end doJSONParser()
    // end class
}

