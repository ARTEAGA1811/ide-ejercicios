/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexpresionesregulares;

/**
 *
 * @author Equipo
 */
public class Validacion {
    //el "static" hace que el metodo sea de la clase, y no de un objeto.
    //no necesito un objeto para llamarla.
    
    public static boolean esUnNombre(String nombreParaValidar){
        return nombreParaValidar.matches("[A-Z][a-z]+");
    }
    
    
}
