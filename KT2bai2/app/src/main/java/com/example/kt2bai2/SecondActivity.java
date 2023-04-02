package com.example.kt2bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    Button cong, tru ,nhan, chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        anhxa();

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pt = cong.getText().toString();
                Intent nextScrenn2 = new Intent(SecondActivity.this,MainActivity.class);
                //Dùng intent để truyền activity này truyền sang activity khác
                nextScrenn2.putExtra("pt",pt);
                startActivity(nextScrenn2);
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pt = tru.getText().toString();
                Intent nextScrenn2 = new Intent(SecondActivity.this,MainActivity.class);
                //Dùng intent để truyền activity này truyền sang activity khác
                nextScrenn2.putExtra("pt",pt);
                startActivity(nextScrenn2);
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pt = nhan.getText().toString();
                Intent nextScrenn2 = new Intent(SecondActivity.this,MainActivity.class);
                //Dùng intent để truyền activity này truyền sang activity khác
                nextScrenn2.putExtra("pt",pt);
                startActivity(nextScrenn2);
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pt = chia.getText().toString();
                Intent nextScrenn2 = new Intent(SecondActivity.this,MainActivity.class);
                //Dùng intent để truyền activity này truyền sang activity khác
                nextScrenn2.putExtra("pt",pt);
                startActivity(nextScrenn2);
            }
        });
    }
    protected void anhxa(){
        cong = (Button) findViewById(R.id.button3);
        tru = (Button) findViewById(R.id.button4);
        nhan = (Button) findViewById(R.id.button5);
        chia = (Button) findViewById(R.id.button6);

    }
}