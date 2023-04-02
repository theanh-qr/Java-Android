package com.example.secondactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnClick1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick1 = (Button) findViewById(R.id.btnClick1);

        btnClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Chuẩn bị dữ liệu cần truyền(bundle dùng để truyền nhiều dữ liệu)
                //khai báo mảng
                String[] mamgdl = {"Iphone","Samsung","Nokia","Oppo"};
                HocSinh hs = new HocSinh("Nguyen The Anh", 2001);
                //Khai báo bundle để đóng gói tất cả các dữ lieu
                Bundle bundle = new Bundle();
                //Dùng bundle để giử dữ liệu
                bundle.putSerializable("doituong",hs);
                bundle.putStringArray("mangdt",mamgdl);
                bundle.putInt("conso",12345);
                bundle.putString("chuoi","The Anh xin chao");

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                //Dùng intent để truyền activity này truyền sang activity khác
                intent.putExtra("dulieu",bundle);
                startActivity(intent);
            }
        });
    }
}