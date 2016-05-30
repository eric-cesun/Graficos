/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.util.Random;

/**
 *
 * @author kirito205
 */
public class CalificacionesRandom extends javax.swing.JFrame {

    /**
     * Creates new form CalificacionesRandom
     */
    public CalificacionesRandom() {
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

        jPanel1 = new javax.swing.JPanel();
        btnRandom = new javax.swing.JButton();
        txtAprobado = new javax.swing.JTextField();
        txtReprobado = new javax.swing.JTextField();
        txtDerecho = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calificaciones Random");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRandom.setText("Random");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });
        jPanel1.add(btnRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        txtAprobado.setEditable(false);
        jPanel1.add(txtAprobado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 90, -1));

        txtReprobado.setEditable(false);
        jPanel1.add(txtReprobado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 90, -1));

        txtDerecho.setEditable(false);
        jPanel1.add(txtDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, -1));

        jLabel1.setText("Aprobados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setText("Reprobados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setText("Derecho");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 10, 250, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        // TODO add your handling code here:
        txtArea.setText("");
          int[] matris=new int[10];
       for (int i = 0; i < 10; i++) {
            Random n=new Random();
            matris[i]=(int)(n.nextInt(100)+1);
            txtArea.setText(txtArea.getText()+" las calificaciones: "+matris[i]+"\n");
       } 
       Calificacion(matris);
    }//GEN-LAST:event_btnRandomActionPerformed

     public static void Calificacion(int[] matris){
        int aprobados=0;
        int reprobados=0;
        int derecho=0;
        for (int i = 0; i < 10; i++) {
            if (matris[i]>=70) {
                aprobados++;
                continue;
            }
            if (matris[i]>=50 && matris[i]<70){
                derecho++;
                continue;
            }
            if (matris[i]<50){
                reprobados++;
                continue;
            }
        }
         txtAprobado.setText(""+aprobados);
         txtReprobado.setText(""+reprobados);
         txtDerecho.setText(""+derecho);
    }
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
            java.util.logging.Logger.getLogger(CalificacionesRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalificacionesRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalificacionesRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalificacionesRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalificacionesRandom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRandom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtAprobado;
    private javax.swing.JTextArea txtArea;
    public static javax.swing.JTextField txtDerecho;
    public static javax.swing.JTextField txtReprobado;
    // End of variables declaration//GEN-END:variables
}
