package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText number1,number2,ketQua;
    Button cong,tru,nhan,chia,xoa;
    String checkNumber1,checkNumber2;
    Float nb1,nb2,kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ
        anhxa();
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNumber1 = number1.getText().toString();
                checkNumber2 = number2.getText().toString();
                if(checkNumber1.matches("") || checkNumber2.matches("")){
                    Toast.makeText(MainActivity.this,"Bạn cần nhập đẩy đủ 2 số",Toast.LENGTH_SHORT).show();
                    return;
                }
                nb1 = Float.parseFloat(checkNumber1);
                nb2 = Float.parseFloat(checkNumber2);
                kq = nb1 + nb2;
                ketQua.setText(kq+"");
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNumber1 = number1.getText().toString();
                checkNumber2 = number2.getText().toString();
                if(checkNumber1.matches("") || checkNumber2.matches("")){
                    Toast.makeText(MainActivity.this,"Bạn cần nhập đẩy đủ 2 số",Toast.LENGTH_SHORT).show();
                    return;
                }
                nb1 = Float.parseFloat(checkNumber1);
                nb2 = Float.parseFloat(checkNumber2);
                kq = nb1 - nb2;
                ketQua.setText(kq+"");
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNumber1 = number1.getText().toString();
                checkNumber2 = number2.getText().toString();
                if(checkNumber1.matches("") || checkNumber2.matches("")){
                    Toast.makeText(MainActivity.this,"Bạn cần nhập đẩy đủ 2 số",Toast.LENGTH_SHORT).show();
                    return;
                }
                nb1 = Float.parseFloat(checkNumber1);
                nb2 = Float.parseFloat(checkNumber2);
                kq = nb1 * nb2;
                ketQua.setText(kq+"");
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNumber1 = number1.getText().toString();
                checkNumber2 = number2.getText().toString();
                if(checkNumber1.matches("") || checkNumber2.matches("")){
                    Toast.makeText(MainActivity.this,"Bạn cần nhập đẩy đủ 2 số",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(checkNumber2.matches("0")){
                    Toast.makeText(MainActivity.this,"Không có phép chia cho 0",Toast.LENGTH_SHORT).show();
                    return;
                }
                nb1 = Float.parseFloat(checkNumber1);
                nb2 = Float.parseFloat(checkNumber2);
                kq = nb1 / nb2;
                ketQua.setText(kq+"");
            }
        });
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
                ketQua.setText("");
            }
        });
    }
    protected void anhxa(){
        number1 = (EditText) findViewById(R.id.editTextNumber);
        number2 = (EditText) findViewById(R.id.editTextNumber2);
        ketQua = (EditText) findViewById(R.id.editTextNumber3);
        cong = (Button) findViewById(R.id.button);
        tru = (Button) findViewById(R.id.button2);
        nhan = (Button) findViewById(R.id.button3);
        chia = (Button) findViewById(R.id.button4);
        xoa = (Button) findViewById(R.id.button5);
    }
}