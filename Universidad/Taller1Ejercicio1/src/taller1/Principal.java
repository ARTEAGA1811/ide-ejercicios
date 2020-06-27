
package taller1;

import java.util.Scanner;

public class Principal {
    
    public static void main(String [] args){
        
        double longitud, anchura;
        int opcion;
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("\t\nEJERCICIO DEL RECTANGULO\n");
        System.out.println("Para crear un rectangulo con valores aleatorios --> 1."+
        "\nPara ingresar longitud y anchura --> 2. ");
        
        
        System.out.print("Seleccione: "); 
        opcion = input.nextInt();
       
        //CREAMOS UN OBJETO 
        Rectangulo mirectangulo = new Rectangulo();
        
        
        switch(opcion){
            case 1:
                mirectangulo = new Rectangulo();
                
                System.out.println("\nTu rectangulo es: ");
                System.out.println(mirectangulo.toString());
                
                if(mirectangulo.verificarCuadrado() == true){
                    System.out.println("\nAdemas el rectangulo es en realidad un cuadrado");
                }else{
                    System.out.println("\nEste rectangulo NO es un cuadrado");
                }
                break;
            case 2:
                System.out.print("\nIngrese la longitud: ");
                longitud = input.nextDouble();
                System.out.print("\nIngrese la anchura: ");
                anchura = input.nextDouble();
                
              
                //CONDICIONAL >0
                if(longitud <= 0 || anchura <= 0){
                    System.out.println("Numero no valido\nHas ingresado un numero menor o igual  a 0.");
                    
                }else{
                     mirectangulo = new Rectangulo(longitud, anchura);
                    System.out.println("\nTu rectangulo es: ");
                    System.out.println(mirectangulo.toString());
                    
                    if(mirectangulo.verificarCuadrado() == true){
                    System.out.println("\nAdemas el rectangulo es en realidad un cuadrado");
                    }else{
                    System.out.println("\nEste rectangulo NO es un cuadrado");
                    }
                }
                break;
                
            default:
                System.out.println("Has elegido una opcion no valida");
                break;
   
        }
        */
        
        
        //MODIFICACION
        System.out.println("Ingrese los datos del primer rectangulo: ");
        System.out.print("\nIngrese la longitud: ");
        longitud = input.nextDouble();
        System.out.print("\nIngrese la anchura: ");
        anchura = input.nextDouble();
        
        Rectangulo recUno = new Rectangulo(longitud, anchura);
        
        System.out.println("\n\nIngrese los datos del segundo rectangulo: ");
        System.out.print("\nIngrese la longitud: ");
        longitud = input.nextDouble();
        System.out.print("\nIngrese la anchura: ");
        anchura = input.nextDouble();
        
        Rectangulo recDos = new Rectangulo(longitud, anchura);
        
        boolean esAreaIgual;
        esAreaIgual = recUno.equals(recDos);
        
        if(esAreaIgual){
            System.out.println("\n\tLos rectangulos tienen la misma area!!");
        }else{
            System.out.println("\n\tLos rectangulos NO tienen la misma area");
        }
        
        
        
        
        
        
        
       
        
    }
    
}
