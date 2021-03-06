/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DTO.Kisu;
import DTO.NguoiDung;
import Dao.KisuDao;
import Dao.NguoiDungDao;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Hoang Pham
 */
public class Quanlytaikhoanpanel extends javax.swing.JPanel {
private DefaultTableModel tblmodel;
    /**
     * Creates new form Quanlytaikhoanpanel
     */
    public Quanlytaikhoanpanel() {
        initComponents();
        initTable();
        loadTable();
        vaitro();
    }
private void initTable()
    {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[] {"ID","Tên đăng nhập", "Mật Khẩu", "Vai trò", "Ngày tạo"});
        jTable1.setModel(tblmodel);
    }
    
    private void loadTable()
    {
        try
        {
            NguoiDungDao dao = new NguoiDungDao();
            List<NguoiDung> list = dao.hienthi(txttimkiem.getText());            
            tblmodel.setRowCount(0);
            for(NguoiDung cn : list)
            {
                tblmodel.addRow(new Object[]{cn.getId(),cn.getTendangnhap(), cn.getMatkhau(),
                    cn.getVaitro(), cn.getNgaytao()});
            }
            tblmodel.fireTableDataChanged();
            
       
            
        }catch(Exception e)
        {
            e.printStackTrace();
           
        }
         
    }
     private void vaitro()
    {
        String[] vaitro = new String[]{"ADMIN","Thuong"};
        
        DefaultComboBoxModel<String> cbxmodel = new DefaultComboBoxModel<>(vaitro);
        
        cbx1.setModel(cbxmodel);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txttimkiem = new javax.swing.JTextField();
        txttk = new javax.swing.JTextField();
        txtmk = new javax.swing.JTextField();
        cbx1 = new javax.swing.JComboBox<>();
        btntimkiem = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btntaomoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý tài khoản");

        jLabel2.setText("Tìm kiếm:");

        jLabel3.setText("Tên đăng nhập:");

        jLabel4.setText("Mật khẩu:");

        jLabel5.setText("Vai trò:");

        cbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx1MouseClicked(evt);
            }
        });

        btntimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifying-glass.png"))); // NOI18N
        btntimkiem.setText("Tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/insert.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/updated.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trash.png"))); // NOI18N
        jButton4.setText("Xóa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btntaomoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eraser.png"))); // NOI18N
        btntaomoi.setText("Tạo mới");
        btntaomoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntaomoiActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txttk)
                                            .addComponent(txtmk, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(64, 64, 64)
                                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(btntimkiem)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnthem)
                                .addGap(40, 40, 40)
                                .addComponent(btnsua)
                                .addGap(47, 47, 47)
                                .addComponent(jButton4)
                                .addGap(34, 34, 34)
                                .addComponent(btntaomoi))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(jButton4)
                    .addComponent(btntaomoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void clearform()
{
     txttimkiem.setText("");
     txttk.setText("");
     txtmk.setText("");
     cbx1.setSelectedIndex(0);
}
        
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
       StringBuilder sb = new StringBuilder();
        if(txttk.getText().equals("")){
             sb.append("Tên đăng nhập không được để trống \n");
        txttk.setBackground(Color.red);
        }else
        {
            txttk.setBackground(Color.white);
        }
        if(txtmk.getText().equals("")){
             sb.append("Mật khẩu không được để trống \n");
        txtmk.setBackground(Color.red);
        }else
        {
            txtmk.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error" , JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?","Hỏi",
        JOptionPane.YES_OPTION );
        if(choice == JOptionPane.NO_OPTION)
            return;
        
        NguoiDung nd = new NguoiDung();
        try{
            nd.setTendangnhap(txttk.getText());
            nd.setMatkhau(txtmk.getText());
            nd.setVaitro(cbx1.getSelectedItem().toString());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
            
         
            
           
         NguoiDungDao dao = new NguoiDungDao();
    try {
        NguoiDung nd1 = dao.findbytentk(txttk.getText());
        if(nd1!=null)
        {
            JOptionPane.showMessageDialog(this, "Đã tồn tại tài khoản có tên đăng nhập là:"+ txttk.getText());
        }
        else
        {
            try {
            if(dao.them(nd))
            {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                clearform();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Quanlytaikhoanpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        }
                
    } catch (Exception ex) {
        Logger.getLogger(Quanlytaikhoanpanel.class.getName()).log(Level.SEVERE, null, ex);
    }
       
        loadTable();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
       StringBuilder sb = new StringBuilder();
        if(txttk.getText().equals("")){
             sb.append("Tên đăng nhập không được để trống \n");
        
        }else
        {
            txttk.setBackground(Color.white);
        }
     
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error" , JOptionPane.ERROR_MESSAGE);
        return;
        }
         int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn Sửa không?","Hỏi",
        JOptionPane.YES_OPTION );
        if(choice == JOptionPane.NO_OPTION)
            return;
        
        NguoiDung nd= new NguoiDung();
        
           
             try{
            nd.setId(txttimkiem.getText());
            
            nd.setTendangnhap(txttk.getText());
            
                
                
            
            nd.setMatkhau(txtmk.getText());
            nd.setVaitro(cbx1.getSelectedItem().toString());
        }catch(Exception e)
        {
            e.printStackTrace();
        }           
         NguoiDungDao dao = new NguoiDungDao();
        try {
            if(dao.Sua(nd))
            {
                
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                clearform();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!");
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Quanlytaikhoanpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        loadTable();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txttk.getText().equals("")){
             sb.append("tên đăng nhập không được để trống \n");
        
        }else
        {
            txttk.setBackground(Color.white);
        } 
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error" , JOptionPane.ERROR_MESSAGE);
        return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa hay không?","Hỏi",
        JOptionPane.YES_OPTION );
        if(choice == JOptionPane.NO_OPTION)
            return;
        NguoiDungDao dao = new NguoiDungDao();
      try {
          if(dao.xoa(txttk.getText()))
          {
              
              JOptionPane.showMessageDialog(this, "xóa thành công!");
              clearform();
          }
      } catch (Exception ex) {
          Logger.getLogger(QuanLyKiSu.class.getName()).log(Level.SEVERE, null, ex);
      }
      loadTable();
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btntaomoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntaomoiActionPerformed
        clearform();
        loadTable();
    }//GEN-LAST:event_btntaomoiActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row = jTable1.getSelectedRow();
            if (row >= 0) {
                String id = (String) jTable1.getValueAt(row, 0);
                NguoiDungDao dao = new NguoiDungDao();
                NguoiDung nd = dao.findbyid(id);

                if (nd != null) {
//                    txttimkiem.setText(String.valueOf(nd.getId()));
                    txttk.setText(nd.getTendangnhap());
                    txtmk.setText(nd.getMatkhau());
                    cbx1.setSelectedItem(nd.getVaitro().trim());    
                  
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
//       try{
//         NguoiDungDao dao = new NguoiDungDao();
//         NguoiDung nd = dao.findbyid(txttimkiem.getText());   
//          if(nd!=null)
//          {
//              
//                  txttk.setText(nd.getTendangnhap());
//                  txtmk.setText(nd.getMatkhau());
//                  cbx1.setSelectedItem(nd.getVaitro());
//          }else
//              JOptionPane.showMessageDialog(this, "không tìm thấy kĩ sư nào có id là:"+ txttimkiem.getText());
//            
//            
//            
//     }catch(Exception e)
//     {
//         e.printStackTrace();
//     }
    
       loadTable();
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void cbx1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx1MouseClicked
     
    }//GEN-LAST:event_cbx1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btntaomoi;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtmk;
    private javax.swing.JTextField txttimkiem;
    private javax.swing.JTextField txttk;
    // End of variables declaration//GEN-END:variables
}
