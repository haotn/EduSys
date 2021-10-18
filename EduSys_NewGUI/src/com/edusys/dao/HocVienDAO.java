/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.HocVien;
import com.edusys.entity.KhoaHoc;
import com.edusys.helper.XJdbc;
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
public class HocVienDAO extends EduSysDAO<HocVien, Integer> {

    String INSERT_SQL = " INSERT INTO HOCVIEN( MAKH, MANH, DIEM) VALUES ( ?, ?, ?)";
    String UPDATE_SQL = "UPDATE HOCVIEN SET MAKH = ?, MANH = ?, DIEM = ? WHERE MAHV = ?";
    String DELETE_SQL = "DELETE FROM HOCVIEN WHERE MAHV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CHUYENDE";
    String SELECT_BY_ID_SQL = "SELECT * FROM HOCVIEN WHERE MAHV = ?";

    @Override
    public void insert(HocVien entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(HocVien entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem(), entity.getMaHV());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Integer id) {
        try {
            XJdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectById(Integer id) {
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
            ResultSet result = XJdbc.query(sql, args);
            while (result.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(result.getInt("MAHV"));
                entity.setMaKH(result.getInt("MAKH"));
                entity.setMaNH(result.getString("MANH"));
                entity.setDiem(result.getInt("Diem"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HocVien> selectByKhoaHoc(int maKH) {
        String sql = "select * from HocVien where MaKH = ?";
        return this.selectBySql(sql, maKH);
    }

//    public List<HocVien> selectByKeyWord(String keyword, KhoaHoc kh) {
//        String sql = "SELECT * FROM HOCVIEN  WHERE  MAKH = ?";
//        return selectBySql(sql, "%" + keyword + "%",  kh.getMaKH());
//    }
}
