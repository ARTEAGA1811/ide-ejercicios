
package poo.capitulo1.deber1;

import java.util.Scanner;


public class ejerciciouno {

    public static void main(String[] args) {
        /*
        Escriba una aplicación que reciba del usuario un número compuesto
        por cinco dígitos, que separe ese número en sus dígitos individuales
        y los imprima, cada uno separado de los demás por tres espacios. 
        Por ejemplo, si el usuario escribe el número 72539, el programa
        debe imprimir

        */
        
        Scanner input = new Scanner(System.in);
        int numero, numDeDigitos;
        String cambioDeTipo;
        System.out.println("\tEJERCICIO UNO\n");
        
        
        do{ //Hago este bucle en caso que el numero que se ingrese no sea de 5 digitos
            System.out.println("\nA continuacion ingrese un numero compuesto por 5 digitos: ");

            numero = input.nextInt();

            cambioDeTipo = Integer.toString(numero); //Cambiamos el numero a un String
            numDeDigitos = cambioDeTipo.length(); //Tamano del String, deberia salir 5 .
            
            if(numDeDigitos != 5){
                System.out.println("Has elegido un numero diferente de 5 digitos!!!\n");
            }

            
        }while(numDeDigitos != 5);
        
        //Imprimimos
        System.out.println("\nAqui tienes: ");
        
        for(int i = 0; i<5; i++){
           System.out.print(cambioDeTipo.charAt(i) + "   "); 
        
        }
        System.out.println("\n");
        
        
        
        
        
        
    }
    
}
