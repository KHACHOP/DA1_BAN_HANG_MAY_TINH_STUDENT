package VEW_TONG;

public class TrangChuView extends javax.swing.JFrame {

    public TrangChuView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelControl = new javax.swing.JPanel();
        banHangPanel = new javax.swing.JPanel();
        banHangLabel = new javax.swing.JLabel();
        sanPhamPanel = new javax.swing.JPanel();
        sanPhamLabel = new javax.swing.JLabel();
        nhanVienPanel = new javax.swing.JPanel();
        nhanVienLabel = new javax.swing.JLabel();
        hoaDonPanel = new javax.swing.JPanel();
        hoaDonLabel = new javax.swing.JLabel();
        khuyenMaiPanel = new javax.swing.JPanel();
        khuyenMaiLabel = new javax.swing.JLabel();
        khachHangPanel = new javax.swing.JPanel();
        khachHangLabel = new javax.swing.JLabel();
        labelShowOffice = new javax.swing.JLabel();
        labelShowName = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        exitStatusLb = new javax.swing.JPanel();
        exitLb = new javax.swing.JLabel();
        doiMatKhauPanel = new javax.swing.JPanel();
        doiMatKhau = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNgay = new javax.swing.JLabel();
        lblGio = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelControl.setBackground(new java.awt.Color(51, 153, 255));
        panelControl.setPreferredSize(new java.awt.Dimension(175, 744));

        banHangPanel.setBackground(new java.awt.Color(51, 0, 51));
        banHangPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        banHangLabel.setBackground(new java.awt.Color(255, 204, 204));
        banHangLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        banHangLabel.setForeground(new java.awt.Color(255, 255, 255));
        banHangLabel.setText("BÁN HÀNG");
        banHangLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        banHangLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banHangLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout banHangPanelLayout = new javax.swing.GroupLayout(banHangPanel);
        banHangPanel.setLayout(banHangPanelLayout);
        banHangPanelLayout.setHorizontalGroup(
            banHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, banHangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        banHangPanelLayout.setVerticalGroup(
            banHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        sanPhamPanel.setBackground(new java.awt.Color(51, 0, 51));
        sanPhamPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        sanPhamLabel.setBackground(new java.awt.Color(153, 255, 153));
        sanPhamLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        sanPhamLabel.setForeground(new java.awt.Color(255, 255, 255));
        sanPhamLabel.setText("SẢN PHẨM");
        sanPhamLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout sanPhamPanelLayout = new javax.swing.GroupLayout(sanPhamPanel);
        sanPhamPanel.setLayout(sanPhamPanelLayout);
        sanPhamPanelLayout.setHorizontalGroup(
            sanPhamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sanPhamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sanPhamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sanPhamPanelLayout.setVerticalGroup(
            sanPhamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sanPhamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        nhanVienPanel.setBackground(new java.awt.Color(51, 0, 51));
        nhanVienPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        nhanVienLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        nhanVienLabel.setForeground(new java.awt.Color(255, 255, 255));
        nhanVienLabel.setText("NHÂN VIÊN");

        javax.swing.GroupLayout nhanVienPanelLayout = new javax.swing.GroupLayout(nhanVienPanel);
        nhanVienPanel.setLayout(nhanVienPanelLayout);
        nhanVienPanelLayout.setHorizontalGroup(
            nhanVienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nhanVienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhanVienLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nhanVienPanelLayout.setVerticalGroup(
            nhanVienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nhanVienLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        hoaDonPanel.setBackground(new java.awt.Color(51, 0, 51));
        hoaDonPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        hoaDonLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        hoaDonLabel.setForeground(new java.awt.Color(255, 255, 255));
        hoaDonLabel.setText("HÓA ĐƠN");

        javax.swing.GroupLayout hoaDonPanelLayout = new javax.swing.GroupLayout(hoaDonPanel);
        hoaDonPanel.setLayout(hoaDonPanelLayout);
        hoaDonPanelLayout.setHorizontalGroup(
            hoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hoaDonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hoaDonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        hoaDonPanelLayout.setVerticalGroup(
            hoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hoaDonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        khuyenMaiPanel.setBackground(new java.awt.Color(51, 0, 51));
        khuyenMaiPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        khuyenMaiLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        khuyenMaiLabel.setForeground(new java.awt.Color(255, 255, 255));
        khuyenMaiLabel.setText("KHUYẾN MÃI");

        javax.swing.GroupLayout khuyenMaiPanelLayout = new javax.swing.GroupLayout(khuyenMaiPanel);
        khuyenMaiPanel.setLayout(khuyenMaiPanelLayout);
        khuyenMaiPanelLayout.setHorizontalGroup(
            khuyenMaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khuyenMaiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(khuyenMaiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        khuyenMaiPanelLayout.setVerticalGroup(
            khuyenMaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(khuyenMaiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        khachHangPanel.setBackground(new java.awt.Color(51, 0, 51));
        khachHangPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        khachHangLabel.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        khachHangLabel.setForeground(new java.awt.Color(255, 255, 255));
        khachHangLabel.setText("KHÁCH HÀNG");

        javax.swing.GroupLayout khachHangPanelLayout = new javax.swing.GroupLayout(khachHangPanel);
        khachHangPanel.setLayout(khachHangPanelLayout);
        khachHangPanelLayout.setHorizontalGroup(
            khachHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachHangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(khachHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        khachHangPanelLayout.setVerticalGroup(
            khachHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(khachHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        labelShowOffice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelShowOffice.setForeground(new java.awt.Color(255, 255, 255));
        labelShowOffice.setText("Chức Vụ");

        labelShowName.setBackground(new java.awt.Color(204, 255, 204));
        labelShowName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelShowName.setForeground(new java.awt.Color(255, 255, 255));
        labelShowName.setText("Tên");

        exitPanel.setBackground(new java.awt.Color(0, 0, 0));
        exitPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        exitStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        exitStatusLb.setOpaque(false);
        exitStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout exitStatusLbLayout = new javax.swing.GroupLayout(exitStatusLb);
        exitStatusLb.setLayout(exitStatusLbLayout);
        exitStatusLbLayout.setHorizontalGroup(
            exitStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        exitStatusLbLayout.setVerticalGroup(
            exitStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        exitLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        exitLb.setForeground(new java.awt.Color(255, 255, 255));
        exitLb.setText("THOÁT");

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(exitStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitLb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitStatusLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(exitLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        doiMatKhauPanel.setBackground(new java.awt.Color(51, 0, 51));
        doiMatKhauPanel.setPreferredSize(new java.awt.Dimension(163, 36));

        doiMatKhau.setFont(new java.awt.Font("Source Sans Pro Black", 1, 14)); // NOI18N
        doiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        doiMatKhau.setText("ĐỔI MẬT KHẨU");

        javax.swing.GroupLayout doiMatKhauPanelLayout = new javax.swing.GroupLayout(doiMatKhauPanel);
        doiMatKhauPanel.setLayout(doiMatKhauPanelLayout);
        doiMatKhauPanelLayout.setHorizontalGroup(
            doiMatKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doiMatKhauPanelLayout.createSequentialGroup()
                .addComponent(doiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        doiMatKhauPanelLayout.setVerticalGroup(
            doiMatKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        lblNgay.setText("ngay");

        lblGio.setText("gio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banHangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(sanPhamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(nhanVienPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(hoaDonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(khuyenMaiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(khachHangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doiMatKhauPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelShowName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelShowOffice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelShowOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(banHangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sanPhamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nhanVienPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hoaDonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(khuyenMaiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(khachHangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doiMatKhauPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        mainPanel.setAutoscrolls(true);
        mainPanel.setPreferredSize(new java.awt.Dimension(1300, 790));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void banHangLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banHangLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_banHangLabelMouseClicked

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
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banHangLabel;
    private javax.swing.JPanel banHangPanel;
    private javax.swing.JLabel doiMatKhau;
    private javax.swing.JPanel doiMatKhauPanel;
    private javax.swing.JLabel exitLb;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JPanel exitStatusLb;
    private javax.swing.JLabel hoaDonLabel;
    private javax.swing.JPanel hoaDonPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel khachHangLabel;
    private javax.swing.JPanel khachHangPanel;
    private javax.swing.JLabel khuyenMaiLabel;
    private javax.swing.JPanel khuyenMaiPanel;
    private javax.swing.JLabel labelShowName;
    private javax.swing.JLabel labelShowOffice;
    private javax.swing.JLabel lblGio;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nhanVienLabel;
    private javax.swing.JPanel nhanVienPanel;
    private javax.swing.JPanel panelControl;
    private javax.swing.JLabel sanPhamLabel;
    private javax.swing.JPanel sanPhamPanel;
    // End of variables declaration//GEN-END:variables
}
