package poo.capitulo1.deber1;

import java.util.Scanner;


public class ejerciciodos {
    public static void main(String[] args){
    //Escriba una aplicacion que calcule los cuadreados y cubos
    //de los numeros del 1 al 10.
    
        Scanner input = new Scanner(System.in);
        System.out.println("\tEJERCICIO DOS\n\nNumero  Cuadrados  Cubos");
        
        int cuadrados, cubos;
        
        for(int i = 1; i<=10; i++){
            cuadrados = i * i;
            cubos = i * i * i;
            System.out.printf("  %d        %d         %d \n", i, cuadrados, cubos);
            System.out.println("-------------------------");           
        }   
    }       
}
        
        
        
        
        
        
    
    
    
    
    
        
    
    
    
    
    
    
    
    

