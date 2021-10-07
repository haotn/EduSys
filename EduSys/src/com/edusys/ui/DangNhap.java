/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author haotn
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    boolean showPass = false;

    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        txtUser.setBackground(new Color(0, 0, 0, 1));
        pwdPass.setBackground(new Color(0, 0, 0, 1));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left = new javax.swing.JPanel();
        Wellcome = new javax.swing.JLabel();
        EduSys = new javax.swing.JLabel();
        src = new javax.swing.JLabel();
        aut = new javax.swing.JLabel();
        backgroundLeft = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        taiKhoan = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        taiKhoan1 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pwdPass = new javax.swing.JPasswordField();
        lblAn_Hien = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        backgroundRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Wellcome.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Wellcome.setForeground(new java.awt.Color(255, 255, 255));
        Wellcome.setText("Wellcome to");
        left.add(Wellcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        EduSys.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        EduSys.setForeground(new java.awt.Color(255, 255, 255));
        EduSys.setText("EduSys");
        left.add(EduSys, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        src.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        src.setForeground(new java.awt.Color(255, 255, 255));
        src.setText("CoppyRight ©");
        left.add(src, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        aut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        aut.setForeground(new java.awt.Color(255, 255, 255));
        aut.setText("NHOM 5");
        left.add(aut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        backgroundLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/leftSignIn.png"))); // NOI18N
        left.add(backgroundLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/BlackClose.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        right.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 16, 16));

        Title.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("ĐĂNG NHẬP");
        right.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        taiKhoan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        taiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        taiKhoan.setText("Mật khẩu");
        right.add(taiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        right.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 270, 32));

        taiKhoan1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        taiKhoan1.setForeground(new java.awt.Color(255, 255, 255));
        taiKhoan1.setText("Tài khoản");
        right.add(taiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        right.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));
        right.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, 10));

        pwdPass.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pwdPass.setForeground(new java.awt.Color(255, 255, 255));
        pwdPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pwdPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdPassActionPerformed(evt);
            }
        });
        right.add(pwdPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 240, 32));

        lblAn_Hien.setForeground(new java.awt.Color(255, 255, 255));
        lblAn_Hien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/HienMatKhau.png"))); // NOI18N
        lblAn_Hien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAn_HienMouseClicked(evt);
            }
        });
        right.add(lblAn_Hien, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 32, 32));
        right.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 270, 10));

        backgroundRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/images/rightSignIn.png"))); // NOI18N
        right.add(backgroundRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setIcon(new ImageIcon("src/com/edusys/images/RedClose.png"));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        close.setIcon(new ImageIcon("src/com/edusys/images/BlackClose.png"));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
//        int confirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn thoát không?");
//        if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0);
//        }
    }//GEN-LAST:event_closeMouseClicked

    private void pwdPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdPassActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void lblAn_HienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAn_HienMouseClicked
        // TODO add your handling code here:
        if (showPass == false) {
            pwdPass.setEchoChar((char) 0);
            lblAn_Hien.setIcon(new ImageIcon("src/com/edusys/images/AnMatKhau.png"));
            showPass = true;
        } else {
            pwdPass.setEchoChar('*');
            lblAn_Hien.setIcon(new ImageIcon("src/com/edusys/images/HienMatKhau.png"));
            showPass = false;
        }
    }//GEN-LAST:event_lblAn_HienMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        kiemTra();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EduSys;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Wellcome;
    private javax.swing.JLabel aut;
    private javax.swing.JLabel backgroundLeft;
    private javax.swing.JLabel backgroundRight;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel close;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAn_Hien;
    private javax.swing.JPanel left;
    private javax.swing.JPasswordField pwdPass;
    private javax.swing.JPanel right;
    private javax.swing.JLabel src;
    private javax.swing.JLabel taiKhoan;
    private javax.swing.JLabel taiKhoan1;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    boolean kiemTra() {
        if (txtUser.getText().equals("") && pwdPass.getText().equals("")) {
            alert(this, "Xin hãy nhập tên đăng nhập và mật khẩu.");

            txtUser.requestFocus();
        } else if (txtUser.getText().equals("")) {
            alert(this, "Bạn chưa nhập tên đăng nhập.");

            txtUser.requestFocus();
        } else if (pwdPass.getText().equals("")) {
            alert(this, "Bạn chưa nhập mật khẩu.");

            pwdPass.requestFocus();
        } else {
            new GUI().setVisible(true);
            this.dispose();
        }
        return true;
    }

    // Phần đăng nhập chưa đưa vào nên không kiểm tra được
//   void dangNhap(){
//       String tendangnhap = txtTenDangNhap.getText();
//       String matkhau = pswMatKhau.getText();
//       NhanVien nhanvien = dao.selectByld(manv);
//       if(nhanVien == null) {
//           alert(this, "Tên đăng nhập không đúng.");
//       }
//       else if(!matkhau.equals(nhanvien.getMatKhau())){
//           alert(this, "Mật khẩu không đúng.");
//       }
//       else {
//           Auth.user = nhanvien;
//           this.dispose();
//       }
//   }
//    void ketThuc() {
//        if (confirm(this, "Bạn có muốn kết thúc ứng dụng?")) {
//            System.exit(0);
//        }
//    }

    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message, "Hệ thống quản lý đào tạo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}