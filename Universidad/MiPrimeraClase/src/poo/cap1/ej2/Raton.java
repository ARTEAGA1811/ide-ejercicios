package poo.cap1.ej2;

import java.util.Objects;

public class Raton {

    private int edad;
    private double peso;
    private double tasaCrecimientoPorcentual;
    private int dias;
    private String nombre;
    
    
   
    //Crear un constructor para la clase Taton , que reciba el peso
    //del raton y la tasa de crecimiento porcentual
    public Raton(int edad, double tasaCrecimientoPorcentual){
        this.edad = edad;
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
        
    }
    
    public Raton(String nombre, double tasaCrecimientoPorcentual, double peso){
        this.nombre = nombre;
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
        this.peso = peso;
        this.edad = 0;
        
    }
    //El ocntructor tiene que ser publico
    public Raton(){
        this.peso = 2;
        this.tasaCrecimientoPorcentual = 2;
        this.edad = 5;
           
    }
    
   
        
    
    

    public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual) {
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
        //this. es una variable de referencia que usamos cuando hablamos del ...
        //forma en la que le indicamos que estamos trabajando con la variable actual.

    }

    public void crecer() {
        System.out.println("crecer sin argumentos/vacio");
        this.peso += (this.peso * this.tasaCrecimientoPorcentual / 100);
        this.edad++;
    }
    
    public void crecer(int dias){
        //sout("crecer con n dias)
        for(int i = 0; i<dias; i++){
            this.peso += this.peso * this.tasaCrecimientoPorcentual * 0.01;
        }
        this.edad += dias; 
    }
    
    public void desplegar() {
        System.out.printf("Edad %d peso %.2f\n", this.edad, this.peso);
     
    }
    
    
    
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    
    
    public boolean esAdolescente(){
        return this.edad <= 100;
    }

    @Override
    public String toString() {
        return "Raton{" + "edad=" + edad + ", peso=" + peso + ", tasaCrecimientoPorcentual=" + tasaCrecimientoPorcentual + ", dias=" + dias + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
    
    
    
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public boolean equals(Raton otroRaton){
        return this.edad == otroRaton.edad && this.peso == otroRaton.peso && this.nombre.equals(otroRaton.nombre);
        //NO SE PUEDE COMPARA CADENAS DE TEXTO CON == SINO TOCA USAR EL EQUALS QUE YA ESTA PREDERTERMINADO
        //EN LA CLASE OBJECT.
        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Raton other = (Raton) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
   
    
    
    
    

    
    
    
    
}

    

    
 
    
    
    
    


