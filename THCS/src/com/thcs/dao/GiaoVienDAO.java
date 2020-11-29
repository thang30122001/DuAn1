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
    String UPDATE_SQL = "UPDATE GiaoVien SET MaMH =?, HoTen =?, DiaChi =?, GioiTinh =? WHERE (MaGV = ?)";
    String DELETE_SQL = "DELETE FROM GiaoVien WHERE MaGV=?";
    String SELECT_ALL_SQL = "SELECT * FROM GiaoVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM GiaoVien WHERE MaGV=?";

    @Override
    public void insert(GiaoVien entity) {
        JdbcHelper.executeUpdate(INSERT_SQL,entity.getMaGV(),entity.getMaMH(),entity.getHoTen(),entity.getDiaChi(),entity.isGioiTinh());
    }

    @Override
    public void update(GiaoVien entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,entity.getMaMH(),entity.getHoTen(),entity.getDiaChi(),entity.isGioiTinh(),entity.getMaGV());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.executeUpdate(id);
    }

    @Override
    public List<GiaoVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public GiaoVien selectById(String id) {
        List<GiaoVien> list = this.selectBySql("SELECT * FROM GiaoVien WHERE MaGV=?", id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    List<GiaoVien> selectBySql(String sql, Object... args) {
        List<GiaoVien> list = new ArrayList<GiaoVien>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                GiaoVien entity = new GiaoVien();
                entity.setMaGV(rs.getString("MaGV"));
                entity.setMaMH(rs.getString("MaMH"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();

        } catch (Exception e) {
        }
        return list; 
    }

}
