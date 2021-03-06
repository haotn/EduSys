/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.NguoiHoc;
import com.edusys.helper.XDate;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QUOC DAO
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {

    String INSERT_SQL = "INSERT INTO NGUOIHOC(MANH, HOTEN, GIOITINH, NGAYSINH, DIENTHOAI, EMAIL, GHICHU, MANV)"
            + "VALUES(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NGUOIHOC SET HOTEN=?, GIOITINH=?, NGAYSINH=?, DIENTHOAI=?, EMAIL=?, GHICHU=?, MANV=? WHERE MANH=?";
    String DELETE_SQL = "DELETE FROM NGUOIHOC WHERE MANH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NGUOIHOC";
    String SELECT_BY_ID_SQL = "SELECT * FROM NGUOIHOC WHERE MANH=?";

    @Override
    public void insert(NguoiHoc entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getMaNH(), entity.getHoTen(), entity.getGioiTinh(), entity.getNgaySinh(),
                    entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV());
        } catch (Exception ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NguoiHoc entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getHoTen(), entity.getGioiTinh(), entity.getNgaySinh(),
                    entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getMaNH());
        } catch (Exception ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            XJdbc.update(DELETE_SQL, id);
        } catch (Exception ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectById(String id) {
        List<NguoiHoc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NguoiHoc> selectBySql(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<NguoiHoc>();
        try {
            ResultSet result = XJdbc.query(sql, args);
            while (result.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(result.getString("MANH"));
                entity.setHoTen(result.getString("HOTEN"));
                entity.setGioiTinh(result.getBoolean("GIOITINH"));
                entity.setNgaySinh(result.getDate("NGAYSINH"));
                entity.setDienThoai(result.getString("DIENTHOAI"));
                entity.setEmail(result.getString("EMAIL"));
                entity.setGhiChu(result.getString("GHICHU"));
                entity.setMaNV(result.getString("MANV"));
                entity.setNgayDK(result.getDate("NGAYDK"));
                list.add(entity);
            }
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<NguoiHoc> selectByKeyWordAndNotInCourse(int makh, String keyword) {
        String sql = "SELECT * FROM NGUOIHOC WHERE HOTEN LIKE ? AND MANH NOT IN (SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
        return this.selectBySql(sql, "%" + keyword + "%", makh);
    }

    public List<NguoiHoc> selectByKeyWord( String keyword) {
        String sql = "SELECT * FROM NGUOIHOC WHERE HOTEN LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<NguoiHoc> selectNotlnCourse(int makh) {
        String sql = "SELECT * FROM NGUOIHOC WHERE MANH NOT IN (SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
        return this.selectBySql(sql, makh);
    }
}
