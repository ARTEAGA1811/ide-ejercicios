package metodoconstructor;


public class Persona {
    
    //Atributos
    String nombre;
    int edad;
    String cedula;
    
    //Metodos de esta clase
    //Los metodos constructores se ponen de manera publica, 
    //los metodos constructores no se pone el tipo de valor de retorno
    //Deben tener el mismo nombre que la clase
    
    //Metodos
    //Metodo constructor

    //Sobrecarga de metodos, tinen el mismo nombre pero varian sus parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String cedula) {
        this.cedula = cedula;
    }
    
    //Sobrecarga de metodos, no pueden tener la el mismo tipo de dato en el parametro
    public void correr(){
        System.out.printf("\nSoy %s, tengo %d anios y estoy corriendo"
                + " una maraton.\n" , nombre, edad );
                
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+ " kilometros" );
    }
    
     
    
    
}

    

