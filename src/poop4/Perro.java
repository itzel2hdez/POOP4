/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author itzel
 */
public class Perro {
    String nombre, raza, color;
    int edad;
    /**
     * Constructor vacio
     */
    public Perro() {
    }
    /**
     * Constructor lleno
     * @param nombre 
     * @param raza
     * @param color
     * @param edad 
     */
    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    /**
     * Metodo que indica que el perro se sentó
     */
    public void sentado(){
        System.out.println("Estoy sentado");
    }
    /**
     * Metodo que indica que el perro ladra
     * @param veces del ladrido
     */
    public void ladra(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Woof");
        }
    }
    /**
     * Metodo que indica que el perro corre
     * @param distancia en metros
     */
    public void corre (int distancia){
        System.out.println("Corrí" + distancia+ "m");
    }
    /**
     * Metodo que indica las horas que duerme el perro
     * @param horas en horas
     */
    public void duerme (int horas){
        System.out.println("Dormí"+ horas+ "horas");
    }
    /**
     * Metodo override
     * @return nombre, raza, color, edad
     */
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
}
