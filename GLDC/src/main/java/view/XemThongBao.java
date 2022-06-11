/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PhanHoi;
import model.ThongBao;
import model.ThongBaoDAO;
import ConnectDB.ConnectJDBC;

/**
 *
 * @author Admin
 */
public class XemThongBao extends javax.swing.JFrame {

    ThongBaoDAO thongBaoDAO = new ThongBaoDAO();
    List<ThongBao> listThongBao = thongBaoDAO.getAllTB();
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form XemThongBao
     */
    public XemThongBao() {
        
        initComponents();
        initTable();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initTable(){
        String[] colums = new String[]{
            "ID Thông báo", "Nội dung", "Thời gian gửi"
        };
        model.setColumnIdentifiers(colums);
        
        
        tblThongBao.setModel(model);
        
    }
    
     private void fillTable(){
        model.setRowCount(0);
        for (ThongBao thongBao : listThongBao) {
            model.addRow(new Object[]{
                thongBao.getId(), thongBao.getNoiDungTB(), thongBao.getThoiGianGui()
            });
        }
        model.fireTableDataChanged();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongBao = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        btnXemTB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Xem thông báo");

        tblThongBao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nội dung", "Thời gian gửi"
            }
        ));
        jScrollPane1.setViewportView(tblThongBao);

        btnHome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnXemTB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnXemTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewdetails_vista_3354.png"))); // NOI18N
        btnXemTB.setText("Xem");
        btnXemTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnXemTB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)
                        .addGap(0, 380, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnXemTB)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemTBActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        conn = ConnectJDBC.connect();
      
       String query = "SELECT * FROM thongbao";
        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
           
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                
                int id = rs.getInt("IDThongBao");
                String noidung = rs.getString("NoiDungThongBao");
                String thoigiantao = rs.getString("ThoiGianGui");
                
                
                ThongBao tb = new ThongBao();
                tb.setId(id);
                tb.setNoiDungTB(noidung);
                tb.setThoiGianGui(thoigiantao);
                listThongBao.add(tb);
                fillTable();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnXemTBActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        UIMain uim = new UIMain();
        uim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(XemThongBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemThongBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemThongBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemThongBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemThongBao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnXemTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblThongBao;
    // End of variables declaration//GEN-END:variables
}
