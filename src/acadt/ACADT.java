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
        PedirNumeros pn = new PedirNumeros();
        //pn.pideNumeros();
        
        TablaEnteros te = new TablaEnteros();
        //te.rellenaTabla();
        
        FactorialRecursivo fr = new FactorialRecursivo();
        //fr.calculaFactorial();
        
        Cuenta c = new Cuenta("Juan Pedro Sánchez", 1000.50);
        System.out.println(c);
        
        c.ingresar(499.50);
        System.out.println(c);
        
        c.ingresar(-10.80);
        System.out.println(c);
        
        c.retirar(500);
        System.out.println(c);
        
    }
    
}
