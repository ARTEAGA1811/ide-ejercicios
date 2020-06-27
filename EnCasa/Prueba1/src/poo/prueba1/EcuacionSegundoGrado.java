
package poo.prueba1;


public class EcuacionSegundoGrado {
    private int coeficienteA;
    private int coeficienteB;
    private int coeficienteC;
    private String tipoSolucion;
    private double discriminante;
    
    //CONSTRUCTORES
    public EcuacionSegundoGrado(int coeficienteA,int coeficienteB, int coeficienteC){
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    
    }
    
    //GETTER AND SETTER
    public void setDiscriminante(double discriminante){
        this.discriminante = discriminante;
    }
    
    
    //METODOS
    public String analizarTipodeSolucion(){
        if(this.discriminante > 0){
            this.tipoSolucion = "Dos raices reales y diferentes";
        }
        if(this.discriminante == 0){
            this.tipoSolucion = "Dos raices reales e iguales";
        }
        if(this.discriminante < 0){
            this.tipoSolucion = "Dos raices complejas y diferentes";
        }
    
        return this.tipoSolucion;
    }
    
    
    public void  calcularSolucionesEcuacion(){
        double solucionEcuacion;
        if(this.discriminante > 0){
            solucionEcuacion = (-coeficienteB + Math.sqrt(discriminante))/(2 * coeficienteA);
            System.out.print("\nPrimera Solucion: "+ solucionEcuacion);
            
            solucionEcuacion = (-coeficienteB - Math.sqrt(discriminante))/(2 * coeficienteA);
            System.out.println("\nSegunda Solucion: "+ solucionEcuacion);
        }
        
        if(this.discriminante == 0){
            solucionEcuacion = (-coeficienteB + Math.sqrt(discriminante))/(2 * coeficienteA);
            System.out.println("\nSolucion: "+ solucionEcuacion);
        }
        
        if(this.discriminante < 0){
            System.out.println("\nEsta ecuacion no tiene soluciones en los Reales.");
        }
         
       //METODO TOSTRING MODIFICADO
    }

    @Override
    public String toString() {
        
        return "\nEcuacion De Segundo Grado: \n-------------------\n"+ coeficienteA +"X2 + "+this.coeficienteB+"X + "+this.coeficienteC+ " = 0"+"\n-------------------";
    }
    
    
    
    
    
    
    
    
    
    
}
