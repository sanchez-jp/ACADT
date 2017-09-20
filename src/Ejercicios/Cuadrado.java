/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 * EJERCICIO 3
 * Leer un número y mostrar su cuadrado. Repetir el proceso hasta que se 
 * introduzca un número negativo. 
 * @author alumno
 */
public class Cuadrado {
    public void calculaCuadrado(){
        Scanner ent = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("Introduce un número: ");
            num = ent.nextInt();
            if(num >=0)
                System.out.println("El cuadrado de " + num +" es " + (num*num));
        }while(num>=0);
    }
}
