package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText so1,so2;
    TextView kq;
    Button btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        so1 = (EditText) findViewById(R.id.editTextNumber);
        so2 = (EditText) findViewById(R.id.editTextNumber2);
        kq = (TextView) findViewById(R.id.textView);
        btnRandom = (Button) findViewById(R.id.button);


        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Integer value1 = Integer.parseInt(so1.getText().toString());
                    Integer value2 = Integer.parseInt(so2.getText().toString());

                    if(value1 >= value2){
                        Toast.makeText(MainActivity.this,"Số thứ nhất phải nhỏ hơn số thứ hai, vui lòng nhập lại !",Toast.LENGTH_SHORT).show();
                    }
                    if(so1.getText().toString().length() == 0 || so2.getText().toString().length() == 0 ){
                        Toast.makeText(MainActivity.this,"Bạn chưa nhập đầy đủ 2 số",Toast.LENGTH_SHORT).show();
                    }
                    Integer tt1 = Math.abs(value1);
                    Integer tt2 = Math.abs(value2);
                    Random myRamdom = new Random();
                    Integer randomValue = myRamdom.nextInt((tt1 - tt2)+1) + tt2;
                    kq.setText(randomValue.toString());
                }catch(Exception e){
                    Toast.makeText(MainActivity.this,"ERROR: "+e,Toast.LENGTH_LONG).show();
                }
            }


        });
    }
}