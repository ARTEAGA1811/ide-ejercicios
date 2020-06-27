
package poo.prueba1;

import java.util.Scanner;
//Autor David Arteaga

public class Main {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        int coeficienteA;
        int coeficienteB;
        int coeficienteC;
        double discriminante;
        
        System.out.println("\tPRUEBA 1\n");
        System.out.println("Por favor ingrese los coeficientes de la ecuacion de segundo grado:");
        
        
        System.out.print("\nIngrese el coeficiente A: ");
        coeficienteA = input.nextInt();
        System.out.print("\nIngrese el coeficiente B: ");
        coeficienteB = input.nextInt();
        System.out.print("\nIngrese el coeficiente C: ");
        coeficienteC = input.nextInt();
        
        
        
        
        if(coeficienteA != 0){ //VERIFICAMOS QUE EL COEF A NO SEA 0
             //INICIALIZAMOS EL OBJETO
            EcuacionSegundoGrado ec = new EcuacionSegundoGrado(coeficienteA, coeficienteB, coeficienteC);
            //CALCULAMOS EL DISCRIMINANTB
            discriminante = ((coeficienteB * coeficienteB) - 4* coeficienteA * coeficienteC);
            ec.setDiscriminante(discriminante); //MANDAMOS EL DISCRIMINANTE A LA OTRA CLASE
        
 
        
            System.out.println(ec.toString()); //IMPRIMIMOS EL TOSTRING
            System.out.println("\nTipo de solucion:\n"+ ec.analizarTipodeSolucion());//IMPRIMIMOS EL TIPO DE SOLUCION
            ec.calcularSolucionesEcuacion(); //IMPRIMIMOS LAS SOLUCIONES DE LA ECUACION.
        }else{
            System.out.println("\nEsta NO es una ecuacion de segundo Grado."); //EN CASO QUE "COEFICIENTEA" SEA 0
        }
        
     
        
        
    }
    
}
