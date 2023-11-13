/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reciclaje.model;

/**
 *
 * @author abc
 */
public class Comprador extends Usuario {
    public Comprador(String nombre, String direccion, long informacionContacto) {
        super(nombre, direccion, informacionContacto);
    }

    public void publicarAnuncio(Anuncio anuncio) {
        anunciosPublicados.add(anuncio);
        System.out.println("Anuncio publicado por " + getNombre());
    }
}