/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyktx.view.Admin;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import quanlyktx.DAO.DAO;
import quanlyktx.model.HoaDon;
import quanlyktx.model.HopDong;
import quanlyktx.model.PS_Phong;
import quanlyktx.model.PhatSinh;
import quanlyktx.model.SinhVien;
import quanlyktx.view.DangNhap.DangNhapView;

/**
 *
 * @author luong
 */
public class ThuPhiView extends javax.swing.JFrame {
    
    static String user;
    private DAO controller = new DAO();
    List<PhatSinh> services;
    List<HoaDon> bills;
    List<PS_Phong> roomServices;
    private DefaultTableModel modelServices;
    private DefaultTableModel modelBills;

    /**
     * Creates new form ThuPhiView
     */
    public ThuPhiView(String id) {
        user = id;
        setIcon();
        initComponents();
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        modelServices = (DefaultTableModel) table_phat_sinh.getModel();
        modelBills = (DefaultTableModel) table_phi_phat_sinh.getModel();
        services = controller.getListServices();
        
        controller.getListBills(modelBills);
        
        showServices();
        //showBills();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_logout = new javax.swing.JLabel();
        btn_help = new javax.swing.JLabel();
        btn_user = new javax.swing.JLabel();
        setting_view = new javax.swing.JLabel();
        btn_setting = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_phi_phat_sinh = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_phat_sinh = new javax.swing.JTable();
        btn_add = new javax.swing.JLabel();
        btn_edit = new javax.swing.JLabel();
        btn_remove = new javax.swing.JLabel();
        btn_add_ps = new javax.swing.JLabel();
        btn_edit_ps = new javax.swing.JLabel();
        btn_remove_ps = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 445, 190, 55));

        btn_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_helpMouseClicked(evt);
            }
        });
        getContentPane().add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, 55));

        btn_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_userMouseClicked(evt);
            }
        });
        getContentPane().add(btn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, 190, 55));

        setting_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/setting.jpg"))); // NOI18N
        getContentPane().add(setting_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 220));

        btn_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_settingMouseClicked(evt);
            }
        });
        getContentPane().add(btn_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 190, 50));

        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 25, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Phát sinh:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        table_phi_phat_sinh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_phi_phat_sinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã hóa đơn", "Mã phòng", "Ngày phát sinh", "Tổng tiền"
            }
        ));
        jScrollPane2.setViewportView(table_phi_phat_sinh);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 580, 240));

        table_phat_sinh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_phat_sinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên phát sinh", "Giá tiền", "Đơn vị tính"
            }
        ));
        jScrollPane1.setViewportView(table_phat_sinh);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 580, 110));

        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/add.png"))); // NOI18N
        btn_add.setText("Thêm");
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, 20));

        btn_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/edit.png"))); // NOI18N
        btn_edit.setText("Sửa");
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 60, 20));

        btn_remove.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/remove.png"))); // NOI18N
        btn_remove.setText("Xóa");
        getContentPane().add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 60, 20));

        btn_add_ps.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_add_ps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/add.png"))); // NOI18N
        btn_add_ps.setText("Thêm");
        getContentPane().add(btn_add_ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, 20));

        btn_edit_ps.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_edit_ps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/edit.png"))); // NOI18N
        btn_edit_ps.setText("Sửa");
        getContentPane().add(btn_edit_ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 60, 20));

        btn_remove_ps.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_remove_ps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/remove.png"))); // NOI18N
        btn_remove_ps.setText("Xóa");
        getContentPane().add(btn_remove_ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 60, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Phí dịch vụ: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/ThuPhi.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        this.dispose();
        new AdminView(user).setVisible(true);
    }//GEN-LAST:event_btn_closeMouseClicked
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
            java.util.logging.Logger.getLogger(ThuPhiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuPhiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuPhiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuPhiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuPhiView(user).setVisible(true);
            }
        });
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_add;
    private javax.swing.JLabel btn_add_ps;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_edit;
    private javax.swing.JLabel btn_edit_ps;
    private javax.swing.JLabel btn_help;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_remove;
    private javax.swing.JLabel btn_remove_ps;
    private javax.swing.JLabel btn_setting;
    private javax.swing.JLabel btn_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel setting_view;
    private javax.swing.JTable table_phat_sinh;
    private javax.swing.JTable table_phi_phat_sinh;
    // End of variables declaration//GEN-END:variables

    private void showServices() {
        int i = 1;
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        modelServices.setRowCount(0);
        for (PhatSinh t : services) {
            
            modelServices.addRow(new Object[]{
                i++,
                t.getMaPS().trim(),
                t.getTenPS().trim(),
                formatter.format(t.getGiaTienPS()) + " vnđ",
                t.getDonViTinh(),});
        }
    }
}
