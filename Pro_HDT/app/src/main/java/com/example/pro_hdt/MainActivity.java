package com.example.pro_hdt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SinhVien sv = new SinhVien();
        sv.hoTen="The Anh";
        sv.diaChi="Ha noi";
        sv.namSinh=2001;
        Toast.makeText(this,sv.hoTen,Toast.LENGTH_SHORT).show();
    }
}