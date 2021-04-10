/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.*;
import javax.swing.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import config.KoneksiDB;
import config.UserSession;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author pc
 */
public class FormTransaksi extends javax.swing.JFrame {
String id = UserSession.get_id();
    String nama = UserSession.get_nama();
    String level = UserSession.get_level();
        
    Statement st;
    Connection con = KoneksiDB.getConnection();
    ResultSet rs;
    DefaultComboBoxModel modelc;
    DefaultTableModel model;
    DefaultTableModel modelStatus;
    Calendar kalender = new GregorianCalendar();

    
    public FormTransaksi() {
        initComponents();
        tabelSiswa();


      
       tTanggal.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        tJumlah_bayar = new javax.swing.JTextField();
        tTanggal = new javax.swing.JTextField();
        cbBulan = new javax.swing.JComboBox<>();
        tNo_Transaki = new javax.swing.JLabel();
        tPetugas = new javax.swing.JLabel();
        tAngkatan = new javax.swing.JLabel();
        tKelas = new javax.swing.JLabel();
        tNama_siswa = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelSiswa = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        tNama_siswa1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelStatusBayar = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tNisn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tId_petugas = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("TRANSAKSI PEMBAYARAN SPP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Jumlah");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("No.Transaksi :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("NISN              :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Nama Siswa    :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Kelas              :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Angkatan        :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Petugas           :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Tanggal");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Bulan");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        btnHapus.setText("Batalkan");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 90, 30));

        btnSimpan.setText("Bayar");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 90, 30));

        tJumlah_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJumlah_bayarActionPerformed(evt);
            }
        });
        getContentPane().add(tJumlah_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 140, 30));

        tTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTanggalActionPerformed(evt);
            }
        });
        getContentPane().add(tTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 140, 30));

        cbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "januari", "februari", "maret", "april", "mei", "juni", "juli", "agustus", "september", "oktober", "november", "desember" }));
        cbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBulanActionPerformed(evt);
            }
        });
        getContentPane().add(cbBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 140, 30));

        tNo_Transaki.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tNo_Transaki.setText("Trns000");
        getContentPane().add(tNo_Transaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 140, -1));

        tPetugas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tPetugas.setText("~");
        getContentPane().add(tPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 120, -1));

        tAngkatan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tAngkatan.setText("~");
        getContentPane().add(tAngkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 90, -1));

        tKelas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tKelas.setText("~");
        getContentPane().add(tKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 140, -1));

        tNama_siswa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tNama_siswa.setText("~");
        getContentPane().add(tNama_siswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Cari Siswa");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, -1, -1));

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cariKeyTyped(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 490, 380, 30));

        TabelSiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelSiswa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 1320, 200));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Status Bayar :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        tNama_siswa1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tNama_siswa1.setText("~");
        getContentPane().add(tNama_siswa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 370, -1));

        tabelStatusBayar.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelStatusBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelStatusBayarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelStatusBayar);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, 1320, 220));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setText("Reset Form");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 250, 190, 50));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 250, 190, 50));

        tNisn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tNisn.setText("~");
        tNisn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tNisnPropertyChange(evt);
            }
        });
        getContentPane().add(tNisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 140, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("~");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 70, -1));

        tId_petugas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tId_petugas.setText("~");
        getContentPane().add(tId_petugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 30, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("/");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 20, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("/");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 10, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trans.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, 1280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    String no_trans = tNo_Transaki.getText();
        String nisn = tNisn.getText();
        String id_angkatan = jLabel11.getText();
        String id_petugas = tId_petugas.getText();
        String angkatan = tAngkatan.getText();
        String tgl = tTanggal.getText();
        String bln_bayar = cbBulan.getSelectedItem().toString();
        String jml_bayar = tJumlah_bayar.getText();

        try{
            Statement st = con.createStatement();
            String sql = "SELECT * FROM  pembayaran where nisn='"+nisn+"' and bulan_dibayar='"+bln_bayar+"'";
            rs = st.executeQuery(sql);

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Gagal : Transaksi ini sudah dilakukan!");
            } else {
                con.createStatement().executeUpdate("insert into pembayaran value ('"+no_trans+"','"+id_petugas+"','"+nisn+"','"+tgl+"','"+bln_bayar+"','"+angkatan+"','"+id_angkatan+"','"+jml_bayar+"')");
                JOptionPane.showMessageDialog(null, "Berhasil melakukan transaksi");
            }
        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
        
        tabelStatBayar();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    switch (level) {
                    case "admin":
                    {
                        Dashboard dsb = new Dashboard();
                        dsb.dashAdmin();
                        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        dsb.setVisible(true);
                        dispose();
                        break;
                    }
                    case "petugas":
                    {
                        Dashboard dsb = new Dashboard();
                        dsb.dashPetugas();
                        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        dsb.setVisible(true);
                        dispose();
                        break;
                    }
                    default:
                    break;
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
    tabelSiswa();
    }//GEN-LAST:event_cariKeyReleased

    private void cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyTyped
    tabelSiswa();
    }//GEN-LAST:event_cariKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     dispose();
       new FormTransaksi().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TabelSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelSiswaMouseClicked
    ID_AUTO();
        //setting date
        int tahun = kalender.get(Calendar.YEAR);
        int bulan = kalender.get(Calendar.MONTH)+1;
        int hari = kalender.get(Calendar.DAY_OF_MONTH);
        String tanggal = tahun+"/"+bulan+"/"+hari;
        tTanggal.setText(tanggal);
        
        int i = TabelSiswa.getSelectedRow();
        tNisn.setText(model.getValueAt(i, 0).toString());
        tNama_siswa.setText(model.getValueAt(i, 2).toString());
        tNama_siswa1.setText(model.getValueAt(i, 2).toString());
        tKelas.setText(model.getValueAt(i, 3).toString());
        tAngkatan.setText(model.getValueAt(i, 6).toString());
        tId_petugas.setText(id);
        tPetugas.setText(nama);

        try {
            rs = con.createStatement().executeQuery("select siswa.*, spp.* from siswa INNER JOIN spp Using(id_spp)where nisn like '%"+tNisn.getText()+"%'");
            while (rs.next()) {
                jLabel11.setText(rs.getString("id_spp"));
                tJumlah_bayar.setText(rs.getString("nominal"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(false);
    }//GEN-LAST:event_TabelSiswaMouseClicked

    private void tNisnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tNisnPropertyChange
     tabelStatBayar();
    }//GEN-LAST:event_tNisnPropertyChange

    private void tabelStatusBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelStatusBayarMouseClicked
    int trans = tabelStatusBayar.getSelectedRow();
        tNo_Transaki.setText(modelStatus.getValueAt(trans, 0).toString());
        tTanggal.setText(modelStatus.getValueAt(trans, 1).toString());
        cbBulan.setSelectedItem(modelStatus.getValueAt(trans, 2).toString());
        tJumlah_bayar.setText(modelStatus.getValueAt(trans, 3).toString());

        try {
            rs = con.createStatement().executeQuery("select pembayaran.*, petugas.*, spp.* from pembayaran INNER JOIN petugas Using(id_petugas) INNER JOIN spp Using(id_spp) where id_pembayaran like '%"+tNo_Transaki.getText()+"%'");
            while (rs.next()) {
                jLabel11.setText(rs.getString("id_spp"));
                tAngkatan.setText(rs.getString("tahun"));
                tId_petugas.setText(rs.getString("id_petugas"));
                tPetugas.setText(rs.getString("nama_petugas"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_tabelStatusBayarMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     try {
            con.createStatement().execute("delete from pembayaran where id_pembayaran='"+tNo_Transaki.getText()+"'");
            JOptionPane.showMessageDialog(null, "Transaksi berhasil dihapus");
            tabelStatBayar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal hapus transaksi");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTanggalActionPerformed

    private void cbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBulanActionPerformed

    private void tJumlah_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJumlah_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tJumlah_bayarActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelSiswa;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> cbBulan;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel tAngkatan;
    private javax.swing.JLabel tId_petugas;
    private javax.swing.JTextField tJumlah_bayar;
    private javax.swing.JLabel tKelas;
    private javax.swing.JLabel tNama_siswa;
    private javax.swing.JLabel tNama_siswa1;
    private javax.swing.JLabel tNisn;
    private javax.swing.JLabel tNo_Transaki;
    private javax.swing.JLabel tPetugas;
    private javax.swing.JTextField tTanggal;
    private javax.swing.JTable tabelStatusBayar;
    // End of variables declaration//GEN-END:variables

private void tabelSiswa() {
        String[] judul = {"NISN","NIS","Nama","Kelas","Alamat","Telepon","Tahun"};
        model = new DefaultTableModel(judul,0);
        TabelSiswa.setModel(model);
        String sql = "SELECT siswa.*, kelas.nama_kelas, spp.tahun from siswa INNER JOIN kelas USING(id_kelas) INNER JOIN spp Using(id_spp) where nisn like '%"+cari.getText()+"%' or nama like '%"+cari.getText()+"%'or nis like '%"+cari.getText()+"%'or nama_kelas like '%"+cari.getText()+"%'or alamat like '%"+cari.getText()+"%'or no_telp like '%"+cari.getText()+"%'or tahun like '%"+cari.getText()+"%'";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            while(rs.next()) {
               String nisn = rs.getString("nisn");
               String nis = rs.getString("nis");
               String nama = rs.getString("nama");
               String kelas = rs.getString("nama_kelas");
               String alamat = rs.getString("alamat");
               String telp = rs.getString("no_telp");
               String tahun = rs.getString("tahun");
                
               String[] data = {nisn, nis, nama, kelas, alamat, telp, tahun};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }
    private void tabelStatBayar() {
        String[] header = {"No Transaksi","Tanggal","Bulan","Jumlah Bayar","Status"};
        modelStatus = new DefaultTableModel(header,0);
        tabelStatusBayar.setModel(modelStatus);
        String dataStat = "SELECT * from pembayaran where nisn='"+tNisn.getText()+"'";
        
        try {
            ResultSet queryStat = con.createStatement().executeQuery(dataStat);
            while(queryStat.next()) {
               String no = queryStat.getString("id_pembayaran");
               String tanggal = queryStat.getString("tgl_bayar");
               String bulan = queryStat.getString("bulan_dibayar");
               String jumlah = queryStat.getString("jumlah_bayar");
               String status = "Lunas";
                
               String[] record = {no,tanggal,bulan,jumlah,status};
               modelStatus.addRow(record);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    }
    
    public void resetForm(){
        tNo_Transaki.setText(""); 
        jLabel11.setText(""); 
        tTanggal.setText(""); 
        tJumlah_bayar.setText(""); 
        tId_petugas.setText(""); 
        tPetugas.setText(""); 
        cbBulan.setSelectedItem("januari");   
        tabelSiswa(); 
    }
        
    /////kode otomatis
    private void ID_AUTO(){
        try {
            String sql="select max(right(id_pembayaran,3)) as no_trans from pembayaran";
            rs = con.createStatement().executeQuery(sql);

            while(rs.next()){
                if(rs.first()==false){
                    tNo_Transaki.setText("TRS001");
                } else{
                    rs.last();
                    int autoid = rs.getInt(1) + 1;
                    String nomor=String.valueOf(autoid);
                    
                    for(int a=0;a<3;a++){ 
                        nomor = "0" + nomor;
                    }
                    tNo_Transaki.setText("TRS" + nomor);
                }
            }
        } catch (Exception e) {
            System.out.println("error pembayaran | "+e);
        }
    }
}