/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
/**
 *
 * @author omarc
 */
public class Coneccion {
    
    final String base_datos = "envio_corres";
    final String user = "omarreyna";
    String clave = "omarreyna1234AE";
    String url ="jdbc:mysql://db4free.net:3306/" + base_datos;
    Connection conexion;
    
    public Connection getConnection() {
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conexion = (Connection)DriverManager.getConnection(url,user,clave);
            } catch (SQLException ex) {
                Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    // Método para insertar datos de publicación de mascotas en la base de datos
    public void insertarPublicacionMascota(String nombre, String raza, String descripcion, byte[] imagenBytes) {
        try {
            Connection conexion = getConnection();
            String consulta = "INSERT INTO publicaciones_mascotas (nombre, raza, descripcion, imagen) VALUES (?, ?, ?, ?)";
            try (PreparedStatement declaracionPreparada = conexion.prepareStatement(consulta)) {
                declaracionPreparada.setString(1, nombre);
                declaracionPreparada.setString(2, raza);
                declaracionPreparada.setString(3, descripcion);
                declaracionPreparada.setBytes(4, imagenBytes);

                declaracionPreparada.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

