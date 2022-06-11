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
import javax.swing.table.DefaultTableModel;
import java.util.List;
import model.PhanHoi;
import model.PhanHoiDAO;
import model.HoDan;
import model.Person;
import ConnectDB.ConnectJDBC;

/**
 *
 * @author Admin
 */
public class XemPhanHoi extends javax.swing.JFrame {
    PhanHoiDAO phanHoiDAO = new PhanHoiDAO();
    List<PhanHoi> listPH = phanHoiDAO.getAllPH();
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form XemPhanHoi
     */
    public XemPhanHoi() {
        initComponents();
        initTable();
        fillTable();
        setTitle("Xem phản hồi");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhanHoi = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        btnXemPhanHoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Ý kiến người dân");

        tblPhanHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Phản hồi", "Nội dung", "Thời gian tạo", "Số nhà"
            }
        ));
        jScrollPane1.setViewportView(tblPhanHoi);

        btnHome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnXemPhanHoi.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnXemPhanHoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewdetails_vista_3354.png"))); // NOI18N
        btnXemPhanHoi.setText("Xem toàn bộ phản hồi");
        btnXemPhanHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemPhanHoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)
                        .addGap(0, 255, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXemPhanHoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(jLabel1))
                .addGap(54, 54, 54)
                .addComponent(btnXemPhanHoi)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initTable(){
        String[] colums = new String[]{
            "ID Phản hồi", "Nội dung", "Thời gian tạo", "Số nhà gửi"
        };
        model.setColumnIdentifiers(colums);
        
        
        tblPhanHoi.setModel(model);
        
    }
    
     private void fillTable(){
        model.setRowCount(0);
        for (PhanHoi phanHoi : listPH) {
            model.addRow(new Object[]{
                phanHoi.getIdPH(), phanHoi.getNoiDungPH(), phanHoi.getThoiGianTaoPH(), phanHoi.getSoNhaGuiPH()
            });
        }
        model.fireTableDataChanged();
    }
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        FrMain frMain = new FrMain();
        frMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnXemPhanHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemPhanHoiActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        conn = ConnectJDBC.connect();
      
       String query = "SELECT * FROM phanhoi";
        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
           
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                
                int id = rs.getInt("IDPhanHoi");
                String noidung = rs.getString("NoiDungPhanHoi");
                String thoigiantao = rs.getString("ThoiGianTao");
                int sonha = rs.getInt("SoNha");
                
                PhanHoi phMoi = new PhanHoi();
                
                phMoi.setIdPH(id);
                phMoi.setNoiDungPH(noidung);
                phMoi.setThoiGianTaoPH(thoigiantao);
                phMoi.setSoNhaGuiPH(sonha);
                
                listPH.add(phMoi);
                System.out.println("abc");
                fillTable();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnXemPhanHoiActionPerformed

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
            java.util.logging.Logger.getLogger(XemPhanHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemPhanHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemPhanHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemPhanHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemPhanHoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnXemPhanHoi;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhanHoi;
    // End of variables declaration//GEN-END:variables
}
