/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

/**
 *
 * @author batro
 */

import Data.DataProvider;
import Frame.Room.pnlRoom4;
import Frame.Room.pnlRoom2;
import Frame.Room.pnlRoom3;
import Frame.Room.pnlRoom1;
import Frame.Room.pnlRoom5;
import Frame.Room.pnlRoom6;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import javax.swing.*;
public class frmMain extends javax.swing.JFrame {

    public static String id=null;
    
    public static int Quyen=-1;
    
    private JPanel ChildPanel;
    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        pnlMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlQuanLy = new javax.swing.JPanel();
        btnAddUse = new javax.swing.JButton();
        btnQLUser = new javax.swing.JButton();
        btnUpdatePM = new javax.swing.JButton();
        pnlNotification = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNotification = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnRoom1 = new javax.swing.JButton();
        btnRoom2 = new javax.swing.JButton();
        btnRoom4 = new javax.swing.JButton();
        btnRoom3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRoom5 = new javax.swing.JButton();
        btnRoom6 = new javax.swing.JButton();
        pnlHello = new javax.swing.JPanel();
        lblHello = new javax.swing.JLabel();
        mnBar = new javax.swing.JMenuBar();
        mnAccount = new javax.swing.JMenu();
        mnIInfor = new javax.swing.JMenuItem();
        mnILogOut = new javax.swing.JMenuItem();
        mnApplication = new javax.swing.JMenu();
        mniInfoApp = new javax.swing.JMenuItem();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lý phòng máy");
        setPreferredSize(new java.awt.Dimension(1200, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlMain.setAutoscrolls(true);
        pnlMain.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlQuanLy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAddUse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-user-icon.png"))); // NOI18N
        btnAddUse.setText("Thêm USER");
        btnAddUse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddUse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUseActionPerformed(evt);
            }
        });

        btnQLUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apps-system-file-manager-icon.png"))); // NOI18N
        btnQLUser.setText("Quản lý USER");
        btnQLUser.setActionCommand("Quản lý User");
        btnQLUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLUserActionPerformed(evt);
            }
        });

        btnUpdatePM.setText("Cập nhật phòng máy");
        btnUpdatePM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePMActionPerformed(evt);
            }
        });

        pnlNotification.setBackground(new java.awt.Color(255, 255, 255));
        pnlNotification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("Thông báo:");

        lblNotification.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNotification.setText("Chưa có thông báo");

        javax.swing.GroupLayout pnlNotificationLayout = new javax.swing.GroupLayout(pnlNotification);
        pnlNotification.setLayout(pnlNotificationLayout);
        pnlNotificationLayout.setHorizontalGroup(
            pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotificationLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlNotificationLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblNotification)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNotificationLayout.setVerticalGroup(
            pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotificationLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNotification)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlQuanLyLayout = new javax.swing.GroupLayout(pnlQuanLy);
        pnlQuanLy.setLayout(pnlQuanLyLayout);
        pnlQuanLyLayout.setHorizontalGroup(
            pnlQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuanLyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddUse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQLUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlQuanLyLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnlQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuanLyLayout.createSequentialGroup()
                        .addComponent(btnUpdatePM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(pnlNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlQuanLyLayout.setVerticalGroup(
            pnlQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuanLyLayout.createSequentialGroup()
                .addComponent(pnlNotification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdatePM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAddUse)
                    .addComponent(btnQLUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRoom1.setForeground(new java.awt.Color(0, 0, 102));
        btnRoom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sever.png"))); // NOI18N
        btnRoom1.setText("Phòng máy 1");
        btnRoom1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRoom1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom1.setIconTextGap(0);
        btnRoom1.setMargin(new java.awt.Insets(5, 5, 7, 5));
        btnRoom1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoom1ActionPerformed(evt);
            }
        });

        btnRoom2.setForeground(new java.awt.Color(0, 0, 102));
        btnRoom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sever.png"))); // NOI18N
        btnRoom2.setText("Phòng máy 2");
        btnRoom2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom2.setIconTextGap(0);
        btnRoom2.setMargin(new java.awt.Insets(5, 5, 7, 5));
        btnRoom2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoom2ActionPerformed(evt);
            }
        });

        btnRoom4.setForeground(new java.awt.Color(0, 0, 102));
        btnRoom4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sever.png"))); // NOI18N
        btnRoom4.setText("Phòng máy 4");
        btnRoom4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom4.setIconTextGap(0);
        btnRoom4.setMargin(new java.awt.Insets(5, 5, 7, 5));
        btnRoom4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoom4ActionPerformed(evt);
            }
        });

        btnRoom3.setForeground(new java.awt.Color(0, 0, 102));
        btnRoom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sever.png"))); // NOI18N
        btnRoom3.setText("Phòng máy 3");
        btnRoom3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom3.setIconTextGap(0);
        btnRoom3.setMargin(new java.awt.Insets(5, 5, 7, 5));
        btnRoom3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoom3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Danh sách phòng máy:");

        btnRoom5.setForeground(new java.awt.Color(0, 0, 102));
        btnRoom5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sever.png"))); // NOI18N
        btnRoom5.setText("Phòng máy 5");
        btnRoom5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom5.setIconTextGap(0);
        btnRoom5.setMargin(new java.awt.Insets(5, 5, 7, 5));
        btnRoom5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoom5ActionPerformed(evt);
            }
        });

        btnRoom6.setForeground(new java.awt.Color(0, 0, 102));
        btnRoom6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sever.png"))); // NOI18N
        btnRoom6.setText("Phòng máy 6");
        btnRoom6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom6.setIconTextGap(0);
        btnRoom6.setMargin(new java.awt.Insets(5, 5, 7, 5));
        btnRoom6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoom6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRoom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRoom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRoom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRoom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRoom5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRoom6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRoom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoom6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoom5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        lblHello.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHello.setForeground(new java.awt.Color(0, 153, 51));
        lblHello.setText("Chào bạn! Chúc một ngày tốt lành");

        javax.swing.GroupLayout pnlHelloLayout = new javax.swing.GroupLayout(pnlHello);
        pnlHello.setLayout(pnlHelloLayout);
        pnlHelloLayout.setHorizontalGroup(
            pnlHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHelloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHello)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlHelloLayout.setVerticalGroup(
            pnlHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHelloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHello)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlHello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnAccount.setText("Tài khoản");

        mnIInfor.setText("Thông tin tài khoản");
        mnIInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIInforActionPerformed(evt);
            }
        });
        mnAccount.add(mnIInfor);

        mnILogOut.setText("Đăng xuất");
        mnILogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnILogOutActionPerformed(evt);
            }
        });
        mnAccount.add(mnILogOut);

        mnBar.add(mnAccount);

        mnApplication.setText("Phần mềm");

        mniInfoApp.setText("Thông tin phần mềm");
        mniInfoApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInfoAppActionPerformed(evt);
            }
        });
        mnApplication.add(mniInfoApp);

        mniExit.setText("Thoát");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnApplication.add(mniExit);

        mnBar.add(mnApplication);

        setJMenuBar(mnBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Quản lý phong máy");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showPanelInfor(JPanel p)
    {
        ChildPanel = p;
        pnlMain.removeAll();
        
        pnlMain.add(ChildPanel,BorderLayout.CENTER);
        
        pnlMain.validate();
    }
    
    private void mnIInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIInforActionPerformed

        showPanelInfor(new pnlInfo());
        
    }//GEN-LAST:event_mnIInforActionPerformed
    
    private void PhanQuyen()
    {
        //Quyền admin
        if(Quyen==0){
            btnUpdatePM.setVisible(false);
            btnQLUser.setVisible(true);
            btnAddUse.setVisible(true);
        }else if(Quyen==1)//Quyền quản lý Phòng máy
        {
            btnUpdatePM.setVisible(true);
            btnQLUser.setVisible(false);
            btnAddUse.setVisible(false);
        }else
        {
            btnUpdatePM.setVisible(false);
            btnQLUser.setVisible(false);
            btnAddUse.setVisible(false);
            pnlQuanLy.setVisible(false);
        }
    }
    
    private void Get_MaPhong()
    {
        try{
            String select="select MaPhong,QUYEN from giaovien where TAIKHOAN='"+id+"' and QUYEN=1;";
            Data.DataProvider data = new DataProvider();
            ResultSet rsMaPhong= data.Get_Data(select);
            rsMaPhong.beforeFirst();
            if(rsMaPhong.next()) 
                pnlUpdateRoom.MaPhong=rsMaPhong.getNString("MAPHONG");
            else
                JOptionPane.showMessageDialog(null,"Lỗi hệ thống");
            
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Lỗi: "+ex.toString());
        }
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        PhanQuyen();
        load_Notification();
    }//GEN-LAST:event_formWindowActivated

    private void load_Notification()
    {
        try{
        String select="Select count(*) soluong from maytinh,giaovien where giaovien.MAPHONG=maytinh.MAPHONG and  TAIKHOAN='"+id+"'";
        if(Quyen==1)
        {
            DataProvider dt= new DataProvider();
            ResultSet rs= dt.Get_Data(select);
            rs.beforeFirst();
            if(rs.next())
                lblNotification.setText("Có "+rs.getString("soluong")+" máy tính bị lỗi!");
            else
                lblNotification.setText("Chưa có thông báo!");
            
        }else
        {
            lblNotification.setText("Chưa có thông báo!");
        }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Lỗi kết nối!","Lỗi",1);
        }
        
    }
    private void mnILogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnILogOutActionPerformed
        int kq=JOptionPane.showConfirmDialog(null, "Bạn muốn đăng xuất?","Thông Báo",JOptionPane.YES_NO_OPTION);
        if(kq==0){
            login f = new login();
            f.show();
            id = null;
            this.dispose();
        }
        
    }//GEN-LAST:event_mnILogOutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int kq=JOptionPane.showConfirmDialog(null,"Bạn muốn thoát chương trình?","Thoát", JOptionPane.YES_NO_OPTION);
        if(kq==0)
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void btnAddUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUseActionPerformed
        showPanelInfor(new pnlAddUse());
    }//GEN-LAST:event_btnAddUseActionPerformed

    private void btnQLUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLUserActionPerformed
        showPanelInfor(new pnlManagerUser());
    }//GEN-LAST:event_btnQLUserActionPerformed

    private void btnUpdatePMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePMActionPerformed
        Get_MaPhong();
        showPanelInfor(new pnlUpdateRoom());
        
    }//GEN-LAST:event_btnUpdatePMActionPerformed

    private void btnRoom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoom1ActionPerformed
       showPanelInfor(new pnlRoom1());
    }//GEN-LAST:event_btnRoom1ActionPerformed

    private void btnRoom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoom2ActionPerformed
        showPanelInfor(new pnlRoom2());
    }//GEN-LAST:event_btnRoom2ActionPerformed

    private void btnRoom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoom4ActionPerformed
         showPanelInfor(new pnlRoom4());
    }//GEN-LAST:event_btnRoom4ActionPerformed

    private void btnRoom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoom3ActionPerformed
        showPanelInfor(new pnlRoom3());
    }//GEN-LAST:event_btnRoom3ActionPerformed

    private void btnRoom5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoom5ActionPerformed
       showPanelInfor(new pnlRoom5());
    }//GEN-LAST:event_btnRoom5ActionPerformed

    private void btnRoom6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoom6ActionPerformed
        showPanelInfor(new pnlRoom6());
    }//GEN-LAST:event_btnRoom6ActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        int kq=JOptionPane.showConfirmDialog(null,"Bạn muốn thoát chương trình?","Thoát", JOptionPane.YES_NO_OPTION);
        if(kq==0)
            System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniInfoAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInfoAppActionPerformed
        showPanelInfor(new pnlInfoApp());
    }//GEN-LAST:event_mniInfoAppActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUse;
    private javax.swing.JButton btnQLUser;
    private javax.swing.JButton btnRoom1;
    private javax.swing.JButton btnRoom2;
    private javax.swing.JButton btnRoom3;
    private javax.swing.JButton btnRoom4;
    private javax.swing.JButton btnRoom5;
    private javax.swing.JButton btnRoom6;
    private javax.swing.JButton btnUpdatePM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JMenu mnAccount;
    private javax.swing.JMenu mnApplication;
    private javax.swing.JMenuBar mnBar;
    private javax.swing.JMenuItem mnIInfor;
    private javax.swing.JMenuItem mnILogOut;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniInfoApp;
    private javax.swing.JPanel pnlHello;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlNotification;
    private javax.swing.JPanel pnlQuanLy;
    // End of variables declaration//GEN-END:variables
}
