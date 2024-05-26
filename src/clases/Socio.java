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
public class Socio {
    
    
    private String nombre;
    private String dni;
    private String telefono;
    private String correoElectronico;

    public Socio() {
    }

    public Socio(String nombre, String dni, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.dni);
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
        final Socio other = (Socio) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + '}';
    }
    
    
    
    
}
