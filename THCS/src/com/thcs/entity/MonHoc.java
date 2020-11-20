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
public class MonHoc {
  private  String MaMH;
  private String TenMonHoc;

    public MonHoc() {
    }

    public MonHoc(String MaMH, String TenMonHoc) {
        this.MaMH = MaMH;
        this.TenMonHoc = TenMonHoc;
    }
  
    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String TenMonHoc) {
        this.TenMonHoc = TenMonHoc;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
  
}
