/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.PhanQuyen;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haotn
 */
public class PhanQuyenDAO {

    String SELECT_ALL_SQL = "SELECT * FROM PHANQUYEN";

    public List<PhanQuyen> selectALL() {
        List<PhanQuyen> list = new ArrayList<PhanQuyen>();
        try {
            ResultSet result = XJdbc.query(SELECT_ALL_SQL);
            while (result.next()) {
                PhanQuyen entity = new PhanQuyen();
                entity.setMaPQ(result.getInt("MAQUYEN"));
                entity.setTenPQ(result.getString("TENQUYEN"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
