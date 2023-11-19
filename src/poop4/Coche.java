/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class Coche {
    String marca, modelo, color, motor, combustible;
    /**
     * Constructor vacio
     */
    public Coche() {
    }
    /**
     * Constructor lleno
     * @param marca del coche
     * @param modelo del auto
     * @param color del coche
     * @param motor del coche
     * @param combustible que usa el auto
     */
    public Coche(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    /**
     * Metodo que indica que el coche avanzo
     */
    public void avanzar (){
        System.out.println("El coche avanzó");
    }
    /**
     * Metodo que indica que el coche retrocedio
     */
    public void retroceder (){
        System.out.println("El coche retrocedió");
    }
    /**
     * Metodo que indica que el auto se prendio
     */
    public void prender(){
        System.out.println("Prendido");
    }
    /**
     * Metodo que indica que el auto se apago
     */
    public void apagar(){
        System.out.println("Apagado");
    }
    /**
     * Metodo que indica que el auto giro
     * @param lado que da la vuelta
     */
    public void girar(String lado){
        System.out.println("El coche gira a la "+ lado);
    }
    /**
     * Metodo override
     * @return todos los atributos
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", combustible=" + combustible + '}';
    }
    
    
}
