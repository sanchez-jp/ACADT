/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Juan Pedro Sánchez Álvarez (sanchezalvarezjp@gmail.com)
 */
public class Robots {

    private ArrayList<Robot> roboList = new ArrayList<>();

    /**
     * Inserta un nuevo robot en la lista y la reordena a continuación.
     *
     * @param r el robot a insertar
     */
    public void insertRobot(Robot r) {
        roboList.add(r);
        Collections.sort(roboList);
    }

    /**
     * Muestra el numero de robots con más del 50% de vida y devuelve una lista
     * de estos
     *
     * @return la lista de los robots con mas del 50% de vida
     */
    public ArrayList<Robot> showMedioVivos() {
        ArrayList<Robot> listaMedioVivos = new ArrayList<>();
        for (int i = 0; i < roboList.size(); i++) {
            if (roboList.get(i).getVida() > 50) {
                listaMedioVivos.add(roboList.get(i));
            }
        }
        System.out.println("\nHay " + listaMedioVivos.size() 
                + " robots con más de un 50% de vida");
        return listaMedioVivos;
    }

    /**
     * Genera un número aleatorio de robots entre 5 y 15 con un porcentaje de
     * vida entre 1 y 100,
     */
    public void genAleatorios() {
        int numRobots = (int) (Math.random() * (15 - 5 + 1) + 5);
        int id = 1;
        for (int i = 0; i < numRobots; i++) {
            roboList.add(new Robot(id, (int) (Math.random() * (100) + 1)));
            id++;
        }
        Collections.sort(roboList);
        System.out.println("Se han generado " + roboList.size() + " ");
    }

    /**
     * @return the roboList
     */
    public ArrayList<Robot> getRoboList() {
        return roboList;
    }

    /**
     * @param roboList the roboList to set
     */
    public void setRoboList(ArrayList<Robot> roboList) {
        this.roboList = roboList;
    }

}
