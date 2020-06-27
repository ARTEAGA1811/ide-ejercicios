package variablesporreferencia;



public class Main {

    
    public static void main(String[] args) {
        
        Fraccion fraccion1;  //Decalracion de la variable
        fraccion1 = new Fraccion(1,2); //Crea una instancia
        
        System.out.print(fraccion1.getDenominador());
        
        Fraccion fraccion2 = new Fraccion(3,4);
        System.out.print(fraccion2.getDenominador());
        
        ////////////
        fraccion1 = fraccion2;
        System.out.print(fraccion1.getDenominador());
        
        System.out.println(fraccion2.getDenominador());
        ///////////
        
        fraccion1.setDenominador(9);
        
        System.out.print(fraccion1.getDenominador());
        
        System.out.println(fraccion2.getDenominador());
        
        
    }
    
}
 