package com.thcs.dao;

import com.thcs.entity.GiaoVien;
import java.util.List;
import com.thcs.helper.JdbcHelper;
import com.thcs.entity.GiaoVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GiaoVienDAO extends ThcsDAO<GiaoVien, String>{
    
    String INSERT_SQL = "INSERT INTO GiaoVien (MaGV, MatKhau, HoTen,VaiTro)VALUES (?,?,?,?)";
    String UPDATE_SQL = "UPDATE GiapVien SET MaNH =?, HoTen =?, DiaChi =?, GioiTinh =? WHERE (MaGV = ?)";
    String DELETE_SQL = "DELETE FROM GiaoVien WHERE MaGV=?";
    String SELECT_ALL_SQL = "SELECT * FROM GiaoVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM GiaoVien WHERE MaGV=?";

    @Override
    public void insert(GiaoVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(GiaoVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GiaoVien> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GiaoVien selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<GiaoVien> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
