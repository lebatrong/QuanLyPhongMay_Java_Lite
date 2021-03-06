/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Data.DataProvider;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author batro
 */
public class pnlManagerUser extends javax.swing.JPanel {

    /**
     * Creates new form pnlManagerUser
     */
    public pnlManagerUser() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblHoten = new javax.swing.JLabel();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoGiangDay = new javax.swing.JRadioButton();
        txtPass = new javax.swing.JPasswordField();
        txtConfigPass = new javax.swing.JPasswordField();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPhong = new javax.swing.JTextField();
        lblErrorPass = new javax.swing.JLabel();
        lblErrorConfigPass = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPhongMay = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Họ tên", "Quyền", "Quản lý phòng máy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUser.setColumnSelectionAllowed(true);
        tbUser.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUser);
        tbUser.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("DANH SÁCH THÀNH VIÊN");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tài khoản:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Quyền:");

        lbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl.setText("Quản lý phòng máy:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Họ tên:");

        lblUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblHoten.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        buttonGroup1.add(rdoQuanLy);
        rdoQuanLy.setText("Quản lý phòng máy");
        rdoQuanLy.setEnabled(false);
        rdoQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoQuanLyActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoGiangDay);
        rdoGiangDay.setText("Giảng dạy");
        rdoGiangDay.setEnabled(false);
        rdoGiangDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGiangDayActionPerformed(evt);
            }
        });

        txtPass.setEnabled(false);

        txtConfigPass.setEnabled(false);

        btnEdit.setText("Chỉnh sửa");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.setEnabled(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setIconTextGap(0);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Hủy");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Xác nhận mật khẩu:");

        txtPhong.setEnabled(false);

        lblErrorPass.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorConfigPass.setForeground(new java.awt.Color(255, 0, 0));

        lstPhongMay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPhongMay.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPhongMay.setEnabled(false);
        lstPhongMay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPhongMayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstPhongMay);

        jLabel7.setText("Danh sách phòng máy chưa quản lý:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoQuanLy)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConfigPass, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblErrorConfigPass))
                                    .addComponent(rdoGiangDay)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblErrorPass))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(lblHoten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(lbl)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorPass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfigPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lblErrorConfigPass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoGiangDay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl)
                            .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(117, 117, 117))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            Data.DataProvider dt= new DataProvider();
                       
            String update;
            
            if(rdoGiangDay.isSelected()){
                update="UPDATE `qlpm`.`giaovien` SET `MAPHONG` = '', `PASS` = '"+txtPass.getText()+"', `QUYEN` =2 WHERE `TAIKHOAN` ='"+lblUser.getText()+"';";
                
                String updatePhong="UPDATE `qlpm`.`phongmay` SET `TAIKHOAN`='' WHERE `MAPHONG`='"+txtPhong.getText()+"';";
                
                if(dt.Exec_Query(update)&& dt.Exec_Query(updatePhong)){
                    Load_User();
                    LoadPM();
                    JOptionPane.showMessageDialog(null,"Cập nhật thành công!","Thông báo!",1);
                }
                else
                    JOptionPane.showMessageDialog(null,"Không thể cập nhật!","Lỗi!",2);
            }
            else{
                update="UPDATE `qlpm`.`giaovien` SET `MAPHONG` = '"+txtPhong.getText()+"', `PASS` = '"+txtPass.getText()+"', `QUYEN` =1 WHERE `TAIKHOAN` ='"+lblUser.getText()+"';";
                String updatePhong="UPDATE `qlpm`.`phongmay` SET `TAIKHOAN` = '"+lblUser.getText()+"' WHERE `MAPHONG` ='"+txtPhong.getText()+"';";
            
                if(dt.Exec_Query(update) && dt.Exec_Query(updatePhong))
                {
                    Load_User();
                    LoadPM();
                    JOptionPane.showMessageDialog(null,"Cập nhật thành công!","Thông báo!",1);
                }
                else
                    JOptionPane.showMessageDialog(null,"Không thể cập nhật!","Lỗi!",2);
            }
            
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Lỗi kết nối!","Lỗi!",2);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnEdit.setEnabled(false);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        txtConfigPass.setEnabled(true);
        txtPass.setEnabled(true);
        rdoGiangDay.setEnabled(true);
        rdoQuanLy.setEnabled(true);
        lstPhongMay.setEnabled(true);

    }//GEN-LAST:event_btnEditActionPerformed

    private void Load_User()
    {
        String select="select TAIKHOAN,HOTEN,PASS,QUYEN,MAPHONG from giaovien;";
        
        try{
            Data.DataProvider dt= new DataProvider();
            
            ResultSet rs= dt.Get_Data(select);
            
            //Xóa table
            DefaultTableModel clear = (DefaultTableModel) tbUser.getModel();
            while(clear.getRowCount()>0)
                clear.removeRow(0);
            
            //Fill table
            DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("TAIKHOAN"),rs.getString("HOTEN"),rs.getString("QUYEN"),rs.getString("MAPHONG")});
            }
            tbUser.setModel(model);
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối!","Lỗi",2);
        }
    }
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        Load_User();
        LoadPM();
    }//GEN-LAST:event_formAncestorAdded

    private void Get_Pass_PhongMay(String id)
    {
        String pass="select pass,MaPhong from giaovien where TAIKHOAN='"+lblUser.getText()+"';";
            
            try{
                Data.DataProvider dt= new DataProvider();
                
                ResultSet rs=dt.Get_Data(pass);
                
                if(rs.next()){
                    txtPass.setText(rs.getString("PASS"));
                    txtConfigPass.setText(rs.getString("PASS"));
                    if(rs.getString("MaPhong")!=null)
                        txtPhong.setText(rs.getString("MaPhong"));
                    else
                        txtPhong.setText("");
                }
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Lỗi kết nối!", "Lỗi",2);
            }
        
    }
    
    private void tbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUserMouseClicked
        btnEdit.setEnabled(true);
        int row= tbUser.getSelectedRow();
        lblUser.setText(tbUser.getValueAt(row,0).toString());
        lblHoten.setText(tbUser.getValueAt(row,1).toString());
        if(Integer.parseInt(tbUser.getValueAt(row,2).toString())==1)
        {
            rdoQuanLy.setSelected(true);
            txtPhong.setVisible(true);
            lbl.setVisible(true);
        }
        else if(Integer.parseInt(tbUser.getValueAt(row,2).toString())==2)
        {
            rdoGiangDay.setSelected(true);
            txtPhong.setVisible(false);
            lbl.setVisible(false);
        }
        else
        {
            rdoGiangDay.setSelected(false);
            rdoQuanLy.setSelected(false);
            txtPhong.setVisible(false);
            lbl.setVisible(false);
            
        }
        Get_Pass_PhongMay(tbUser.getValueAt(row,0).toString());
            
    }//GEN-LAST:event_tbUserMouseClicked

    
    private void Update_User()
    {
        
    }
    
    private void LoadPM()
    {
        try {
            String sql="SELECT MAPHONG,TAIKHOAN FROM qlpm.phongmay";
            Data.DataProvider dt= new DataProvider();
            ResultSet rs=dt.Get_Data(sql);
            
            DefaultListModel reset= new DefaultListModel();
            reset.clear();
            
            //fill list
            DefaultListModel model= new DefaultListModel();
            while(rs.next())
            {
                if(rs.getString("TAIKHOAN").matches(""))
                {
                    model.addElement(rs.getString("MAPHONG"));
                }
            }
            lstPhongMay.setModel(model);
            
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnEdit.setEnabled(true);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        txtConfigPass.setEnabled(false);
        txtPass.setEnabled(false);
        rdoGiangDay.setEnabled(false);
        rdoQuanLy.setEnabled(false);
        lstPhongMay.setEnabled(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void rdoGiangDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGiangDayActionPerformed
        if(rdoGiangDay.isSelected())
        {
            txtPhong.setVisible(false);
            lbl.setVisible(false);
        }else
        {
            txtPhong.setVisible(true);
            lbl.setVisible(true);
        }
    }//GEN-LAST:event_rdoGiangDayActionPerformed

    private void rdoQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoQuanLyActionPerformed
        if(rdoQuanLy.isSelected())
        {
            txtPhong.setVisible(true);
            lbl.setVisible(true);
        }else
        {
            txtPhong.setVisible(false);
            lbl.setVisible(false);
        }
    }//GEN-LAST:event_rdoQuanLyActionPerformed

    private void lstPhongMayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPhongMayMouseClicked
        txtPhong.setText(lstPhongMay.getSelectedValue());
    }//GEN-LAST:event_lstPhongMayMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblErrorConfigPass;
    private javax.swing.JLabel lblErrorPass;
    private javax.swing.JLabel lblHoten;
    private javax.swing.JLabel lblUser;
    private javax.swing.JList<String> lstPhongMay;
    private javax.swing.JRadioButton rdoGiangDay;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTable tbUser;
    private javax.swing.JPasswordField txtConfigPass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhong;
    // End of variables declaration//GEN-END:variables
}
