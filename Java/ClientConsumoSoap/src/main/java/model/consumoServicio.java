/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import sv.Servicios;
import sv.Servicios_Service;

/**
 *
 * @author DELL
 */
public class consumoServicio {

    public static void main(String[] args) {
        Servicios_Service servicio = new Servicios_Service();
        Servicios cliente = servicio.getServiciosPort();
        System.out.println("Resultado 1: " + cliente.hello("Jonnathgan"));
        System.out.println("Resultado 2: " + cliente.diccionario("lan"));
        System.out.println("Resultado 3: " + cliente.parImpar(3));
        System.out.println("Resultado 4: " + cliente.potencia(2, 3));
        System.out.println("Resultado 5 SUMA: " + cliente.suma(20, 50));
        System.out.println("Resultado 6 RESTA: " + cliente.resta(50, 30));
        System.out.println("Resultado 7 MULTIPLICACIÓN: " + cliente.multiplicacion(20, 50));

        if (cliente.login("Jonnathan", "md3108")) {
            System.out.println("Login succesful");
        } else {
            System.out.println("User error");
        }

    }
}
