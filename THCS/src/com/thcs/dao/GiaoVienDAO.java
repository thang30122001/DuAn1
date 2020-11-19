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
public class GiaoVienDAO implements ThcsDAO{
    
    String INSERT_SQL = "INSERT INTO GiaoVien (MaGV, MatKhau, HoTen,VaiTro)VALUES (?,?,?,?)";
    String UPDATE_SQL = "UPDATE GiapVien SET MaNH =?, HoTen =?, DiaChi =?, GioiTinh =? WHERE (MaGV = ?)";
    String DELETE_SQL = "DELETE FROM GiaoVien WHERE MaGV=?";
    String SELECT_ALL_SQL = "SELECT * FROM GiaoVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM GiaoVien WHERE MaGV=?";

    public void insert(GiaoVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaMH(), entity.getHoTen(), entity.getDiaChi(), entity.getGioiTinh(), entity.getMaGV());
    }

    public void update(GiaoVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMaMH(), entity.getHoTen(), entity.getDiaChi(), entity.getGioiTinh(), entity.getMaGV());
    }

    public void delete(String MaGV) {
        JdbcHelper.update(DELETE_SQL, MaGV);
    }

    @Override
    public List<GiaoVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }


    public GiaoVien selectById(String MaGV) {
        List<GiaoVien> list = selectBySql(SELECT_BY_ID_SQL, MaGV);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<GiaoVien> selectBySql(String sql, Object... args) {
        List<GiaoVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    GiaoVien entity = readFormResultSet(rs);
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    
    private GiaoVien readFormResultSet(ResultSet rs) throws SQLException {
       GiaoVien entity = new GiaoVien();
        entity.setMaGV(rs.getString("MaGV"));
        entity.setMaMH(rs.getString("MaMH"));
        entity.setHoTen(rs.getString("HoTen"));
        entity.setDiaChi(rs.getString("DiaChi"));
        entity.setGioiTinh(rs.getString("GioiTinh"));
        return entity;
    }

    @Override
    public void insert(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object selectById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
