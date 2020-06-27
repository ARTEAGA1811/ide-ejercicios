
package taller1;


public class Rectangulo {

        private double longitud;
        private double anchura;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }
    public Rectangulo(){
        this.longitud = Math.random()*10;
        this.anchura = Math.random()*10;
    }
    
    public boolean verificarCuadrado(){
        boolean bandera = false;
        if(longitud == anchura){
            bandera = true;
        }
        return bandera;
        
    }

    @Override
    public String toString() {
        return "Rectangulo:\n" + "longitud=" + longitud + "\nanchura=" + anchura;
    }
    
    
    public boolean equals(Rectangulo otroRec){
        return ( (this.longitud * this.anchura) == (otroRec.longitud * otroRec.anchura) );
        
    }
    
    
    
        
        
    
}
