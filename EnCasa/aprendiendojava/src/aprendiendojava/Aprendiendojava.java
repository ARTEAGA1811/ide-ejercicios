/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendojava;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Aprendiendojava {

    public static void main(String[] args) {
        
        //Construir un porgrama que, dado un numero total de horas, devuelve el
        //numero de semanas, dias y horas equivalentes. 
        Scanner input = new Scanner(System.in);
        int horasTotal, semanas, dias, horas;
        semanas = 0;
        dias = 0;
        horas = 0;
        System.out.println("Ingrese el numero total de horas: ");
        horasTotal = input.nextInt();
        
        while (horasTotal >= 168) {
            semanas += 1;
            horasTotal -= 168;
            
        }
        while(horasTotal >= 24){
            dias += 1;
            horasTotal -= 24;
        }
        
        horas = horasTotal;
        
        System.out.println("El resultado es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias" + dias);
        System.out.println("Horas" + horas);
        
        
        
        
        
        
        
    }
    
}
