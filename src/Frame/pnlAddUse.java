/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Data.DataProvider;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author batro
 */
public class pnlAddUse extends javax.swing.JPanel {

    /**
     * Creates new form pnlAddUse
     */
    public pnlAddUse() {
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

        groupQuyen = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        cbbPM = new javax.swing.JComboBox<>();
        txtUser = new javax.swing.JTextField();
        rdoQuanTri = new javax.swing.JRadioButton();
        rdoQuanLyPM = new javax.swing.JRadioButton();
        rdoGiangDay = new javax.swing.JRadioButton();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 102));
        jLabel2.setText("THÊM TÀI KHOẢN");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Tên tài khoản:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Loại tài khoản:");

        lbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl.setText("Quản lý phòng máy:");

        lblReset.setText("Làm lại");
        lblReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblResetActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtUser.setColumns(18);

        groupQuyen.add(rdoQuanTri);
        rdoQuanTri.setText("Quản trị");
        rdoQuanTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoQuanTriActionPerformed(evt);
            }
        });

        groupQuyen.add(rdoQuanLyPM);
        rdoQuanLyPM.setText("Quản lý phòng máy");
        rdoQuanLyPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoQuanLyPMActionPerformed(evt);
            }
        });

        groupQuyen.add(rdoGiangDay);
        rdoGiangDay.setSelected(true);
        rdoGiangDay.setText("Giảng dạy");
        rdoGiangDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGiangDayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(lblReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbPM, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdoQuanTri)
                                    .addComponent(rdoQuanLyPM)
                                    .addComponent(rdoGiangDay))))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdoQuanTri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoQuanLyPM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoGiangDay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl)
                    .addComponent(cbbPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReset)
                    .addComponent(btnAdd))
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoadPM()
    {
        try {
            String sql="SELECT MAPHONG,TAIKHOAN FROM qlpm.phongmay";
            Data.DataProvider dt= new DataProvider();
            ResultSet rs=dt.Get_Data(sql);
         
            while(rs.next())
            {
                if(rs.getString("TAIKHOAN").matches(""))
                {
                    cbbPM.addItem(rs.getString("MAPHONG"));
                   
                }
            }
            cbbPM.setSelectedIndex(0);
            
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    
    
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
            lbl.setVisible(false);
            cbbPM.setVisible(false);
            LoadPM();
            
    }//GEN-LAST:event_formAncestorAdded

    private void rdoQuanTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoQuanTriActionPerformed
        lbl.setVisible(false);
        cbbPM.setVisible(false);
        
    }//GEN-LAST:event_rdoQuanTriActionPerformed

    private void rdoGiangDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGiangDayActionPerformed
        lbl.setVisible(false);
        cbbPM.setVisible(false);
    }//GEN-LAST:event_rdoGiangDayActionPerformed

    private void rdoQuanLyPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoQuanLyPMActionPerformed
        lbl.setVisible(true);
        cbbPM.setVisible(true);
    }//GEN-LAST:event_rdoQuanLyPMActionPerformed

    private void lblResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblResetActionPerformed
        txtUser.setText("");
        rdoGiangDay.setSelected(true);
        lbl.setVisible(false);
        cbbPM.setVisible(false);
    }//GEN-LAST:event_lblResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(!txtUser.getText().trim().matches(""))
        {  
            try {
                int q;
                if(rdoGiangDay.isSelected())
                    q=2;
                else if(rdoQuanLyPM.isSelected())
                    q=1;
                else
                    q=0;

                DataProvider dt= new DataProvider();

                //Tài khoản quản lý phòng máy
                if(q==1)
                {
                    String sqlQuanLy="INSERT INTO `qlpm`.`giaovien` (`TAIKHOAN`,`MAPHONG`,`PASS`,`QUYEN`) VALUES('"+txtUser.getText()+"','"+cbbPM.getSelectedItem()+"','1',"+q+");";
                    String udateQuanLy="UPDATE `qlpm`.`phongmay` SET `TAIKHOAN` = '"+txtUser.getText()+"' WHERE `MAPHONG` = '"+cbbPM.getSelectedItem()+"';";
                    if(dt.Exec_Query(sqlQuanLy) && dt.Exec_Query(udateQuanLy))
                    {
                        JOptionPane.showMessageDialog(null, "Thêm thành công!");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Lỗi!");
                }else
                {
                    String sql="INSERT INTO `qlpm`.`giaovien` (`TAIKHOAN`,`PASS`,`QUYEN`) VALUES('"+txtUser.getText()+"','1',"+q+");";

                    if(dt.Exec_Query(sql))
                        JOptionPane.showMessageDialog(null, "Thêm thành công!");
                    else
                        JOptionPane.showMessageDialog(null, "Lỗi!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Tên tài khoản đã có người sử dụng!","Thông báo",2);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Tên tài khoản không được để trống!","Thông báo",2);
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cbbPM;
    private javax.swing.ButtonGroup groupQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl;
    private javax.swing.JButton lblReset;
    private javax.swing.JRadioButton rdoGiangDay;
    private javax.swing.JRadioButton rdoQuanLyPM;
    private javax.swing.JRadioButton rdoQuanTri;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}