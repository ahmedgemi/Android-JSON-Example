package com.example.ahmed.json_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject json = new JSONObject();

        try {

            json.put("name" , "ahmed");
            json.put("phone" , "010055");
            json.put("email" , "gmail.com");


            Log.d("test",json.toString());


            String data = json.toString();// {"email":"gmail.com","phone":"010055","name":"ahmed"}

            JSONObject json2 = new JSONObject(data);

            String name = json2.getString("name") ;  // ahmed
            String email = json2.getString("email") ;

            Log.d("test",name);


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
