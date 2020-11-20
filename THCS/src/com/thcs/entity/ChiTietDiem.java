/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thcs.entity;

/**
 *
 * @author Admin
 */
public class ChiTietDiem {
    private String MaDiemMon;
    private String MaLoaiKiemTra;
    private double DiemSo;

    public ChiTietDiem() {
    }

    public ChiTietDiem(String MaDiemMon, String MaLoaiKiemTra, double DiemSo) {
        this.MaDiemMon = MaDiemMon;
        this.MaLoaiKiemTra = MaLoaiKiemTra;
        this.DiemSo = DiemSo;
    }
    
    public String getMaDiemMon() {
        return MaDiemMon;
    }

    public void setMaDiemMon(String MaDiemMon) {
        this.MaDiemMon = MaDiemMon;
    }

    public String getMaLoaiKiemTra() {
        return MaLoaiKiemTra;
    }

    public void setMaLoaiKiemTra(String MaLoaiKiemTra) {
        this.MaLoaiKiemTra = MaLoaiKiemTra;
    }

    public double getDiemSo() {
        return DiemSo;
    }

    public void setDiemSo(double DiemSo) {
        this.DiemSo = DiemSo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
