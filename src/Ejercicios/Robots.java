/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Pedro Sánchez Álvarez (sanchezalvarezjp@gmail.com)
 */
public class Robots {
    private ArrayList<Robot> roboList = new ArrayList<>();
    
    /**
     * Inserta un nuevo robot en la lista y la reordena a continuación.
     * @param r el robot a insertar
     */
    public void insertRobot(Robot r){
        getRoboList().add(r);
        Collections.sort(getRoboList());
    }
    
    public ArrayList<Robot> showMedioVivos(){
        ArrayList <Robot> listaMedioVivos = new ArrayList<>();
        for(int i=0; i<getRoboList().size(); i++){
            if(getRoboList().get(i).getVida() > 50)
                listaMedioVivos.add(getRoboList().get(i));
        }
        return listaMedioVivos;
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
