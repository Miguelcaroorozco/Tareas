/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.persona;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cargo = "Empleado";

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.next();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.next();

        System.out.print("Ingrese la direccion: ");
        String direccion = scanner.next();

        System.out.print("Ingrese el telefono: ");
        String telefono = scanner.next();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese el correo: ");
        String correo = scanner.next();

        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingrese el jefe inmediato: ");
        String jefeInmediato = scanner.next();

        System.out.print("Ingrese los años de experiencia: ");
        int añosExperiencia = scanner.nextInt();
               
        if(salario>=5000000 && añosExperiencia>=5 && edad>=25 && edad<=45){
         cargo = "Senior";    
        }else if(salario>=900000 && salario>=1200000 && añosExperiencia>=1 && añosExperiencia<=2 && edad>=18 && edad<=22){
         cargo = "Junior"; 
        }
        Empleado empleado = new Empleado(nombre, apellido, direccion, telefono, edad, correo, cargo, salario, jefeInmediato, añosExperiencia);

        System.out.println("Empleado:");
        System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Dirección: " + empleado.getDireccion());
        System.out.println("Telefono: " + empleado.getTelefono());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("correo: " + empleado.getcorreo());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("Jefe Inmediato: " + empleado.getJefeInmediato());
        System.out.println("Años de Experiencia: " + empleado.getAñosExperiencia());
        System.out.println("Cargo: " + empleado.getNombreCargo());
        
    }
    
}
