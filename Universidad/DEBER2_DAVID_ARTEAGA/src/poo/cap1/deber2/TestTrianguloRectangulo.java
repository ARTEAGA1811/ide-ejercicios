
package poo.cap1.deber2;

import java.util.Scanner;


public class TestTrianguloRectangulo {
    public static void main(String [] args){
        
        //Variables locales
        double catetouno;
        double catetodos;
        
        
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo();
        
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tDEBER 2\n");
        System.out.print("Ingrese el primer cateto: ");
        catetouno = input.nextDouble();
        System.out.print("Ingrese el segundo cateto: ");
        catetodos = input.nextDouble();
        
        //Mandamos los valores a la clase TrianguloRectangulo 
        trianguloRectangulo.setCateto1(catetouno);
        trianguloRectangulo.setCateto2(catetodos);
        
        //y ejecutamos las operaciones
        trianguloRectangulo.calcularHipotenusa();
        trianguloRectangulo.calcularPerimetro();
        trianguloRectangulo.calcularArea();

        //LLAMAMOS A EL METODO TOSTRING E IMPRIMIMOS 
        System.out.println(trianguloRectangulo.toString());
     
    }
    
}
