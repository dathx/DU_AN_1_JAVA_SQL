/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bean.DanhMucBean;
import controller.ChuyenManHinh;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author Vu Hoang Phuc
 */
public class QuanTriVienUI extends javax.swing.JFrame {

    /**
     * Creates new form QuanTriVienUI
     */
    public QuanTriVienUI() {

        
        initComponents();
        init();
        startDongHo();
        
        ChuyenManHinh controller = new ChuyenManHinh(jpnView);
        controller.setDashboard(pnlTrangChu, lblTrangChu);

        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu", pnlTrangChu, lblTrangChu));
        listItem.add(new DanhMucBean("DonHang", pnlDongHang, lblDonHang));
        listItem.add(new DanhMucBean("KhachHang", pnlKhachHang, lblKhachHang));
        listItem.add(new DanhMucBean("NhaCungCap", pnlNCC, lblNCC));
        listItem.add(new DanhMucBean("NhanVien", pnlNhanVien, lblNhanVien));
        listItem.add(new DanhMucBean("SanPham", pnlSanPham, lblSanPham));
        listItem.add(new DanhMucBean("ThongKe", pnlThongKe, lblThongKe));

        controller.setEvent(listItem);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        pnlTrangChu = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        pnlSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        pnlDongHang = new javax.swing.JPanel();
        lblDonHang = new javax.swing.JLabel();
        pnlNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        pnlNCC = new javax.swing.JPanel();
        lblNCC = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDongho = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(204, 204, 204));

        jpnMenu.setBackground(new java.awt.Color(102, 102, 102));

        pnlTrangChu.setBackground(new java.awt.Color(76, 175, 80));
        pnlTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTrangChuMouseClicked(evt);
            }
        });

        lblTrangChu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manhinhchinh.png"))); // NOI18N
        lblTrangChu.setText("MÀN HÌNH CHÍNH");

        javax.swing.GroupLayout pnlTrangChuLayout = new javax.swing.GroupLayout(pnlTrangChu);
        pnlTrangChu.setLayout(pnlTrangChuLayout);
        pnlTrangChuLayout.setHorizontalGroup(
            pnlTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrangChuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTrangChu)
                .addGap(15, 15, 15))
        );
        pnlTrangChuLayout.setVerticalGroup(
            pnlTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangChuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTrangChu)
                .addGap(10, 10, 10))
        );

        pnlSanPham.setBackground(new java.awt.Color(76, 175, 80));

        lblSanPham.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sanpham.png"))); // NOI18N
        lblSanPham.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSanPham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDongHang.setBackground(new java.awt.Color(76, 175, 80));

        lblDonHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDonHang.setForeground(new java.awt.Color(255, 255, 255));
        lblDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/donhang.png"))); // NOI18N
        lblDonHang.setText("QUẢN LÝ ĐƠN HÀNG");

        javax.swing.GroupLayout pnlDongHangLayout = new javax.swing.GroupLayout(pnlDongHang);
        pnlDongHang.setLayout(pnlDongHangLayout);
        pnlDongHangLayout.setHorizontalGroup(
            pnlDongHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDongHangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblDonHang)
                .addGap(15, 15, 15))
        );
        pnlDongHangLayout.setVerticalGroup(
            pnlDongHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongHangLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pnlNhanVien.setBackground(new java.awt.Color(76, 175, 80));

        lblNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nhanvien.png"))); // NOI18N
        lblNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblNhanVien)
                .addGap(15, 15, 15))
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNhanVien)
                .addGap(10, 10, 10))
        );

        pnlNCC.setBackground(new java.awt.Color(76, 175, 80));

        lblNCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNCC.setForeground(new java.awt.Color(255, 255, 255));
        lblNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nhacungcap.png"))); // NOI18N
        lblNCC.setText("QUẢN LÝ NHÀ CUNG CẤP");

        javax.swing.GroupLayout pnlNCCLayout = new javax.swing.GroupLayout(pnlNCC);
        pnlNCC.setLayout(pnlNCCLayout);
        pnlNCCLayout.setHorizontalGroup(
            pnlNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNCCLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblNCC)
                .addGap(15, 15, 15))
        );
        pnlNCCLayout.setVerticalGroup(
            pnlNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNCCLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNCC)
                .addGap(10, 10, 10))
        );

        pnlThongKe.setBackground(new java.awt.Color(76, 175, 80));

        lblThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thongke.png"))); // NOI18N
        lblThongKe.setText("THỐNG KÊ");

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongKeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblThongKe)
                .addGap(15, 15, 15))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblThongKe)
                .addGap(10, 10, 10))
        );

        pnlKhachHang.setBackground(new java.awt.Color(76, 175, 80));

        lblKhachHang.setBackground(new java.awt.Color(76, 175, 80));
        lblKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/khachhang.png"))); // NOI18N
        lblKhachHang.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachHangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblKhachHang)
                .addGap(15, 15, 15))
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblKhachHang)
                .addGap(10, 10, 10))
        );

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng xuất");

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Kết thúc");

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_add_box_white_18dp.png"))); // NOI18N

        lblDongho.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        lblDongho.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongho, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongho, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDongHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnlKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDongHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 989, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTrangChuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTrangChuMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblNhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(QuanTriVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanTriVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanTriVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanTriVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanTriVienUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblDongho;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblNCC;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JPanel pnlDongHang;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlNCC;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlTrangChu;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
        new Timer(1000, (ActionEvent e) -> {
            lblDongho.setText(formater.format(new Date()));
        }).start();
    }
}
