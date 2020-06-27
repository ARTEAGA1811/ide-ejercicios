/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo1.ej1;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class IngresoDespliegueDato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valorInicial = 28.37845;
        int edad = 24;
        float valorFinal = 140.845f; //Hay que poner la f al final
        char inicial = 'a';
        String nombres;
        int curso;
        /*
        System.out.print("Valor Inicial " + valorInicial + "\n");
        System.out.print(edad + "\n");
        System.out.println(valorFinal);
        System.out.println("inicial: " + inicial);
        */
        //elemento para inprimir como un formato
        System.out.printf("Valor Inicial %.3f y valor final %.2e", valorInicial, valorFinal );
        System.out.printf("\n %C \n", inicial);
        
        /////////
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese la edad ");
        edad = input.nextInt();
        input.nextLine();
        System.out.println("Edad "+ edad);
        System.out.println("INgrese un nombre ");
        nombres = input.nextLine();
        System.out.println("Nombres "+ nombres);
        System.out.println("Ingrese el valor inicial");
        valorInicial = input.nextDouble();
        System.out.println("valor Inicial "+ valorInicial);
        
        System.out.println("Ingrese un num again: ");
        
        curso = input.nextInt();
        System.out.println("El num que elegiste OTRA VEZ ES: " + curso);
        
        
        
    }

}
