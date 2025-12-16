/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebagit;

/**
 *
 * @author ALEJANDRA MENSAQUE
 */
public class NewClass {
     private String nombre;
    private int edad;
    
    public NewClass(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método 1: mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método 2: comprobar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
    
    
    
    

