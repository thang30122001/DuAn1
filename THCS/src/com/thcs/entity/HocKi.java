
package com.thcs.entity;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class HocKi {
    private String MaHocKi;
    private Date NgayBatDau;
    private Date NgayKetThuc;
    private String Nam;

    public HocKi() {
    }

    public HocKi(String MaHocKi, Date NgayBatDau, Date NgayKetThuc, String Nam) {
        this.MaHocKi = MaHocKi;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.Nam = Nam;
    }
    
    
    public String getMaHocKi() {
        return MaHocKi;
    }

    public void setMaHocKi(String MaHocKi) {
        this.MaHocKi = MaHocKi;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getNam() {
        return Nam;
    }

    public void setNam(String Nam) {
        this.Nam = Nam;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
