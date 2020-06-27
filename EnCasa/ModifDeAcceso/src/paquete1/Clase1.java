//MODIFICADORES DE ACCESO
//ENCAPSULAMIENTO
package paquete1;


public class Clase1 {
    public int atributo1; //Lo pongo publico para que no me restrinja si lo 
                        //quiero usar en otros paquetes o otras clases.
    private int atributo2; //Me restringe para que solo pueda ser usado por
    //la misma clase, en este caso solo de la clase 1.
    
    private String nombre;
    
    //encapsulamiento 
    //HACEMOS QUE INGRESE UN VALOR PARA atributo2;
    //Setter
    public void setAtributo2(int atributo2){
        this.atributo2 = atributo2;
    }
    
    //Getter
    public int GetAtributo2(){
        return atributo2;
    } //PARA SACAR EL ATRIBUTO A OTRA CLASE O PAQUETE.
    
    

    public void setNombre(String nombre) { //SETTER
        this.nombre = nombre;
    }
    
    public String getNombre() { //GETTER
        return nombre;
    }

    
    
    
    
    
}
