/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author Miguel
 */
public class Empleado extends Persona { 
    private String nombreCargo;
    private double salario;
    private String jefeInmediato;
    private int añosExperiencia;

    public Empleado(String nombre, String apellido, String direccion, String telefono, int edad, String correo,String nombreCargo, double salario, String jefeInmediato, int añosExperiencia) {
        super(nombre, apellido, direccion, telefono, edad, correo);
        this.nombreCargo = nombreCargo;
        this.salario = salario;
        this.jefeInmediato = jefeInmediato;
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * @return the nombreCargo
     */
    public String getNombreCargo() {
        return nombreCargo;
    }

    /**
     * @param nombreCargo the nombreCargo to set
     */
    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the jefeInmediato
     */
    public String getJefeInmediato() {
        return jefeInmediato;
    }

    /**
     * @param jefeInmediato the jefeInmediato to set
     */
    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    /**
     * @return the añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     * @param añosExperiencia the añosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
}
