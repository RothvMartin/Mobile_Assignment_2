package com.example.myappvolleytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStop() {
        /*requestQueue.cancelAll(this);*/
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewTest = this.findViewById(R.id.textViewTest);

        RequestQueue queue = Volley.newRequestQueue(this);
        String testURL = "https://anapioficeandfire.com/api/characters/583";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, testURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        textViewTest.setText("Response is: " + response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textViewTest.setText("Volley Request failed.");
            }
        });

        queue.add(stringRequest);
    }


}
