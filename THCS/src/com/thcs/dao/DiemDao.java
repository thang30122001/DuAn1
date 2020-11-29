/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thcs.dao;

import com.thcs.entity.Diem;
import com.thcs.entity.LopHoc;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DiemDao extends ThcsDAO<Diem, String>{

    @Override
    public void insert(Diem entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Diem entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Diem> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diem selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<Diem> selectBySql(String sql, Object... args) {
        List<Diem> list=new ArrayList<>();
        try {
              ResultSet rs=JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                Diem entity=new Diem();
               
                entity.setMaDiemMon(rs.getString("MaDiemMon"));
               entity.setMaHS(rs.getString("MaHS"));
               entity.setMaHocKi(rs.getString("MaHocKi"));
               entity.setMaMH(rs.getString("MaMH"));
               entity.setMaGV(rs.getString("MaGV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
        }
        return list;
    }
    
}
