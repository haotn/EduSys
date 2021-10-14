/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.dao.ChuyenDeDAO;
import com.edusys.dao.KhoaHocDAO;
import com.edusys.entity.ChuyenDe;
import com.edusys.entity.KhoaHoc;
import com.edusys.entity.NguoiHoc;
import com.edusys.entity.NhanVien;
import com.edusys.helper.Auth;
import com.edusys.helper.MsgBox;
import com.edusys.helper.XDate;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author haotn
 */
public class PanelQuanLyKhoaHoc extends javax.swing.JPanel {

    /**
     * Creates new form PanelQuanLyKhoaHoc
     */
    DefaultTableModel model;
    JTableHeader header;

    public PanelQuanLyKhoaHoc() {
        initComponents();
        setModelTable();
        fillComboBoxChuyenDe();
        fillTable();
        updateStatus();
    }

    public void setModelTable() {
        model = new DefaultTableModel(new Object[][]{}, new Object[]{"Mã KH", "Mã CĐ", "Học phí", "Thời lượng", "Ngày KG", "Ngày tạo", "Người tạo", "Ghi chú"});
        tblKhoaHoc.setModel(model);
        header = tblKhoaHoc.getTableHeader();
        header.setFont(new Font("SansSerif", 1, 18));
        header.setForeground(new Color(102, 102, 102));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel27 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        pnlCongCuBangKhoaHoc = new javax.swing.JPanel();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        pnlFormKhoaHoc = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtChuyenDe = new javax.swing.JTextField();
        txtHocPhi = new javax.swing.JTextField();
        txtNguoiTao = new javax.swing.JTextField();
        txtNgayKhaiGiang = new javax.swing.JTextField();
        txtThoiLuong = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cboLocChuyenDe = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Khóa học");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jScrollPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblKhoaHoc.setAutoCreateRowSorter(true);
        tblKhoaHoc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKhoaHoc.setGridColor(new java.awt.Color(255, 255, 255));
        tblKhoaHoc.setRowHeight(30);
        tblKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblKhoaHocMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tblKhoaHoc);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1200, 250));

        txtTimKiem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTimKiem.setForeground(new java.awt.Color(153, 153, 153));
        txtTimKiem.setText("Tìm kiếm khóa học");
        add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 250, -1));

        pnlCongCuBangKhoaHoc.setBackground(new java.awt.Color(255, 255, 255));
        pnlCongCuBangKhoaHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLast.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLast.setForeground(new java.awt.Color(102, 102, 102));
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlCongCuBangKhoaHoc.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        btnFirst.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(102, 102, 102));
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlCongCuBangKhoaHoc.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        btnPrev.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(102, 102, 102));
        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        pnlCongCuBangKhoaHoc.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        btnNext.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(102, 102, 102));
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlCongCuBangKhoaHoc.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        add(pnlCongCuBangKhoaHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1200, 50));

        pnlFormKhoaHoc.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormKhoaHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Ngày tạo");
        pnlFormKhoaHoc.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        txtNgayTao.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormKhoaHoc.add(txtNgayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 320, -1));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Chuyên đề");
        pnlFormKhoaHoc.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Học phí");
        pnlFormKhoaHoc.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Ghi chú");
        pnlFormKhoaHoc.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Ngày khai giảng");
        pnlFormKhoaHoc.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Thời lượng");
        pnlFormKhoaHoc.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        txtChuyenDe.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormKhoaHoc.add(txtChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 320, -1));

        txtHocPhi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormKhoaHoc.add(txtHocPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 320, -1));

        txtNguoiTao.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormKhoaHoc.add(txtNguoiTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 320, -1));

        txtNgayKhaiGiang.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormKhoaHoc.add(txtNgayKhaiGiang, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 320, -1));

        txtThoiLuong.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormKhoaHoc.add(txtThoiLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 320, -1));

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Người tạo");
        pnlFormKhoaHoc.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtGhiChu.setRows(5);
        jScrollPane9.setViewportView(txtGhiChu);

        pnlFormKhoaHoc.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 830, 110));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(102, 102, 102));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/Icon_16px/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlFormKhoaHoc.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(102, 102, 102));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/Icon_16px/Update.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        pnlFormKhoaHoc.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(102, 102, 102));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/Icon_16px/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlFormKhoaHoc.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        btnCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(102, 102, 102));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/Icon_16px/Edit.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        pnlFormKhoaHoc.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        add(pnlFormKhoaHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1200, 350));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Chuyên đề");
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        cboLocChuyenDe.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cboLocChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboLocChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocChuyenDeActionPerformed(evt);
            }
        });
        add(cboLocChuyenDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
        fillComboBoxChuyenDe();
        fillTable();
        updateStatus();

    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void cboLocChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocChuyenDeActionPerformed
        // TODO add your handling code 
        chonChuyenDe();
    }//GEN-LAST:event_cboLocChuyenDeActionPerformed

    private void tblKhoaHocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaHocMousePressed
        // TODO add your handling code here:
            row = tblKhoaHoc.getSelectedRow();
        edit();
    }//GEN-LAST:event_tblKhoaHocMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLocChuyenDe;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pnlCongCuBangKhoaHoc;
    private javax.swing.JPanel pnlFormKhoaHoc;
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTextField txtChuyenDe;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtNgayKhaiGiang;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNguoiTao;
    private javax.swing.JTextField txtThoiLuong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    KhoaHocDAO khoaHocDAO = new KhoaHocDAO();
    ChuyenDeDAO chuyenDeDAO = new ChuyenDeDAO();
    int row = -1;

    public void setForm(KhoaHoc kh) {
        ChuyenDe chuyenDe = (ChuyenDe) cboLocChuyenDe.getSelectedItem();
        //txtChuyenDe.setText(chuyenDe.getTenCD());
        //txtHocPhi.setText(String.valueOf(kh.getHocPhi()));
        //txtThoiLuong.setText(String.valueOf(kh.getThoiLuong()));
        txtNgayKhaiGiang.setText(XDate.toString(kh.getNgayKG(), "yyyy-MM-dd"));
        txtNgayTao.setText(XDate.toString(kh.getNgayTao(), "yyyy-MM-dd"));
        //txtNguoiTao.setText(kh.getMaNV());
        txtGhiChu.setText(kh.getGhiChu());
    }

    public KhoaHoc getForm() {
        KhoaHoc kh = new KhoaHoc();
        ChuyenDe chuyenDe = (ChuyenDe) cboLocChuyenDe.getSelectedItem();
        kh.setMaCD(chuyenDe.getMaCD());
        kh.setHocPhi(chuyenDe.getHocPhi());
        kh.setThoiLuong(chuyenDe.getThoiLuong());
        kh.setMaNV(Auth.user.getMaNV());
        kh.setNgayKG(XDate.toDate(txtNgayKhaiGiang.getText(), "yyyy-MM-dd"));
        //kh.setNgayTao(XDate.toDate(XDate.toString(new Date(), "yyyy-MM-dd"), "yyyy-MM-dd"));
        kh.setGhiChu(txtGhiChu.getText());
        return kh;
    }

    public void clearForm() {
        //KhoaHoc kh = new KhoaHoc();
        //setForm(kh);
        row = -1;
        //kh.setNgayKG(null);
        txtNgayKhaiGiang.setText("");
        txtGhiChu.setText("");
        updateStatus();
        fillComboBoxChuyenDe();
    }

    public void edit() {
        int maKH = Integer.parseInt(String.valueOf(tblKhoaHoc.getValueAt(row, 0)));
        KhoaHoc kh = khoaHocDAO.selectById(maKH);
        setForm(kh);
        updateStatus();
    }

    public void insert() {
        KhoaHoc kh = getForm();
        try {
            khoaHocDAO.insert(kh);
            MsgBox.alert(this, "Thêm mới thành công!");
            clearForm();
            fillTable();
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    public void update() {
        KhoaHoc kh = khoaHocDAO.selectById(Integer.parseInt(String.valueOf(tblKhoaHoc.getValueAt(row, 0))));
        if (MsgBox.confirm(this, "Bạn có chắc muốn cập nhật khóa học này không?")) {
            try {
                khoaHocDAO.update(kh);
                clearForm();
                fillTable();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, e);
                //MsgBox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    public void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa khóa học!");
        } else {
            int makh = Integer.parseInt(String.valueOf(tblKhoaHoc.getValueAt(row, 0)));
            KhoaHoc exist = khoaHocDAO.checkForDelete(makh);
            if (makh == exist.getMaKH()) {
                if (MsgBox.confirm(this, "Khóa học đã tồn tại học viên, bạn có chắc muốn xóa khóa học bao gồm học viên không?")) {
                    try {
                        khoaHocDAO.detele(makh);
                        fillTable();
                        clearForm();
                        MsgBox.alert(this, "Xóa khóa học thành công!");
                    } catch (Exception e) {
                        Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, e);
                        //MsgBox.alert(this, "Xóa thất bại!");
                    }
                }
            } else {
                if (MsgBox.confirm(this, "Bạn có chắc muốn xóa khóa học này không?")) {
                    try {
                        khoaHocDAO.detele(makh);
                        fillTable();
                        clearForm();
                        MsgBox.alert(this, "Xóa khóa học thành công!");
                    } catch (Exception e) {
                        Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, e);
                        //MsgBox.alert(this, "Xóa thất bại!");
                    }
                }
            }
        }
    }

    public void first() {
        row = 0;
        tblKhoaHoc.setRowSelectionInterval(row, row);
        edit();
    }

    public void prev() {
        if (row > 0) {
            row--;
            tblKhoaHoc.setRowSelectionInterval(row, row);
            edit();
        }
    }

    public void next() {
        if (row < tblKhoaHoc.getRowCount() - 1) {
            row++;
            tblKhoaHoc.setRowSelectionInterval(row, row);
            edit();
        }
    }

    public void last() {
        row = tblKhoaHoc.getRowCount() - 1;
        tblKhoaHoc.setRowSelectionInterval(row, row);
        edit();
    }

    public void updateStatus() {
        boolean edit = (row >= 0);
        boolean first = (row == 0);
        boolean last = (row == tblKhoaHoc.getRowCount() - 1);
        ChuyenDe chuyenDe = (ChuyenDe) cboLocChuyenDe.getSelectedItem();
        txtChuyenDe.setEditable(false);
        txtHocPhi.setEditable(false);
        txtThoiLuong.setEditable(false);
        txtNgayTao.setEditable(false);
        txtNguoiTao.setEditable(false);
//        txtChuyenDe.setText(chuyenDe.getTenCD());
//        txtHocPhi.setText(String.valueOf(chuyenDe.getHocPhi()));
//        txtThoiLuong.setText(String.valueOf(chuyenDe.getThoiLuong()));
//        txtNguoiTao.setText(Auth.user.getMaNV());
//        txtNgayTao.setText(XDate.toString(new Date(), "yyyy-MM-dd"));
        chonChuyenDe();

        btnThem.setEnabled(!edit);
        btnCapNhat.setEnabled(edit);
        btnXoa.setEnabled(edit);

        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    public void fillComboBoxChuyenDe() {
        //Dùng để đổ dữ liệu vào cboChuyenDe_KhoaHoc 
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLocChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = chuyenDeDAO.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
    }

    public void fillTable() {
        //DefaultTableModel model = (DefaultTableModel) tblKhoaHoc.getModel();
        model.setRowCount(0);
        try {
            if (cboLocChuyenDe.getItemCount() > 0) {
                ChuyenDe chuyenDe = (ChuyenDe) cboLocChuyenDe.getSelectedItem();
                List<KhoaHoc> list = khoaHocDAO.selectByChuyenDe(chuyenDe.getMaCD());
                for (KhoaHoc kh : list) {
                    model.addRow(new Object[]{kh.getMaKH(), kh.getMaCD(), kh.getThoiLuong(), kh.getHocPhi(), XDate.toString(kh.getNgayKG(), "dd/MM/yyyy"), kh.getMaNV(), XDate.toString(kh.getNgayTao(), "dd/MM/yyyy")});
                }
            } else {
            }
        } catch (Exception e) {
        }
    }

    public void chonChuyenDe() {
        ChuyenDe chuyenDe = (ChuyenDe) cboLocChuyenDe.getSelectedItem();
        if (chuyenDe != null) {
            txtThoiLuong.setText(String.valueOf(chuyenDe.getThoiLuong()));
            txtHocPhi.setText(String.valueOf(chuyenDe.getHocPhi()));
            txtChuyenDe.setText(chuyenDe.getTenCD());
            txtGhiChu.setText(chuyenDe.getTenCD());
        }
        fillTable();
        row = -1;
    }

    public DefaultComboBoxModel getModel() {
        return (DefaultComboBoxModel) cboLocChuyenDe.getModel();
    }

    public void setModel(DefaultComboBoxModel model) {
        cboLocChuyenDe.setModel(model);
    }

}
