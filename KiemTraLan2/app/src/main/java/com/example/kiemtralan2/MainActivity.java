package com.example.kiemtralan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,messages;
    Button feedBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.editTextTextPersonName);
        messages = (EditText) findViewById(R.id.editTextTextPersonName2);
        feedBack = (Button) findViewById(R.id.button);

        feedBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myName = name.getText().toString();
                String myMessages = messages.getText().toString();
                String [] thongtin = {myName,myMessages};
                if(myName.equals(null) || myName.equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập tên", Toast.LENGTH_SHORT).show();
                }else if(myMessages.equals(null) || myMessages.equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập phản hồi", Toast.LENGTH_SHORT).show();
                }else{
                    //Khai báo bundle để đóng gói tất cả các dữ lieu
                    Bundle bundle = new Bundle();
                    //Dùng bundle để giử dữ liệu
                    bundle.putStringArray("thongtin",thongtin);

                    Intent nextScrenn = new Intent(MainActivity.this,SecondActivity.class);
                    //Dùng intent để truyền activity này truyền sang activity khác
                    nextScrenn.putExtra("ttguidi",bundle);
                    startActivity(nextScrenn);
                }
            }
        });
    }
}