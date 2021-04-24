/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyktx.view.Admin;

import java.awt.Toolkit;
import quanlyktx.view.DangNhap.DangNhapView;

/**
 *
 * @author luong
 */
public class AdminView extends javax.swing.JFrame {
    String user = "";
    /**
     * Creates new form AdminView
     */
    public AdminView() {
        setIcon();
        initComponents();
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);

    }
    public AdminView(String idQuanLy) {
        user = idQuanLy;
        setIcon();
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        btn_ql_csvc = new javax.swing.JLabel();
        btn_quan_ly_phong = new javax.swing.JLabel();
        btn_thu_phi = new javax.swing.JLabel();
        btn_dang_ki = new javax.swing.JLabel();
        btn_thong_ke = new javax.swing.JLabel();
        quan_ly_sinh_vien = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        btn_setting = new javax.swing.JButton();
        btn_user = new javax.swing.JLabel();
        btn_help = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        setting_view = new javax.swing.JLabel();
        main = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ql_csvc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ql_csvc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ql_csvcMouseClicked(evt);
            }
        });
        getContentPane().add(btn_ql_csvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 310, 150, 170));

        btn_quan_ly_phong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_quan_ly_phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_quan_ly_phongMouseClicked(evt);
            }
        });
        getContentPane().add(btn_quan_ly_phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 75, 150, 172));

        btn_thu_phi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_thu_phi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_thu_phiMouseClicked(evt);
            }
        });
        getContentPane().add(btn_thu_phi, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 310, 150, 170));

        btn_dang_ki.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dang_ki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dang_kiMouseClicked(evt);
            }
        });
        getContentPane().add(btn_dang_ki, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 75, 150, 170));

        btn_thong_ke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_thong_ke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_thong_keMouseClicked(evt);
            }
        });
        getContentPane().add(btn_thong_ke, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 150, 170));

        quan_ly_sinh_vien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quan_ly_sinh_vien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quan_ly_sinh_vienMouseClicked(evt);
            }
        });
        getContentPane().add(quan_ly_sinh_vien, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 75, 150, 170));

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/close.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        btn_setting.setBorder(null);
        btn_setting.setContentAreaFilled(false);
        btn_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_settingMouseClicked(evt);
            }
        });
        btn_setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingActionPerformed(evt);
            }
        });
        getContentPane().add(btn_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 190, 55));

        btn_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_userMouseClicked(evt);
            }
        });
        getContentPane().add(btn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 333, 190, 52));

        btn_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_helpMouseClicked(evt);
            }
        });
        getContentPane().add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 387, 190, 52));

        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 443, 190, 52));

        setting_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/setting.jpg"))); // NOI18N
        getContentPane().add(setting_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 276, 191, 220));

        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/admin_view.jpg"))); // NOI18N
        main.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainMouseDragged(evt);
            }
        });
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMouseClicked(evt);
            }
        });
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
    }//GEN-LAST:event_mainMouseClicked

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void quan_ly_sinh_vienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quan_ly_sinh_vienMouseClicked
        new QuanLySVView(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quan_ly_sinh_vienMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0; i <= 1; i += 0.2) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_thong_keMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thong_keMouseClicked
        new ThongKeView(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_thong_keMouseClicked

    private void btn_dang_kiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dang_kiMouseClicked
        System.out.println("btn_dang_ki" + user);
        new DangKyKTX(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_dang_kiMouseClicked

    private void btn_thu_phiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thu_phiMouseClicked
        new ThuPhiView(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_thu_phiMouseClicked

    private void btn_quan_ly_phongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quan_ly_phongMouseClicked
        new QuanLyPhongView(this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_quan_ly_phongMouseClicked

    private void btn_ql_csvcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ql_csvcMouseClicked
        new QuanLyCSVCView(this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ql_csvcMouseClicked

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
        this.dispose();
        new HelpView().setVisible(true);
    }//GEN-LAST:event_btn_helpMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);     
        flag = true;
        System.out.println("click log out");
        this.dispose();
        new DangNhapView().setVisible(true);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_settingActionPerformed

    //int x,y;
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
//        x = evt.getX();
//        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void mainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseDragged
//        int xx = evt.getXOnScreen();
//        int yy = evt.getYOnScreen();
//        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_mainMouseDragged

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_dang_ki;
    private javax.swing.JLabel btn_help;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_ql_csvc;
    private javax.swing.JLabel btn_quan_ly_phong;
    private javax.swing.JButton btn_setting;
    private javax.swing.JLabel btn_thong_ke;
    private javax.swing.JLabel btn_thu_phi;
    private javax.swing.JLabel btn_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel main;
    private javax.swing.JLabel quan_ly_sinh_vien;
    private javax.swing.JLabel setting_view;
    // End of variables declaration//GEN-END:variables
}
