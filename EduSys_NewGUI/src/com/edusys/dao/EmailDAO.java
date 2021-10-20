/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.Email;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haotn
 */
public class EmailDAO {
    String SELECT_ALL_SQL = "SELECT * FROM EMAIL";

    public List<Email> selectAll() {
        List<Email> list = new ArrayList<>();
        try {
            ResultSet result = XJdbc.query(SELECT_ALL_SQL);
            while (result.next()) {
                Email entity = new Email();
                entity.setEmail(result.getString("EMAIL"));
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
