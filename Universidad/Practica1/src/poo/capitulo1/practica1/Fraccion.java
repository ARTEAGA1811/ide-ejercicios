
package poo.capitulo1.practica1;


public class Fraccion {
    
    //Atributos de instancia
    private int numerador;
    private int denominador;
    
    //Constructores
    public Fraccion(){
        this.numerador = 9;
        this.denominador = 12;
    }
    
    public Fraccion(int numerador){
        this.numerador = numerador;
        this.denominador = 5;
    }
    
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    //Simplificar
    public void simplificar(){
        int i = 2; //el numero que va simplificando
        
        
        do{ 
            if(numerador%i==0 && denominador%i==0){
                numerador/=i;
                denominador/=i; 
            }else{
            i +=1;
            }
	
        }while(i <= denominador);
      
	
       
    }
    
    //modificamos el metodo toString

    @Override
    public String toString() {
        return "\n\t------------\n\tFraccion: \n\t" + numerador + "/" + denominador + "\n\t------------";
    }
    

   
      
    
}
