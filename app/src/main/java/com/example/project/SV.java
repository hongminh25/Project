package com.example.project;

import java.io.Serializable;

public class SV  implements Serializable{
    private String Ten;
    private int NamThanhLap;
    private String LinhVuc;
    private String TruSo;
    private int Hinh;
    public SV(String ten, int namThanhLap, String linhVuc, String truSo, int hinh) {
        Ten = ten;
        NamThanhLap = namThanhLap;
        LinhVuc = linhVuc;
        TruSo = truSo;
        Hinh = hinh;
    }
    public int getHinh() { return Hinh; }
    public void setHinh(int hinh) { Hinh = hinh; }
    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }
    public int getNamThanhLap() {
        return NamThanhLap;
    }
    public void setNamThanhLap(int namThanhLap) {
        NamThanhLap = namThanhLap;
    }
    public String getLinhVuc() {
        return LinhVuc;
    }
    public void setLinhVuc(String linhVuc) {
        LinhVuc = linhVuc;
    }
    public String getTruSo() {
        return TruSo;
    }
    public void setTruSo(String truSo) {
        TruSo = truSo;
    }
}
