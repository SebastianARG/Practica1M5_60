/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;

/**
 *
 * @author sebas
 */
public class Catalogo {
    private List<Ejemplar> ejemplares;

    public Catalogo() {
    }

    public Catalogo(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "ejemplares=" + ejemplares + '}';
    }
    
    
}
