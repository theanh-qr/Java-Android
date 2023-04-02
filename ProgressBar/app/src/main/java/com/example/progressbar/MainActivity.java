package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Khai báo biến để ánh xạ vào các view đơn
//    EditText txtMa, txtTen, txtSoluong, txtDongia;
//    Button btnThuchien;

//    Bai random so
//    EditText txta, txtb;
//    Button button;
//    TextView kq;
//    Random r = new Random();

    //Bài đổi ảnh nền
//    ConstraintLayout cl;
////    ArrayList<Integer> dsanhnen;
////    Button nutbam, bt2;
////    ProgressBar thanhtt;


    //Bài thanh tiến trình
    ProgressBar thanhtt1, thanhtt2,thanhtt3,thanhtt4 ;
    Button btntt, btnrs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Code reset tiến trình
        btnrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thanhtt1.setProgress(0);
                thanhtt2.setProgress(0);
                thanhtt3.setProgress(0);
                thanhtt4.setProgress(0);
            }
        });



        //Bài đổi ảnh nền
//        cl = (ConstraintLayout)findViewById(R.id.layout1);
//        dsanhnen = new ArrayList<>();
//        nutbam = (Button)findViewById(R.id.button3);
//        thanhtt = (ProgressBar)findViewById(R.id.progressBar3);
//        bt2 = (Button)findViewById(R.id.button4);
//        //Thêm từng ảnh nên vào danh sách ảnh nền
//        dsanhnen.add(R.drawable.love);//Vị trí thứ 0 và tiếp theo đó là 1, 2,...
//        dsanhnen.add(R.drawable.fish); //  1
//        dsanhnen.add(R.drawable.swingming); // 2
//        dsanhnen.add(R.drawable.tom); //3
//        //Gán giá trị max cho thanh tiến trình
//        thanhtt.setMax(100);
//        //Code click vào nút bấm
//        nutbam.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Random r = new Random();
//                Integer vitri = r.nextInt(dsanhnen.size());
//                cl.setBackgroundResource(dsanhnen.get(vitri));
//                //Code cho thanh tien trinh
//                if(thanhtt.getProgress() >= 100){
//                    thanhtt.setProgress(0);
//                }else{
//                    thanhtt.setProgress(thanhtt.getProgress()+25);
//                }
//
//            }
//        });
//        //Code chay count timer
//        bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                CountDownTimer timer1 = new CountDownTimer(15000, 300) {
//                    @Override
//                    public void onTick(long l) {
//                        //Mỗi 300 mili giây thì thanh tiến trình cộng 5
//                        thanhtt.setProgress(thanhtt.getProgress()+5);
//                        if(thanhtt.getProgress() >= 100){
//                            Toast.makeText(MainActivity.this, "Hết tiến trình",Toast.LENGTH_SHORT).show();
//                        }
//                    }
//
//                    @Override
//                    public void onFinish() {
//                        Toast.makeText(MainActivity.this, "Hết thời gian",Toast.LENGTH_SHORT).show();
//                    }
//                };
//                timer1.start();
//            }
//        });







        //Bai random so
//        txta = (EditText) findViewById(R.id.editTextTextPersonName5);
//        txtb = (EditText) findViewById(R.id.editTextTextPersonName6);
//        button = (Button) findViewById(R.id.button2);
//        kq = (TextView) findViewById(R.id.textView8);
//
//Bài thanh tiến trình
        thanhtt1 = (ProgressBar) findViewById(R.id.progressBar2);
        thanhtt2 = (ProgressBar) findViewById(R.id.progressBar4);
        thanhtt3 = (ProgressBar) findViewById(R.id.progressBar5);
        thanhtt4 = (ProgressBar) findViewById(R.id.progressBar6);
        btntt = (Button) findViewById(R.id.button5);
        btnrs = (Button)findViewById(R.id.button6);
        //Giá trị max của tiến trình
        thanhtt1.setMax(100);
        thanhtt2.setMax(100);
        thanhtt3.setMax(100);
        thanhtt4.setMax(100);
        //Code chạy tiến trình
        btntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer  timer2 = new CountDownTimer(30000,1000) {
                    @Override
                    public void onTick(long l) {
                        //Random từng thanh
                        Random r1 = new Random();
                        Random r2 = new Random();
                        Random r3 = new Random();
                        Random r4 = new Random();
                        //gán time cộng thêm từng thanh

                        Integer timett1 = r1.nextInt(5);
                        Integer timett2 = r2.nextInt(5);
                        Integer timett3 = r3.nextInt(5);
                        Integer timett4 = r4.nextInt(5);

                        thanhtt1.setProgress(thanhtt1.getProgress()+timett1);
                        if(thanhtt1.getProgress() == 100){
                            Toast.makeText(MainActivity.this, "Tiến trình 1 hoàn thành đầu tiên",Toast.LENGTH_SHORT).show();
                        }else if(thanhtt2.getProgress() == 100){
                            Toast.makeText(MainActivity.this, "Tiến trình 2 hoàn thành đầu tiên",Toast.LENGTH_SHORT).show();
                        }else if(thanhtt3.getProgress() == 100){
                            Toast.makeText(MainActivity.this, "Tiến trình 3 hoàn thành đầu tiên",Toast.LENGTH_SHORT).show();
                        }else if(thanhtt4.getProgress() == 100){
                            Toast.makeText(MainActivity.this, "Tiến trình 4 hoàn thành đầu tiên",Toast.LENGTH_SHORT).show();
                        }else{
                            thanhtt2.setProgress(thanhtt2.getProgress()+timett2);
                            thanhtt3.setProgress(thanhtt3.getProgress()+timett3);
                            thanhtt4.setProgress(thanhtt4.getProgress()+timett4);
                            thanhtt1.setProgress(thanhtt1.getProgress()+timett1);
                        }
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "Hết thời gian",Toast.LENGTH_SHORT).show();
                    }
                };
                timer2.start();
            }
        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer min, max, kqnn;
//                if(txta.getText().length() == 0 || txtb.getText().length() == 0){
//                    Toast.makeText(MainActivity.this, "Chưa nhập số", Toast.LENGTH_SHORT).show();
//                }else {
//                    min = Integer.parseInt(txta.getText().toString());
//                    max = Integer.parseInt(txtb.getText().toString());
//                    //Tạo số ngẫu nhiên trong khoảng min max
//                    kqnn = r.nextInt(max - min + 1) + min;
//                    //Gán số ngẫu nhiên vào textviews(kq)
//                    kq.setText(kqnn.toString());
//                }
//
//            }
//        });









//Bai giu thong bao
//        //Ánh xạ
//        txtMa = (EditText) findViewById(R.id.editTextTextPersonName);
//        txtTen = (EditText) findViewById(R.id.editTextTextPersonName2);
//        txtSoluong = (EditText) findViewById(R.id.editTextTextPersonName3);
//        txtDongia = (EditText) findViewById(R.id.editTextTextPersonName4);
//        btnThuchien = (Button) findViewById(R.id.button);
//        //Viết code cho nút thực hiện
//        btnThuchien.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Lấy giá trị trong các ô edit text
//                String ma, ten, soLuong, donGia;
//                ma = txtMa.getText().toString();
//                ten = txtTen.getText().toString();
//                soLuong = txtSoluong.getText().toString();
//                donGia = txtDongia.getText().toString();
//                //Hiện ra thông báo
//                Toast.makeText(MainActivity.this, "Sản phẩm (Mã: "+ma +",Tên: " +ten +",Số Lương: " + soLuong +",Đơn giá: "+ donGia+")", Toast.LENGTH_SHORT).show();
        //Taoj ra số ngẫu nhiên
//                Integer a;
//                Integer max, min;
//                max = 30;
//                min = 20;
//                a = r.nextInt((max-min+1)+min);
//                textview5.setText(a+ "");
//            }
//        });
    }
}