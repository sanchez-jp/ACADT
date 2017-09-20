/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 * EJERCICIO 4 Pedir números hasta que se teclee uno negativo. Mostrar cuántos
 * números se han introducido.
 *
 * @author Juan Pedro Sánchez Álvarez (sanchezalvarezjp@gmail.com)
 */
public class PedirNumeros {

    /**
     * Pide números hasta que se teclee uno negativo. Muesta cuántos
     * números se han introducido.
     */
    public void pideNumeros() {
        Scanner scn = new Scanner(System.in);
        int num;
        int count = 0;

        do {
            System.out.print("Introduce número: ");
            num = scn.nextInt();
            if (num >= 0) {
                count++;
            }
        } while (num >= 0);
        System.out.println("\nSe han introducido " + count + " números mas 1 negativo.");
    }

}
