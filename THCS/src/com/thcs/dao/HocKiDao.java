/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thcs.dao;

import java.util.List;
import com.thcs.entity.HocKi;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class HocKiDao extends ThcsDAO<HocKi,String>{
     String INSERT_SQL = "INSERT INTO HocSinh (MaHS,MaLH,HoTen,DiaChi,GioiTinh)VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HocSinh SET MaLH=?,HoTen =?, DiaChi =?, GioiTinh =? WHERE (MaHS = ?)";
    String DELETE_SQL = "DELETE FROM HocSinh WHERE MaHS=?";
    String SELECT_ALL_SQL = "SELECT * HocSinh";
    String SELECT_BY_ID_SQL = "SELECT * FROM HocSinh WHERE MaHS=?";
    @Override
    public void insert(HocKi entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(HocKi entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HocKi> selectAll() {
        return selectBySql("select * from HocKi");
    }

    @Override
    public HocKi selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<HocKi> selectBySql(String sql, Object... args) {
        List<HocKi> list = new ArrayList<HocKi>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                HocKi entity = new HocKi();
                entity.setMaHocKi(rs.getString("MaHocKi"));
                entity.setNgayBatDau(rs.getDate("NgayBatDau"));
                entity.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                entity.setNam(rs.getString("Nam"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

//    public List<HocKi> selectHocKi() {
//        return selectBySql("select MaHocKi from HocKi");
//    }
    
}
