/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.time.LocalDateTime;
import ConnectDB.ConnectJDBC;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ConnectDB.ConnectJDBC;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.HoDan;

/**
 *
 * @author Admin
 */
public class GuiThongBao extends javax.swing.JFrame {

    /**
     * Creates new form GuiThongBao
     */
    public GuiThongBao() {
        initComponents();
        initMajor();
    }
    
    private void initMajor(){
        
        int id = 0, sotv;
        Connection conn = null;
        conn = ConnectJDBC.connect();

        String query = "SELECT * FROM hodan";
        Statement stm = null;
        DefaultListModel ListModel = new DefaultListModel();
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);

            
            
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp

                id = rs.getInt("SoNha");
                sotv = rs.getInt("SoNguoi");
                ListModel.addElement(id);

                System.out.print(id);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        jList1.setModel(ListModel);
        
        String [] majors = new String[]{
            "Cho tất cả", "Nhiều người", "Một người"
        };
//        System.out.print("abc");
//        DefaultComboBoxModel <String> comboBoxModel = new DefaultComboBoxModel<>(majors);
//        cboLuaChon.setModel(comboBoxModel);
//        DefaultListModel ListModel = new DefaultListModel();
//        ListModel.addElement("Tất cả");
//        ListModel.addElement("hộ 1");
//        ListModel.addElement("hộ 2");
//        
//        jList1.setModel(ListModel);
        
        jList1.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextArea();
        btnGuiThongBao = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jLabel3.setText("jLabel3");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Tới");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Nội dung");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noti_32.png"))); // NOI18N
        jLabel4.setText("THÔNG BÁO TỚI NGƯỜI DÂN");

        txtContent.setColumns(20);
        txtContent.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtContent.setRows(5);
        jScrollPane2.setViewportView(txtContent);

        btnGuiThongBao.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnGuiThongBao.setText("Gửi thông báo");
        btnGuiThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiThongBaoActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Một hoặc nhiều hộ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Tất Cả");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHome)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(btnGuiThongBao)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome)
                    .addComponent(jLabel4))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2))
                .addGap(37, 37, 37)
                .addComponent(btnGuiThongBao)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        FrMain frMain = new FrMain();
        frMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed
    
    private void btnGuiThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiThongBaoActionPerformed
        // TODO add your handling code here:
        //gửi cho tất cả
        if(jRadioButton2.isSelected()){
            Connection conn = null;
            conn = ConnectJDBC.connect();
            String data = "";
            data += ", Vegetables selected: ";

            String content = txtContent.getText();
            if(content.isEmpty()){
                JOptionPane.showMessageDialog(this, "không được để trống");
            }else{
                String currentTime = LocalDateTime.now()+"";
                String idThongBao = "TB" + currentTime;
                String query = "INSERT INTO thongbao(IDThongBao, NoiDungThongBao) " + "VALUES (?,?)";
                PreparedStatement pstm = null;

                try {
                    pstm = conn.prepareStatement(query);
                    pstm.setString(1, idThongBao);
                    pstm.setString(2, content);
    //                pstm.setString(2, currentTime);

                    int row = pstm.executeUpdate();
                    if(row != 0){
                        System.out.println("Gửi thông báo thành công here");
                        System.out.println("Gửi thông báo thành công " + row);
                        
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
                conn = ConnectJDBC.connect();
                String query2 = "SELECT * FROM hodan";
                Statement stm = null;
                try {
                    //Tạo đối tượng Statement
                    stm = conn.createStatement();

                    //Thực thi truy vấn và trả về đối tượng ResultSet
                    ResultSet rs = stm.executeQuery(query2);
                    //Duyệt kết quả trả về
                    String query1 = "INSERT INTO hd_tb(IDThongBao, SoNha, ThoiGianTao) " + "VALUES (?,?,?)";
                    while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp

                        int id = rs.getInt("SoNha");

                        PreparedStatement pstm1 = null;

                        try {
                            pstm1 = conn.prepareStatement(query1);
                            pstm1.setString(1, idThongBao);
                            pstm1.setString(2, id+"");
                            pstm1.setString(3, currentTime);

                            int row1 = pstm1.executeUpdate();
                            if(row1 != 0){
                                System.out.println("Gửi thông báo thành công " + row1);
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                

        //         txtContent.setText(data);
                JOptionPane.showMessageDialog(this, "Gửi thông báo thành công");
                txtContent.setText("");
        }
        }
        //chon so nha
        else if(jRadioButton1.isSelected()){
            Connection conn = null;
            conn = ConnectJDBC.connect();
            String data = "";
            data += ", Vegetables selected: ";

            String content = txtContent.getText();
            if(content.isEmpty()){
                JOptionPane.showMessageDialog(this, "không được để trống");
            }else{
                String currentTime = LocalDateTime.now()+"";
            String idThongBao = "TB" + currentTime;
            String query = "INSERT INTO thongbao(IDThongBao, NoiDungThongBao) " + "VALUES (?,?)";
            PreparedStatement pstm = null;

            try {
                    pstm = conn.prepareStatement(query);
                    pstm.setString(1, idThongBao);
                    pstm.setString(2, content);
    //                pstm.setString(2, currentTime);

                    int row = pstm.executeUpdate();
                    if(row != 0){
                        System.out.println("Gửi thông báo thành công " + row);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String query1 = "INSERT INTO hd_tb(IDThongBao, SoNha, ThoiGianTao) " + "VALUES (?,?,?)";
                for (Object sonha : jList1.getSelectedValues()) {
        //                        data += vegetable + ", ";
                    PreparedStatement pstm1 = null;

                try {
                        pstm1 = conn.prepareStatement(query1);
                        pstm1.setString(1, idThongBao);
                        pstm1.setString(2, sonha.toString());
                        pstm1.setString(3, currentTime);

                        int row = pstm1.executeUpdate();
                        if(row != 0){
                            System.out.println("Gửi thông báo thành công " + row);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

        //         txtContent.setText(data);
                JOptionPane.showMessageDialog(this, "Gửi thông báo thành công");
                txtContent.setText(""+buttonGroup1.getSelection().getActionCommand());
        }
            
        
        
        }else{
            JOptionPane.showMessageDialog(this, "hãy chọn đối tượng gửi thông báo");    
                }
        
    }//GEN-LAST:event_btnGuiThongBaoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jList1.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jList1.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiThongBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiThongBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiThongBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiThongBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiThongBao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuiThongBao;
    private javax.swing.JButton btnHome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtContent;
    // End of variables declaration//GEN-END:variables
}
