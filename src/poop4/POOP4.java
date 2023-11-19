/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto = new Punto();
        punto.imprimirPunto();
        Punto punto2= new Punto(3,5);
        punto2.imprimirPunto();
        System.out.println(punto); //imprimio una referencia
        Perro perro = new Perro("Max", "Chihuahua", "negro", 2);
        System.out.println(perro);
        Coche coche = new Coche("Mazda", "mazda", "rojo", "estandar", "diesel");
        System.out.println(coche);
        Profesor profesor = new Profesor ("itzelhdz@gmail.com","Vectorial", "Ing en Computacion", 21, 554856513);
        System.out.println(profesor);
        
        profesor.calificar();
        profesor.reprobar(6);
        profesor.hablar();
        
    }
    
}
