package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FoodLayout extends AppCompatActivity {
    EditText foodname;
    Button btnfood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_layout);
        anhxadrink();
        btnfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String doan = String.valueOf(foodname.getText());
                Intent intent = new Intent(FoodLayout.this,MainActivity.class);
                intent.putExtra("doan",doan);
                startActivity(intent);
            }
        });
    }
    protected  void anhxadrink(){
        foodname = (EditText) findViewById(R.id.editTextTextPersonName2);
        btnfood = (Button) findViewById(R.id.button5);
    }
}