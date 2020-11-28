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
public class GiangDay {
 String   MaGV;
 String MaLH ;
 String Mon ;

    public GiangDay() {
    }

    public GiangDay(String MaGV, String MaLH, String Mon) {
        this.MaGV = MaGV;
        this.MaLH = MaLH;
        this.Mon = Mon;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getMon() {
        return Mon;
    }

    public void setMon(String Mon) {
        this.Mon = Mon;
    }
 
 
}
