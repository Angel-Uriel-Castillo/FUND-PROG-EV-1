/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA1_5_ENTRADA_SALIDA {

    public static void main(String[] args) {
        // 1. DECLARACION DE VARIABLE
        String nombre;
        String apellidos;
        String control;
        String carrera;
        int semestre;
        Scanner input = new Scanner (System.in);
        //2. CAPTURA DE VARIABLE
        System.out.println("introduce tu nombre");
        nombre=input.nextLine();
        System.out.println("introduce tu apellidos");
        apellidos = input.nextLine();
        System.out.println("introduce tu numero de control"); 
        control = input.nextLine();
        System.out.println("introduce tu carrera"); 
        carrera = input.nextLine();
        System.out.println("introduce tu semestre"); 
        semestre = input.nextInt();
        //3. MOSTRAR LOS DATOS CAPTURADO
        System.out.println(nombre);
        System.out.println(control);
        System.out.println(carrera);
        System.out.println(semestre);
    }
}
