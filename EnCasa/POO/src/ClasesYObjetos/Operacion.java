package ClasesYObjetos;

import java.util.Scanner;


public class Operacion {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodo para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        numero1 = input.nextInt();
        System.out.print("Digite un numero: ");
        numero2 = input.nextInt();       
    }
    
    public void sumar(){ //Metodo para sumar
        suma  = numero1+numero2;
    }
    
    public void restar(){ //Metodo para sumar
        resta  = numero1-numero2;
    }
    
    public void multiplicar(){ //Metodo para sumar
        multiplicacion  = numero1*numero2;
    }
    
    public void dividir(){ //Metodo para sumar
        division  = numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        System.out.println("La division es: "+ division);
    }

       
}
