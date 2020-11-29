/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thcs.dao;

import com.thcs.entity.GiangDay;
import com.thcs.entity.LoaiKiemTra;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LoaiKiemTraDao extends ThcsDAO<LoaiKiemTra, String>{

    @Override
    public void insert(LoaiKiemTra entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(LoaiKiemTra entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LoaiKiemTra> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoaiKiemTra selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<LoaiKiemTra> selectBySql(String sql, Object... args) {
         List<LoaiKiemTra> list=new ArrayList<>();
        try {
              ResultSet rs=JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                LoaiKiemTra entity=new LoaiKiemTra();
               
                entity.setMaLoaiKiemTra(rs.getString("MaLoaiKiemTra"));
               entity.setTenLoaiKiemTra(rs.getString("TenLoaiKiemTra"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
        }
        return list;
    }
    
}
