/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author sebas
 */
public class Libro {
    private String titulo;
    private String ISBN;
    private String editorial;
    private int anioPublicacion;
    private List<Autor> sutores;
    private List<Ejemplar> ejemplares;

    public Libro() {
    }

    public Libro(String titulo, String ISBN, String editorial, int anioPublicacion, List<Autor> sutores, List<Ejemplar> ejemplares) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.sutores = sutores;
        this.ejemplares = ejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public List<Autor> getSutores() {
        return sutores;
    }

    public void setSutores(List<Autor> sutores) {
        this.sutores = sutores;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.ISBN, other.ISBN);
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", editorial=" + editorial + ", anioPublicacion=" + anioPublicacion + ", sutores=" + sutores + ", ejemplares=" + ejemplares + '}';
    }
    
    
}
