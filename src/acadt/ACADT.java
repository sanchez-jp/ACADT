/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadt;

import Ejercicios.*;

/**
 *
 * @author Juan Pedro Sánchez Álvarez (sanchezalvarezjp@gmail.com)
 */
public class ACADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Pruebas del EJERCICIO 1...");
        TablaMultiplicar tm = new TablaMultiplicar();
        tm.calculaTabla();

        /*--------------------------------------------------------------------*/
        System.out.println("\n\nPruebas del EJERCICIO 2...");
        EsMultiplo em = new EsMultiplo();
        em.esMultiplo();

        /*--------------------------------------------------------------------*/
        System.out.println("\n\nPruebas del EJERCICIO 3...");
        Cuadrado cuad = new Cuadrado();
        cuad.calculaCuadrado();

        /*--------------------------------------------------------------------*/
        System.out.println("\n\nPruebas del EJERCICIO 4...");
        PedirNumeros pn = new PedirNumeros();
        pn.pideNumeros();

        /*--------------------------------------------------------------------*/
        System.out.println("\n\nPruebas del EJERCICIO 5...");
        TablaEnteros te = new TablaEnteros();
        te.rellenaTabla();

        /*--------------------------------------------------------------------*/
        System.out.println("\n\nPruebas del EJERCICIO 6...");
        FactorialRecursivo fr = new FactorialRecursivo();
        fr.calculaFactorial();

        /*--------------------------------------------------------------------*/
        System.out.println("\n\nPruebas del EJERCICIO 7...");
        Cuenta c = new Cuenta("Juan Pedro Sánchez", 1000.50);
        System.out.println(c);

        c.ingresar(499.50);
        System.out.println(c);

        c.ingresar(-10.80);
        System.out.println(c);

        c.retirar(500);
        System.out.println(c);

        /*--------------------------------------------------------------------*/
        System.out.println("\n\nPruebas del EJERCICIO 8...");
        Persona p = new Persona();
        System.out.println("persona generada por defecto:\n" + p);

        p = new Persona("Juan Pedro", 28, p.generaDNI(), SEXO.M, 70, 1.60);
        System.out.println("Persona generada mediante constructor parametrizado completo:\n" + p);

        System.out.println("Probando método EsMayorDeEdad() para " + p.getNombre()
                + ": " + p.esMayorDeEdad());

        System.out.println("\n\nPruebas del EJERCICIO 9...");
        Robots robots = new Robots();

        robots.genAleatorios();
        System.out.println("Mostrando la lista de robots:\n"
                + robots.getRoboList());

        System.out.println("Mostrando robots con mas de 50% de vida:\n"
                + robots.showMedioVivos());

    }

}
