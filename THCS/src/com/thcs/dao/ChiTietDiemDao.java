/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thcs.dao;

import com.thcs.entity.ChiTietDiem;
import com.thcs.entity.Diem;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChiTietDiemDao extends ThcsDAO<ChiTietDiem,String>{

    @Override
    public void insert(ChiTietDiem entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ChiTietDiem entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChiTietDiem> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChiTietDiem selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<ChiTietDiem> selectBySql(String sql, Object... args) {
         List<ChiTietDiem> list=new ArrayList<>();
        try {
              ResultSet rs=JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                ChiTietDiem entity=new ChiTietDiem();
               
                entity.setMaDiemMon(rs.getString("MaDiemMon"));
               entity.setMaLoaiKiemTra(rs.getString("MaLoaiKiemTra"));
               entity.setDiemSo(rs.getDouble("DiemSo"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
        }
        return list;
    }
    
    
}
