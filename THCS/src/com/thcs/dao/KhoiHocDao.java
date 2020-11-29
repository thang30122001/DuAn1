
package com.thcs.dao;

import com.thcs.entity.GiangDay;
import com.thcs.entity.KhoiHoc;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhoiHocDao extends ThcsDAO<KhoiHoc, String>{

    @Override
    public void insert(KhoiHoc entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(KhoiHoc entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhoiHoc> selectAll() {
        return selectBySql("select * from khoihoc");
    }

    @Override
    public KhoiHoc selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<KhoiHoc> selectBySql(String sql, Object... args) {
         List<KhoiHoc> list=new ArrayList<>();
        try {
              ResultSet rs=JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                KhoiHoc entity=new KhoiHoc();
               
                entity.setMaKhoiHoc(rs.getString("MaKhoiHoc"));
               entity.setTenKhoiHoc(rs.getString("TenKhoiHoc"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
        }
        return list;
    }

    public List<Object[]> getcboKhoi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
