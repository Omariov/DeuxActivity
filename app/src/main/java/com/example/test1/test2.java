package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class test2 extends AppCompatActivity {

    Button bt2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        bt2=(Button)findViewById(R.id.bt2);

        Bundle b=getIntent().getExtras();

        tv=(TextView) findViewById(R.id.textV);

        tv.setText(b.getString("name"));

        bt2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}