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
public class Poche extends javax.swing.JFrame {

    /** Creates new form poche */
    public Poche() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kecepatan_maks = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        transmisi = new javax.swing.JTextField();
        id_mobil = new javax.swing.JComboBox<>();
        tb_edit38 = new javax.swing.JButton();
        tb_cari1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        tb_simpan1 = new javax.swing.JButton();
        tb_hapus1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_porche = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("id_mobil");

        jLabel3.setText("kecepatan_maks");

        jLabel4.setText("tansmisi");

        id_mobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilihmobil" }));
        id_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_mobilActionPerformed(evt);
            }
        });

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

        jLabel1.setText("id_poche");

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
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(id_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(id_porche, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kecepatan_maks)
                                .addComponent(transmisi))
                            .addGap(113, 113, 113))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(113, 113, 113)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id_porche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(id_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kecepatan_maks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(transmisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_simpan1)
                    .addComponent(tb_hapus1)
                    .addComponent(tb_edit38))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_cari1)
                    .addComponent(jLabel8)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tb_edit38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_edit38ActionPerformed
        try{
            String sql="update tb_porche set id_mobil='" + id_mobil.getSelectedItem()+
            "', kecepatan_maks='"+kecepatan_maks.getText()+
            "',transmisi='"+transmisi.getText()+
            "' where id_porche='"+ id_porche.getText()+"'";
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
            String sql = "Select * from tb_porche where id_porche='"+cari.getText()+"' or kecepatan_maks='"+cari.getText()+"'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()){
                id_porche.setText(rs.getString(1));
                id_mobil.setSelectedItem(rs.getString(2));
                kecepatan_maks.setText(rs.getString(3));
                transmisi.setText(rs.getString(4));
                JOptionPane.showMessageDialog(null,"Data tbdata : "
                    + cari.getText() + " ditemukan, ");
            }
        } catch (Exception e){}
        cari.requestFocus();
    }//GEN-LAST:event_tb_cari1ActionPerformed

    private void tb_simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_simpan1ActionPerformed
        try{
            String sql="insert into tb_porche values('"
                    +id_porche.getText()+"','"
                    +id_mobil.getSelectedItem()+"','"
                    +kecepatan_maks.getText()+"','"
                    +transmisi.getText()+"')";
                    
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
            String sql = "delete from tb_porche where id_porche='"+id_porche.getText()+"' ";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate(); JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Proses Penghapusan Gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_hapus1ActionPerformed

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
            java.util.logging.Logger.getLogger(Poche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Poche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Poche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Poche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Poche().setVisible(true);
            }
        });
    }
    public void tampil_data() {
    DefaultTableModel tabel = new DefaultTableModel();
    tabel.addColumn("id_porche");
    tabel.addColumn("id_mobil");
    tabel.addColumn("kepatan_maks");
    tabel.addColumn("transmisi");
    
    
    

    try {
      java.sql.Connection conn=(java.sql.Connection)crud.Koneksi.koneksiDB();
      String sql = "select*from tb_porche";
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
        // ... handle exception
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> id_mobil;
    private javax.swing.JTextField id_porche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kecepatan_maks;
    private javax.swing.JButton tb_cari1;
    private javax.swing.JButton tb_edit38;
    private javax.swing.JButton tb_hapus1;
    private javax.swing.JButton tb_simpan1;
    private javax.swing.JTextField transmisi;
    // End of variables declaration//GEN-END:variables

}
