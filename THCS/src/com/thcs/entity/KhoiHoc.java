
package com.thcs.entity;

/**
 *
 * @author Admin
 */
public class KhoiHoc {
    String MaKhoiHoc;
    String TenKhoiHoc;

    public KhoiHoc() {
    }

    public KhoiHoc(String MaKhoiHoc, String TenKhoiHoc) {
        this.MaKhoiHoc = MaKhoiHoc;
        this.TenKhoiHoc = TenKhoiHoc;
    }

    public String getMaKhoiHoc() {
        return MaKhoiHoc;
    }

    public void setMaKhoiHoc(String MaKhoiHoc) {
        this.MaKhoiHoc = MaKhoiHoc;
    }

    public String getTenKhoiHoc() {
        return TenKhoiHoc;
    }

    public void setTenKhoiHoc(String TenKhoiHoc) {
        this.TenKhoiHoc = TenKhoiHoc;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
