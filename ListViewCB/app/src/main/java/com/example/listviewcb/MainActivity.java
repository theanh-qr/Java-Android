package com.example.listviewcb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //khai bao bien
    ListView listview1;
    EditText txtthem;
    Button btnthem, btncapnhap;
    int vitri;
    ArrayAdapter adListView;
    //khai bao arrarylist
    ArrayList<String> arrListView, arrChose;
    //    String noidung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        noidung = "";
        //Anh xa
        listview1 = (ListView) findViewById(R.id.Listview1);
        txtthem = (EditText) findViewById(R.id.editTextTextPersonName);
        btnthem = (Button) findViewById(R.id.button);
        btncapnhap = (Button) findViewById(R.id.button3);
        //them du lieu cho arraylist
        arrListView = new ArrayList<>();
        arrListView.add("Bài 1:Hello world");
        arrListView.add("Bài 2:Text view, Edit text,Button");
        arrListView.add("Bài 3:Bắt sự kiện click button");
        arrListView.add("Bài 4:Thiết kế giao diện với RelativeLayout");
        arrListView.add("Bài 5:Thiết kế giao diện với LinearLayout");
        arrListView.add("Bài 6:Thực hành xây dựng ứng dụng Calculator");
        arrListView.add("Bài 7:Toast, Checkbox, RadioButton,Dialog");
        arrListView.add("Bài 8:Intent - Chuyển đổi giữa các màn hình");
        //tao list chưa du lieu
        arrChose = new ArrayList<>();
        //doc du lieu tu arrList vao trong listview bang ArrayAdapter
        adListView = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrListView);
        listview1.setAdapter(adListView);
        //Thực hiện click nut button
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noidung;
                noidung = txtthem.getText().toString();
                //thêm dữ liệu vào mảng arr
                arrListView.add(noidung);
                //đưa dữ liệu tử mảng vào listview
                adListView.notifyDataSetChanged();
            }
        });
        //nut cap nhap
        btncapnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrListView.set(vitri,txtthem.getText().toString());
                adListView.notifyDataSetChanged();
            }
        });
        //goi event cho listview item click
        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                //Lấy dữ liệu từ listview cho lên edittext
                txtthem.setText(arrListView.get(i));
                vitri = i;
            }
        });
        //goi event nhan va giu lau long click
        listview1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                arrListView.remove(i);
                adListView.notifyDataSetChanged();
                return  false;
            }
        });
    }
}