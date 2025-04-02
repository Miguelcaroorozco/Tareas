/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Miguel
 */
public class Usuario {

    private String nombre;
    private String email;
    private String username;
    private String clave;

    public Usuario(String nombre, String email, String username, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.clave = clave;

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean validarUsuario(String pUsername, String pPassword) {
        Conector db = new Conector();
        
        try {
            db.conectar();
            String query = "SELECT * FROM usuarios WHERE Usuario = ? AND Clave = ?";
            ResultSet rs = db.executeSelect(query, pUsername, pPassword);
            return rs.next();
            
        }catch (SQLException e) {
            System.err.println("Error al verificar las credenciales: " + e.getMessage());
            return false;
        }finally {
           db.desconectar();
        }
    }
    public boolean registrarUsuario(Usuario usuario) {
    Conector db = new Conector();
    try {
        db.conectar();
        String query = "INSERT INTO usuarios (Nombre, Email, Usuario, Clave) VALUES (?, ?, ?, ?)";
        int filasAfectadas = db.executeUpdate(query, 
            usuario.getNombre(), 
            usuario.getEmail(), 
            usuario.getUsername(), 
            usuario.getClave()
        );
        return filasAfectadas > 0;
    } catch (SQLException e) {
        System.err.println("Error al guardar usuario: " + e.getMessage());
        return false;
    } finally {
        db.desconectar();
    }
}
}
