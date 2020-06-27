package poo.capitulo1.deber1;

import java.util.Scanner;


public class ejerciciotres {
    public static void main(String [] args){
    
    //Escriba un programa que reciba cinco numeros enteros,
    //y que determine e imprima la cantidad de numeros negativos,
    //positivos y la cantidaad de ceros recibidos.
        
        System.out.println("\tEJERCICIO TRES\n");
        Scanner input = new Scanner(System.in);
        float arrayNum[] = new float[5];
        int contPositivo = 0;
        int contNegativo = 0;
        int contCero = 0;
        
        System.out.println("A continuacion introduzca 5 numeros:");
        for(int i = 0; i<arrayNum.length; i++){
            System.out.print((i+1)+". Numero: ");
            arrayNum[i] = input.nextFloat();
        }
        
        for(int i = 0; i<arrayNum.length; i++){
            if(arrayNum[i] > 0){
                contPositivo += 1;
            }
            if(arrayNum[i] == 0){
                contCero += 1;
            }
            if(arrayNum[i] < 0){
                contNegativo += 1;
            }  
        }      
        System.out.printf("\nNumeros Positivos: %d \nNumeros Negativos: %d \nCeros: %d \n",
                contPositivo, contNegativo, contCero);    
    }    
}
