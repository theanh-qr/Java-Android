package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layoutmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //gọi hàm bắt sự kien

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuStart:

                break;
            case R.id.menuPanel:

                break;
            case R.id.menuShare:

                break;
            case R.id.menuSetting:

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}