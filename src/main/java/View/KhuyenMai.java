/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Service.KhuyenMaiService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class KhuyenMai extends javax.swing.JDialog {

    /**
     * Creates new form KhuyenMai
     */
    private KhuyenMaiService service = new KhuyenMaiService();
    private DefaultTableModel model;
    private List<Model.KhuyenMai> listkm = new ArrayList<>();

    public KhuyenMai() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) this.tblKM.getModel();
        this.loadTable();
        this.clear();
    }

    public void loadTable() {
        ArrayList<Model.KhuyenMai> list = this.service.all();
        model.setRowCount(0);

        for (Model.KhuyenMai km : list) {
            model.addRow(new Object[]{
                km.getIdKM(),
                km.getTenKM(),
                km.getGiaTri(),
                km.getNgayBatDau(),
                km.getNgayKetThuc(),
                km.getLoaiKM() == 0 ? "Giảm cố định" : "Giảm %",
                km.getMoTa(),
                km.getTrangThai() == 0 ? "Hoạt động" : "Không hoạt động",
                km.getGiaApDung(),});
        }
    }

    public void clear() {
        this.txtID.setText("");
        this.txtten.setText("");
        this.txtGiaTri.setText("");
        this.txtNgayBatDau.setText("");
        this.txtNgayKetThuc.setText("");

        this.txtMoTa.setText("");
        this.txtGiaApDung.setText("");

    }

    public boolean checkData() {
        if (txtten.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên không được để trống!");
            return false;
        } else if (txtGiaTri.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá Trị không được để trống!");
            return false;

        } else if (txtNgayBatDau.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không được để trống!");
            return false;

        } else if (txtNgayKetThuc.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc không được để trống!");
            return false;
        } else if (txtMoTa.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mô tả không được để trống!");
            return false;
        } else if (txtGiaApDung.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá áp dụng không được để trống!");
            return false;

        } else {
            return true;
        }
    }

//    
//
    public boolean checkTenKMAdd() {
        String ten = this.txtten.getText();
        for (Model.KhuyenMai khuyenMai : listkm) {
            if (khuyenMai.getTenKM().equalsIgnoreCase(ten)) {
                JOptionPane.showMessageDialog(this, "Tên khuyến mãi đã tồn tại");
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMa1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtten = new javax.swing.JTextField();
        txtNgayBatDau = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMoi = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKM = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNgayKetThuc = new javax.swing.JTextField();
        txtGiaTri = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGiaApDung = new javax.swing.JTextField();
        rd_HoatDong = new javax.swing.JRadioButton();
        rd_khd = new javax.swing.JRadioButton();
        rd_Phantram = new javax.swing.JRadioButton();
        rd_codinh = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID:");

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        txtID.setEditable(false);

        tblKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên Khuyến mãi", "Giá trị KM", "Ngày Bắt Dầu", "Ngày kết thúc", "Loại KM", "Mô Tả ", "Trạng Thái", "Giá Áp Dụng"
            }
        ));
        tblKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKM);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên khuyến mãi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Giá trị KM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Trạng thái:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ngày bắt đầu");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày kết thúc");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Loại KM");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mô tả");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Khuyến mãi");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Giá áp dụng");

        buttonGroup1.add(rd_HoatDong);
        rd_HoatDong.setSelected(true);
        rd_HoatDong.setText("Hoạt Động");

        buttonGroup1.add(rd_khd);
        rd_khd.setText("Không Hoạt Động");
        rd_khd.setContentAreaFilled(false);

        buttonGroup2.add(rd_Phantram);
        rd_Phantram.setSelected(true);
        rd_Phantram.setText("Giảm phần trăm");

        buttonGroup2.add(rd_codinh);
        rd_codinh.setText("Giảm Cố Định");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(btnThem)
                .addGap(105, 105, 105)
                .addComponent(btnSua)
                .addGap(150, 150, 150)
                .addComponent(btnMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGiaApDung, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(txtten)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rd_HoatDong)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rd_khd)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(42, 42, 42))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_Phantram, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rd_codinh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(286, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel9)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(rd_Phantram)
                    .addComponent(rd_codinh))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(rd_HoatDong)
                            .addComponent(rd_khd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtGiaApDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnMoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        String tenKhuyenMai = this.txtten.getText();
////        int giaTriKM = Integer.parseInt(txtGiaTri.toString());
//        Integer giaTriKM = Integer.parseInt(txtGiaTri.getText());
//        String s = String.valueOf(giaTriKM);
//        int trangThai;
//        if (rd_HoatDong.isSelected() == true) {
//            trangThai = 0;
//        } else {
//            trangThai = 1;
//        }
////        int loaiKhuyenMai = Integer.parseInt(txtLoaiKM.toString());
//        int loaiKhuyenMai;
//        if (rd_Phantram.isSelected() == true) {
//            loaiKhuyenMai = 0;
//        } else {
//            loaiKhuyenMai = 1;
//        }
//
//        // xong r đấy
////        String t = String.valueOf(loaiKhuyenMai);
//        String moTa = this.txtMoTa.getText();
//
//        String ngayBatDau = txtNgayBatDau.getText();
//        Date dateNgayBatDau;
//        try {
//            dateNgayBatDau = new SimpleDateFormat("yyyy-mm-dd").parse(ngayBatDau);
//        } catch (ParseException ex) {
//            JOptionPane.showMessageDialog(this, "Bạn cần nhập ngày bắt đầu theo định dạng Year/Month/Day");
//            return;
//        }
//
//        String ngayKetThuc = txtNgayKetThuc.getText();
//        Date dateNgayKetThuc;
//        try {
//            dateNgayKetThuc = new SimpleDateFormat("yyyy-mm-dd").parse(ngayKetThuc);
//        } catch (ParseException ex) {
//            JOptionPane.showMessageDialog(this, "Bạn cần nhập ngày kết thúc theo định dạng Year/Month/Day");
//            return;
//        }
//        Integer giaApDung = Integer.parseInt(txtGiaApDung.getText());
//        Model.KhuyenMai km = new Model.KhuyenMai(0, tenKhuyenMai, giaTriKM, dateNgayBatDau, dateNgayKetThuc, trangThai, loaiKhuyenMai, moTa, giaApDung);
//
//        boolean a = this.service.insert(km);
//
//        if (a == true) {
//            JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
//        } else {
//            JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
//            return;
//        }
//
//        this.clear();
//        this.loadTable();
        int cf = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn thêm ?");
        if (cf == JOptionPane.YES_OPTION) {

            if (checkData()) {
                if (checkTenKMAdd()) {
                    String tenKhuyenMai = this.txtten.getText();
//        int giaTriKM = Integer.parseInt(txtGiaTri.toString());
                    Integer giaTriKM = Integer.parseInt(txtGiaTri.getText());
                    String s = String.valueOf(giaTriKM);
                    int trangThai;
                    if (rd_HoatDong.isSelected() == true) {
                        trangThai = 0;
                    } else {
                        trangThai = 1;
                    }
//        int loaiKhuyenMai = Integer.parseInt(txtLoaiKM.toString());
                    int loaiKhuyenMai;
                    if (rd_Phantram.isSelected() == true) {
                        loaiKhuyenMai = 0;
                    } else {
                        loaiKhuyenMai = 1;
                    }

                    
//        String t = String.valueOf(loaiKhuyenMai);
                    String moTa = this.txtMoTa.getText();

                    String ngayBatDau = txtNgayBatDau.getText();
                    Date dateNgayBatDau;
                    try {
                        dateNgayBatDau = new SimpleDateFormat("yyyy-mm-dd").parse(ngayBatDau);
                    } catch (ParseException ex) {
                        JOptionPane.showMessageDialog(this, "Bạn cần nhập ngày bắt đầu theo định dạng Year/Month/Day");
                        return;
                    }

                    String ngayKetThuc = txtNgayKetThuc.getText();
                    Date dateNgayKetThuc;
                    try {
                        dateNgayKetThuc = new SimpleDateFormat("yyyy-mm-dd").parse(ngayKetThuc);
                    } catch (ParseException ex) {
                        JOptionPane.showMessageDialog(this, "Bạn cần nhập ngày kết thúc theo định dạng Year/Month/Day");
                        return;
                    }
                    Integer giaApDung = Integer.parseInt(txtGiaApDung.getText());
                    Model.KhuyenMai km = new Model.KhuyenMai(0, tenKhuyenMai, giaTriKM, dateNgayBatDau, dateNgayKetThuc, trangThai, loaiKhuyenMai, moTa, giaApDung);

                    boolean a = this.service.insert(km);

                   

                    if (a == true) {
                        JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
                        return;
                    }

                    this.clear();
                    this.loadTable();
                }
            } else {
                return;
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int id = Integer.parseInt(txtID.getText());
        String tenKhuyenMai = this.txtten.getText();
//        int giaTriKM = Integer.parseInt(txtGiaTri.toString());
        Integer giaTriKM = Integer.parseInt(txtGiaTri.getText());;
        String s = String.valueOf(giaTriKM);
        int trangThai;
        if (rd_HoatDong.isSelected() == true) {
            trangThai = 0;
        } else {
            trangThai = 1;
        }
//        int loaiKhuyenMai = Integer.parseInt(txtLoaiKM.toString());
        int loaiKhuyenMai;
        if (rd_Phantram.isSelected() == true) {
            loaiKhuyenMai = 1;
        } else {
            loaiKhuyenMai = 0;
        }

        // xong r đấy
//        String t = String.valueOf(loaiKhuyenMai);
        String moTa = this.txtMoTa.getText();

        String ngayBatDau = txtNgayBatDau.getText();
        Date dateNgayBatDau;
        try {
            dateNgayBatDau = new SimpleDateFormat("yyyy-mm-dd").parse(ngayBatDau);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập ngày bắt đầu theo định dạng Year/Month/Day");
            return;
        }

        String ngayKetThuc = txtNgayKetThuc.getText();
        Date dateNgayKetThuc;
        try {
            dateNgayKetThuc = new SimpleDateFormat("yyyy-mm-dd").parse(ngayKetThuc);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập ngày kết thúc theo định dạng Year/Month/Day");
            return;
        }
        Integer giaApDung = Integer.parseInt(txtGiaApDung.getText());
        Model.KhuyenMai km = new Model.KhuyenMai(id, tenKhuyenMai, giaTriKM, dateNgayBatDau, dateNgayKetThuc, trangThai, loaiKhuyenMai, moTa, giaApDung);

        boolean a = this.service.update(km);

        if (a == true) {
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sửa thất bại");
            return;
        }

        this.clear();
        this.loadTable();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clear();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKMMouseClicked
        int index = this.tblKM.getSelectedRow();

        String id = model.getValueAt(index, 0).toString();
        String tenKhuyenMai = model.getValueAt(index, 1).toString();
        String giaTriKM = model.getValueAt(index, 2).toString();
        String ngayBatDau = model.getValueAt(index, 3).toString();
        String ngayKetThuc = model.getValueAt(index, 4).toString();
        String loaiKhuyenMai = model.getValueAt(index, 5).toString();
        String moTa = model.getValueAt(index, 6).toString();
        String trangThai = model.getValueAt(index, 7).toString();
        String giaApDung = model.getValueAt(index, 8).toString();

        this.txtID.setText(id);
        this.txtten.setText(tenKhuyenMai);
        this.txtGiaTri.setText(giaTriKM);
        this.txtNgayBatDau.setText(ngayBatDau);
        this.txtNgayKetThuc.setText(ngayKetThuc);

        this.txtMoTa.setText(moTa);

        this.txtGiaApDung.setText(giaApDung);
        if (trangThai.equals("Không hoạt động")) {
            rd_khd.setSelected(true);
        } else {
            rd_HoatDong.setSelected(true);
        }
        if (loaiKhuyenMai.equals("Giảm %")) {
            rd_Phantram.setSelected(true);
        } else {
            rd_codinh.setSelected(true);
        }
    }//GEN-LAST:event_tblKMMouseClicked

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
            java.util.logging.Logger.getLogger(KhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rd_HoatDong;
    private javax.swing.JRadioButton rd_Phantram;
    private javax.swing.JRadioButton rd_codinh;
    private javax.swing.JRadioButton rd_khd;
    private javax.swing.JTable tblKM;
    private javax.swing.JTextField txtGiaApDung;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMa1;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
