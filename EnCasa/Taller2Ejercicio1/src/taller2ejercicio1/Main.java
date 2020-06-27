/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2ejercicio1;



/**
 *
 * @author Equipo
 */
public class Main {
    
    public static void main(String [] args){
        
        System.out.println("EJERCICIO");
        Medico medDavid = new Medico("David", 016);
        Paciente carlos = new Paciente("Carlos");
        
        medDavid.registrarDatosPaciente(carlos, 1.34 , 1.90);
        
        medDavid.calcularIndiceMasaCorporal(carlos);
        
        
        System.out.println(carlos.toString());
        System.out.println(medDavid.diagnosticarPaciente(carlos));
        
    }
    
}
