package com.example.kt2bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2;
    Button btnCalculation, btnResult;
    TextView caculation,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        String NO1 = no1.getText().toString();
        String NO2 = no2.getText().toString();
        btnCalculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(NO1.equals(null) || NO1.equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập so thu 1", Toast.LENGTH_SHORT).show();
                }else if(NO2.equals(null) || NO2.equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập so thu 2", Toast.LENGTH_SHORT).show();
                }else{
                    Intent nextScrenn = new Intent(MainActivity.this,SecondActivity.class);
                    //Dùng intent để truyền activity này truyền sang activity khác
                    startActivity(nextScrenn);
                }
            }
        });

        Intent intent = getIntent();
        String [] pt = intent.getStringArrayExtra("pt");
        if(pt.equals(null)){
            caculation.setText("Chưa có phép tính");
            result.setText("Chưa có kết quả");
        }else{
            caculation.setText("no1" + pt[0] + "no2");
            if(pt[0] == "+"){
                Integer No1 = Integer.parseInt(NO1);
                Integer No2 = Integer.parseInt(NO2);
                Integer reSult = No1 + No2;
                result.setText(reSult+"");
            }
            if(pt[0] == "-"){
                Integer No1 = Integer.parseInt(NO1);
                Integer No2 = Integer.parseInt(NO2);
                Integer reSult = No1 - No2;
                result.setText(reSult+"");
            }
            if(pt[0] == "*"){
                Integer No1 = Integer.parseInt(NO1);
                Integer No2 = Integer.parseInt(NO2);
                Integer reSult = No1 * No2;
                result.setText(reSult+"");
            }
            if(pt[0] == "/"){
                Integer No1 = Integer.parseInt(NO1);
                Integer No2 = Integer.parseInt(NO2);
                Integer reSult = No1 / No2;
                result.setText(reSult+"");
            }
        }
    }
    protected void anhxa(){
        no1 = (EditText) findViewById(R.id.editTextNumber);
        no2 = (EditText) findViewById(R.id.editTextNumber2);
        btnCalculation = (Button) findViewById(R.id.button);
        btnResult = (Button) findViewById(R.id.button2);
        caculation = (TextView) findViewById(R.id.textView4);
        result = (TextView) findViewById(R.id.textView6);

    }
}