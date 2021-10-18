/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.NhanVien;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KI
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NHANVIEN(MANV, HOTEN, MATKHAU, MACV, EMAIL) VALUES ( ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NHANVIEN SET  HOTEN =?, MATKHAU =?, MACV = ?, EMAIL = ? WHERE MANV =?";
    String DELETE_SQL = "DELETE FROM NHANVIEN WHERE MANV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NHANVIEN";
    String SELECT_BY_ID_SQL = "SELECT * FROM NHANVIEN WHERE MANV = ?";

    @Override
    public void insert(NhanVien entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getMaNV(), entity.getHoTen(), entity.getMatKhau(), entity.getMaCV(), entity.getEmail());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getHoTen(), entity.getMatKhau(), entity.getMaCV(), entity.getEmail(), entity.getMaNV());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void delete(String id) {
        try {
            XJdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet result = XJdbc.query(sql, args);
            while (result.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(result.getString("MANV"));
                entity.setMatKhau(result.getString("MATKHAU"));
                entity.setHoTen(result.getString("HOTEN"));
                entity.setMaCV(result.getString("MACV"));
                entity.setEmail(result.getString("EMAIL"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<NhanVien> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM NHANVIEN WHERE HOTEN LIKE ?";
        return selectBySql(sql, "%" + keyword + "%");
    }

}
