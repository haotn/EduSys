/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.entity;

/**
 *
 * @author haotn
 */
public class ChucVu {
    public String maCV;
    public String tenCV;
    private String phanQuyen;

    @Override
    public String toString(){
    return this.tenCV;
    }
    /**
     * @return the maCV
     */
    public String getMaCV() {
        return maCV;
    }

    /**
     * @param maCV the maCV to set
     */
    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    /**
     * @return the tenCV
     */
    public String getTenCV() {
        return tenCV;
    }

    /**
     * @param tenCV the tenCV to set
     */
    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    /**
     * @return the phanQuyen
     */
    public String getPhanQuyen() {
        return phanQuyen;
    }

    /**
     * @param phanQuyen the phanQuyen to set
     */
    public void setPhanQuyen(String phanQuyen) {
        this.phanQuyen = phanQuyen;
    }
}
