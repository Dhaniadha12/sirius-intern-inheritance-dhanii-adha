/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud;
import java.sql.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;




/**
 *
 * @author dhani
 */
public class Sedan extends javax.swing.JFrame {

    /**
     * Creates new form sedan
     */
    public Sedan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb_edit38 = new javax.swing.JButton();
        tb_cari1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        tb_simpan1 = new javax.swing.JButton();
        tb_hapus1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_sedan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jenis_bahan_bakar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kapasitas_penumpang = new javax.swing.JTextField();
        id_mobil = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_edit38.setText("edit");
        tb_edit38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_edit38ActionPerformed(evt);
            }
        });

        tb_cari1.setText("cari");
        tb_cari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_cari1ActionPerformed(evt);
            }
        });

        jLabel8.setText("cari");

        tb_simpan1.setText("simpan");
        tb_simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_simpan1ActionPerformed(evt);
            }
        });

        tb_hapus1.setText("hapus");
        tb_hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_hapus1ActionPerformed(evt);
            }
        });

        jLabel1.setText("id_sedan");

        jLabel2.setText("id_mobil");

        jLabel3.setText("jenis_bahan_bakar");

        jLabel4.setText("kapasitas_penumpang");

        id_mobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilihmobil" }));
        id_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_mobilActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(id_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_sedan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jenis_bahan_bakar)
                                    .addComponent(kapasitas_penumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tb_simpan1)
                        .addGap(41, 41, 41)
                        .addComponent(tb_edit38)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(51, 51, 51)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tb_cari1)
                    .addComponent(tb_hapus1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id_sedan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(id_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jenis_bahan_bakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(kapasitas_penumpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_simpan1)
                    .addComponent(tb_hapus1)
                    .addComponent(tb_edit38))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_cari1)
                    .addComponent(jLabel8)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_edit38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_edit38ActionPerformed
        try{
            String sql="update tb_sedan set id_mobil='" + id_mobil.getSelectedItem()+
            "', jenis_bahan_bakar='"+jenis_bahan_bakar.getText()+
            "',kapasitas_penumpang='"+kapasitas_penumpang.getText()+
            "' where id_sedan='"+ id_sedan.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)crud.Koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_edit38ActionPerformed

    private void tb_cari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_cari1ActionPerformed
        try {
            java.sql.Connection conn=(java.sql.Connection)crud.Koneksi.koneksiDB();
            String sql = "Select * from tb_sedan where id_sedan='"+cari.getText()+"' or jenis_bahan_bakar='"+cari.getText()+"'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()){
                id_sedan.setText(rs.getString(1));
                id_mobil.setSelectedItem(rs.getString(2));
                jenis_bahan_bakar.setText(rs.getString(3));
                kapasitas_penumpang.setText(rs.getString(4));
                JOptionPane.showMessageDialog(null,"Data tbdata : "
                    + cari.getText() + " ditemukan, ");
            }
        } catch (Exception e){}
        cari.requestFocus();
    }//GEN-LAST:event_tb_cari1ActionPerformed

    private void tb_simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_simpan1ActionPerformed
        try{
            String sql="insert into tb_sedan values('"
                    +id_sedan.getText()+"','"
                    +id_mobil.getSelectedItem()+"','"
                    +jenis_bahan_bakar.getText()+"','"
                    +kapasitas_penumpang.getText()+"')";
                    
            java.sql.Connection conn=(java.sql.Connection)crud.Koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_simpan1ActionPerformed

    private void tb_hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_hapus1ActionPerformed
        try{
            java.sql.Connection conn=(java.sql.Connection)crud.Koneksi.koneksiDB();
            String sql = "delete from tb_sedan where id_sedan='"+id_sedan.getText()+"' ";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate(); JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Proses Penghapusan Gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_hapus1ActionPerformed

    private void id_mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_mobilActionPerformed
       
        try {
            String query = "SELECT * FROM tb_mobil";
            Statement st = crud.Koneksi.koneksiDB().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                id_mobil.addItem(rs.getString("id"));
            }
            
            rs.last();
            boolean first = rs.first();
            
        } catch (SQLException e) {
    // Cetak detail kesalahan pada konsol
    // Atau tambahkan log atau tindakan penanganan kesalahan lainnya di sini
}

    }//GEN-LAST:event_id_mobilActionPerformed

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
            java.util.logging.Logger.getLogger(Sedan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sedan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sedan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sedan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sedan().setVisible(true);
            }
        });
    }
    
    public void tampil_data() {
    DefaultTableModel tabel = new DefaultTableModel();
    tabel.addColumn("id_sedan");
    tabel.addColumn("id_mobil");
    tabel.addColumn("jenis_bahan_bakar");
    tabel.addColumn("kapasitas_penumpang");
    
    
    

    try {
      java.sql.Connection conn=(java.sql.Connection)crud.Koneksi.koneksiDB();
      String sql = "select*from tb_sedan";
      java.sql.PreparedStatement pst = conn.prepareStatement(sql);
      ResultSet rs = pst.executeQuery(sql);
      while(rs.next())
      {
        tabel.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4)});
        }
        jTable1.setModel(tabel);
        }
    catch (Exception e){
    }
        // Ganti model JComboBox dengan data ID dari database
      






        // ... handle exception
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> id_mobil;
    private javax.swing.JTextField id_sedan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jenis_bahan_bakar;
    private javax.swing.JTextField kapasitas_penumpang;
    private javax.swing.JButton tb_cari1;
    private javax.swing.JButton tb_edit38;
    private javax.swing.JButton tb_hapus1;
    private javax.swing.JButton tb_simpan1;
    // End of variables declaration//GEN-END:variables
}
