
package poo.capitulo1.practica1;

import java.util.Scanner;


public class TestFraccion {
    
    
    public static void main(String [] args){
        
        int eleccion, numerador, denominador;
        int eleccion2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("\tPRACTICA #1\n");
        
        
        do{
            System.out.println("----------------\nElige una opcion por favor: ");
            System.out.println("Fraccion 9/12 ---> 1.\nCon ingreso de numerador"
                    + " y el denominador cinco ---> 2.\nCon ingreso de numerador"
                    + " y denominador. ---> 3.");
            System.out.print("\nTu opcion: ");
            eleccion = input.nextInt();

            //Creamos el objeto op de la clase Fraccion
            Fraccion op = new Fraccion();



            switch(eleccion){
                case 1:
                    System.out.println(op.toString());
                    break;

                case 2:
                    System.out.print("Ingresa el numerador: ");
                    numerador = input.nextInt();
                    op = new Fraccion(numerador);
                    op.simplificar();
                    System.out.println(op.toString());
                    break;

                case 3:
                    System.out.print("Ingresa el numerador: ");
                    numerador = input.nextInt();
                    System.out.print("Ingresa el denominador: ");
                    denominador = input.nextInt();

                    op = new Fraccion(numerador, denominador);
                    op.simplificar();
                    System.out.println(op.toString());
                    break;
           
                default:
                    System.out.println("Has elegido una opcion no valida");
                    break;
                           

            }
            
            System.out.println("\nQuieres realizar otra operacion??:\nSI ---> 1.\nSALIR ---> Presiona cualquier otro numero");
            eleccion2 = input.nextInt();
           
            
        }while( eleccion2 == 1);
         
        
    }
 
    
}
