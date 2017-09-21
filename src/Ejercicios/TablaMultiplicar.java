/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 * EJERCICIO 1 Clase que pide un número por teclado y muestre la tabla de
 * multiplicar de dicho número.
 *
 * @author alumno
 */
public class TablaMultiplicar {
    
    /**
     * Calcula la tabla de multiplicar del número introducido por el usuario
     */
    public void calculaTabla() {
        Scanner ent = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int number = ent.nextInt();

        System.out.println("La tabla de multiplicar de " + number + " es:");

        for (int i = 0; i <= 10; i++) {
            if (i != 10) {
                System.out.println(" " + number + "x" + i + " = " + (i * number));
            } else {
                System.out.println(number + "x" + i + " = " + (i * number));
            }
        }
    }
}
