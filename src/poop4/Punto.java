/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class Punto {
    int x,y;
    /**
     * Constructor vacio
     */
    public Punto() { //sobrecarga: dos metodos de mismo nombre pero dif parametros
    }
    /**
     * Constructor lleno
     * @param x
     * @param y 
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Método que imprime los valores de Punto
     */
    public void imprimirPunto(){
        System.out.println("x=" + x+ ", y="+y);
    }
    /**
     * Metodo override
     * @return los atributos declarados 
     */
    @Override //anotacion para programar (sobreescritura)
    public String toString() { //hace que se convierta la referencia en string
        return "Punto{" + "x=" + x + ", y=" + y + '}'; //nombre de la clase
    }
    
    
}
