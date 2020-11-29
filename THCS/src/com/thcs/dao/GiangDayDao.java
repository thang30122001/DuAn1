/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thcs.dao;

import com.thcs.entity.ChiTietDiem;
import com.thcs.entity.GiangDay;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GiangDayDao extends  ThcsDAO<GiangDay,String>{

    @Override
    public void insert(GiangDay entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(GiangDay entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GiangDay> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GiangDay selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<GiangDay> selectBySql(String sql, Object... args) {
        List<GiangDay> list=new ArrayList<>();
        try {
              ResultSet rs=JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                GiangDay entity=new GiangDay();
               
                entity.setMaGV(rs.getString("MaGV"));
               entity.setMaLH(rs.getString("MaLH"));
               entity.setMon(rs.getString("Mon"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
        }
        return list;
    }
    
}
