
package aprendiendojava;

import java.util.Scanner;


public class OrdenarNumeros {
    public static void main(String[] args){
        //Leer 10 entero ordenados crecientemente. Leer N y buscarlo en la tabla
        //Se debe mostrar la posicion en que se encuentra.
        //Si no esta, indicarlo con un mensaje.
        
        int array[] = new int[10]; //Tamano 10
        int aux;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");
        
        for(int i = 0; i<10; i++){
            System.out.printf("Ingrese el %d` numero: ", (i+1));
            array[i] = input.nextInt();
        }
        
        /*primer metodo
        
        for(int i = 0; i<9; i++){
            for(int z = i+1; z<=9; z++){
                if(array[i] > array[z]){
                    aux = array[i];
                    array[i] = array[z];
                    array[z] = aux;
                    
                }
            }
        }
        */
        
        //SEGUNDO METODO, METODO DE LA BURBUJA, este esta menos complejo
        
        for(int i = 0; i< 10; i++){ //Repetimos este algoritmo varias veces
            for(int z = 0; z<9; z++){ //para ordenar todo
                if(array[z] > array[z+1]){
                    aux = array[z];
                    array[z] = array[z+1];
                    array[z+1] = aux;
                }

            }
        }
        
        
        
        for(int x: array){
            System.out.println(x);
        }
        
        
        
    }
}
    