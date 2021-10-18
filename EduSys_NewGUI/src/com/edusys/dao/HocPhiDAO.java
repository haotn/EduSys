/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.HocPhi;
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
public class HocPhiDAO {

    String UPDATE_SQL = "UPDATE HOCPHI SET HOCPHI = ?, MANV = ?, NGAYDOI = ?";
    String SELECT_SQL = "SELECT * FROM HOCPHI";

    public void update(HocPhi hp) {
        try {
            XJdbc.update(UPDATE_SQL, hp.getHocPhi(), hp.getMaNV(), hp.getNgayDoi());
        } catch (SQLException ex) {
            Logger.getLogger(HocPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public HocPhi selectHocPhi() {
        List<HocPhi> list = new ArrayList<>();
        try {
            ResultSet result = XJdbc.query(SELECT_SQL);
            while (result.next()) {
                HocPhi entity = new HocPhi();
                entity.setHocPhi(result.getFloat("HOCPHI"));
                entity.setMaNV(result.getString("MANV"));
                entity.setNgayDoi(result.getDate("NGAYDOI"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list.get(0);
        } catch (SQLException e) {
            Logger.getLogger(HocPhiDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new RuntimeException(e);
        }
    }
}
