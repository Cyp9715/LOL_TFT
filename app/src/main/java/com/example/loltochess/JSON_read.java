package com.example.loltochess;

import org.json.JSONArray;
import org.json.JSONException;

public class JSON_read {
    String str =
            "[{'name':'배트맨','age':43,'address':'고담'}," +
                    "{'name':'슈퍼맨','age':36,'address':'뉴욕'}," +
                    "{'name':'앤트맨','age':25,'address':'LA'}]";
    public void JSON_read() {
        try {
            JSONArray jarray = new JSONArray(str);

        } catch (JSONException e) {

        }

    }
}



