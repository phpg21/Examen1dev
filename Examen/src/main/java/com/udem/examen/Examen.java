/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.udem.examen;

import com.udem.examen.entities.Lechuga;
import com.udem.examen.interfaces.Reino;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author b12s309
 */
public class Examen {

    public static void main(String[] args) {
        List<Reino>lista= new ArrayList<>();
        lista.add(new Lechuga("Lechuga crespa","verde",1));
        lista.add(new Lechuga("Lechuga francesa","verde",1));
        
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).toString());
            
        }
    }
}
