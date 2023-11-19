/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author itzel
 */
public class Profesor {
    String correo, asignatura, titulo;
    int edad, telefono;
    /**
     * Constructor vacio
     */
    public Profesor() {
    }
    /**
     * Constructor lleno
     * @param correo 
     * @param asignatura
     * @param titulo
     * @param edad
     * @param telefono 
     */
    public Profesor(String correo, String asignatura, String titulo, int edad, int telefono) {
        this.correo = correo;
        this.asignatura = asignatura;
        this.titulo = titulo;
        this.edad = edad;
        this.telefono = telefono;
    }
    /**
     * Metodo que indica la materia que se enseño 
     * @param materia 
     */
    public void enseñar(String materia){
        System.out.println("Hoy enseñé "+ materia);
    }
    /**
     * Método que indica que leyó un libro
     */
    public void leer(){
        System.out.println("Leí un libro nuevo");
    }
    /**
     * Metodo que indica que los alumnos hablaron mucho
     */
    public void hablar(){
        System.out.println("No hablaron mucho mis alumnos");
    }
    /**
     * Metdodo que indica la cantidad de alumnos reprobados
     * @param reprobados 
     */
    public void reprobar (int reprobados){
        System.out.println("Este semestre reprobaron "+ reprobados + " alumnos");
    }
    /**
     * Metodo que indica que el profesor calificó muchos examenes
     */
    public void calificar (){
        System.out.println("Califiqué muchos exámenes");
    }
    /**
     * Método override
     * @return correo, asignatura, titulo, edad, telefono
     */
    @Override
    public String toString() {
        return "Profesor{" + "correo=" + correo + ", asignatura=" + asignatura + ", titulo=" + titulo + ", edad=" + edad + ", telefono=" + telefono + '}';
    }
    
    
}
