/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reciclaje.model;

/**
 *
 * @author abc
 **/

 import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nombre;
    private String direccion;
    private long informacionContacto;
    List<Anuncio> anunciosPublicados;

    public Usuario(String nombre, String direccion, long informacionContacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.informacionContacto = informacionContacto;
        this.anunciosPublicados = new ArrayList<>();
    }

    public void registrarUsuario() {
        System.out.println("Usuario registrado: " + nombre);
    }

    public List<Anuncio> buscarAnuncios(String tipoMaterial, String ubicacion) {
        List<Anuncio> resultados = new ArrayList<>();
        for (Anuncio anuncio : anunciosPublicados) {
            if (anuncio.getTipoMaterial().equalsIgnoreCase(tipoMaterial)) {
                resultados.add(anuncio);
            }
        }
        return resultados;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", informacionContacto=" + informacionContacto +
                ", anunciosPublicados=" + anunciosPublicados +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getInformacionContacto() {
        return informacionContacto;
    }

    public List<Anuncio> getAnunciosPublicados() {
        return anunciosPublicados;
    }

    public void setAnunciosPublicados(List<Anuncio> anunciosPublicados) {
        this.anunciosPublicados = anunciosPublicados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setInformacionContacto(long informacionContacto) {
        this.informacionContacto = informacionContacto;
    }

    public void agregarAnuncio(Anuncio anuncio) {
        anunciosPublicados.add(anuncio);
        System.out.println("Anuncio agregado por " + nombre);
    }

}