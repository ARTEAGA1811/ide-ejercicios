/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2ejercicio1;

/**
 *
 * @author Marcela
 */

/*
Un paciente tiene nombre, peso y estatura.
*/
public class Paciente {
    //declaraciÃ³n de variables de instancia
    private String nombre;
    private double peso;
    private double estatura;
    
    
    //Constructores

    public Paciente() {
    }

    public Paciente(String nombre) {
        this.nombre = nombre;
    }
    
    /*mÃ©todos de acceso y modificaciÃ³n (mutaciÃ³n)Â´para las variables de instancia
    GET Y SET*/

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
    
    //sobreescritura del mÃ©todo toString( )

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
    
    
    
    
}
