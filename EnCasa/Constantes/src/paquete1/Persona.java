
package paquete1;

public class Persona {
    private final String nombre;
    private int edad;
    

    public Persona(String nombre,int edad ) {
        this.nombre = nombre;
        this.edad = edad;
        
    }
    public void cambiarEdad(int edad){
        this.edad = edad;
    }
    
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+ nombre);
        System.out.println("La edad es: "+ edad);
    }
    
    
    
}
