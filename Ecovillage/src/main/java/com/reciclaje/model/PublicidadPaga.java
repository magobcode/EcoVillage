/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reciclaje.model;

/**
 *
 * @author abc
 */
public class PublicidadPaga {
    private Anuncio anuncioRelacionado;
    private int duracionPublicidad;
    private double costo;

    @Override
    public String toString() {
        return "PublicidadPaga{" + "anuncioRelacionado=" + anuncioRelacionado + ", duracionPublicidad=" + duracionPublicidad + ", costo=" + costo + '}';
    }
    
    public Anuncio getAnuncioRelacionado() {
        return anuncioRelacionado;
    }

    public void setAnuncioRelacionado(Anuncio anuncioRelacionado) {
        this.anuncioRelacionado = anuncioRelacionado;
    }

    public int getDuracionPublicidad() {
        return duracionPublicidad;
    }

    public void setDuracionPublicidad(int duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
   
}