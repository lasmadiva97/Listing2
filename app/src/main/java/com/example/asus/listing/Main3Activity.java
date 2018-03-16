package com.example.asus.listing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private String url1 = "http://jsonplaceholder.typicode.com/posts/%7Bid_post%7D/comments";
    TextView nama, email, body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nama= (TextView) findViewById(R.id.nama);
        email= (TextView) findViewById(R.id.email);
        body= (TextView) findViewById(R.id.body);
    }
}
