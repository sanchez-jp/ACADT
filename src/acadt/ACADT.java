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
        TablaMultiplicar tm = new TablaMultiplicar();
        //tm.calculaTabla();
        
        EsMultiplo em = new EsMultiplo();
        //em.esMultiplo();
        
        Cuadrado cuad = new Cuadrado();
        //cuad.calculaCuadrado();
        
        PedirNumeros pn = new PedirNumeros();
        //pn.pideNumeros();
        
        TablaEnteros te = new TablaEnteros();
        //te.rellenaTabla();
        
        FactorialRecursivo fr = new FactorialRecursivo();
        //fr.calculaFactorial();
        
        Cuenta c = new Cuenta("Juan Pedro Sánchez", 1000.50);
    /*    System.out.println(c);
        
        c.ingresar(499.50);
        System.out.println(c);
        
        c.ingresar(-10.80);
        System.out.println(c);
        
        c.retirar(500);
        System.out.println(c);
    */
    
    /* JUEGO DE PRUEBAS DE CLASE PERSONA */    
//        Persona p = new Persona();
//        System.out.println("persona generada por defecto:\n" + p);
//        
//        p = new Persona("Juan Pedro", 28, p.generaDNI(), SEXO.M, 70, 1.60);
//        System.out.println("Persona generada mediante constructor parametrizado completo:\n" + p);
//        
//        System.out.println("Probando método EsMayorDeEdad() para " + p.getNombre()
//                            + ": " + p.esMayorDeEdad());
        
        
    /* JUEGO DE PRUEBAS DE ROBOTS */
        Robots robots = new Robots();
        System.out.println("robots.insertRobot(new Robot(1,100));");
        robots.insertRobot(new Robot(1,100));
        
        System.out.println("robots.insertRobot(new Robot(2,50));");
        robots.insertRobot(new Robot(2,51));
        
        System.out.println("robots.insertRobot(new Robot(3,75));");
        robots.insertRobot(new Robot(3,75));
        
        System.out.println("robots.insertRobot(new Robot(8,15));");
        robots.insertRobot(new Robot(8,15));
        
        System.out.println("robots.insertRobot(new Robot(7,49));");
        robots.insertRobot(new Robot(7,49));
        
        System.out.println("Mostrando la lista de robots:\n" 
                + robots.getRoboList());
        
        System.out.println("Mostrando robots con mas de 50% de vida:\n" 
                + robots.showMedioVivos());
        
    }
    
    
}
