/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecovillage;

import java.util.Scanner;
import com.reciclaje.model.Anuncio;
import com.reciclaje.model.Comprador;
import com.reciclaje.model.EstadoAnuncio;
import com.reciclaje.model.Proveedor;
import java.util.InputMismatchException;

/**
 *
 * @author abc
 */
public class EcoVillage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean ejecucionTerminada = false;
        
        String nombreUsuario = "";
        String direccionUsuario = "";
        long informacionContacto = 0;

        while (!ejecucionTerminada) {
        System.out.println("Seleccione una Opción:"
                + " 1 - Proveedor "
                + " 2 - Comprador "
                + " 3 - Salir");
        int op = sc.nextInt();
        System.out.println("Opción seleccionada: " + op);
        sc.nextLine();
        if(op == 3) {
                    ejecucionTerminada = true;
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    break;
        }

        if (op == 1) {
            System.out.println("Proveedor");
            System.out.println("Ingrese el nombre del proveedor:");
            nombreUsuario = sc.nextLine();
            System.out.println("Bienvenido a EcoVillage " + nombreUsuario);

            System.out.println("Ingrese su Dirección:");
            direccionUsuario = sc.nextLine();
            System.out.println("Dirección ingresada: " + direccionUsuario);

            boolean numeroIngresadoCorrectamente = false;
            while (!numeroIngresadoCorrectamente) {
                try {
                    System.out.println("Ingrese su Número de Contacto:");
                    informacionContacto = sc.nextLong();
                    if (informacionContacto >= 0) {
                        sc.nextLine();
                        System.out.println("Número de contacto ingresado: " + informacionContacto);
                        numeroIngresadoCorrectamente = true;
                    } else {
                        System.out.println("Error: Ingrese un número válido. Asegúrese de no ingresar letras o caracteres especiales.");
                        sc.nextLine();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido. Asegúrese de no ingresar letras o caracteres especiales.");
                    sc.nextLine();
                }
            }

            // Crear un proveedor
            Proveedor proveedor = new Proveedor(nombreUsuario, direccionUsuario, informacionContacto);

            System.out.println("Seleccione una Opción:"
                    + " 1 - Crear Anuncio"
                    + " 2 - Promocionar mi Perfil"
                    + " 3 - Salir");
            int op1 = sc.nextInt();
            System.out.println("Opción seleccionada: " + op1);
            switch (op1) {
                case 1:
                    System.out.println("Ingrese el número de anuncios que desea crear:");
                    int numeroDeAnuncios = obtenerEntero(sc);

                    for (int i = 0; i < numeroDeAnuncios; i++) {
                        System.out.println("Creando Anuncio #" + (i + 1));

                        System.out.println("Ingrese el nombre del Artículo:");
                        String tipoMaterial = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Ingrese la cantidad:");
                        int cantidad = obtenerEntero(sc);

                        System.out.println("Ingrese la calidad de la materia prima:");
                        String calidad = sc.nextLine();

                        System.out.println("Ingrese el Precio en Pesos:");
                        double precio = obtenerDouble(sc);

                        // Lógica para crear el anuncio
                        Anuncio anuncio = new Anuncio(tipoMaterial, cantidad, calidad, precio, EstadoAnuncio.DISPONIBLE);
                        // Agregar el anuncio al proveedor
                        proveedor.agregarAnuncio(anuncio);
                    }
                case 2:
                    // Lógica para promocionar el perfil
                    System.out.println("Promocionando perfil...");
                    break;
                default:
                    System.out.println("Opción no válida");
                
                case 3: 
                    ejecucionTerminada = true;
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    break;
            }} else {
                  System.out.println("Comprador");
            System.out.println("Ingrese el nombre del comprador:");
            nombreUsuario = sc.nextLine();
            System.out.println("Bienvenido a EcoVillage " + nombreUsuario);

            System.out.println("Ingrese su Dirección:");
            direccionUsuario = sc.nextLine();
            System.out.println("Dirección ingresada: " + direccionUsuario);

            boolean numeroIngresadoCorrectamente = false;
            while (!numeroIngresadoCorrectamente) {
                try {
                    System.out.println("Ingrese su Número de Contacto:");
                    informacionContacto = sc.nextLong();
                    if (informacionContacto >= 0) {
                        sc.nextLine();
                        System.out.println("Número de contacto ingresado: " + informacionContacto);
                        numeroIngresadoCorrectamente = true;
                    } else {
                        System.out.println("Error: Ingrese un número válido. Asegúrese de no ingresar letras o caracteres especiales.");
                        sc.nextLine();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido. Asegúrese de no ingresar letras o caracteres especiales.");
                    sc.nextLine();
                }
            }
               Comprador comprador = new Comprador(nombreUsuario, direccionUsuario, informacionContacto);
                System.out.println("Anuncios publicados:");
            if (comprador.getAnunciosPublicados().isEmpty()) {
                System.out.println("¡Ups, aún no hay anuncios publicados! Lo siento.");

                // Preguntar al usuario si quiere volver a la página de ingreso o salir
                System.out.println("¿Desea volver a la página de ingreso? (1 - Sí, 2 - Salir)");
                int opcionVolver = obtenerEntero(sc);

                if (opcionVolver == 2) {
                    ejecucionTerminada = true;
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                }
            } else {
                for (Anuncio anuncio : comprador.getAnunciosPublicados()) {
                System.out.println(anuncio);
            }
            }}}

        sc.close();
    }

    private static int obtenerEntero(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                sc.nextLine();  // Limpiar el buffer
            }
        }
    }

    private static double obtenerDouble(Scanner sc) {
        while (true) {
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                sc.nextLine();  // Limpiar el buffer
            }
        }
    }
}