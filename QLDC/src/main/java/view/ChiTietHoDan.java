/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoDan;
import model.Person;
import model.PersonDAO;
import ConnectDB.ConnectJDBC;

/**
 *
 * @author Admin
 */
public class ChiTietHoDan extends javax.swing.JFrame {
    PersonDAO dAO = new PersonDAO();
    List<Person> listPersons = dAO.getAllPerson();
    DefaultTableModel model = new DefaultTableModel();
    
    //List<HoDan>
    /**
     * Creates new form ChiTietHoDan
     */
    public ChiTietHoDan(String sonha, String sotv) {
        initComponents();
        initTable();
        fillTable();
        txtChiTietSoNha.setEnabled(false);
        txtID.setEnabled(false);
        setTitle("Chi tiết hộ dân");
        txtChiTietSoNha.setText(sonha);
        txtChiTietSoThanhVien.setText(sotv);
        
    }
    
    private void initTable(){
        String[] colums = new String[]{
            "ID", "Họ tên", "Tuổi", "Năm sinh", "Nghề nghiệp"
        };
        model.setColumnIdentifiers(colums);
        
        
        tblPerson.setModel(model);
        
    }
    
     private void fillTable(){
        model.setRowCount(0);
        for (Person person: listPersons) {
            model.addRow(new Object[]{person.getId(), person.getHoten(), person.getTuoi(), person.getNamsinh(), person.getNghenghiep()
            });
        }
        model.fireTableDataChanged();
    }
    private ChiTietHoDan() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtChiTietSoNha = new javax.swing.JTextField();
        txtChiTietSoThanhVien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtNamSinh = new javax.swing.JTextField();
        txtNgheNghiep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("CHI TIẾT HỘ DÂN");

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Họ tên", "Tuổi", "Năm sinh", "Nghề nghiệp"
            }
        ));
        tblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        txtChiTietSoNha.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        txtChiTietSoThanhVien.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Số nhà");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Số thành viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtChiTietSoNha, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(txtChiTietSoThanhVien))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChiTietSoNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtChiTietSoThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/create_32.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnSua)
                .addContainerGap())
        );

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Họ tên");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Tuổi");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Ngày sinh");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Nghề nghiệp");

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        txtTuoi.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        txtNamSinh.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        txtNgheNghiep.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("ID");

        txtID.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnHome)
                            .addGap(230, 230, 230)
                            .addComponent(jLabel1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String ketqua = "";
        Connection conn = null;
        conn = ConnectJDBC.connect();

    int  sonha = Integer.parseInt(txtChiTietSoNha.getText());
    String hoten = txtHoTen.getText();
    int tuoi = Integer.parseInt(txtTuoi.getText());
    String namsinh = txtNamSinh.getText();
    String nghengiep = txtNgheNghiep.getText();
    
    
    
    String query = "INSERT INTO nguoi(ID ,HoTen, Tuoi, NamSinh, NgheNghiep, SoNha) " + "VALUES (null,?, ?, ?, ?, ?)";
    PreparedStatement pstm = null;
 
        
    try {
            pstm = conn.prepareStatement(query);
            //pstm.setInt(1, null);
            pstm.setString(1, hoten);
            pstm.setInt(2, tuoi);
            pstm.setString(3, namsinh);
            pstm.setString(4, nghengiep);
            pstm.setInt(5, sonha);
            
            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
                ketqua = "Thêm thành công 1";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        query = "SELECT * FROM nguoi WHERE SoNha = "+sonha+"";
        System.out.println(query);
        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
           listPersons.clear();
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
               
                int id = rs.getInt("ID");
                
                String name1 = rs.getString("HoTen");
                String job = rs.getString("NgheNghiep");
                String dob1 = rs.getString("NamSinh");
                int age1 = rs.getInt("Tuoi");
                int sonha1 = rs.getInt("SoNha");
                
                Person person = new Person();
                person.setId(id);
                person.setHoten(name1);
                person.setTuoi(age1);
                person.setNamsinh(dob1);
                person.setNghenghiep(job);
                person.setSonha(sonha1);
                listPersons.add(person);
               fillTable();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       if(!ketqua.equals("")){
           query = "UPDATE hodan SET SoNguoi = SoNguoi + 1 WHERE SoNha = "+sonha;
            try {
                pstm = conn.prepareStatement(query);
                pstm.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
       }
       
       query = "SELECT COUNT(nguoi.SoNha) AS Number FROM nguoi WHERE nguoi.SoNha = "+sonha+"";
        
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();
            
            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
          
            //Duyệt kết quả trả về
           while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                
                txtChiTietSoThanhVien.setText(""+rs.getInt("Number"));
                //listPersons.clear();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }                                       

    private void btnHienActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
       int sonha1 = Integer.parseInt(txtChiTietSoNha.getText());
         Connection conn = null;
        conn = ConnectJDBC.connect();
      
       String query = "SELECT * FROM nguoi WHERE SoNha = "+sonha1+"";
        
        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
           listPersons.clear();
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
               
                int id = rs.getInt("ID");
                String hoten = rs.getString("HoTen");
                int tuoi = rs.getInt("Tuoi");
                String namsinh = rs.getString("NamSinh");
                String nghenghiep = rs.getString("NgheNghiep");
                
                System.out.println(id +" "+ hoten +" "+ tuoi +" "+ namsinh +""+ nghenghiep);
                Person person = new Person();
                person.setId(id);
                person.setHoten(hoten);
                person.setTuoi(tuoi);
                person.setNamsinh(namsinh);
                person.setNghenghiep(nghenghiep);
                listPersons.add(person);
                fillTable();
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        query = "SELECT COUNT(nguoi.SoNha) AS Number FROM nguoi WHERE nguoi.SoNha = "+sonha1+"";
        
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();
            
            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
          
            //Duyệt kết quả trả về
           while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                
                txtChiTietSoThanhVien.setText(""+rs.getInt("Number"));
                //listPersons.clear();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //fillTable();
       
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtID.getText());
        String hoten = txtHoTen.getText();
        String namsinh = txtNamSinh.getText();
        String nghenghiep = txtNgheNghiep.getText();
        int tuoi = Integer.parseInt(txtTuoi.getText());
        int choice = JOptionPane.showConfirmDialog(this, "Co chac chan sua ko?", "Noti", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION){
            return;
        }
        for (Person person : listPersons) {
            
            if (id == person.getId()){
                person.setId(id);
                person.setHoten(hoten);
                person.setTuoi(tuoi);
                person.setNamsinh(namsinh);
                person.setNghenghiep(nghenghiep);
                break;
            }
        }
        fillTable();
        
        Connection conn = null;
        conn = ConnectJDBC.connect();
        /*Person editPerson = new Person();
        editPerson.setId(id);*/
        String query = "UPDATE nguoi SET HoTen = ?, Tuoi = ?, NamSinh = ?, NgheNghiep = ? WHERE ID = ?";
        
       
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);
          
            pstm.setInt(5, id);
            pstm.setInt(2, tuoi);
            pstm.setString(1, hoten);
            pstm.setString(3, namsinh);
            pstm.setString(4, nghenghiep);
            int row = pstm.executeUpdate();
            
            if(row != 0){
                System.out.println("Sửa thành công " + row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        FrMain frMain = new FrMain();
        frMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtID.getText());
        int sonha = Integer.parseInt(txtChiTietSoNha.getText());
        String kq ="";
        int choice = JOptionPane.showConfirmDialog(this, "Co chac chan xoa ko?", "Noti", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION){
            return;
        }
        for (Person person : listPersons) {
            id = person.getId();
            if (id == Integer.parseInt(txtID.getText())){
                listPersons.remove(person);
                break;
            }
        }
        fillTable();
        Person delePerson = new Person();
        delePerson.setId(Integer.parseInt( txtID.getText()));
        
        
        Connection conn = null;
        conn = ConnectJDBC.connect();
        String query = "DELETE FROM nguoi WHERE ID = ?";
        
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);
            pstm.setInt(1, id);
            //Khi thực hiện các lệnh insert/update/delete sử dụng executeUpdate, nó sẽ trả về số hàng bị tác động
            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Xóa thành công " + row);
                kq = "Xóa thành công 1";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if(!kq.equals("")){
           query = "UPDATE hodan SET SoNguoi = SoNguoi - 1 WHERE SoNha = "+sonha;
            try {
                pstm = conn.prepareStatement(query);
                pstm.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
       }
        
        query = "SELECT COUNT(nguoi.SoNha) AS Number FROM nguoi WHERE nguoi.SoNha = "+sonha+"";
        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();
            
            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
          
            //Duyệt kết quả trả về
           while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                
                txtChiTietSoThanhVien.setText(""+rs.getInt("Number"));
                //listPersons.clear();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed
/**/
    private void tblPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();
        if(selectedRow >= 0){
            int id = (int) tblPerson.getValueAt(selectedRow, 0);
            for (Person person : listPersons) {
                if(id == person.getId()){
                    txtID.setText(""+id);
                    txtHoTen.setText(person.getHoten());
                    txtTuoi.setText(""+person.getTuoi());
                    txtNamSinh.setText(person.getNamsinh());
                    txtNgheNghiep.setText(person.getNghenghiep());
                    break;
            }
        }
        }
    }//GEN-LAST:event_tblPersonMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        int sonha1 = Integer.parseInt(txtChiTietSoNha.getText());
         Connection conn = null;
        conn = ConnectJDBC.connect();
      
       String query = "SELECT * FROM nguoi WHERE SoNha = "+sonha1+"";
        
        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
           listPersons.clear();
            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
               
                int id = rs.getInt("ID");
                String hoten = rs.getString("HoTen");
                int tuoi = rs.getInt("Tuoi");
                String namsinh = rs.getString("NamSinh");
                String nghenghiep = rs.getString("NgheNghiep");
                
                Person person = new Person();
                person.setId(id);
                person.setHoten(hoten);
                person.setTuoi(tuoi);
                person.setNamsinh(namsinh);
                person.setNghenghiep(nghenghiep);
                listPersons.add(person);
                fillTable();
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         query = "SELECT COUNT(nguoi.SoNha) AS Number FROM nguoi WHERE nguoi.SoNha = "+sonha1+"";
        
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();
            
            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);
          
            //Duyệt kết quả trả về
           while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                
                txtChiTietSoThanhVien.setText(""+rs.getInt("Number"));
                //listPersons.clear();
            }
        } catch (SQLException e) {
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
            java.util.logging.Logger.getLogger(ChiTietHoDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietHoDan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtChiTietSoNha;
    private javax.swing.JTextField txtChiTietSoThanhVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
