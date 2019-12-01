package com.example.loltft;

import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;


// 해당 클래스에선 tft_summoner_v1 의 Name란에 소환사의 이름을 넣고 정보를 꺼내옵니다.
public class tft_summoner_v1 extends Thread {
    String setURL = null;
    String id = null;
    String accountId = null;
    String puuid = null;
    String name = null;
    int profileIconId = 0;
    int revisionDate = 0;
    int summonerLevel = 0;

    String api = "INPUT API";

    public tft_summoner_v1(String id){
        try {
            setURL = "https://kr.api.riotgames.com/tft/summoner/v1/summoners/by-name/" + URLEncoder.encode(id, "UTF-8").replace("+", "%20") + api;
        } catch(IOException e) {
            e.getStackTrace();
        }
    }


    public void run() {
        try {
            URL url = new URL(setURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }

            String result;
            result = sb.toString();

            JSONObject jObject = new JSONObject(result);
            id = jObject.getString("id");
            accountId = jObject.getString("accountId");
            puuid = jObject.getString("puuid");
            name = jObject.getString("name");
            profileIconId = jObject.getInt("profileIconId");
            revisionDate = jObject.getInt("revisionDate");
            summonerLevel = jObject.getInt("summonerLevel");

            Log.d("개굴시벌",id);

        } catch (MalformedURLException e) {
            Log.d("MalformedURLException e", "잘못된 URL로 접근 하셨습니다.");
        } catch (IOException e) {
            Log.d("IOException e", "잘못된 IO");
        } catch (JSONException e) {
            Log.d("JSONException e", "잘못된 JSONException");
        }
    }
}