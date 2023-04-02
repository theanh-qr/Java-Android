package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnfood,btndrink,btnout;
    TextView ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        Intent intent = getIntent();
        String doan,douong;
        doan = intent.getStringExtra("doan");
        douong = intent.getStringExtra("douong");
        if(doan == null && douong == null){
            ketqua.setText("Chưa có đồ ăn và đồ uống");
        }else if(doan == null){
            ketqua.setText("Chưa có đồ ăn - " + douong);
        }else if(douong == null){
            ketqua.setText(doan+" - chưa có đồ ăn");
        }else{
            ketqua.setText(doan+"-"+douong);
        }

        btnfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("douong",douong);
                Intent intent = new Intent(MainActivity.this,FoodLayout.class);
                intent.putExtra("douong",bundle);
                startActivity(intent);
            }
        });
        btndrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("doan",doan);
                Intent intent = new Intent(MainActivity.this,DrinkLayout.class);
                intent.putExtra("doan",bundle);
                startActivity(intent);
            }
        });
        btnout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });
    }
    protected void anhxa(){
        btnfood = (Button) findViewById(R.id.button);
        btndrink = (Button) findViewById(R.id.button2);
        btnout = (Button) findViewById(R.id.button3);
        ketqua = (TextView) findViewById(R.id.textView2);
    }
}