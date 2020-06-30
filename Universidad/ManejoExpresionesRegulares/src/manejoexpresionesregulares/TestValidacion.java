/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexpresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Marcela
 */
public class TestValidacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    //Primera parte uso del método matches
        String nombre1 = "Lola";
        boolean esValido = nombre1.matches("[A-Z][a-z]");
        String nombre2 = "Pepe";
    
        System.out.println(Validacion.esUnNombre(nombre2));
    
    //Segunda parte uso de Pattern y Matcher    
        Pattern expresion = Pattern.compile("D.*1[0-2]-\\d\\d-90");

        String cadena1 = "Jane 12-12-75\n"
                + "Dave 11-04-90\n"
                + "John 04-28-90\n"
                + "Joe 12-17-77\n"
                + "Diana 10-04-70\n";

        Matcher matcher = expresion.matcher(cadena1);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    
    }

}
