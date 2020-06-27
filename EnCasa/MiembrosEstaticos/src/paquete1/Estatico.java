
package paquete1;

//SI SE LE ASIGNA UN STATIC A ALGUN ATRIBUTO DE LA CLASE, EL ATRIBUTO PERTENECE TOTALMENTE
//A LA CLASE, POR ESO SI SE LE CAMBIA EL VALOR DESDE ALGUN OBJETO, LE CAMBIA EL VALOR A TODOS.
//ADEMAS, SI ES ESTATICO, NO ES NECESARIO UN OBJETO PAR MANDAR A PANTALLA.
public class Estatico {
    private static String nombre = "Say, hello";
    
    
    

    
    public static void main(String[] args) {
        
        Estatico obj1 = new Estatico();
        
        
        System.out.println("Hi, my name es: "+ Estatico.nombre );
    }
    
}
