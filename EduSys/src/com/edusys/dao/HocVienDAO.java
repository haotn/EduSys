/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.HocVien;
import com.edusys.helper.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class HocVienDAO extends EduSysDAO<HocVien, String>{
    String INSERT_SQL = "INSERT INTO HOCVIEN(MAHV, MAKH, MANH, DIEM) VALUES (?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE HOCVIEN SET MAKH = ?, MANH = ?, DIEM = ? WHERE MAHV = ?";
    String DELETE_SQL = "DELETE FROM HOCVIEN WHERE MAHV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CHUYENDE";
    String SELECT_BY_ID_SQL = "SELECT * FROM HOCVIEN WHERE MAHV = ?";

    @Override
    public void insert(HocVien entity) {
        try {
            Xjdbc.update(INSERT_SQL, entity.getMaHV(), entity.getMaKH(), entity.getMaNH(), entity.getDiem());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(HocVien entity) {
        try {
            Xjdbc.update(UPDATE_SQL, entity.getMaHV(), entity.getMaKH(), entity.getMaNH(), entity.getDiem());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            Xjdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectById(String id) {
        List<HocVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<HocVien>();
        try {
            ResultSet result = Xjdbc.query(sql, args);
            while (result.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(result.getInt("MAHV"));
                entity.setMaKH(result.getInt("MAKH"));
                entity.setMaNH(result.getString("NH"));
                entity.setDiem(result.getInt("Diem"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}