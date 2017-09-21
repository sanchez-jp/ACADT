/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 * EJERCICIO 2 Pedir dos números por teclado y decir si uno es múltiplo del
 * otro.
 *
 * @author alumno
 */
public class EsMultiplo {

    /**
     * Indica si un número es múltiplo de otro. Los números son introducidos por
     * el usuario.
     */
    public void esMultiplo() {
        Scanner ent = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n1 = ent.nextInt();
        System.out.print("Introduzca otro número: ");
        int n2 = ent.nextInt();

        if (n2 < n1) {
            if (n1 % n2 == 0) {
                System.out.println(n1 + "es múltiplo de " + n2);
            } else {
                System.out.println("Los números no son múltiplos entre si");
            }
        } else {
            if (n2 % n1 == 0) {
                System.out.println(n2 + " es múltiplo de " + n1);
            } else {
                System.out.println("Los números no son múltiplos entre si");
            }

        }
    }
}
