/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Room;

import Data.DataProvider;
import Frame.fmBaoCaoTinhTrang;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author batro
 */
public class pnlRoom4 extends javax.swing.JPanel {

    /**
     * Creates new form pnlRoom4
     */
    public pnlRoom4() {
        initComponents();
    }

    
     public ResultSet rsPC;
     
    private String Get_Name_Button(JButton btn)
    {
        return btn.getName();
    }
     private void Load_DataPC()
    {
        try{
            
            String select="SELECT MAMAY,TINHTRANG FROM qlpm.maytinh where MAPHONG='"+this.getName()+"'";
            Data.DataProvider data= new DataProvider();
            rsPC=data.Get_Data(select);
        
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
    
    
    private void Load_default()
    {
        may1.setForeground(Color.GREEN);
        may2.setForeground(Color.GREEN);
        may3.setForeground(Color.GREEN);
        may4.setForeground(Color.GREEN);
        may5.setForeground(Color.GREEN);
        may6.setForeground(Color.GREEN);
        may7.setForeground(Color.GREEN);
        may8.setForeground(Color.GREEN);
        may9.setForeground(Color.GREEN);
        may10.setForeground(Color.GREEN);
        may11.setForeground(Color.GREEN);
        may12.setForeground(Color.GREEN);
        may13.setForeground(Color.GREEN);
        may14.setForeground(Color.GREEN);
        may15.setForeground(Color.GREEN);
        may16.setForeground(Color.GREEN);
        may17.setForeground(Color.GREEN);
        may18.setForeground(Color.GREEN);
        may19.setForeground(Color.GREEN);
        may20.setForeground(Color.GREEN);
        may21.setForeground(Color.GREEN);
        may22.setForeground(Color.GREEN);
        may23.setForeground(Color.GREEN);
        may24.setForeground(Color.GREEN);
        may25.setForeground(Color.GREEN);
        may26.setForeground(Color.GREEN);
        may27.setForeground(Color.GREEN);
        may28.setForeground(Color.GREEN);
        may29.setForeground(Color.GREEN);
        may30.setForeground(Color.GREEN);
        may31.setForeground(Color.GREEN);
        may32.setForeground(Color.GREEN);
        may33.setForeground(Color.GREEN);
        may34.setForeground(Color.GREEN);
        may35.setForeground(Color.GREEN);
    }
    
    private void Set_ErrorPC()
    {
        try{
            Load_DataPC();
            Load_default();
            while (rsPC.next()) {
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==1)
                    may1.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==2)
                    may2.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==3)
                    may3.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==4)
                    may4.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==5)
                    may5.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==6)
                    may6.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==7)
                    may7.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==8)
                    may8.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==9)
                    may9.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==10)
                    may10.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==11)
                    may11.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==12)
                    may12.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==13)
                    may13.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==14)
                    may14.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==15)
                    may15.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==16)
                    may16.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==17)
                    may17.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==18)
                    may18.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==19)
                    may19.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==20)
                    may20.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==21)
                    may21.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==22)
                    may22.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==23)
                    may23.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==24)
                    may24.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==25)
                    may25.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==26)
                    may26.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==27)
                    may27.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==28)
                    may28.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==29)
                    may29.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==30)
                    may30.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==31)
                    may31.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==32)
                    may32.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==33)
                    may33.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==34)
                    may34.setForeground(Color.red);
                
                if(Integer.parseInt(rsPC.getString("MaMay").substring(5,7))==35)
                    may35.setForeground(Color.red);
                    
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Lỗi: "+ ex.toString());
        }
    }
    
    private void ShowFrmBaoCao(String ID_PC)
    {
        fmBaoCaoTinhTrang f= new fmBaoCaoTinhTrang();
        fmBaoCaoTinhTrang.ID_PC=ID_PC;
        fmBaoCaoTinhTrang.MaPhong=this.getName();
        f.show();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        may30 = new javax.swing.JButton();
        may12 = new javax.swing.JButton();
        may21 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        may26 = new javax.swing.JButton();
        may9 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        may31 = new javax.swing.JButton();
        may20 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        may5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        may22 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        may32 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        may7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        may17 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        may10 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        may8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        may18 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        may33 = new javax.swing.JButton();
        may3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        may13 = new javax.swing.JButton();
        may34 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        may27 = new javax.swing.JButton();
        may11 = new javax.swing.JButton();
        may24 = new javax.swing.JButton();
        may4 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        may14 = new javax.swing.JButton();
        may28 = new javax.swing.JButton();
        may1 = new javax.swing.JButton();
        may29 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        may23 = new javax.swing.JButton();
        may19 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        may16 = new javax.swing.JButton();
        may2 = new javax.swing.JButton();
        may15 = new javax.swing.JButton();
        may25 = new javax.swing.JButton();
        may6 = new javax.swing.JButton();
        may35 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setName("A204"); // NOI18N

        jLabel19.setText("Máy 15");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(java.awt.Color.green);
        jLabel37.setText("*");

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Refresh-icon.png"))); // NOI18N
        btnRefresh.setBorder(null);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        may30.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may30.setForeground(java.awt.Color.green);
        may30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may30.setText("*");
        may30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may30ActionPerformed(evt);
            }
        });

        may12.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may12.setForeground(java.awt.Color.green);
        may12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may12.setText("*");
        may12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may12ActionPerformed(evt);
            }
        });

        may21.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may21.setForeground(java.awt.Color.green);
        may21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may21.setText("*");
        may21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may21ActionPerformed(evt);
            }
        });

        jLabel3.setText("Máy 2");

        may26.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may26.setForeground(java.awt.Color.green);
        may26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may26.setText("*");
        may26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may26ActionPerformed(evt);
            }
        });

        may9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may9.setForeground(java.awt.Color.green);
        may9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may9.setText("*");
        may9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may9ActionPerformed(evt);
            }
        });

        jLabel34.setText("Máy 34");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("PHÒNG MÁY 4");

        jLabel17.setText("Máy 28");

        may31.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may31.setForeground(java.awt.Color.green);
        may31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may31.setText("*");
        may31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may31ActionPerformed(evt);
            }
        });

        may20.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may20.setForeground(java.awt.Color.green);
        may20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may20.setText("*");
        may20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may20ActionPerformed(evt);
            }
        });

        jLabel28.setText("Máy 32");

        jLabel14.setText("Máy 13");

        may5.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may5.setForeground(java.awt.Color.green);
        may5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may5.setText("*");
        may5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may5ActionPerformed(evt);
            }
        });

        jLabel20.setText("Máy 22");

        may22.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may22.setForeground(java.awt.Color.green);
        may22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may22.setText("*");
        may22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may22ActionPerformed(evt);
            }
        });

        jLabel15.setText("Máy 14");

        may32.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may32.setForeground(java.awt.Color.green);
        may32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may32.setText("*");
        may32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may32ActionPerformed(evt);
            }
        });

        jLabel23.setText("Máy 23");

        jLabel11.setText("Máy 10");

        jLabel27.setText("Máy 31");

        jLabel33.setText("Máy 33");

        may7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may7.setForeground(java.awt.Color.green);
        may7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may7.setText("*");
        may7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may7ActionPerformed(evt);
            }
        });

        jLabel5.setText("Máy 4");

        may17.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may17.setForeground(java.awt.Color.green);
        may17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may17.setText("*");
        may17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may17ActionPerformed(evt);
            }
        });

        jLabel40.setText("Máy lỗi");

        jLabel32.setText("Máy 26");

        may10.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may10.setForeground(java.awt.Color.green);
        may10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may10.setText("*");
        may10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may10ActionPerformed(evt);
            }
        });

        jLabel35.setText("Máy 27");

        may8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may8.setForeground(java.awt.Color.green);
        may8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may8.setText("*");
        may8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may8ActionPerformed(evt);
            }
        });

        jLabel13.setText("Máy 12");

        may18.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may18.setForeground(java.awt.Color.green);
        may18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may18.setText("*");
        may18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may18ActionPerformed(evt);
            }
        });

        jLabel12.setText("Máy 11");

        jLabel31.setText("Máy 19");

        may33.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may33.setForeground(java.awt.Color.green);
        may33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may33.setText("*");
        may33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may33ActionPerformed(evt);
            }
        });

        may3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may3.setForeground(java.awt.Color.green);
        may3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may3.setText("*");
        may3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may3ActionPerformed(evt);
            }
        });

        jLabel25.setText("Máy 17");

        jLabel29.setText("Máy 25");

        jLabel26.setText("Máy 24");

        may13.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may13.setForeground(java.awt.Color.green);
        may13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may13.setText("*");
        may13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may13ActionPerformed(evt);
            }
        });

        may34.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may34.setForeground(java.awt.Color.green);
        may34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may34.setText("*");
        may34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may34ActionPerformed(evt);
            }
        });

        jLabel36.setText("Máy 20");

        jLabel16.setText("Máy 21");

        jLabel8.setText("Máy 7");

        may27.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may27.setForeground(java.awt.Color.green);
        may27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may27.setText("*");
        may27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may27ActionPerformed(evt);
            }
        });

        may11.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may11.setForeground(java.awt.Color.green);
        may11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may11.setText("*");
        may11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may11ActionPerformed(evt);
            }
        });

        may24.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may24.setForeground(java.awt.Color.green);
        may24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may24.setText("*");
        may24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may24ActionPerformed(evt);
            }
        });

        may4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may4.setForeground(java.awt.Color.green);
        may4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may4.setText("*");
        may4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may4ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(java.awt.Color.red);
        jLabel38.setText("*");

        may14.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may14.setForeground(java.awt.Color.green);
        may14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may14.setText("*");
        may14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may14ActionPerformed(evt);
            }
        });

        may28.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may28.setForeground(java.awt.Color.green);
        may28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may28.setText("*");
        may28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may28ActionPerformed(evt);
            }
        });

        may1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may1.setForeground(java.awt.Color.green);
        may1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may1.setText("*");
        may1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may1ActionPerformed(evt);
            }
        });

        may29.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may29.setForeground(java.awt.Color.green);
        may29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may29.setText("*");
        may29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may29ActionPerformed(evt);
            }
        });

        jLabel10.setText("Máy 9");

        jLabel18.setText("Máy 35");

        jLabel7.setText("Máy 6");

        jLabel24.setText("Máy 16");

        jLabel4.setText("Máy 3");

        jLabel22.setText("Máy 30");

        may23.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may23.setForeground(java.awt.Color.green);
        may23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may23.setText("*");
        may23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may23ActionPerformed(evt);
            }
        });

        may19.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may19.setForeground(java.awt.Color.green);
        may19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may19.setText("*");
        may19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may19ActionPerformed(evt);
            }
        });

        jLabel2.setText("Máy 1");

        jLabel21.setText("Máy 29");

        jLabel30.setText("Máy 18");

        may16.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may16.setForeground(java.awt.Color.green);
        may16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may16.setText("*");
        may16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may16ActionPerformed(evt);
            }
        });

        may2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may2.setForeground(java.awt.Color.green);
        may2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may2.setText("*");
        may2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may2ActionPerformed(evt);
            }
        });

        may15.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may15.setForeground(java.awt.Color.green);
        may15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may15.setText("*");
        may15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may15ActionPerformed(evt);
            }
        });

        may25.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may25.setForeground(java.awt.Color.green);
        may25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may25.setText("*");
        may25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may25ActionPerformed(evt);
            }
        });

        may6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may6.setForeground(java.awt.Color.green);
        may6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may6.setText("*");
        may6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may6ActionPerformed(evt);
            }
        });

        may35.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        may35.setForeground(java.awt.Color.green);
        may35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Devices-computer-icon.png"))); // NOI18N
        may35.setText("*");
        may35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may35ActionPerformed(evt);
            }
        });

        jLabel6.setText("Máy 5");

        jLabel9.setText("Máy 8");

        jLabel39.setText("Máy bình thường.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(may29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(may30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(may31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(may32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(may33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(may34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(may35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(may22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(may23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(may24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(may25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(may26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(may27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(may28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(may15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(may16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(may17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(may18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(may19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(may20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(may21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(may8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(may9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(may10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(may11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(may12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(may13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(may14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(may1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(may2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(may3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(may4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(may5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(may6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(may7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)))
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(99, 99, 99)
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel40)))
                            .addComponent(btnRefresh))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(may4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(may11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(may18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(may25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(may28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(may32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(may34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(may33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(may31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(may30, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(may29, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(may35, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        Set_ErrorPC();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void may30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may30ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("30");
    }//GEN-LAST:event_may30ActionPerformed

    private void may12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may12ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("12");
    }//GEN-LAST:event_may12ActionPerformed

    private void may21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may21ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("21");
    }//GEN-LAST:event_may21ActionPerformed

    private void may26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may26ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("26");
    }//GEN-LAST:event_may26ActionPerformed

    private void may9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may9ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("9");
    }//GEN-LAST:event_may9ActionPerformed

    private void may31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may31ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("31");
    }//GEN-LAST:event_may31ActionPerformed

    private void may20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may20ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("20");
    }//GEN-LAST:event_may20ActionPerformed

    private void may5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may5ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("5");
    }//GEN-LAST:event_may5ActionPerformed

    private void may22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may22ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("22");
    }//GEN-LAST:event_may22ActionPerformed

    private void may32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may32ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("32");
    }//GEN-LAST:event_may32ActionPerformed

    private void may7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may7ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("7");
    }//GEN-LAST:event_may7ActionPerformed

    private void may17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may17ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("17");
    }//GEN-LAST:event_may17ActionPerformed

    private void may10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may10ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("10");
    }//GEN-LAST:event_may10ActionPerformed

    private void may8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may8ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("8");
    }//GEN-LAST:event_may8ActionPerformed

    private void may18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may18ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("18");
    }//GEN-LAST:event_may18ActionPerformed

    private void may33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may33ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("33");
    }//GEN-LAST:event_may33ActionPerformed

    private void may3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may3ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("3");
    }//GEN-LAST:event_may3ActionPerformed

    private void may13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may13ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("13");
    }//GEN-LAST:event_may13ActionPerformed

    private void may34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may34ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("34");
    }//GEN-LAST:event_may34ActionPerformed

    private void may27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may27ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("27");
    }//GEN-LAST:event_may27ActionPerformed

    private void may11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may11ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("11");
    }//GEN-LAST:event_may11ActionPerformed

    private void may24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may24ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("24");
    }//GEN-LAST:event_may24ActionPerformed

    private void may4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may4ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("4");
    }//GEN-LAST:event_may4ActionPerformed

    private void may14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may14ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("14");
    }//GEN-LAST:event_may14ActionPerformed

    private void may28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may28ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("28");
    }//GEN-LAST:event_may28ActionPerformed

    private void may1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may1ActionPerformed
        ShowFrmBaoCao("1");
    }//GEN-LAST:event_may1ActionPerformed

    private void may29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may29ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("29");
    }//GEN-LAST:event_may29ActionPerformed

    private void may23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may23ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("23");
    }//GEN-LAST:event_may23ActionPerformed

    private void may19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may19ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("19");
    }//GEN-LAST:event_may19ActionPerformed

    private void may16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may16ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("16");
    }//GEN-LAST:event_may16ActionPerformed

    private void may2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may2ActionPerformed
        ShowFrmBaoCao("2");
    }//GEN-LAST:event_may2ActionPerformed

    private void may15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may15ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("15");
    }//GEN-LAST:event_may15ActionPerformed

    private void may25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may25ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("25");
    }//GEN-LAST:event_may25ActionPerformed

    private void may6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may6ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("6");
    }//GEN-LAST:event_may6ActionPerformed

    private void may35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may35ActionPerformed
        // TODO add your handling code here:
        ShowFrmBaoCao("35");
    }//GEN-LAST:event_may35ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton may1;
    private javax.swing.JButton may10;
    private javax.swing.JButton may11;
    private javax.swing.JButton may12;
    private javax.swing.JButton may13;
    private javax.swing.JButton may14;
    private javax.swing.JButton may15;
    private javax.swing.JButton may16;
    private javax.swing.JButton may17;
    private javax.swing.JButton may18;
    private javax.swing.JButton may19;
    private javax.swing.JButton may2;
    private javax.swing.JButton may20;
    private javax.swing.JButton may21;
    private javax.swing.JButton may22;
    private javax.swing.JButton may23;
    private javax.swing.JButton may24;
    private javax.swing.JButton may25;
    private javax.swing.JButton may26;
    private javax.swing.JButton may27;
    private javax.swing.JButton may28;
    private javax.swing.JButton may29;
    private javax.swing.JButton may3;
    private javax.swing.JButton may30;
    private javax.swing.JButton may31;
    private javax.swing.JButton may32;
    private javax.swing.JButton may33;
    private javax.swing.JButton may34;
    private javax.swing.JButton may35;
    private javax.swing.JButton may4;
    private javax.swing.JButton may5;
    private javax.swing.JButton may6;
    private javax.swing.JButton may7;
    private javax.swing.JButton may8;
    private javax.swing.JButton may9;
    // End of variables declaration//GEN-END:variables
}
