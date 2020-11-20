package com.thcs.dao;

import com.thcs.entity.NguoiDung;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.thcs.helper.JdbcHelper;

/**
 *
 * @author Admin
 */
public class NguoiDungDAO extends ThcsDAO<NguoiDung, String>{
    
    String INSERT_SQL = "INSERT INTO NguoiDung (ChucVu, Username, Password)VALUES (?,?,?)";
    String UPDATE_SQL = "UPDATE NguoiDung SET ChucVu =?, Password =? WHERE (Username = ?)";
    String DELETE_SQL = "DELETE FROM NguoiDung WHERE Username=?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiDung";
    String SELECT_BY_ID_SQL = "SELECT * FROM NguoiDung WHERE Username=?";

    @Override
    public void insert(NguoiDung entity) {
        JdbcHelper.executeUpdate(INSERT_SQL, entity.getUsername(), entity.getPassword(), entity.getChucVu());
    }

    @Override
    public void update(NguoiDung entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL, entity.getUsername(), entity.getPassword(), entity.getChucVu());
    }

    @Override
    public void delete(String ChucVu) {
        JdbcHelper.executeUpdate(DELETE_SQL, ChucVu);
    }

    @Override
    public List<NguoiDung> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiDung selectById(String ChucVu) {
        List<NguoiDung> list = selectBySql(SELECT_BY_ID_SQL, ChucVu);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NguoiDung> selectBySql(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<NguoiDung>();
        try {
            ResultSet rs=JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                NguoiDung entity=new NguoiDung();
                entity.setUsername(rs.getString("username"));
                entity.setPassword(rs.getString("password"));
                entity.setChucVu(rs.getBoolean("chucvu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

   
   
    
}
