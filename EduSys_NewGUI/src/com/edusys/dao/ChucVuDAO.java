/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.ChucVu;
import com.edusys.entity.ChuyenDe;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haotn
 */
public class ChucVuDAO extends EduSysDAO<ChucVu, String> {

    String INSERT_SQL = "INSERT INTO CHUCVU (MACV, CHUCVU, PHANQUYEN) VALUE (?, ?, ?)";
    String UPDATE_SQL = "UPDATE CHUCVU SET CHUCVU = ?, PHANQUYEN = ? WHERE MACV = ?";
    String DELETE_SQL = "DELETE FROM CHUCVU WHERE MACV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CHUCVU";
    String SELECT_BY_ID_SQL = "SELECT * FROM CHUCVU WHERE MACV = ?";

    @Override
    public void insert(ChucVu entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getMaCV(), entity.getTenCV(), entity.getPhanQuyen());
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ChucVu entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getTenCV(), entity.getPhanQuyen(), entity.getMaCV());
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
        try {
            XJdbc.update(DELETE_SQL, key);
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<ChucVu> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChucVu selectById(String key) {
        List<ChucVu> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ChucVu> selectBySql(String sql, Object... args) {
        List<ChucVu> list = new ArrayList<>();
        try {
            ResultSet result = XJdbc.query(sql, args);
            while (result.next()) {
                ChucVu entity = new ChucVu();
                entity.setMaCV(result.getString("MACV"));
                entity.setTenCV(result.getString("CHUCVU"));
                entity.setPhanQuyen(result.getString("PHANQUYEN"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<ChucVu> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM CHUCVU WHERE CHUCVU LIKE ?";
        return selectBySql(sql, "%" + keyword + "%");
    }
    public List<ChucVu> selectHaveEmployee(String id){
        String sql ="SELECT * FROM CHUCVU WHERE MACV IN (SELECT MACV FROM NHANVIEN)";
        return  selectBySql(sql, id);
    }
}
