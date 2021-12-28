package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         bt1 = (Button)findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(getApplicationContext(),test2.class);
                ed1=(EditText)findViewById(R.id.edit1);

                String ns=ed1.getText().toString();
                Bundle  b=new Bundle();
                b.putString("name",ns);
                intent.putExtras(b);
                startActivity(intent);
            }
        });


    }
}