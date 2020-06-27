/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaprueba;

/**
 *
 * @author Equipo
 */
public class Main {

    
    public static void main(String[] args) {
        
        Doctor docDavid = new Doctor("David", 002);
        Enfermo carlos = new Enfermo("Carlos");
        
        docDavid.registrarDatos(carlos, 3, 2);
       
        System.out.println(docDavid.toString());
        System.out.println(carlos.toString());
        
        System.out.println(docDavid.diagnosticarEnfermo(carlos));
        
        
        
        
        
    }
    
}
