
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vivob
 */
public class PerhitunganDiskonForm extends javax.swing.JFrame {

    /**
     * Creates new form PerhitunganDiskonForm
     */
    public PerhitunganDiskonForm() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboPersentaseDiskon = new javax.swing.JComboBox<>();
        txtHargaAsli = new javax.swing.JTextField();
        txtHargaAkhir = new javax.swing.JTextField();
        txtPenghematan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKodeKupon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Aplikasi Perhitungan Diskon");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Harga Asli");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Persentase Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Harga Akhir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Penghematan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(jLabel5, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(jButton1, gridBagConstraints);

        comboPersentaseDiskon.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboPersentaseDiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Diskon-", "10%", "20%", "30%" }));
        comboPersentaseDiskon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPersentaseDiskonItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(comboPersentaseDiskon, gridBagConstraints);

        txtHargaAsli.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtHargaAsli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaAsliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(txtHargaAsli, gridBagConstraints);

        txtHargaAkhir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtHargaAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaAkhirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(txtHargaAkhir, gridBagConstraints);

        txtPenghematan.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(txtPenghematan, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Kode Kupon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 17, 5, 17);
        jPanel2.add(jLabel6, gridBagConstraints);

        txtKodeKupon.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 179;
        gridBagConstraints.insets = new java.awt.Insets(7, 17, 7, 17);
        jPanel2.add(txtKodeKupon, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaAsliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaAsliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaAsliActionPerformed

    private void txtHargaAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaAkhirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
        // Ambil nilai harga asli dari input
        double hargaAsli = Double.parseDouble(txtHargaAsli.getText());
        
        // Ambil persentase diskon dari JComboBox
        int persentaseDiskon = Integer.parseInt(comboPersentaseDiskon.getSelectedItem().toString().replace("%", ""));
        
        // Ambil kode kupon dari JTextField
        String kodeKupon = txtKodeKupon.getText();
        double diskonTambahan = 0;

        // Periksa kode kupon dan tentukan diskon tambahan
        if (kodeKupon.equals("DISKON10")) {
            diskonTambahan = 10;
        } else if (kodeKupon.equals("DISKON20")) {
            diskonTambahan = 20;
        }

        // Hitung total persentase diskon (diskon utama + diskon tambahan)
        double totalPersentaseDiskon = persentaseDiskon + diskonTambahan;

        // Hitung jumlah diskon dan harga akhir
        double jumlahDiskon = hargaAsli * totalPersentaseDiskon / 100;
        double hargaAkhir = hargaAsli - jumlahDiskon;

        // Tampilkan hasil pada JTextField tanpa format desimal
        txtHargaAkhir.setText(String.valueOf(hargaAkhir));
        txtPenghematan.setText(String.valueOf(jumlahDiskon));
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan nilai yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
    }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboPersentaseDiskonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPersentaseDiskonItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPersentaseDiskonItemStateChanged

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
            java.util.logging.Logger.getLogger(PerhitunganDiskonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganDiskonForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPersentaseDiskon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtHargaAkhir;
    private javax.swing.JTextField txtHargaAsli;
    private javax.swing.JTextField txtKodeKupon;
    private javax.swing.JTextField txtPenghematan;
    // End of variables declaration//GEN-END:variables
}
