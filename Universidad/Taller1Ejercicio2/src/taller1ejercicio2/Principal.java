
package taller1ejercicio2;

import java.util.HashSet;
import java.util.Scanner;

public class Principal {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        double saldoInicial, monto;
        int eleccion;
        
        System.out.println("\n\tEJERCICIO 2\n");
        System.out.print("Por favor ingrese el saldo inicial: ");
        saldoInicial = input.nextDouble();
        
        if(saldoInicial <= 0){
            saldoInicial = 0;
        }
        
        Cuenta obj1 = new Cuenta(saldoInicial);
        
       
        do{
            System.out.println("\nDesea abonar en su cuenta?");
            System.out.println("Si --> 1.\nNo --> Presione otro numero.");
            System.out.print("Selecciona: "); 
            eleccion = input.nextInt();
     
        
            if(eleccion == 1){
                System.out.print("Cantidad a abonar: ");
                monto = input.nextDouble();
                    if(monto <= 0){
                        monto = 0;
                    }

                obj1.abonar(monto);
                System.out.println("Tu balance total es: " + obj1.obtenerSaldo());
            }
        }while(eleccion == 1);
        
        System.out.println("Tu balance total es: " + obj1.obtenerSaldo());
        
        //MANDAR EL SALDO DE OTRA CUENTA A MI CUENTA 1
        Cuenta obj2 = new Cuenta(100);
        
        System.out.print("\nDesea agregar el dinero de su segunda cuenta a su cuenta principal?"
        +"\nDinero en su segunda cuenta: $100. "+"\n\nSI --> 1.\nNO --> Cualquier otro numero. \nSeleccione:  ");
        eleccion = input.nextInt();
        
        if(eleccion == 1){
            obj1.fusionarCuenta(obj2);
            obj2.setEsCuentaInactiva(true);
            obj2.quitarTodoElDinero();
                   
            
        }
        
        System.out.println("\nCuenta Principal: \n"+ obj1.toString());
        System.out.println("\nSegunda Cuenta: \n"+ obj2.toString());
        
            

        
        
    }
    
}
