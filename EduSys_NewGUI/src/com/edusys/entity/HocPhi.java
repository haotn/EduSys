/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.entity;

import java.util.Date;

/**
 *
 * @author haotn
 */
public class HocPhi {

    private float hocPhi;
    private String maNV;
    private Date ngayDoi;

    /**
     * @return the hocPhi
     */
    public float getHocPhi() {
        return hocPhi;
    }

    /**
     * @param hocPhi the hocPhi to set
     */
    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the ngayDoi
     */
    public Date getNgayDoi() {
        return ngayDoi;
    }

    /**
     * @param ngayDoi the ngayDoi to set
     */
    public void setNgayDoi(Date ngayDoi) {
        this.ngayDoi = ngayDoi;
    }

}
