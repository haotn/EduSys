/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import AppPackage.AnimationClass;
import com.edusys.helper.MsgBox;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author haotn
 */
public class PanelHuongDan extends javax.swing.JPanel {

    /**
     * Creates new form PanelHuongDan
     */
    AnimationClass ac = new AnimationClass();

    public PanelHuongDan() {
        initComponents();
        trai.setBackground(new Color(0, 0, 0, 1));
        phai.setBackground(new Color(0, 0, 0, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trai = new javax.swing.JButton();
        phai = new javax.swing.JButton();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        lblImg4 = new javax.swing.JLabel();
        lblImg5 = new javax.swing.JLabel();
        lblImg6 = new javax.swing.JLabel();
        lblImg7 = new javax.swing.JLabel();
        lblImg8 = new javax.swing.JLabel();
        lblImg9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/Trai.png"))); // NOI18N
        trai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traiActionPerformed(evt);
            }
        });
        add(trai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 60, 150));

        phai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/Phai.png"))); // NOI18N
        phai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaiActionPerformed(evt);
            }
        });
        add(phai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 300, 60, 150));

        lblImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HDEduSys.png"))); // NOI18N
        lblImg1.setOpaque(true);
        add(lblImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));

        lblImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HDTaiKhoan.png"))); // NOI18N
        lblImg2.setOpaque(true);
        add(lblImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 1200, 750));

        lblImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HDNhanVien.png"))); // NOI18N
        lblImg3.setOpaque(true);
        add(lblImg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2400, 0, 1200, 750));

        lblImg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HDHocVien.png"))); // NOI18N
        lblImg4.setText("jLabel1");
        lblImg4.setOpaque(true);
        add(lblImg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3600, 0, 1200, 750));

        lblImg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HDNguoiHoc.png"))); // NOI18N
        lblImg5.setOpaque(true);
        add(lblImg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4800, 0, 1200, 750));

        lblImg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HDKhoaHoc.png"))); // NOI18N
        lblImg6.setOpaque(true);
        add(lblImg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6000, 0, 1200, 750));

        lblImg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HDChuyenDe.png"))); // NOI18N
        lblImg7.setOpaque(true);
        add(lblImg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(7200, 0, 1200, 750));

        lblImg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HDBangDiem.png"))); // NOI18N
        lblImg8.setOpaque(true);
        add(lblImg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8400, 0, 1200, 750));

        lblImg9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/DoanhThu.png"))); // NOI18N
        lblImg9.setOpaque(true);
        add(lblImg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(9600, 0, 1200, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void traiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traiActionPerformed
        // TODO add your handling code here:

        if (index >=1) {
            index--;
            previous();
        }
    }//GEN-LAST:event_traiActionPerformed

    private void phaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaiActionPerformed
        // TODO add your handling code here:
        if (index < 7) {
            index++;
            next();
        }
    }//GEN-LAST:event_phaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel lblImg4;
    private javax.swing.JLabel lblImg5;
    private javax.swing.JLabel lblImg6;
    private javax.swing.JLabel lblImg7;
    private javax.swing.JLabel lblImg8;
    private javax.swing.JLabel lblImg9;
    private javax.swing.JButton phai;
    private javax.swing.JButton trai;
    // End of variables declaration//GEN-END:variables

    int index = 0;

    public void next() {
        switch (index) {
            case 1:
                ac.jLabelXLeft(0, -1200, 20, 50, lblImg1);
                ac.jLabelXLeft(1200, 0, 20, 50, lblImg2);
                ac.jLabelXLeft(2400, 1200, 20, 50, lblImg3);
                ac.jLabelXLeft(3600, 2400, 20, 50, lblImg4);
                ac.jLabelXLeft(4800, 3600, 20, 50, lblImg5);
                ac.jLabelXLeft(6000, 4800, 20, 50, lblImg6);
                ac.jLabelXLeft(7200, 6000, 20, 50, lblImg7);
                ac.jLabelXLeft(8400, 7200, 20, 50, lblImg8);
                ac.jLabelXLeft(8400, 9600, 20, 50, lblImg9);
            case 2:
                ac.jLabelXLeft(-1200, -2400, 20, 50, lblImg1);
                ac.jLabelXLeft(0, -1200, 20, 50, lblImg2);
                ac.jLabelXLeft(1200, 0, 20, 50, lblImg3);
                ac.jLabelXLeft(2400, 1200, 20, 50, lblImg4);
                ac.jLabelXLeft(3600, 2400, 20, 50, lblImg5);
                ac.jLabelXLeft(4800, 3600, 20, 50, lblImg6);
                ac.jLabelXLeft(6000, 4800, 20, 50, lblImg7);
                ac.jLabelXLeft(7200, 6000, 20, 50, lblImg8);
                ac.jLabelXLeft(8400, 7200, 20, 50, lblImg9);
            case 3:
                ac.jLabelXLeft(-2400, -3600, 20, 50, lblImg1);
                ac.jLabelXLeft(-1200, -2400, 20, 50, lblImg2);
                ac.jLabelXLeft(0, -1200, 20, 50, lblImg3);
                ac.jLabelXLeft(1200, 0, 20, 50, lblImg4);
                ac.jLabelXLeft(2400, 1200, 20, 50, lblImg5);
                ac.jLabelXLeft(3600, 2400, 20, 50, lblImg6);
                ac.jLabelXLeft(4800, 3600, 20, 50, lblImg7);
                ac.jLabelXLeft(6000, 4800, 20, 50, lblImg8);
                ac.jLabelXLeft(7200, 6000, 20, 50, lblImg9);
            case 4:
                ac.jLabelXLeft(-3600, -4800, 20, 50, lblImg1);
                ac.jLabelXLeft(-2400, -3600, 20, 50, lblImg2);
                ac.jLabelXLeft(-1200, -2400, 20, 50, lblImg3);
                ac.jLabelXLeft(0, -1200, 20, 50, lblImg4);
                ac.jLabelXLeft(1200, 0, 20, 50, lblImg5);
                ac.jLabelXLeft(2400, 1200, 20, 50, lblImg6);
                ac.jLabelXLeft(3600, 2400, 20, 50, lblImg7);
                ac.jLabelXLeft(4800, 3600, 20, 50, lblImg8);
                ac.jLabelXLeft(6000, 4800, 20, 50, lblImg9);
            case 5:
                ac.jLabelXLeft(-4800, -6000, 20, 50, lblImg1);
                ac.jLabelXLeft(-3600, -4800, 20, 50, lblImg2);
                ac.jLabelXLeft(-2400, -3600, 20, 50, lblImg3);
                ac.jLabelXLeft(-1200, -2400, 20, 50, lblImg4);
                ac.jLabelXLeft(0, -1200, 20, 50, lblImg5);
                ac.jLabelXLeft(1200, 0, 20, 50, lblImg6);
                ac.jLabelXLeft(2400, 1200, 20, 50, lblImg7);
                ac.jLabelXLeft(3600, 2400, 20, 50, lblImg8);
                ac.jLabelXLeft(4800, 3600, 20, 50, lblImg9);
            case 6:
                ac.jLabelXLeft(-6000, -7200, 20, 50, lblImg1);
                ac.jLabelXLeft(-4800, -6000, 20, 50, lblImg2);
                ac.jLabelXLeft(-3600, -4800, 20, 50, lblImg3);
                ac.jLabelXLeft(-2400, -3600, 20, 50, lblImg4);
                ac.jLabelXLeft(-12000, -2400, 20, 50, lblImg5);
                ac.jLabelXLeft(0, -1200, 20, 50, lblImg6);
                ac.jLabelXLeft(1200, 0, 20, 50, lblImg7);
                ac.jLabelXLeft(2400, 1200, 20, 50, lblImg8);
                ac.jLabelXLeft(3600, 2400, 20, 50, lblImg9);
            case 7:
                ac.jLabelXLeft(-7200, -8400, 20, 50, lblImg1);
                ac.jLabelXLeft(-6000, -7200, 20, 50, lblImg2);
                ac.jLabelXLeft(-4800, -6000, 20, 50, lblImg3);
                ac.jLabelXLeft(-3600, -4800, 20, 50, lblImg4);
                ac.jLabelXLeft(-2400, -3600, 20, 50, lblImg5);
                ac.jLabelXLeft(-1200, -2400, 20, 50, lblImg6);
                ac.jLabelXLeft(0, -1200, 20, 50, lblImg7);
                ac.jLabelXLeft(1200, 0, 20, 50, lblImg8);
                ac.jLabelXLeft(2400, 1200, 20, 50, lblImg9);
            case 8:
                ac.jLabelXLeft(-8400, -9600, 20, 50, lblImg1);
                ac.jLabelXLeft(-7200, -8400, 20, 50, lblImg2);
                ac.jLabelXLeft(-6000, -7200, 20, 50, lblImg3);
                ac.jLabelXLeft(-4800, -6000, 20, 50, lblImg4);
                ac.jLabelXLeft(-3600, -4800, 20, 50, lblImg5);
                ac.jLabelXLeft(-2400, -3600, 20, 50, lblImg6);
                ac.jLabelXLeft(-1200, -2400, 20, 50, lblImg7);
                ac.jLabelXLeft(0, -1200, 20, 50, lblImg8);
                ac.jLabelXLeft(1200, 0, 20, 50, lblImg9);
        }
    }

    public void previous() {
        switch (index) {
            case 0:
                ac.jLabelXLeft(8400, 9600, 20, 50, lblImg9);
                ac.jLabelXLeft(7200, 8400, 20, 50, lblImg8);
                ac.jLabelXLeft(6000, 7200, 20, 50, lblImg7);
                ac.jLabelXLeft(4800, 6000, 20, 50, lblImg6);
                ac.jLabelXLeft(3600, 4800, 20, 50, lblImg5);
                ac.jLabelXLeft(2400, 3600, 20, 50, lblImg4);
                ac.jLabelXLeft(1200, 2400, 20, 50, lblImg3);
                ac.jLabelXLeft(0, 1200, 20, 50, lblImg2);
                ac.jLabelXLeft(-1200, 0, 20, 50, lblImg1);

            case 1:
                ac.jLabelXLeft(7200, 8400, 20, 50, lblImg9);
                ac.jLabelXLeft(6000, 7200, 20, 50, lblImg8);
                ac.jLabelXLeft(4800, 6000, 20, 50, lblImg7);
                ac.jLabelXLeft(3600, 4800, 20, 50, lblImg6);
                ac.jLabelXLeft(2400, 3600, 20, 50, lblImg5);
                ac.jLabelXLeft(1200, 2400, 20, 50, lblImg4);
                ac.jLabelXLeft(0, 1200, 20, 50, lblImg3);
                ac.jLabelXLeft(-1200, 0, 20, 50, lblImg2);
                ac.jLabelXLeft(-2400, -1200, 20, 50, lblImg1);

            case 2:
                ac.jLabelXLeft(6000, 7200, 20, 50, lblImg9);
                ac.jLabelXLeft(4800, 6000, 20, 50, lblImg8);
                ac.jLabelXLeft(3600, 4800, 20, 50, lblImg7);
                ac.jLabelXLeft(2400, 3600, 20, 50, lblImg6);
                ac.jLabelXLeft(12000, 2400, 20, 50, lblImg5);
                ac.jLabelXLeft(0, 1200, 20, 50, lblImg4);
                ac.jLabelXLeft(-1200, 0, 20, 50, lblImg3);
                ac.jLabelXLeft(-2400, -1200, 20, 50, lblImg2);
                ac.jLabelXLeft(-3600, -2400, 20, 50, lblImg1);
            case 3:
                ac.jLabelXLeft(4800, 6000, 20, 50, lblImg9);
                ac.jLabelXLeft(3600, 4800, 20, 50, lblImg8);
                ac.jLabelXLeft(2400, 3600, 20, 50, lblImg7);
                ac.jLabelXLeft(1200, 2400, 20, 50, lblImg6);
                ac.jLabelXLeft(0, 1200, 20, 50, lblImg5);
                ac.jLabelXLeft(-1200, 0, 20, 50, lblImg4);
                ac.jLabelXLeft(-2400, -1200, 20, 50, lblImg3);
                ac.jLabelXLeft(-3600, -2400, 20, 50, lblImg2);
                ac.jLabelXLeft(-4800, -3600, 20, 50, lblImg1);

            case 4:
                ac.jLabelXLeft(3600, 4800, 20, 50, lblImg9);
                ac.jLabelXLeft(2400, 3600, 20, 50, lblImg8);
                ac.jLabelXLeft(1200, 2400, 20, 50, lblImg7);
                ac.jLabelXLeft(0, 1200, 20, 50, lblImg6);
                ac.jLabelXLeft(-1200, 0, 20, 50, lblImg5);
                ac.jLabelXLeft(-2400, -1200, 20, 50, lblImg4);
                ac.jLabelXLeft(-3600, -2400, 20, 50, lblImg3);
                ac.jLabelXLeft(-4800, -3600, 20, 50, lblImg2);
                ac.jLabelXLeft(-6000, -4800, 20, 50, lblImg1);
            case 5:
                ac.jLabelXLeft(2400, 3600, 20, 50, lblImg9);
                ac.jLabelXLeft(1200, 2400, 20, 50, lblImg8);
                ac.jLabelXLeft(0, 1200, 20, 50, lblImg7);
                ac.jLabelXLeft(-1200, 0, 20, 50, lblImg6);
                ac.jLabelXLeft(-2400, -1200, 20, 50, lblImg5);
                ac.jLabelXLeft(-3600, -2400, 20, 50, lblImg4);
                ac.jLabelXLeft(-4800, -3600, 20, 50, lblImg3);
                ac.jLabelXLeft(-6000, -4800, 20, 50, lblImg2);
                ac.jLabelXLeft(-7200, -6000, 20, 50, lblImg1);

            case 6:
                ac.jLabelXLeft(1200, 2400, 20, 50, lblImg9);
                ac.jLabelXLeft(0, 1200, 20, 50, lblImg8);
                ac.jLabelXLeft(-1200, 0, 20, 50, lblImg7);
                ac.jLabelXLeft(-2400, -1200, 20, 50, lblImg6);
                ac.jLabelXLeft(-3600, -2400, 20, 50, lblImg5);
                ac.jLabelXLeft(-4800, -3600, 20, 50, lblImg4);
                ac.jLabelXLeft(-6000, -4800, 20, 50, lblImg3);
                ac.jLabelXLeft(-7200, -6000, 20, 50, lblImg2);
                ac.jLabelXLeft(-8400, -7200, 20, 50, lblImg1);
            case 7:
                ac.jLabelXLeft(0, 1200, 20, 50, lblImg9);
                ac.jLabelXLeft(-1200, 0, 20, 50, lblImg8);
                ac.jLabelXLeft(-2400, -1200, 20, 50, lblImg7);
                ac.jLabelXLeft(-3600, -2400, 20, 50, lblImg6);
                ac.jLabelXLeft(-4800, -3600, 20, 50, lblImg5);
                ac.jLabelXLeft(-6000, -4800, 20, 50, lblImg4);
                ac.jLabelXLeft(-7200, -6000, 20, 50, lblImg3);
                ac.jLabelXLeft(-8400, -7200, 20, 50, lblImg2);
                ac.jLabelXLeft(-8400, -9600, 20, 50, lblImg1);
        }
    }
}