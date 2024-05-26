/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Objects;

/**
 *
 * @author sebas
 */
public class Ejemplar {
    private String codigoEjemplar;
    private String estado;

    public Ejemplar() {
    }

    public Ejemplar(String codigoEjemplar, String estado) {
        this.codigoEjemplar = codigoEjemplar;
        this.estado = estado;
    }

    public String getCodigoEjemplar() {
        return codigoEjemplar;
    }

    public void setCodigoEjemplar(String codigoEjemplar) {
        this.codigoEjemplar = codigoEjemplar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.codigoEjemplar);
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
        final Ejemplar other = (Ejemplar) obj;
        return Objects.equals(this.codigoEjemplar, other.codigoEjemplar);
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "codigoEjemplar=" + codigoEjemplar + ", estado=" + estado + '}';
    }
    
    
}
