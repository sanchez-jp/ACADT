/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 * EJERCICIO 5 Tenemos una tabla de 10 elementos enteros. Introducir 8 números
 * en la misma por teclado. Después pedir un número y una posición, insertarlo
 * en la posición indicada, desplazando los que estén detrás.
 *
 * @author Juan Pedro Sánchez Álvarez (sanchezalvarezjp@gmail.com)
 */
public class TablaEnteros {

    /**
     * Crea una tabla de 10 elementos enteros. Se pide introducir 8
     * números en la misma por teclado. Después pide un número y una posición
     * para insertarlo en la posición indicada, desplazando los que estén detrás.
     */
    public void rellenaTabla() {
        Scanner scn = new Scanner(System.in);
        int num, pos;
        int[] tabla = new int[10];

        System.out.println("Introduce 8 números: ");
        for (int i = 0; i < 8; i++) {
            tabla[i] = scn.nextInt();
        }

        System.out.print("\nElige un número para almacenar en la tabla: ");
        num = scn.nextInt();
        System.out.print("\nSelecciona la posición donde deseas almacenarlo (de 1 a 10): ");
        pos = scn.nextInt() - 1;
        for (int i = tabla.length - 1; i > pos; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[pos] = num;

        System.out.println("\nMostrando la tabla..");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(" [" + tabla[i] + "]");
        }
        System.out.println("\n");
    }
}
