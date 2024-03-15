/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sismu.Modelo;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private int idCancion;
    private String titulo; 
    private double duracion;
    private String genero;
    private int annoLanzamiento;  

    public Cancion(int idCancion, String titulo, double duracion, String genero, int annoLanzamiento) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.annoLanzamiento = annoLanzamiento;
    }

    public Cancion() {
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnnoLanzamiento() {
        return annoLanzamiento;
    }

    public void setAnnoLanzamiento(int annoLanzamiento) {
        this.annoLanzamiento = annoLanzamiento;
    }
    
}
