/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv;

import java.util.ArrayList;
import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "servicios")
public class servicios {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "potencia")
    public Double potencia(@WebParam(name = "base") double base, @WebParam(name = "exponente") double exponente) {
        //TODO write your implementation code here:
        double reslt = Math.pow(base, exponente);
        return reslt;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "par_impar")
    public String par_impar(@WebParam(name = "numero") int numero) {
        //TODO write your implementation code here:
        String respuesta = "";
        int valor = numero % 2;
        if (valor == 0) {
            respuesta = "Par";
        } else {
            respuesta = "Impar";
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "diccionario")
    public String diccionario(@WebParam(name = "palabra") String palabra) {
        //TODO write your implementation code here:
        String palabares = "";
        try {
            String result = valorResultado(palabra);
            if (result.equals("null")) {
                palabares = "La palabra no esta en el diccionario.";
            } else {
                palabares = result;
            }
        } catch (java.lang.NullPointerException e) {
            palabares =  "No puede ingresar campos vacios";
        }
//        if (palabra == null) {
//            palabares = "No puede ingresar campos vacios";
//        } else {
//            String result = valorResultado(palabra);
//            if (result.equals("null")) {
//                palabares = "La palabra no esta en el diccionario.";
//            } else {
//                palabares = result;
//            }
//        }

        return palabares;
    }

    public String valorResultado(String key) {
        String keyValue = null;
        boolean keyFind = false;
        HashMap<String, String> mapBits = new HashMap<String, String>();
        mapBits.put("Saludo", "Un saludo puede catalogarse como un respeto.");
        mapBits.put("IP", "protocolo de internet.");
        mapBits.put("Tcp", "Protocolo de transferencia comunicación");
        mapBits.put("INTERNET", "Red de redes.");
        mapBits.put("LAN", "Redes de area local.");
        mapBits.put("man", "Redes de area metropolitana.");
        mapBits.put("WAN", "Redes de area extensa.");
        mapBits.put("HARDWARE", "Partes fisicas, tangibles");
        mapBits.put("SOFTWARE", "Son las partes logicas, las partes intangibles.");
        mapBits.put("so", "Sistema operativo");

        for (HashMap.Entry<String, String> each : mapBits.entrySet()) {
            System.out.println("Recorrido del for key -> " + each.getKey());
//                System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());        
            if (each.getKey().equalsIgnoreCase(key.intern())) {
                System.out.println("En el servidor tenemos: " + each.getValue());
                keyValue = each.getValue();
                keyFind = true;
                break;
            }
        }

        if (keyFind == true) {
            System.out.println("Lo que tenemos en el server de value: " + keyValue);
            return key + ": " + keyValue;

        } else {
            return "null";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Double suma(@WebParam(name = "Num1") double num1, @WebParam(name = "Num2") double num2) {
        //TODO write your implementation code here:
        double sumaV = num1 +num2;
        return sumaV;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
    public Double resta(@WebParam(name = "Num1") double num1, @WebParam(name = "Num2") double num2) {
        //TODO write your implementation code here:
        double restaR = num1 - num2;
        return restaR;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicacion")
    public Double multiplicacion(@WebParam(name = "Num1") double num1, @WebParam(name = "Num2") double num2) {
        //TODO write your implementation code here:
        double multiplicacionR = num1 * num2;
        return multiplicacionR;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        if(user.equals("Jonnathan") && password.equals("md3108")){
            return true;
        }else{
            return false;
        }   
    }
}
