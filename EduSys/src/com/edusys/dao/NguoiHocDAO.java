/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.NguoiHoc;
import com.edusys.helper.XDate;
import com.edusys.helper.Xjdbc;
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

    String INSERT_SQL = "INSERT INTO NGUOIHOC(MANH, HO, TEN, GIOITINH, NGAYSINH, DIENTHOAI, EMAIL, GHICHU, MANV, NGAYDK)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NGUOIHOC SET HO=?, TEN=?, GIOITINH=?, NGAYSINH=?, DIENTHOAI=?, EMAIL=?, GHICHU=?, MANV=? , NGAYDK=? WHERE MANH=?";
    String DELETE_SQL = "DELETE FROM NGUOIHOC WHERE MANH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NGUOIHOC";
    String SELECT_BY_ID_SQL = "SELECT * FROM NGUOIHOC WHERE MANH=?";

    @Override
    public void insert(NguoiHoc entity) {
        try {
            Xjdbc.update(INSERT_SQL, entity.getMaNH(), entity.getHo(), entity.getTen(), entity.getGioiTinh(), entity.getNgaySinh(),
                    entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK());
        } catch (Exception ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NguoiHoc entity) {
        try {
            Xjdbc.update(UPDATE_SQL, entity.getHo(), entity.getTen(), entity.getGioiTinh(), XDate.toDate(entity.getNgaySinh(), "yyyy-MM-dd"),
                    entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK(), entity.getMaNH());
        } catch (Exception ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            Xjdbc.update(DELETE_SQL, id);
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
            ResultSet result = Xjdbc.query(sql, args);
            while (result.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(result.getString("MANH"));
                entity.setHo(result.getString("HO"));
                entity.setTen(result.getString("TEN"));
                entity.setGioiTinh(result.getBoolean("GIOITINH"));
                entity.setNgaySinh(XDate.toString(result.getDate("NGAYSINH"), "yyyy-MM-dd"));
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
        String sql = "SELECT * FROM NGUOIHOC WHERE HO + ' ' +TEN LIKE ? AND MANH NOT IN (SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
        return this.selectBySql(sql, "%" + keyword + "%", makh);
    }

    public List<NguoiHoc> selectByKeyWord( String keyword) {
        String sql = "SELECT * FROM NGUOIHOC WHERE HO + ' ' +TEN LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<NguoiHoc> selectNotlnCourse(int makh) {
        String sql = "SELECT * FROM NGUOIHOC WHERE MANH NOT IN (SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
        return this.selectBySql(sql, makh);
    }
}
