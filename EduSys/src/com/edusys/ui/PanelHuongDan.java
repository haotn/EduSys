/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

/**
 *
 * @author haotn
 */
public class PanelHuongDan extends javax.swing.JPanel {

    /**
     * Creates new form PanelHuongDan
     */
    public PanelHuongDan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Đây là cửa sổ hướng dẫn!!!");
        jScrollPane16.setViewportView(jTextArea3);

        add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 950, 390));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}