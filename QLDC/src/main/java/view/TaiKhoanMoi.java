/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import XML.taikhoan;
import javax.swing.DefaultComboBoxModel;
import ConnectDB.ConnectJDBC;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import model.HoDan;
import ConnectDB.ConnectJDBC;

/**
 *
 * @author Admin
 */
public class TaiKhoanMoi extends javax.swing.JFrame {
    
    DocumentBuilderFactory dbf;
    DocumentBuilder db;
    Document doc;
    String filename = "E:\\QLDCJAVA\\java\\QLDC\\src\\main\\java\\XML\\taikhoan2.xml";

    
     /**
     * Creates new form TaiKhoanMoi
     */
    public TaiKhoanMoi() {
        try {
            initComponents();
            initRole();
            initMajor();
            setTitle("Tạo tài khoản mới");
            txtMatKhau.setText("");
            txtXacNhan.setText("");
            dbf = DocumentBuilderFactory.newInstance();
            db = dbf.newDocumentBuilder();
            doc = db.parse("E:\\QLDCJAVA\\java\\QLDC\\src\\main\\java\\XML\\taikhoan2.xml");
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(TaiKhoanMoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(TaiKhoanMoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TaiKhoanMoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenTK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTaoTK = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        txtXacNhan = new javax.swing.JPasswordField();
        btnHuyBo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cboSoNha = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboQuyen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_acc_256.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login_User_32.png"))); // NOI18N
        jLabel1.setText("Tạo tài khoản mới");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_icon-32.png"))); // NOI18N
        jLabel2.setText("Tài khoản");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pass_32.png"))); // NOI18N
        jLabel3.setText("Mật khẩu");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pass_32.png"))); // NOI18N
        jLabel4.setText("Xác nhận");

        btnTaoTK.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnTaoTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_32.png"))); // NOI18N
        btnTaoTK.setText("Tạo mới");
        btnTaoTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoTKActionPerformed(evt);
            }
        });

        txtMatKhau.setText("jPasswordField1");

        txtXacNhan.setText("jPasswordField2");

        btnHuyBo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHuyBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel_32.png"))); // NOI18N
        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHuyBoMouseClicked(evt);
            }
        });
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32.png"))); // NOI18N
        jLabel5.setText("Số nhà");

        cboSoNha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/role_user_icon_217169.png"))); // NOI18N
        jLabel6.setText("Quyền");

        cboQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnTaoTK)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTenTK)
                        .addGap(103, 103, 103))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnHuyBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboSoNha, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtXacNhan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(cboQuyen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSoNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoTK)
                    .addComponent(btnHuyBo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton2)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initRole(){
        String role[] = new String[]{
            "0","1"
        };
        DefaultComboBoxModel <String> comboBoxModel = new DefaultComboBoxModel<>(role);
        cboQuyen.setModel(comboBoxModel);
    }
    private void initMajor(){
        List<String> item = new ArrayList<>();
         Connection conn = null;
        conn = ConnectJDBC.connect();
        String query = "SELECT SoNha AS DaDangKy FROM hodan WHERE SoNha NOT IN" + "(SELECT SoNha FROM taikhoan)";
        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();
            
            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
          
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                int selectedItem = rs.getInt("DaDangKy");
                String duochon = ""+ selectedItem;
                item.add(duochon);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String majors[] = new String[item.size()];
        
        for(int i = 0;i<item.size();i++){
//            System.out.println("Item"+item.get(i));
            majors[i] = item.get(i);
        }
       
        DefaultComboBoxModel <String> comboBoxModel = new DefaultComboBoxModel<>(majors);
        cboSoNha.setModel(comboBoxModel);
        
    }
    private void btnTaoTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoTKActionPerformed
        // TODO add your handling code here:
        
        char[] s1 = txtMatKhau.getPassword();
        char[] s2 = txtXacNhan.getPassword();
        
        if(!Arrays.equals(s1, s2)){
            JOptionPane.showMessageDialog(this, "Vui lòng xác nhận lại mật khẩu");
            return;
        } 
 
        
        
        taikhoan tk = new taikhoan();
        tk.setTaikhoan(txtTenTK.getText());
        tk.setMatkhau(String.valueOf(txtMatKhau.getPassword()));
        tk.setQuyen(Integer.parseInt(""+cboQuyen.getSelectedItem()));
        tk.setIdhodan(Integer.parseInt(""+cboSoNha.getSelectedItem()));
        
        
        Element hodan = doc.createElement("hodan");
        hodan.setAttribute("idhodan", String.valueOf(tk.getIdhodan()));
        Element taikhoan = doc.createElement("taikhoan");
        taikhoan.setTextContent(tk.getTaikhoan());
        Element matkhau = doc.createElement("matkhau");
        matkhau.setTextContent(tk.getMatkhau());
        Element quyen = doc.createElement("quyen");
        quyen.setTextContent(String.valueOf(tk.getQuyen()));
            
        hodan.appendChild(taikhoan);
        hodan.appendChild(matkhau);
        hodan.appendChild(quyen);
        Element taikhoans = doc.getDocumentElement();
        taikhoans.appendChild(hodan);
        Ghifile();
        
         Connection conn = null;
        conn = ConnectJDBC.connect();
        PreparedStatement pstm = null;

    String query = "INSERT INTO taikhoan(IDTaiKhoan, TenTaiKhoan, MatKhau, Quyen, SoNha) " +
                "VALUES (null, ?, ?, ?, ?)";
 
    
    try {
            pstm = conn.prepareStatement(query);
            String username = txtTenTK.getText();
            String pass = new String();
            String password = pass.valueOf(s1);
            int role = Integer.parseInt(cboQuyen.getSelectedItem().toString());
            int item = Integer.parseInt(cboSoNha.getSelectedItem().toString());
            
            pstm.setString(1,username );
            pstm.setString(2,password );
            pstm.setInt(3,role );
            pstm.setInt(4,item );
            
            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        QuanLyTaiKhoan quanLyTaiKhoan = new QuanLyTaiKhoan();
        quanLyTaiKhoan.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnTaoTKActionPerformed
    
    private void Ghifile() {
        try {
            //ghi file
            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tr = tff.newTransformer();
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            tr.setOutputProperty("{https:xml.apache.org/xslt}indent-amount", "3");
            DOMSource nguon = new DOMSource(doc);
            StreamResult dich = new StreamResult("E:\\QLDCJAVA\\java\\QLDC\\src\\main\\java\\XML\\taikhoan2.xml");
            tr.transform(nguon, dich);
            System.out.println("Da ghi xong");
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(TaiKhoanMoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(TaiKhoanMoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        // TODO add your handling code here:
        QuanLyTaiKhoan quanLyTaiKhoan = new QuanLyTaiKhoan();
        quanLyTaiKhoan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void btnHuyBoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyBoMouseClicked
        // TODO add your handling code here:
//        QuanLyTaiKhoan quanLyTaiKhoan = new QuanLyTaiKhoan();
//        quanLyTaiKhoan.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnHuyBoMouseClicked

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
            java.util.logging.Logger.getLogger(TaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaiKhoanMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnTaoTK;
    private javax.swing.JComboBox<String> cboQuyen;
    private javax.swing.JComboBox<String> cboSoNha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenTK;
    private javax.swing.JPasswordField txtXacNhan;
    // End of variables declaration//GEN-END:variables
}
