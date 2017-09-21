/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 * EJERCICIO 9: Ejercicio 9 Se desea manejar una lista de robots en la que cada
 * robot tiene asociado un número que lo identifica y un porcentaje de vida. El
 * número de robots en la lista será un valor aleatorio entre 5 y 15, mientras
 * que los porcentajes de vida serán valores aleatorios entre 1 y 100. • Muestra
 * la lista ordenada de menor a mayor por porcentaje de vida de los robots. •
 * Muestra cuántos robots tienen un porcentaje superior a 50.
 *
 * @author Juan Pedro Sánchez Álvarez (sanchezalvarezjp@gmail.com)
 */
public class Robot implements Comparable<Robot> {

    private int id;
    private int vida;

    /**
     * Constructor parametrizado de Robot
     *
     * @param id el identificador del robot
     * @param vida la vida del robot
     */
    public Robot(int id, int vida) {
        this.id = id;
        this.vida = vida;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Redefinición de toString para Robot
     *
     * @return
     */
    @Override
    public String toString() {
        return "Robot(" + "ID: " + id + ", Vida: " + vida + "% ) ";
    }

    /**
     * redefinición de hashCode para Robot
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    /**
     * Redefinición de equals para Robot
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Robot other = (Robot) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     * Redefinición de compareTo para Robot
     *
     * @param o robot a comparar
     * @return
     */
    @Override
    public int compareTo(Robot o) {
        if (vida < o.getVida()) {
            return -1;
        }
        if (vida > o.getVida()) {
            return 1;
        } else {
            return 0;
        }
    }

}
