/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 * EJERCICIO 6 Calcular el factorial de n recursivamente
 *
 * @author Juan Pedro Sánchez Álvarez (sanchezalvarezjp@gmail.com)
 */
public class FactorialRecursivo {
    
    /**
     * Método que calcula el factorial de un número introducido por el 
     * usuario
     * @see FactorialR Calcula el factorial de manera recursiva
     */
    public void calculaFactorial() {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.print("¿De qué número deseas calcular el factorial? ");
        num = scn.nextInt();

        System.out.println("El factorial de " + num + " es: " + FactorialR(num));
    }

    /**
     * Calcula el factorial de un número recursivamente
     * @param n el número del que se quiere calcular el factorial
     * @return el factorial de n
     */
    private int FactorialR(int n) {
        if (n > 0) {
            return (n * FactorialR(n - 1));
        } else {
            return 1;
        }
    }
}
