/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.actividad3condicionalesjava;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */
public class Actividad3CondicionalesJAVA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String Nombre = entrada.next();
        System.out.println("Ingrese su apellido");
        String Apellido = entrada.next();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su sexo \nM(Masculino) o F(Femenino)");
        String sexo = entrada.next();
        System.out.println(Nombre+" "+Apellido);
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
        System.out.println("Su Sexo es: "+sexo);    
    }
}
