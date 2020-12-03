package com.imc;

import util.CalculoImc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IMC extends javax.swing.JFrame {

    public IMC() {
        initComponents();
        LocalDate dataHoje = LocalDate.now();
        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        lblDataHoje.setText(dataHoje.format(formatadorBarra));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalcularImc = new javax.swing.JButton();
        lblIndiceImc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblClassificacao = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnZerar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblDataHoje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Índice IMC");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMC");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 143, 52));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Informe a Altura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 74, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Informe o peso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 129, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Classificação");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        btnCalcularImc.setText("Calcular");
        btnCalcularImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularImcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularImc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        lblIndiceImc.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblIndiceImc.setForeground(new java.awt.Color(0, 0, 153));
        lblIndiceImc.setText("0");
        getContentPane().add(lblIndiceImc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 192, 80, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Índice IMC");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 99, -1));

        lblClassificacao.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblClassificacao.setForeground(new java.awt.Color(0, 0, 153));
        lblClassificacao.setText("0");
        getContentPane().add(lblClassificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 20));

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 74, 51, -1));
        getContentPane().add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 51, -1));

        btnZerar.setText("Zerar");
        btnZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnZerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 70, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Data de Hoje:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        lblDataHoje.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblDataHoje.setText("dd/MM/yyyy");
        getContentPane().add(lblDataHoje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularImcActionPerformed

        float peso = Float.parseFloat(txtPeso.getText());
        float altura = Float.parseFloat(txtAltura.getText());  
        float imc = CalculoImc.calcularImc(peso, altura);

        String i = String.format("%.2f", imc);
        String indiceImc = CalculoImc.indice(imc);
        
        lblIndiceImc.setText(i);
        lblClassificacao.setText(indiceImc);
        
    }//GEN-LAST:event_btnCalcularImcActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void btnZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZerarActionPerformed
        // TODO add your handling code here:
        txtPeso.setText("");
        txtAltura.setText("");
        lblIndiceImc.setText("0"); 
        lblClassificacao.setText("0");
    }//GEN-LAST:event_btnZerarActionPerformed

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
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularImc;
    private javax.swing.JButton btnZerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblClassificacao;
    private javax.swing.JLabel lblDataHoje;
    private javax.swing.JLabel lblIndiceImc;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
