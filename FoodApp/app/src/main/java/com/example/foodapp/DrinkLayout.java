package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DrinkLayout extends AppCompatActivity {

    EditText drinkname;
    Button btndrink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_layout);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("doan");
        String doan = bundle.getString("doan");
        anhxadrink();
        btndrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String douong = String.valueOf(drinkname.getText());
                Intent intent = new Intent(DrinkLayout.this,MainActivity.class);
                intent.putExtra("douong",douong);
                startActivity(intent);
            }
        });
    }

    protected  void anhxadrink(){
        drinkname = (EditText) findViewById(R.id.editTextTextPersonName);
        btndrink = (Button) findViewById(R.id.button4);
    }
}