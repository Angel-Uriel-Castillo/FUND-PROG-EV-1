/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA1_8_AREA_TRIANGULO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //TODO code application loic here
        double base; //double ---> tipo de dato para numeros conpartes iguales
        double altura;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("intruduce el altura del triangulo");
        altura = input.nextDouble();
        System.out.println("intruduce la base del triangulo");
        base = input.nextDouble();
        area = (base * altura) / 2;
        System.out.println("el area es");
        System.out.println(area);
    }
}
