/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.practicajunit;

public class Circulo {

    private double radio;

    // Constructor vacío
    public Circulo() {
        this.radio = 0;
    }

    // Constructor con parámetro
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter
    public double getRadio() {
        return radio;
    }

    // Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Calcular área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Calcular perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Mostrar radio
public static String mostrarRadio(Circulo c) {
    return "El radio es: " + c.getRadio();
}

    // Mostrar nombre
    public void mostrarNombre() {
        System.out.println("Circulo con radio: " + radio);
    }

}