/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 * EJERCICIO 7 Crea una clase llamada Cuenta que tendrá los siguientes
 * atributos: · Titular (obligatorio) · Cantidad (puede contener decimales y
 * será opcional) Crea dos constructores que cumplan estas condiciones.
 * Construye además los métodos get, set y toString correspondientes. Tendrá dos
 * métodos más: · Ingresar: se ingresa una cantidad en la cuenta. Si la cantidad
 * es negativa, no hacer nada. · Retirar: se retira una cantidad de la cuenta.
 * Si tras retirar el dinero la diferencia es negativa, la cuenta quedará a 0.
 *
 * @author Juan Pedro Sánchez Álvarez (sanchezalvarezjp@gmail.com)
 */
public class Cuenta {

    private String titular;
    private double cantidad;

    /**
     * Constructor por defecto de la clase Cuenta
     */
    public Cuenta() {
    }

    /**
     * Constructor parametrizado de la clase Cuenta
     *
     * @param titular el nombre del titular de la cuenta
     */
    public Cuenta(String titular) {
        this.titular = titular;
    }

    /**
     * Constructor parametrizado de la clase Cuenta
     *
     * @param titular el nombre del titular de la cuenta
     * @param cantidad la cantidad en euros de la cuenta
     */
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * redefinición del método toString para Cuenta
     *
     * @return cadena con los datos de la cuenta
     */
    @Override
    public String toString() {
        return "Cuenta{ " + "Titular: " + titular + ", Cantidad: "
                + String.format("%.2f", cantidad) + "€ }";
    }

    /**
     * Se ingresa una cantidad en la cuenta. Si la cantidad es negativa no hace
     * nada
     *
     * @param amount la cantidad a ingresar
     */
    public void ingresar(double amount) {
        if (amount > 0) {
            this.cantidad += amount;
        }
    }

    /**
     * Se retira una cantidad de la cuenta. Si tras retirar el dinero la
     * diferencia es negativa la cuenta queda a 0
     *
     * @param amount la cantidad a retirar
     */
    public void retirar(double amount) {
        if ((this.cantidad - amount) >= 0) {
            this.cantidad -= amount;
        }
    }

}
