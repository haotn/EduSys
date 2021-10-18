/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.ChuyenDe;
import com.edusys.entity.User;
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
public class UserDAO {
    String INSERT_SQL = "INSERT INTO NHOMATKHAU (TAIKHOAN, MATKHAU) VALUES (?, ?)";
    String UPDATE_SQL = "UPDATE NHOMATKHAU SET MATKHAU = ?  WHERE TAIKHOAN = ?";
    String DELETE_SQL = "DELETE FROM NHOMATKHAU WHERE TAIKHOAN = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NHOMATKHAU";
    

    public void insert(User entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getTaiKhoan(), entity.getMatKhau());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void update(User entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getTaiKhoan(), entity.getMatKhau());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void delete(String id) {
        try {
            XJdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<User> selectAll() {
              List<User> list = new ArrayList<>();
        try {
            ResultSet result = XJdbc.query(SELECT_ALL_SQL);
            while (result.next()) {
                User entity = new User();
                entity.setTaiKhoan(result.getString("TAIKHOAN"));
                entity.setMatKhau(result.getString("MATKHAU"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
