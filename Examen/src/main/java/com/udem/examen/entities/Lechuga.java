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
public class Lechuga extends Plantas{
    private String nombre;
    private String Color;
    private int edad;

    public Lechuga(String nombre, String Color, int edad) {
        this.nombre = nombre;
        this.Color = Color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "<Plantas>" + "<Lechuga>" + nombre + "</Lechuga> <Color>" + Color + "</Color> <edad>" + edad + "</edad>"+'}';
    }

    

    
    
}
