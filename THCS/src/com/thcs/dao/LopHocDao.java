/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thcs.dao;

import com.thcs.entity.LopHoc;
import com.thcs.entity.NguoiDung;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LopHocDao extends ThcsDAO<LopHoc, String> {

    String INSERT_SQL = "INSERT INTO LopHoc (MaLH,MaKhoiHoc,MaGVCN,TenLop,SiSo)VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE LopHoc SET MaKhoiHoc=?, MaGVCN=?, TenLop=?, SiSo=? WHERE (MaLH = ?)";
    String DELETE_SQL = "DELETE FROM MonHoc where MaLH=?";
    String SELECT_ALL_SQL = "SELECT * FROM LopHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM MonHoc WHERE MaLh=?";

    @Override
    public void insert(LopHoc entity) {
        JdbcHelper.executeUpdate(INSERT_SQL, entity.getMaLH(), entity.getMaKhoiHoc(), entity.getMaGVCN(), entity.getTenLop(), entity.getSiSo());
    }

    @Override
    public void update(LopHoc entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL, entity.getMaKhoiHoc(), entity.getMaGVCN(), entity.getTenLop(), entity.getSiSo(), entity.getMaLH());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.executeUpdate(DELETE_SQL, id);
    }

    @Override
    public List<LopHoc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    public List<LopHoc> selectAlldistinct() {
        return selectBySql1("select distinct makhoihoc FroM lophoc");
    }

    @Override
    public LopHoc selectById(String id) {
        List<LopHoc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    List<LopHoc> selectBySql(String sql, Object... args) {
        List<LopHoc> list = new ArrayList<LopHoc>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                LopHoc entity = new LopHoc();
                entity.setMaLH(rs.getString("MaLH"));
                entity.setMaKhoiHoc(rs.getString("MaKhoiHoc"));
                entity.setTenLop(rs.getString("TenLop"));
                entity.setSiSo(rs.getInt("SiSo"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    List<LopHoc> selectBySql1(String sql, Object... args) {
        List<LopHoc> list = new ArrayList<LopHoc>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                LopHoc entity = new LopHoc();

                entity.setMaKhoiHoc(rs.getString("MaKhoiHoc"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<LopHoc> selectByKhoiHoc(String maKhoiHoc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LopHoc> selectByK(String maKhoiHoc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Object[]> getcboKhoi(String mahocki) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "select distinct KhoiHoc.MaLH,TenLop,Khoi,SiSo\n"
                        + "Select * From LopHoc where MaLH \n"
                        + "From LopHoc inner join KhoiHoc on KhoiHoc.MaKhoiHoc=LopHoc.MaKhoiHoc\n"
                        + "Select * From LopHoc where TenLop\n"
                        + "Select * From LopHoc where SiSo\n"
                        + "where MaLH=?";
                rs = JdbcHelper.executeQuery(sql, mahocki);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaLH"),
                        rs.getString("MaKhoiHoc"),
                        rs.getString("TenLop"),
                        rs.getDouble("SiSo"),};
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<Object[]> getcboLop(String mahocki) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "select distinct KhoiHoc.MaLH,TenLop,Khoi,SiSo\n"
                        + "Select * From LopHoc where MaLH \n"
                        + "From LopHoc inner join KhoiHoc on KhoiHoc.MaKhoiHoc=LopHoc.MaKhoiHoc\n"
                        + "Select * From LopHoc where TenLop\n"
                        + "Select * From LopHoc where SiSo\n"
                        + "where MaLH=?";
                rs = JdbcHelper.executeQuery(sql, mahocki);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaLH"),
                        rs.getString("MaKhoiHoc"),
                        rs.getString("TenLop"),
                        rs.getDouble("SiSo"),};
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<Object[]> getcboLop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
