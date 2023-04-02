package com.example.secondactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btnClick2;
    TextView txtHienthi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnClick2 = (Button) findViewById(R.id.btnClick2);

        txtHienthi = (TextView) findViewById(R.id.txtview2);
//        String[] bientam;
            Intent intent = getIntent();
            Bundle bundle = intent.getBundleExtra("dulieu");
        //Lấy dữ liệu từ MainActivity
//        bientam = intent.getStringArrayExtra("dulieu");
//        HocSinh hs = (HocSinh) intent.getSerializableExtra("dulieu");
//        txtHienthi.setText(bientam[0]+","+bientam[1]+","+bientam[2]+","+bientam[3]);
//        txtHienthi.setText("Thong tin nhan duoc: "+hs.getHoten()+","+hs.getNamsinh());

        //khai báo 4 biến để nhận dữ liệu từ bundle
        String chuoi;
        int so;
        String[] mang;
        HocSinh hocSinh;

        chuoi = bundle.getString("chuoi");
        so = bundle.getInt("conso");
        mang = bundle.getStringArray("mangdt");
        hocSinh = (HocSinh) bundle.getSerializable("doituong");
        txtHienthi.setText("Thong tin nhan duoc: "+chuoi+","+so+","+mang[2]+","+hocSinh.getHoten());

        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}