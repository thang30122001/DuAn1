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
public class LoaiKiemTra {
    private String MaLoaiKiemTra;
    private String TenLoaiKiemTra;

    public LoaiKiemTra() {
    }

    public LoaiKiemTra(String MaLoaiKiemTra, String TenLoaiKiemTra) {
        this.MaLoaiKiemTra = MaLoaiKiemTra;
        this.TenLoaiKiemTra = TenLoaiKiemTra;
    }

    public String getMaLoaiKiemTra() {
        return MaLoaiKiemTra;
    }

    public void setMaLoaiKiemTra(String MaLoaiKiemTra) {
        this.MaLoaiKiemTra = MaLoaiKiemTra;
    }

    public String getTenLoaiKiemTra() {
        return TenLoaiKiemTra;
    }

    public void setTenLoaiKiemTra(String TenLoaiKiemTra) {
        this.TenLoaiKiemTra = TenLoaiKiemTra;
    }
    
}
