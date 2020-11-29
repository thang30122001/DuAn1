/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thcs.dao;

import com.thcs.entity.GiaoVien;
import com.thcs.entity.HocSinh;
import com.thcs.helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HocSinhDao extends ThcsDAO<HocSinh, String> {

    String INSERT_SQL = "INSERT INTO HocSinh (MaHS,MaLH,HoTen,DiaChi,GioiTinh)VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HocSinh SET MaLH=?,HoTen =?, DiaChi =?, GioiTinh =? WHERE (MaHS = ?)";
    String DELETE_SQL = "DELETE FROM HocSinh WHERE MaHS=?";
    String SELECT_ALL_SQL = "SELECT * HocSinh";
    String SELECT_BY_ID_SQL = "SELECT * FROM HocSinh WHERE MaHS=?";

    @Override
    public void insert(HocSinh entity) {
        JdbcHelper.executeUpdate(INSERT_SQL, entity.getMaHS(), entity.getMaLH(), entity.getHoTen(), entity.getDiaChi(), entity.isGioiTinh());
    }

    @Override
    public void update(HocSinh entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL, entity.getMaLH(), entity.getHoTen(), entity.getDiaChi(), entity.isGioiTinh(), entity.getMaHS());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.executeUpdate(DELETE_SQL, id);
    }

    @Override
    public List<HocSinh> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocSinh selectById(String id) {
        List<HocSinh> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    List<HocSinh> selectBySql(String sql, Object... args) {
        List<HocSinh> list = new ArrayList<HocSinh>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                HocSinh entity = new HocSinh();
                entity.setMaHS(rs.getString("MaHS"));
                entity.setMaLH(rs.getString("MaLH"));
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

    public List<Object[]> getBangHocSinh() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "select distinct hocsinh.MaHS,HoTen,TenLop,DiemMieng,DiemViet,DiemThucHanh,TenMonHoc,hocki.MaHocKi\n"
                        + "From Diem inner join HocSinh on Diem.MaHS=HocSinh.MaHS\n"
                        + "inner join LopHoc on LopHoc.MaLH=HocSinh.MaLH\n"
                        + "inner join HocKi on HocKi.MaHocKi=Diem.MaHocKi\n"
                        + "inner join MonHoc on MonHoc.MaMH=Diem.MaMH";
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaHS"),
                        rs.getString("HoTen"),
                        rs.getString("TenLop"),
                        rs.getDouble("DiemMieng"),
                        rs.getDouble("DiemViet"),
                        rs.getDouble("DiemThucHanh"),};
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

    public List<Object[]> getcboKhoi(String mahocki) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "select distinct hocsinh.MaHS,HoTen,TenLop,DiemMieng,DiemViet,DiemThucHanh\n"
                        + "From Diem inner join HocSinh on Diem.MaHS=HocSinh.MaHS\n"
                        + "inner join LopHoc on LopHoc.MaLH=HocSinh.MaLH\n"
                        + "inner join KhoiHoc on KhoiHoc.MaKhoiHoc=LopHoc.MaKhoiHoc\n"
                        + "inner join HocKi on HocKi.MaHocKi=Diem.MaHocKi\n"
                        + "inner join MonHoc on MonHoc.MaMH=Diem.MaMH\n"
                        + "where TenKhoiHoc=?";
                rs = JdbcHelper.executeQuery(sql, mahocki);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaHS"),
                        rs.getString("HoTen"),
                        rs.getString("TenLop"),
                        rs.getDouble("DiemMieng"),
                        rs.getDouble("DiemViet"),
                        rs.getDouble("DiemThucHanh"),};
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

    public List<Object[]> getcboHocKy(String mahocki) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "select distinct hocsinh.MaHS,HoTen,TenLop,DiemMieng,DiemViet,DiemThucHanh\n"
                        + "From Diem inner join HocSinh on Diem.MaHS=HocSinh.MaHS\n"
                        + "inner join LopHoc on LopHoc.MaLH=HocSinh.MaLH\n"
                        + "inner join HocKi on HocKi.MaHocKi=Diem.MaHocKi\n"
                        + "inner join MonHoc on MonHoc.MaMH=Diem.MaMH\n"
                        + "where diem.MaHocKi=?";
                rs = JdbcHelper.executeQuery(sql, mahocki);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaHS"),
                        rs.getString("HoTen"),
                        rs.getString("TenLop"),
                        rs.getDouble("DiemMieng"),
                        rs.getDouble("DiemViet"),
                        rs.getDouble("DiemThucHanh"),};
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
                String sql = "select distinct hocsinh.MaHS,HoTen,TenLop,DiemMieng,DiemViet,DiemThucHanh\n"
                        + "From Diem inner join HocSinh on Diem.MaHS=HocSinh.MaHS\n"
                        + "inner join LopHoc on LopHoc.MaLH=HocSinh.MaLH\n"
                        + "inner join KhoiHoc on KhoiHoc.MaKhoiHoc=LopHoc.MaKhoiHoc\n"
                        + "inner join HocKi on HocKi.MaHocKi=Diem.MaHocKi\n"
                        + "inner join MonHoc on MonHoc.MaMH=Diem.MaMH\n"
                        + "where TenLop=?";
                rs = JdbcHelper.executeQuery(sql, mahocki);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaHS"),
                        rs.getString("HoTen"),
                        rs.getString("TenLop"),
                        rs.getDouble("DiemMieng"),
                        rs.getDouble("DiemViet"),
                        rs.getDouble("DiemThucHanh"),};
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
}
