package com.example.secondactiviti;
import java.io.Serializable;

public class HocSinh implements Serializable{
    private String hoten;
    private int namsinh;

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public HocSinh(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
    }
}
