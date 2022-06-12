/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import ConnectDB.ConnectJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.HoDan;
import model.HoDanDAO;
import ConnectDB.hodan_service;
import java.sql.*;
import javax.swing.JOptionPane;
import ConnectDB.ConnectJDBC;
/**
 *
 * @author Admin
 */
public class frHoDan extends javax.swing.JFrame {
    HoDanDAO dao = new HoDanDAO();
    ArrayList<HoDan> listHoDans = new ArrayList();
    Object rowData[];
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form HoDan
     */
    public frHoDan() {
        initComponents();
        initTable();
        fillTable();
        txtSoTV.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoDan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXemChiTiet = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSoNha = new javax.swing.JTextField();
        txtSoTV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTongSoHoDan = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblHoDan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số nhà", "Số thành viên"
            }
        ));
        tblHoDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoDanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoDan);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete32.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setToolTipText("");
        btnXoa.setAlignmentY(0.2F);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_32.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXemChiTiet.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnXemChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/see_eye_visible_icon_187826.png"))); // NOI18N
        btnXemChiTiet.setText("Xem chi tiết");
        btnXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXemChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnXemChiTiet)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_243_32.png"))); // NOI18N
        jLabel3.setText("QUẢN LÝ HỘ DÂN CƯ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Số nhà");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Số thành viên");

        txtSoNha.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        txtSoTV.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Tổng số hộ dân");

        txtTongSoHoDan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTongSoHoDan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoTV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(txtSoNha))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtSoTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtTongSoHoDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnHome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initTable(){
        String[] colums = new String[]{
            "", "Số thành viên"
        };
        model.setColumnIdentifiers(colums);
        
        
        tblHoDan.setModel(model);
        
    }
    
     private void fillTable(){
        model.setRowCount(0);
        for (HoDan hoDan : listHoDans) {
            model.addRow(new Object[]{hoDan.getSoNha(), hoDan.getSoTV()});
        }
        model.fireTableDataChanged();
    }
    private void tblHoDanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoDanMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblHoDan.getSelectedRow();
        if(selectedRow >= 0){
            int id = (int) tblHoDan.getValueAt(selectedRow, 0);
            for (HoDan hoDan : listHoDans) {
                if(id == hoDan.getSoNha()){
                    txtSoNha.setText(""+id);
                    txtSoTV.setText(""+hoDan.getSoTV());

                    break;
                }
            }
        }
    }//GEN-LAST:event_tblHoDanMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:

        //      frHoDan delHoDan = new frHoDan();
        //      delHoDan.setSoNha(Integer.parseInt(txtSoNha.getText()));
        //      delHoDan.setSoTV(Integer.parseInt(txtSoTV.getText()));
        int choice = JOptionPane.showConfirmDialog(this, "Có chắc chắn xóa không ?", "Noti", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION){
            return;
        }
        for (HoDan hoDan : listHoDans) {
            String id = ""+hoDan.getSoNha();
            if (id.equals(txtSoNha.getText())){
                listHoDans.remove(hoDan);
                break;
            }
        }
        fillTable();
        HoDan deleHoDan = new HoDan();
        deleHoDan.setSoNha(Integer.parseInt( txtSoNha.getText()));
        //deleHoDan.setSoTV(txtSoTV.getText());
        Connection conn = null;
        conn = ConnectJDBC.connect();
        String query = "DELETE FROM hodan WHERE SoNha = ?";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, deleHoDan.getSoNha());
            //Khi thực hiện các lệnh insert/update/delete sử dụng executeUpdate, nó sẽ trả về số hàng bị tác động
            int row = pstm.executeUpdate();

            if(row != 0){
                System.out.println("Xóa thành công " + row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        query = "SELECT COUNT(SoNha) AS TongSoHoDan FROM hodan";
        Statement stm = null;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                int tongSoHoDan = rs.getInt("TongSoHoDan");
                txtTongSoHoDan.setText(""+tongSoHoDan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int id = 0, sotv;
        Connection conn = null;
        conn = ConnectJDBC.connect();
        int sonha1 = Integer.parseInt(txtSoNha.getText());

        String query = "SELECT * FROM hodan";
        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);

            listHoDans.clear();
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp

                id = rs.getInt("SoNha");
                sotv = rs.getInt("SoNguoi");

                if(sonha1 == id){
                    JOptionPane.showMessageDialog(this, "Số nhà đã tồn tại");
                    break;
                }

                HoDan hoDan = new HoDan();
                hoDan.setSoNha(id);
                hoDan.setSoTV(sotv);
                listHoDans.add(hoDan);

                fillTable();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        query = "INSERT INTO hodan(SoNha, SoNguoi) " +
        "VALUES (?, ?)";
        PreparedStatement pstm = null;

        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, sonha1);
            pstm.setInt(2, 0);

            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        query = "INSERT INTO hodan(SoNha, SoNguoi) " +
        "VALUES (?, ?)";

        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, sonha1);
            pstm.setInt(2, 0);

            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        query = "SELECT * FROM hodan";

        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);

            listHoDans.clear();
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp

                id = rs.getInt("SoNha");
                sotv = rs.getInt("SoNguoi");

                HoDan hoDan = new HoDan();
                hoDan.setSoNha(id);
                hoDan.setSoTV(sotv);
                listHoDans.add(hoDan);

                fillTable();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        query = "SELECT COUNT(SoNha) AS TongSoHoDan FROM hodan";
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                int tongSoHoDan = rs.getInt("TongSoHoDan");
                txtTongSoHoDan.setText(""+tongSoHoDan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
        // TODO add your handling code here:
        ChiTietHoDan chiTietHoDan = new ChiTietHoDan(txtSoNha.getText(), txtSoTV.getText());
        chiTietHoDan.setVisible(true);
        chiTietHoDan.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnXemChiTietActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        FrMain frMain = new FrMain();
        frMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         Connection conn = null;
        conn = ConnectJDBC.connect();
      String query = "SELECT * FROM hodan";
      Statement stm = null;

        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
           
           listHoDans.clear();
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
               
                int id = rs.getInt("SoNha");
                int sotv = rs.getInt("SoNguoi");
                HoDan hoDan = new HoDan();
                hoDan.setSoNha(id);
                hoDan.setSoTV(sotv);
                listHoDans.add(hoDan);
               
                fillTable();
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        query = "SELECT COUNT(SoNha) AS TongSoHoDan FROM hodan";
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                int tongSoHoDan = rs.getInt("TongSoHoDan");
                txtTongSoHoDan.setText(""+tongSoHoDan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(HoDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frHoDan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHoDan;
    private javax.swing.JTextField txtSoNha;
    private javax.swing.JTextField txtSoTV;
    private javax.swing.JTextField txtTongSoHoDan;
    // End of variables declaration//GEN-END:variables
}
