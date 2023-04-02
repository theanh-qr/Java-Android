package com.example.kiemtralan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView name,messages;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        anhxa();
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("ttguidi");

        String [] thongtin = bundle.getStringArray("thongtin");


        name.setText(thongtin[0]);
        messages.setText(thongtin[1]);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });
    }
    protected void anhxa(){
        name = (TextView) findViewById(R.id.textView5);
        messages = (TextView) findViewById(R.id.textView6);
        back = (Button) findViewById(R.id.button2);
    }
}