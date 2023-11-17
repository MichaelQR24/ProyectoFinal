/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import Entidades.Mascota;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author piero
 */
public class FramePublicaciones extends javax.swing.JFrame {

    private FrameCrearPublicación hijo;
    private Mascota mascota;
    private List<JPanel> panelesPublicacion = new ArrayList<>();
    private JPanel panelPublicacion;

    /**
     * Creates new form FramePublicaciones
     */
    public FramePublicaciones() {
        initComponents();
    }

    public FramePublicaciones(FrameCrearPublicación hijo, Mascota mascota) {
        initComponents();
        this.hijo = hijo;
        this.mascota = mascota;
        agregarMascota(mascota);
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
        spPublicacion = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblPhoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnMisPublicaciones = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCrearPublicacion = new javax.swing.JLabel();
        btnMascotasPerdidas = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        btnAdopcion = new javax.swing.JLabel();
        lblLogoPerfil = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 211, 174));

        jLabel2.setText("SE BUSCA:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        jPanel3.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 260, 20));
        jPanel3.add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 260, 20));
        jPanel3.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 510, 110));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, 555, 360));

        spPublicacion.setViewportView(jPanel2);

        jPanel1.add(spPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 72, 644, 568));

        btnMisPublicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFramePublicaciones/btnMisPublicaciones.png"))); // NOI18N
        btnMisPublicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMisPublicacionesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMisPublicacionesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMisPublicacionesMouseReleased(evt);
            }
        });
        jPanel1.add(btnMisPublicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 355, -1, -1));

        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 180, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Mascotas Perdidas");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 0, 644, 72));

        btnCrearPublicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFramePublicaciones/btnCrearPublicacion.png"))); // NOI18N
        btnCrearPublicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearPublicacionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCrearPublicacionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCrearPublicacionMouseReleased(evt);
            }
        });
        jPanel1.add(btnCrearPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 407, -1, -1));

        btnMascotasPerdidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFramePublicaciones/btnMascotasPerdidas.png"))); // NOI18N
        btnMascotasPerdidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMascotasPerdidasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMascotasPerdidasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMascotasPerdidasMouseReleased(evt);
            }
        });
        jPanel1.add(btnMascotasPerdidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 303, -1, -1));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFramePublicaciones/btnCerrarSesion.png"))); // NOI18N
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseReleased(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        btnAdopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFramePublicaciones/btnAdopcion.png"))); // NOI18N
        btnAdopcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdopcionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdopcionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdopcionMouseReleased(evt);
            }
        });
        jPanel1.add(btnAdopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 251, -1, -1));

        lblLogoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFramePublicaciones/LogoPerfil.png"))); // NOI18N
        jPanel1.add(lblLogoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 33, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFramePublicaciones/FramePublicaciones.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    public void agregarMascota(Mascota mascota) {
        lblNombre.setText(mascota.getNombre());
        lblRaza.setText(mascota.getRaza());
        lblDescripcion.setText(mascota.getDescripcion());

        // Mostrar la imagen en un JLabel y ajustar al tamaño del JLabel
        if (mascota.getImagenBytes() != null) {
            try {
                // Obtener la imagen original
                ImageIcon iconoOriginal = new ImageIcon(mascota.getImagenBytes());
                Image imagenOriginal = iconoOriginal.getImage();

                // Obtener el tamaño del JLabel
                int anchoLabel = lblPhoto.getWidth();
                int altoLabel = lblPhoto.getHeight();

                // Escalar la imagen al tamaño del JLabel
                Image imagenEscalada = imagenOriginal.getScaledInstance(anchoLabel, altoLabel, Image.SCALE_SMOOTH);

                // Crear un nuevo ImageIcon con la imagen escalada
                ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

                // Establecer el nuevo icono en el JLabel
                lblPhoto.setIcon(iconoEscalado);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private void btnAdopcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdopcionMouseClicked
        abrirPantalla();
    }//GEN-LAST:event_btnAdopcionMouseClicked

    private void btnAdopcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdopcionMousePressed
        btnAdopcion.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnAdopcion2.png"))
        );
    }//GEN-LAST:event_btnAdopcionMousePressed

    private void btnAdopcionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdopcionMouseReleased
        btnAdopcion.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnAdopcion.png"))
        );
    }//GEN-LAST:event_btnAdopcionMouseReleased

    private void btnMascotasPerdidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasPerdidasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMascotasPerdidasMouseClicked

    private void btnMascotasPerdidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasPerdidasMousePressed
        btnMascotasPerdidas.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnMascotasPerdidas2.png"))
        );
    }//GEN-LAST:event_btnMascotasPerdidasMousePressed

    private void btnMascotasPerdidasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotasPerdidasMouseReleased
        btnMascotasPerdidas.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnMascotasPerdidas.png"))
        );
    }//GEN-LAST:event_btnMascotasPerdidasMouseReleased

    private void btnMisPublicacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisPublicacionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMisPublicacionesMouseClicked

    private void btnMisPublicacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisPublicacionesMousePressed
        btnMisPublicaciones.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnMisPublicaciones2.png"))
        );
    }//GEN-LAST:event_btnMisPublicacionesMousePressed

    private void btnMisPublicacionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisPublicacionesMouseReleased
        btnMisPublicaciones.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnMisPublicaciones.png"))
        );
    }//GEN-LAST:event_btnMisPublicacionesMouseReleased

    private void btnCrearPublicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPublicacionMouseClicked
        abrirPantalla();
    }//GEN-LAST:event_btnCrearPublicacionMouseClicked

    private void btnCrearPublicacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPublicacionMousePressed
        btnCrearPublicacion.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnCrearPublicacion2.png"))
        );
    }//GEN-LAST:event_btnCrearPublicacionMousePressed

    private void btnCrearPublicacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPublicacionMouseReleased
        btnCrearPublicacion.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnCrearPublicacion.png"))
        );
    }//GEN-LAST:event_btnCrearPublicacionMouseReleased

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnCerrarSesion2.png"))
        );
    }//GEN-LAST:event_btnCerrarSesionMousePressed

    private void btnCerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseReleased
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/ImagenesFramePublicaciones/btnCerrarSesion.png"))
        );
    }//GEN-LAST:event_btnCerrarSesionMouseReleased

    private void abrirPantalla() {
        FrameCrearPublicación pantalla = new FrameCrearPublicación(this);
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(FramePublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdopcion;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnCrearPublicacion;
    private javax.swing.JLabel btnMascotasPerdidas;
    private javax.swing.JLabel btnMisPublicaciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogoPerfil;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JScrollPane spPublicacion;
    // End of variables declaration//GEN-END:variables
}
