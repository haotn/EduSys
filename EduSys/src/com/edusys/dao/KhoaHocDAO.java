/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.ChuyenDe;
import com.edusys.entity.KhoaHoc;
import com.edusys.helper.XDate;
import com.edusys.helper.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.beans.binding.Bindings.select;

/**
 *
 * @author KI
 */
public class KhoaHocDAO {

    String INSERT_SQL = "INSERT INTO KHOAHOC(MaCD, HocPhi, ThoiLuong, NGAYKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE KHOAHOC SET NGAYKG = ?, GHICHU = ? WHERE MAKH = ?";
    String DELETE_SQL = "DELETE FROM KHOAHOC WHERE MAKH = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KHOAHOC";
    String SELECT_BY_ID_SQL = "SELECT * FROM KHOAHOC WHERE MaKH = ?";

    public void insert(KhoaHoc entity) {
        try {
            Xjdbc.update(INSERT_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(KhoaHoc entity) {
        try {
            Xjdbc.update(UPDATE_SQL, entity.getNgayKG(), entity.getGhiChu(), entity.getMaKH());
        } catch (SQLException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void detele(Integer MaKH) {
        try {
            Xjdbc.update(DELETE_SQL, MaKH);
        } catch (SQLException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<KhoaHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public KhoaHoc selectById(int id) {
        List<KhoaHoc> list = this.selectBySql(SELECT_BY_ID_SQL, id); // đang lỗi 
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<KhoaHoc>();
        try {
            ResultSet result = Xjdbc.query(sql, args);
            while (result.next()) {
                KhoaHoc entity = new KhoaHoc();
                entity.setMaKH(result.getInt("MAKH"));
                entity.setHocPhi(result.getDouble("HOCPHI"));
                entity.setThoiLuong(result.getInt("THOILUONG"));
                entity.setNgayKG(result.getDate("NGAYKG"));
                entity.setGhiChu(result.getString("GHICHU"));
                entity.setMaNV(result.getString("MaNV"));
                entity.setNgayTao(result.getDate("NgayTao"));

                entity.setMaCD(result.getString("MACD"));

                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<KhoaHoc> selectByChuyenDe(String maCD) {
        String sql = "SELECT * FROM KHOAHOC WHERE MACD = ?";
        return this.selectBySql(sql, maCD);
    }

    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT YEAR(NGAYKG) FROM KHOAHOC ORDER BY YEAR(NGAYKG) DESC";
        List<Integer> list = new ArrayList();
        try {
            ResultSet rs = Xjdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public KhoaHoc checkForDelete(int makh) {
        String sql = "SELECT * FROM HOCVIEN WHERE MAKH = ?";
        return selectBySql(sql, makh).get(0);
    }

}
