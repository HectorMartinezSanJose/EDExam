/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hectorproject1;

/**
 *
 * @author Hector
 */
public class Libro {
    private String Nombre;
    private String Editorial;
    private int Año;
    private String Autor;
    private Boolean Disponibilidad;

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Editorial
     */
    public String getEditorial() {
        return Editorial;
    }

    /**
     * @param Editorial the Editorial to set
     */
    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    /**
     * @return the Año
     */
    public int getAño() {
        return Año;
    }

    /**
     * @param Año the Año to set
     */
    public void setAño(int Año) {
        this.Año = Año;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Disponibilidad
     */
    public Boolean getDisponibilidad() {
        return Disponibilidad;
    }

    /**
     * @param Disponibilidad the Disponibilidad to set
     */
    public void setDisponibilidad(Boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
}
