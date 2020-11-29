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
public class LopHoc {

    String MaLH;
    String MaKhoiHoc;
    String MaGVCN;
    String TenLop;
    int SiSo;

    public LopHoc() {
    }

    public LopHoc(String MaLH, String MaKhoiHoc, String MaGVCN, String TenLop, int SiSo) {
        this.MaLH = MaLH;
        this.MaKhoiHoc = MaKhoiHoc;
        this.MaGVCN = MaGVCN;
        this.TenLop = TenLop;
        this.SiSo = SiSo;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getMaKhoiHoc() {
        return MaKhoiHoc;
    }

    public void setMaKhoiHoc(String MaKhoiHoc) {
        this.MaKhoiHoc = MaKhoiHoc;
    }

    public String getMaGVCN() {
        return MaGVCN;
    }

    public void setMaGVCN(String MaGVCN) {
        this.MaGVCN = MaGVCN;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public int getSiSo() {
        return SiSo;
    }

    public void setSiSo(int SiSo) {
        this.SiSo = SiSo;
    }
}
