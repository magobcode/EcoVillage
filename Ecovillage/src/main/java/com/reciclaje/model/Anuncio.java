/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reciclaje.model;

/**
 *
 * @author abc
 */

public class Anuncio {
    private String tipoMaterial;
    private int cantidad;
    private String calidad;
    private double precio;
    private EstadoAnuncio estado;
    
    public Anuncio(String tipoMaterial, int cantidad, String calidad, double precio, EstadoAnuncio estado) {
        this.tipoMaterial = tipoMaterial;
        this.cantidad = cantidad;
        this.calidad = calidad;
        this.precio = precio;
        this.estado = estado;
    }
    
    // Otros métodos y getters
    @Override
    public String toString() {
        return "Anuncio{" + "tipoMaterial=" + tipoMaterial + ", cantidad=" + cantidad + ", calidad=" + calidad +  ", precio=" + precio + ", estado=" + estado + '}';
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoAnuncio getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnuncio estado) {
        this.estado = estado;
    }    
}

