package com.example.gameduaxe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton play;
    SeekBar s1,s2,s3;
    CheckBox c1,c2,c3;
    TextView t1;
    int ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //gắn kết qủa là 100
        ketqua = 10;
        //Gọi hàm ánh xạ
        anhxa();
        //Sử dụng countDownTimer để gọi sư kiện tick(mỗi 1 giây thi see sẽ thay đổi
        CountDownTimer dongho = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long l) {
                //Mỗi lần tick thay đổi giá trị seebar-Progess
                Random r = new Random();
                int one, two,three;
                one = r.nextInt(4) + 1;
                two = r.nextInt(4) + 1;
                three = r.nextInt(4) + 1;
                s1.setProgress(s1.getProgress()+one);
                s2.setProgress(s2.getProgress()+two);
                s3.setProgress(s3.getProgress()+three);
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
                if(s3.getProgress() >= 100){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"s3 thắng !",Toast.LENGTH_SHORT).show();
                    if(c3.isChecked()){
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
                    c3.setChecked(false);
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    c1.setChecked(false);
                    c3.setChecked(false);
                }

            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    c2.setChecked(false);
                    c1.setChecked(false);
                }
            }
        });
        //Viết sự kiện khi ng dùng ấn chuột vào nút play thì chạy đồng hồ
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
                    if (c1.isChecked() || c2.isChecked() || c3.isChecked()) {
                        s1.setProgress(0);
                        s2.setProgress(0);
                        s3.setProgress(0);
                        dongho.start();
                    } else {
                        Toast.makeText(MainActivity.this, "Vui lòng đặt cược", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    protected void anhxa(){
        play = (ImageButton) findViewById(R.id.imageButton);
        s1 = (SeekBar) findViewById(R.id.s1);
        s2 = (SeekBar) findViewById(R.id.s2);
        s3 = (SeekBar) findViewById(R.id.s3);
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        c3 = (CheckBox) findViewById(R.id.c3);
        t1 = (TextView) findViewById(R.id.txtDiem);
    }
}