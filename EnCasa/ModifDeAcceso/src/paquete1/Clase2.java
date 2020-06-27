/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;



public class Clase2 {
    public static void main(String [] args){
        Clase1 objeto1 = new Clase1();
        objeto1.atributo1 = 15; //Como es publico, lo podemos asignar un valor desde la clase 2
        //objeto1.atributo2 = 20; No se puede hacer esto porque atributo2 es privado
        
        //PARA MODIFICAR EL ATRIBUTO2 USAMOS EL ENCAPSULAMIENTO
        objeto1.setAtributo2(20);
        
        //System.out.println("El atributo 2 es : " + atributo2); me marca error porque atributo2 es privado.
        System.out.println("El atributo 2 es: "+ objeto1.GetAtributo2()); //Mandamos a llamar el metodo Getatributo2
        
        
        objeto1.setNombre("David");
        String miNombre = objeto1.getNombre();
        System.out.println("Hola, mi nombre es: "+ miNombre);
        
    }
    
    
}
