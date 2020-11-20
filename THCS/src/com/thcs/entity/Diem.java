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
public class Diem {
    private String MaDiemMon;
    private String MaHS;
    private String MaHocKi;
    private String MaMH;
    private String MaGV;

    public Diem() {
    }

    public Diem(String MaDiemMon, String MaHS, String MaHocKi, String MaMH, String MaGV) {
        this.MaDiemMon = MaDiemMon;
        this.MaHS = MaHS;
        this.MaHocKi = MaHocKi;
        this.MaMH = MaMH;
        this.MaGV = MaGV;
    }

    public String getMaDiemMon() {
        return MaDiemMon;
    }

    public void setMaDiemMon(String MaDiemMon) {
        this.MaDiemMon = MaDiemMon;
    }

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    public String getMaHocKi() {
        return MaHocKi;
    }

    public void setMaHocKi(String MaHocKi) {
        this.MaHocKi = MaHocKi;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
