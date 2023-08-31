/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udem.examen.entities;

import com.udem.examen.abstracts.Plantas;

/**
 *
 * @author b12s309
 */
public class Zanahoria extends Plantas{
    private String name;
    private String color;
    private int edad;

    public Zanahoria(String name, String color, int edad) {
        this.name = name;
        this.color = color;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        
        return "<Zanahoria{" + "name=" + name + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
    
}
