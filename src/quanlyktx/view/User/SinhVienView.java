/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyktx.view.User;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.List;
import quanlyktx.DAO.DAO;
import quanlyktx.view.Admin.DangKyKTX;
import quanlyktx.view.Admin.HelpView;
import quanlyktx.view.Admin.UserView;
import quanlyktx.view.DangNhap.DangNhapView;
import quanlyktx.model.SinhVien;

/**
 *
 * @author luong
 */
public class SinhVienView extends javax.swing.JFrame {

    /**
     * Creates new form SinhVienView
     */
    SinhVien sinhVien;
    static String taiKhoan = "";
    DAO controller;
    
    public SinhVienView(String tk) {
        initComponents();
        taiKhoan = tk;
        controller = new DAO();
        sinhVien = controller.getStudent(tk);
//        System.out.println(sinhVien.getTen());
        setIcon();
        if (sinhVien != null) {
            txtTen.setText(sinhVien.getTen().trim());
            txtTen.setForeground(Color.orange);
        }
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
    }
    
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_dang_ky = new javax.swing.JLabel();
        btn_thong_tin = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        btn_help = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        btn_user = new javax.swing.JLabel();
        setting_view = new javax.swing.JLabel();
        btn_setting = new javax.swing.JLabel();
        txtTen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dang_ky.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dang_ky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dang_kyMouseClicked(evt);
            }
        });
        getContentPane().add(btn_dang_ky, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 170, 250));

        btn_thong_tin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_thong_tin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_thong_tinMouseClicked(evt);
            }
        });
        getContentPane().add(btn_thong_tin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 190, 250));

        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        btn_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_helpMouseClicked(evt);
            }
        });
        getContentPane().add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, 55));

        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 445, 190, 55));

        btn_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_userMouseClicked(evt);
            }
        });
        getContentPane().add(btn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, 190, 55));

        setting_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/setting.jpg"))); // NOI18N
        setting_view.setText("jLabel3");
        getContentPane().add(setting_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 220));

        btn_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_settingMouseClicked(evt);
            }
        });
        getContentPane().add(btn_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 190, 50));

        txtTen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTen.setForeground(new java.awt.Color(255, 255, 204));
        txtTen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTen.setText("User");
        txtTen.setAlignmentX(15.0F);
        txtTen.setAlignmentY(15.0F);
        txtTen.setFocusable(false);
        txtTen.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        txtTen.setInheritsPopupMenu(false);
        getContentPane().add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 190, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/SinhVienView.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private boolean flag = true;
    private void btn_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingMouseClicked
        if (flag) {
            setting_view.setVisible(true);
            btn_user.setVisible(true);
            btn_help.setVisible(true);
            btn_logout.setVisible(true);
            flag = false;
        } else {
            setting_view.setVisible(false);
            btn_user.setVisible(false);
            btn_help.setVisible(false);
            btn_logout.setVisible(false);
            flag = true;
        }
    }//GEN-LAST:event_btn_settingMouseClicked

    private void btn_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_userMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
        System.out.println("click user");
        this.dispose();
        new UserView().setVisible(true);
    }//GEN-LAST:event_btn_userMouseClicked

    private void btn_helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_helpMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
        System.out.println("click help");
        new HelpView().setVisible(true);
    }//GEN-LAST:event_btn_helpMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
        System.out.println("click logout");
        this.dispose();
        new DangNhapView().setVisible(true);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_thong_tinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thong_tinMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
        System.out.println("click btn_thong_tin");
        new ThongTinView().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_thong_tinMouseClicked

    private void btn_dang_kyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dang_kyMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
        System.out.println("click btn_dang_ky");
        //new NhapThongTinSV(taiKhoan).setVisible(true);
        if(controller.getStudent(taiKhoan) == null)
        {
            new SVNhapThongTinView(taiKhoan).setVisible(true);
        }
        else
        {
            new SVChonPhongView(taiKhoan).setVisible(true);
        }
    }//GEN-LAST:event_btn_dang_kyMouseClicked

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
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVienView(taiKhoan).setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

    public List<SinhVien> listSV;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_dang_ky;
    private javax.swing.JLabel btn_help;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_setting;
    private javax.swing.JLabel btn_thong_tin;
    private javax.swing.JLabel btn_user;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel setting_view;
    private javax.swing.JLabel txtTen;
    // End of variables declaration//GEN-END:variables
}
