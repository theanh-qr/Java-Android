package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView nb1,nb2,phepTinh;
    Button da1,da2,da3,da4;
    String getNb1,getNb2,getPT;
    Float value1,value2,kq;
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        da1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getValue();
                if(kq+"" == da1.getText().toString()){
                    Toast.makeText(MainActivity.this,"Bạn đã trả lời đúng",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Toast.makeText(MainActivity.this,"Bạn đã trả lời sai",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
        da2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getValue();
                if(kq+"" == da2.getText().toString()){
                    Toast.makeText(MainActivity.this,"Bạn đã trả lời đúng",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Toast.makeText(MainActivity.this,"Bạn đã trả lời sai",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
        da3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getValue();
                if(kq+"" == da3.getText().toString()){
                    Toast.makeText(MainActivity.this,"Bạn đã trả lời đúng",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Toast.makeText(MainActivity.this,"Bạn đã trả lời sai",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
        da4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getValue();
                if(kq+"" == da4.getText().toString()){
                    Toast.makeText(MainActivity.this,"Bạn đã trả lời đúng",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Toast.makeText(MainActivity.this,"Bạn đã trả lời sai",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
    protected void anhxa(){
        nb1 = (TextView) findViewById(R.id.textView);
        nb2 = (TextView) findViewById(R.id.textView3);
        phepTinh = (TextView) findViewById(R.id.textView2);
        da1 = (Button) findViewById(R.id.button);
        da2 = (Button) findViewById(R.id.button2);
        da3 = (Button) findViewById(R.id.button3);
        da4 = (Button) findViewById(R.id.button4);
        txt = (EditText) findViewById(R.id.editTextTextPersonName);
    }
    protected void getValue(){
        //Lấy dữ liệu từ TextView
        getNb1 = nb1.getText().toString();
        getNb2 = nb2.getText().toString();
        getPT = phepTinh.getText().toString();
        //Gán giá trị vào để tính toán
        value1 = Float.parseFloat(getNb1);
        value2 = Float.parseFloat(getNb2);
        if(getPT == "+"){
            kq = value1 + value2;
        }else if(getPT == "-"){
            kq = value1 - value2;
        }else if(getPT == "*"){
            kq = value1 * value2;
        }else if(getPT == "/") {
            kq = value1 / value2;
        }
    }
}