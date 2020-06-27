
package ecuaciondelarecta;

import java.util.Scanner;


public class EcuacionDeLaRecta {

    
    public static void main(String[] args) {
    
        //ESTE PROGRAMA CREA LE VALOR DE UNA ECUACION DE LA RECTA
        //Y=MX+B
        
        double x1, y1, x2, y2;
        double m, b;
        System.out.println("DEcimales usar la coma.\n");
        System.out.println("Ingrese el primer par ordenado: ");
        Scanner input = new Scanner(System.in);
        System.out.print("X: ");
        x1 = input.nextDouble();
        System.out.print("\nY: ");
        y1 = input.nextDouble();
        
        System.out.println("\nIngrese el segundo par ordenado: ");
        System.out.print("X: ");
        x2 = input.nextDouble();
        System.out.print("\nY: ");
        y2 = input.nextDouble();
        
        m = (y2 - y1)/(x2 - x1);
        b = y1 - (m * x1);
        
        int selec;
        double valor, respuesta;
        
        System.out.println("\nAhora ingrese x --> 1\n y -->2 ");
        System.out.print("Eleccion: ");
        selec = input.nextInt();
        
        if(selec == 1){
            System.out.print("\nX: ");
            valor = input.nextDouble();
            
            respuesta = m * valor + b;
            
            System.out.println("\nSi X: "+ valor +"\nentonces Y: "+respuesta );
            
        }
        if(selec == 2){
            System.out.print("\nY: ");
            valor = input.nextDouble();
            
            respuesta = (valor - b)/m;
            
            System.out.println("\nSi Y: "+ valor +"\nentonces X: "+respuesta );
        }
        
        System.out.println("Otros valores: "+ "\nm: "+ m +"\nb: "+ b );
        
        
        
        
       
        
        
        
    }
    
}
