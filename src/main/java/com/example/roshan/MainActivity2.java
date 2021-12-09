package com.example.roshan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
   TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.result);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        //String result = intent.getStringExtra("res");
        String result = extras.getString("res");
        String num1 = extras.getString("num1");
        String num2 = extras.getString("num2");
        tv.setText("Num1 is:"+num1+ " Num2 is:"+num2+" Result is:"+result);
    }
}