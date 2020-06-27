/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber3;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        String nombre, apellido, cedula;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\tDEBER #3");
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = input.nextLine();
        System.out.print("Ingrese su Nro. del cedula: ");
        cedula = input.nextLine();
        
        
        DatosPersona persona1 = new DatosPersona(nombre, apellido, cedula);
        
        
        //VERIFICAR QUE EL NOMBRE SEA PALINDROMO.
        if(persona1.esPalindromo()){
            System.out.println("\nEl nombre " + persona1.getNombre() + " SI es palindromo\n");
        }else{
            System.out.println("\nEl nombre " + persona1.getNombre() + " NO es palindromo\n");
        }
        
        //VERIFICAR QUE LA CEDULA SEA VALIDA, EN CASO DE QUE NO SEA VALIDA SE ASIGNA UNA VALOR POR DEFAULT
        
        
        
        boolean esValidoUno = persona1.esCedulaValida();
        boolean esValidoDos = persona1.esCedulaValida();
        System.out.println("Nro. de CI ingresado: "+ persona1.getCedula());
        System.out.println("Cedula Valida: "+ esValidoUno);
        
        
        while(esValidoUno == false){
            persona1.setCedula(persona1.generarNumeroDeCedula());
            esValidoUno = persona1.esCedulaValida();
     
        }
        
        if(esValidoDos == false){
            System.out.println("Nuevo Nro. de CI por default: "+ persona1.getCedula());
        }
        //En este punto ya tenemos una CI valida, ahora vamos a analizar
        //si pertenece a una provincia o no.
        persona1.definirProvinciaNatal();
        
        if(persona1.getProvinciaNatal().equalsIgnoreCase("PENDIENTE")){
            System.out.println("\nTu CI empieza con ("+persona1.getCedula().substring(0,2)+ ") asi que no corresponde a ninguna provincia. "
            + "\nProvincia: "+ persona1.getProvinciaNatal());
                    
        }else{
        System.out.println("\nTu CI empieza con ("+persona1.getCedula().substring(0,2)+") por lo tanto:\nProvincia: "+persona1.getProvinciaNatal());
        }

        
                
    }
    
}
