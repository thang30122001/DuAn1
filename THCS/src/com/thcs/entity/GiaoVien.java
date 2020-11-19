package com.thcs.entity;

public class GiaoVien {

    private String MaGV;
    private String MaMH;
    private String HoTen;
    private String DiaChi;
    private String GioiTinh;

    public GiaoVien() {
    }

    public GiaoVien(String MaGV, String MaMH, String HoTen, String DiaChi, String GioiTinh) {
        this.MaGV = MaGV;
        this.MaMH = MaMH;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public boolean isChucVu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
