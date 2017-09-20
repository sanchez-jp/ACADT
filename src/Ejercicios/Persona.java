/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;

/**
 * EJERCICIO 8 Crea una clase llamada Persona según lo siguiente: • Tendrá
 * obligatoriamente los atributos siguiente: nombre, edad, DNI, sexo (H o M),
 * peso y altura. No se puede acceder directamente a ellos. Puedes añadir más
 * atributos si lo consideras necesario. • Todos los atributos menos el DNI
 * tendrán valores por defecto según su tipo. El sexo por defecto será H. Se
 * implantarán varios constructores: o Uno por defecto. o Uno con el nombre,
 * edad y sexo y el resto por defecto. o Un constructor con todos los atributos
 * por parámetros.
 *
 * Además se implementarán los métodos: • esMayorDeEdad : indica si es mayor de
 * edad o no. • toString : devuelve toda la información del objeto. • generaDNI:
 * genera un Dni aleatorio de 8 cifras, genera a partir de este número la letra
 * correspondiente. Será invocado en la construcción del objeto. • Métodos set
 * para todos los parámetros menos el DNI. Prueba el correcto funcionamiento de
 * todos los métodos.
 *
 * @author alumno
 */
public class Persona {

    enum SEXO {
        H, M
    };

    private static char[] LetrasDNI
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
                'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private String nombre;
    private int edad;
    private String dni;
    private SEXO sexo;
    private double peso;
    private double altura;

    /**
     * Constructor por defecto de Persona
     */
    public Persona() {
        nombre = "name";
        edad = 0;
        this.dni = generaDNI();
        sexo = SEXO.H;
        peso = 0.00;
        altura = 0.00;
    }

    /**
     * Constructor parametrizado de Persona
     *
     * @param nombre elnombre de la persona
     * @param edad la edad de la persona
     * @param sexo el sexo de la persona
     */
    public Persona(String nombre, int edad, SEXO sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        peso = 0.00;
        altura = 0.00;
    }

    /**
     * Constructor parametrizado de Persona
     *
     * @param nombre el nombre de la persona
     * @param edad la edad de la persona
     * @param dni el DNI de la persona
     * @param sexo el sexo de la persona
     * @param peso el peso de la persona
     * @param altura la altura de la persona
     */
    public Persona(String nombre, int edad, String dni, SEXO sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the sexo
     */
    public SEXO getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Redefinición de toString para Persona
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni="
                + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura="
                + altura + '}';
    }

    /**
     * Indica si la persona es mayor de edad o no
     *
     * @return TRUE si tiene 18 años o más, FALSE en caso contrario
     */
    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println(nombre + "es mayor de edad");
        }
        return edad >= 18;
    }

    /**
     * Genera la letra del DNI según el número
     *
     * @param num el numero que compone el dni
     * @return la letra generada
     */
    private String genLetra(int num) {
        return String.valueOf(LetrasDNI[num % 23]);
    }

    /**
     * Genera un DNI de manera aleatoria
     *
     * @return el DNI generado aleatoriamente
     */
    public String generaDNI() {
        String numDni = "";
        for (int i = 0; i < 8; i++) {
            numDni += (int) (Math.random() * (9) + 0);
        }
        return numDni += "-" + genLetra(Integer.parseInt(numDni));
    }

}
