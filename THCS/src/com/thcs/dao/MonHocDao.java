
package com.thcs.dao;

import com.thcs.entity.MonHoc;
import com.thcs.entity.NguoiDung;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MonHocDao extends ThcsDAO<MonHoc, String>{
    String INSERT_SQL = "INSERT INTO MonHoc (MaMh,TenMonHoc)VALUES (?,?)";
    String UPDATE_SQL = "UPDATE MonHoc SET TenMonHoc=? WHERE (MaMH = ?)";
    String DELETE_SQL = "DELETE FROM MonHoc where MaMH=?";
    String SELECT_ALL_SQL = "SELECT * FROM MonHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM MonHoc WHERE MaMH=?";

    @Override
    public void insert(MonHoc entity) {
        JdbcHelper.executeUpdate(INSERT_SQL,entity.getMaMH(),entity.getTenMonHoc());
    }

    @Override
    public void update(MonHoc entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,entity.getTenMonHoc(),entity.getMaMH());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.executeUpdate(DELETE_SQL,id);
    }

    @Override
    public List<MonHoc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MonHoc selectById(String id) {
        List<MonHoc> list=this.selectBySql(SELECT_BY_ID_SQL,id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    List<MonHoc> selectBySql(String sql, Object... args) {
        List<MonHoc> list = new ArrayList<MonHoc>();
        try {
            ResultSet rs=JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                MonHoc entity=new MonHoc();
                entity.setMaMH(rs.getString("MaMH"));
                entity.setTenMonHoc(rs.getString("TenMonHoc"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

   


    
}
