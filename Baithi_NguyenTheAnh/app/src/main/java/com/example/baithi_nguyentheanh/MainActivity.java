package com.example.baithi_nguyentheanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton play;
    SeekBar s1,s2;
    CheckBox c1,c2;
    TextView t1;
    Button btn3;
    int ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ketqua = 100;
        anhxa();
        CountDownTimer dongho = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long l) {
                //Mỗi lần tick thay đổi giá trị seebar-Progess
                Random r = new Random();
                int one, two,three;
                one = r.nextInt(4) + 1;
                two = r.nextInt(4) + 1;
                s1.setProgress(s1.getProgress()+one);
                s2.setProgress(s2.getProgress()+two);
                if(s1.getProgress() >= 100){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"s1 thắng !",Toast.LENGTH_SHORT).show();
                    if(c1.isChecked()){
                        ketqua = ketqua + 10;
                    }else{
                        ketqua = ketqua -5;
                    }
                    //gán kết quả về lại textViews
                    t1.setText(ketqua+"");
                }
                if(s2.getProgress() >= 100){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"s2 thắng !",Toast.LENGTH_SHORT).show();
                    if(c2.isChecked()){
                        ketqua = ketqua + 10;
                    }else{
                        ketqua = ketqua -5;
                    }
                    t1.setText(ketqua+"");
                }
            }

            @Override
            public void onFinish() {

            }
        };
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    c2.setChecked(false);
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    c1.setChecked(false);
                }

            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Kiểm tra xem còn điểm chơi k
                if (ketqua == 0) {
                    Toast.makeText(MainActivity.this,"Bạn đã hết điểm chơi",Toast.LENGTH_SHORT).show();
                } else if(ketqua <= 0){
                    Toast.makeText(MainActivity.this,"Bạn đã hết điểm chơi và bị "+ketqua+" điểm",Toast.LENGTH_SHORT).show();
                }
                else {
                    //Kiểm tra xem các checkbox đc tích vào chưa
                    if (c1.isChecked() || c2.isChecked()) {
                        s1.setProgress(0);
                        s2.setProgress(0);
                        dongho.start();
                    } else {
                        Toast.makeText(MainActivity.this, "Vui lòng đặt cược", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }
    protected void anhxa(){
        play = (ImageButton) findViewById(R.id.imageButton);
        s1 = (SeekBar) findViewById(R.id.s1);
        s2 = (SeekBar) findViewById(R.id.s2);
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        t1 = (TextView) findViewById(R.id.txtDiem);
        btn3 = (Button) findViewById(R.id.button2);
    }
}