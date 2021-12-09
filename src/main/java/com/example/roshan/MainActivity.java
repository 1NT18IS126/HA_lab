package com.example.roshan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText first ;
    EditText second ;
    Button add;
    TextView res;
    Intent intent;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
             first = findViewById(R.id.num1);
             second = findViewById(R.id.num2);
             add= findViewById(R.id.add);
             res=findViewById(R.id.result);
             intent = new Intent(this,MainActivity2.class);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(first.getText().toString());
                int n2 = Integer.parseInt(second.getText().toString());
                int sum= n1+n2;
                res.setText("Result is :"+sum);
                //intent.putExtra("res",sum+"");
                Bundle extras = new Bundle();
                extras.putString("res",sum+"");
                extras.putString("num1",n1+"");
                extras.putString("num2",n2+"");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        }
    }
