/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class Prestamo {
    
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Socio socio;
    private Ejemplar ejemplar;

    public Prestamo() {
    }

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Socio socio, Ejemplar ejemplar) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.socio = socio;
        this.ejemplar = ejemplar;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", socio=" + socio + ", ejemplar=" + ejemplar + '}';
    }
    
    
    
}
