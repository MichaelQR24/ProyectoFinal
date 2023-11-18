/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import javax.swing.text.JTextComponent;

/**
 *
 * @author piero
 */
public class FrameEditarPerfil extends javax.swing.JFrame {

    /**
     * Creates new form FrameEditarPerfil
     */
    public FrameEditarPerfil() {
        initComponents();
         agregarTextPrompt("Nombre",txtNombre);
         agregarTextPrompt("Contraseña",txtContraseña);
         agregarTextPrompt("Usuario",txtUsuario);
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Ellipse 3.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtUsuario.setBorder(null);
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 86, 330, -1));

        txtContraseña.setBackground(new java.awt.Color(235, 235, 235));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtContraseña.setBorder(null);
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 146, 330, -1));

        txtNombre.setBackground(new java.awt.Color(235, 235, 235));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNombre.setBorder(null);
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 26, 330, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Rectangle 40.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Rectangle 40.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Rectangle 40.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Group 10 (1).png"))); // NOI18N
        btnConfirmar.setBorder(null);
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Group 10 (1).png"))); // NOI18N
        btnConfirmar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Group 20.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Rectangle 47.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Group 2.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Group 11 (2).png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Group 11 (2).png"))); // NOI18N
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameEditarPerfil/Group 21.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEditar)
                            .addGap(138, 138, 138)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCancelar)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void agregarTextPrompt(String placeholder, JTextComponent component) {
        TextPrompt prompt = new TextPrompt(placeholder, component);
        
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(FrameEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEditarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
