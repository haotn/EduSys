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
public class ChuyenDe {

    private String MaCD;
    private String TenCD;
    private float hocPhi;
    private int thoiLuong;
    private String hinhCD;
    private String moTa;

    public ChuyenDe() {
    }

    public ChuyenDe(String MaCD, String TenCD, float hocPhi, int thoiLuong, String hinhCD, String moTa) {
        this.MaCD = MaCD;
        this.TenCD = TenCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.hinhCD = hinhCD;
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return this.TenCD;
    }

    @Override
    public boolean equals(Object o) {
        ChuyenDe other = (ChuyenDe) o;
        return other.getMaCD().equals(this.getMaCD());
    }

    /**
     * @return the MaCD
     */
    public String getMaCD() {
        return MaCD;
    }

    /**
     * @param MaCD the MaCD to set
     */
    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    /**
     * @return the TenCD
     */
    public String getTenCD() {
        return TenCD;
    }

    /**
     * @param TenCD the TenCD to set
     */
    public void setTenCD(String TenCD) {
        this.TenCD = TenCD;
    }

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
     * @return the thoiLuong
     */
    public int getThoiLuong() {
        return thoiLuong;
    }

    /**
     * @param thoiLuong the thoiLuong to set
     */
    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    /**
     * @return the hinhCD
     */
    public String getHinhCD() {
        return hinhCD;
    }

    /**
     * @param hinhCD the hinhCD to set
     */
    public void setHinhCD(String hinhCD) {
        this.hinhCD = hinhCD;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
