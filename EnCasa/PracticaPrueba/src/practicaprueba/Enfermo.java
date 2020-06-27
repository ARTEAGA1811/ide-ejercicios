/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaprueba;

/**
 *
 * @author advid arteaga
 */
public class Enfermo {
    
    private String nombre;
    private double peso;
    private double estatura;
    
    public Enfermo(String nombre){
        this.nombre = nombre;
        
    }
    
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "Enfermo{" + "nombre=" + nombre + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
    
    
    
    
}
