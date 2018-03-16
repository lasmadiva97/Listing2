package com.example.asus.listing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String url1 = "http://jsonplaceholder.typicode.com/posts";
    TextView title, body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title= (TextView) findViewById(R.id.title);
        body= (TextView) findViewById(R.id.body);
    }

    public void komentar (View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
