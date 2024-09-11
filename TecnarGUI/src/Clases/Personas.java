/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */

public class Personas {
    private String nombre;
    private String apellido;
    private String dirrecion;
    private String edad;

    public Personas(String nombre, String apellido, String dirrecion, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirrecion = dirrecion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    private final List<String> datos = new ArrayList<>();

    public void almacenarDatos() {
        String personaInfo = "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDireccion: " + this.dirrecion + "\nEdad: " + this.edad;
        datos.add(personaInfo);
    }

    public List<String> getDatos() {
        return datos;
    }
}
    

